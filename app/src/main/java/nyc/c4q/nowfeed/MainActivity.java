package nyc.c4q.nowfeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.nowfeed.examplenetworking.Issue;
import nyc.c4q.nowfeed.examplenetworking.IssueAdapter;
import nyc.c4q.nowfeed.retrofit.RetrofitFactory;
import nyc.c4q.nowfeed.retrofit.RetrofitService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    IssueAdapter issueAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //TODO AJ* Set up Main Card View for widget. Each card will be different

        //example of how to use Retrofit.
        //Step 1 set up recycler view
        //TODO set up your own
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        issueAdapter = new IssueAdapter(new ArrayList<Issue>());
        recyclerView.setAdapter(issueAdapter);
        //** adpater is altered to have a getlist method

        //initialize retrofit service with your specific retrofit ** see RetrofitFactory class

        RetrofitService service = RetrofitFactory.getExampleGitHubRetrofit("https://api.github.com/").create(RetrofitService.class);
        //enter your base url in the getRetrofit method as above

        //Call and callback methods:

        //TODO Adapt callback method for your api - replace "Issue" model with your model, replace adapter and get methods
        final Call<List<Issue>> issues = service.getIssues();
        issues.enqueue(new Callback<List<Issue>>() {
            @Override
            public void onResponse(Call<List<Issue>> call, Response<List<Issue>> response) {
                Log.d(TAG, "onResponse: " + response.body().size());

                issueAdapter.getIssueList().addAll(response.body());//adds objects to the list
                issueAdapter.notifyDataSetChanged();//tells adapter list has changed, needs to redraw.
            }

            @Override
            public void onFailure(Call<List<Issue>> call, Throwable t) {
                Log.d(TAG, "onFailure: "+ t.toString());
            }
        });
    }
}

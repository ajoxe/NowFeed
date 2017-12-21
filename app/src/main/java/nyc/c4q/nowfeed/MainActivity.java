package nyc.c4q.nowfeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    List<MainCard> mainCardList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainCardList = new ArrayList<>();
        mainCardList.add(new MainCard("ToDo", "add some todos"));
        mainCardList.add(new MainCard("Weather", "check your weather"));
        mainCardList.add(new MainCard("Tumbler", "see some tumblers"));
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        MainCardAdapter mainCardAdapter = new MainCardAdapter(mainCardList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setAdapter(mainCardAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }


}

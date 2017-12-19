package nyc.c4q.nowfeed.retrofit;

import java.util.List;

import nyc.c4q.nowfeed.examplenetworking.Issue;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by amirahoxendine on 12/18/17.
 */

public interface RetrofitService {
    @GET("repos/rails/rails/issues")
    Call<List<Issue>> getIssues();//want a list of issues.

    //TODO update weather model and endpoint
    //weather endpoint
    @GET("Put endpoint here")
    Call<List<Object>> getWeather();

    //TODO Update Tumbler Model and endpoint
    @GET("Put endpoint here")
    Call<List<Object>> getTumbler();




}

package nyc.c4q.nowfeed.retrofit;

import java.io.IOException;

import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by amirahoxendine on 12/18/17.
 */

public class RetrofitFactory {
    private static Retrofit tumblrRetrofit;
    private static Retrofit weatherRetrofit; //fn + Shift + f6 refactor all variables of same name
    private static Retrofit exampleRetrofit;


    public static Retrofit getTumblerRetrofit(String baseUrl) {
        if (tumblrRetrofit == null) {
            tumblrRetrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return tumblrRetrofit;
        }
        return tumblrRetrofit;
    }

    public static Retrofit getWeatherRetrofit(String baseUrl) {
        if (weatherRetrofit == null) {
            weatherRetrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return weatherRetrofit;
        }
        return weatherRetrofit;
    }
    public static Retrofit getExampleGitHubRetrofit(String baseUrl) {
        if (exampleRetrofit == null) {
            exampleRetrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return exampleRetrofit;
        }
        return exampleRetrofit;
    }


}

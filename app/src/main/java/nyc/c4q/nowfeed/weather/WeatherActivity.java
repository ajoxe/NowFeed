package nyc.c4q.nowfeed.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nyc.c4q.nowfeed.R;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        getSupportActionBar().setTitle("Weather");
    }
}

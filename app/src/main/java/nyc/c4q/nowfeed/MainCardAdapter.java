package nyc.c4q.nowfeed;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.nowfeed.todo.ToDoActivity;
import nyc.c4q.nowfeed.tumbler.TumblerActivity;
import nyc.c4q.nowfeed.weather.WeatherActivity;

/**
 * Created by amirahoxendine on 12/20/17.
 */

public class MainCardAdapter extends RecyclerView.Adapter<MainCardViewHolder> {
    List<MainCard> mainCardList;

    public MainCardAdapter(List<MainCard> mainCardList){
        this.mainCardList = mainCardList;
    }
    @Override
    public MainCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_card_item_view, parent, false);

        return new MainCardViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(final MainCardViewHolder holder, int position) {
    MainCard mainCard = mainCardList.get(position);
    holder.onBind(mainCard);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (holder.title){
                case "ToDo":
                    Intent todoIntent = new Intent(holder.itemView.getContext(), ToDoActivity.class);
                    holder.itemView.getContext().getApplicationContext().startActivity(todoIntent);
                    break;
                case "Weather":
                    Intent weatherIntent = new Intent(holder.itemView.getContext(), WeatherActivity.class);
                    holder.itemView.getContext().getApplicationContext().startActivity(weatherIntent);
                    break;
                case "Tumbler":
                    Intent tumblerIntent = new Intent(holder.itemView.getContext(), TumblerActivity.class);
                    holder.itemView.getContext().getApplicationContext().startActivity(tumblerIntent);
                    break;


            }
        }
    });
    }

    @Override
    public int getItemCount() {
        return mainCardList.size();
    }
}

package nyc.c4q.nowfeed;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by amirahoxendine on 12/20/17.
 */

public class MainCardViewHolder extends RecyclerView.ViewHolder {
    TextView cardTitle;
    TextView cardInfo;
    String title;
    public MainCardViewHolder(View itemView) {
        super(itemView);
        cardInfo = (TextView) itemView.findViewById(R.id.main_card_info);
        cardTitle = (TextView) itemView.findViewById(R.id.main_card_title);
    }
    public void onBind(MainCard mainCard){
        title = mainCard.getTitle();
        cardTitle.setText(mainCard.getTitle());
        cardInfo.setText(mainCard.getInfo());
    }
}

package nyc.c4q.nowfeed.examplenetworking;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.nowfeed.R;

/**
 * Created by amirahoxendine on 12/18/17.
 */

public class IssueViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    TextView name;
    TextView body;
    TextView comments;

    public IssueViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title_textview);
        name = (TextView) itemView.findViewById(R.id.name_textview);
        body = (TextView) itemView.findViewById(R.id.body_textview);
        comments = (TextView) itemView.findViewById(R.id.comments_textview);
    }

    public void onBind(Issue issue){
        title.setText("Title: " + issue.getTitle());
        name.setText("Name: " + issue.getName());
        body.setText("Body: " + issue.getBody());
        comments.setText("Comment Url: " + issue.getComments_url());

    }
}

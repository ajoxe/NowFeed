package nyc.c4q.nowfeed.examplenetworking;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.nowfeed.R;

/**
 * Created by amirahoxendine on 12/18/17.
 */

public class IssueAdapter extends RecyclerView.Adapter<IssueViewHolder> {
    private List<Issue> issueList;

    public List<Issue> getIssueList() {
        return issueList;
    }

    public IssueAdapter (List<Issue> issueList){
        this.issueList = issueList;
    }

    @Override
    public IssueViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.issue_item_view, parent, false);
        return new IssueViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(IssueViewHolder holder, int position) {
        Issue issue = issueList.get(position);
        holder.onBind(issue);
    }

    @Override
    public int getItemCount() {
        return issueList.size();
    }
}

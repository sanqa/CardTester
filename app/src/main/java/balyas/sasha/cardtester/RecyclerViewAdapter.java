package balyas.sasha.cardtester;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;



    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.subjectName.setText(itemList.get(position).getName());
        holder.subjectDate.setText(itemList.get(position).getDate());
        holder.subjectPlace.setText(itemList.get(position).getPlace());
        holder.subjectAddress.setText(itemList.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public static class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

       public TextView subjectName;
        public TextView subjectDate;
        public TextView subjectPlace;
        public TextView subjectAddress;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            subjectName = (TextView) itemView.findViewById(R.id.subject_name);
            subjectDate = (TextView) itemView.findViewById(R.id.subject_date);
            subjectPlace = (TextView) itemView.findViewById(R.id.subject_place_name);
            subjectAddress = (TextView) itemView.findViewById(R.id.subject_place_address);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        }
    }
}

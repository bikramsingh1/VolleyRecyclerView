package com.apkglobal.volleyir.fetch_data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.apkglobal.volleyir.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 06-Jan-18.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> implements Filterable{

    private ArrayList<Pojo> mArrayList;
    private List<Pojo> mFilteredList;

    public DataAdapter(ArrayList<Pojo> arrayList) {

        this.mArrayList = arrayList;
        this.mFilteredList=arrayList;
    }

    @Override
    public DataAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fetch_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.MyViewHolder holder, int position) {

        holder.name.setText(mFilteredList.get(position).getName());
        holder.email.setText(mFilteredList.get(position).getEmail());
        holder.phn.setText(mFilteredList.get(position).getPhn());
    }

    @Override
    public int getItemCount() {
        return mFilteredList.size();
    }

    @Override
    public Filter getFilter() {

        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                String charString = charSequence.toString();

                if (charString.isEmpty()) {

                    mFilteredList = mArrayList;
                } else {

                    ArrayList<Pojo> filteredList = new ArrayList<>();

                    for (Pojo androidVersion : mArrayList) {

                        if (androidVersion.getName().toLowerCase().contains(charString) || androidVersion.getEmail().toLowerCase().contains(charString)|| androidVersion.getPhn().toLowerCase().contains(charString)) {

                            filteredList.add(androidVersion);
                        }
                    }

                    mFilteredList = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = mFilteredList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mFilteredList = (ArrayList<Pojo>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,email,phn;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            email = itemView.findViewById(R.id.tv_email);
            phn = itemView.findViewById(R.id.tv_phn);

        }
    }
}

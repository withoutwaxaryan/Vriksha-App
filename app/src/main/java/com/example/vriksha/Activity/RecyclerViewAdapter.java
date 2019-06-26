package com.example.vriksha.Activity;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.vriksha.R;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>
{

    private List<Suggestion_Cardview> contactList;

    public RecyclerViewAdapter(List<Suggestion_Cardview> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int i) {
        Suggestion_Cardview ci = contactList.get(i);
        recyclerViewHolder.vName.setText(ci.name);
        recyclerViewHolder.vAddress.setText(ci.address);
        recyclerViewHolder.vTrees_Planted.setText(ci.trees_planted);
        recyclerViewHolder.vSpace_Available.setText(ci.space_available);
        recyclerViewHolder.vRating.setText(ci.rating);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_layout, viewGroup, false);

        return new RecyclerViewHolder(itemView);
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        protected TextView vName;
        protected TextView vAddress;
        protected TextView vTrees_Planted;
        protected TextView vSpace_Available;
        protected TextView vRating;


        public RecyclerViewHolder(View v) {
            super(v);
            vName =   v.findViewById(R.id.TV_Name);
            vAddress =   v.findViewById(R.id.TV_Address);
            vTrees_Planted =   v.findViewById(R.id.TV_Num_Trees);
            vSpace_Available =  v.findViewById(R.id.TV_Num_Space);
            vRating = v.findViewById(R.id.TV_Rating);
        }
    }

}

package com.example.vriksha.Activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vriksha.R;

import org.w3c.dom.Text;

import java.util.List;


public class RecyclerViewAdapter_Timeline extends RecyclerView.Adapter<RecyclerViewAdapter_Timeline.MyViewHolder>
{

    Context mContext;
    List<Timeline> mData;

    public RecyclerViewAdapter_Timeline(Context mContext, List<Timeline> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(mContext).inflate(R.layout.card_timeline,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            holder.tv_name.setText(mData.get(position).getName());
            holder.tv_address.setText(mData.get(position).getAddress());
            holder.tv_message.setText(mData.get(position).getMessage());
            holder.iv_profile_image.setImageResource(mData.get(position).getProfile_Image());
            holder.iv_main_image.setImageResource(mData.get(position).getMain_Image());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_name;
        private TextView tv_address;
        private TextView tv_message;
        private ImageView iv_profile_image;
        private ImageView iv_main_image;
        public MyViewHolder(View itemView)
        {
            super(itemView);

            tv_name=  itemView.findViewById(R.id.Timeline_TV_Name);
            tv_address=itemView.findViewById(R.id.Timeline_TV_Location);
            tv_message=itemView.findViewById(R.id.Timeline_TV_Message);
            iv_profile_image=itemView.findViewById(R.id.Timeline_IV_Profile_Pic);
            iv_main_image=itemView.findViewById(R.id.Timeline_IV_Content);
        }
    }
}
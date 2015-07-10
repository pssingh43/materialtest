package com.example.lepton.materialtest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Lepton on 11-Jun-15.
 */
public class VivzAdapter extends RecyclerView.Adapter<VivzAdapter.MyViewHolder>  {
    private LayoutInflater inflater;
    List<Information> data = Collections.emptyList();
    public Context context;
private ClickListener clickListener;
    VivzAdapter(Context context, List<Information> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
        this.context = context;
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = inflater.inflate(R.layout.custom_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

public void delete(int position){
    data.remove(position);
    notifyItemRemoved(position);
}


    public void onBindViewHolder(MyViewHolder holder, int i) {
        Information object = data.get(i);
        holder.title.setText(object.title);
        holder.Icon.setImageResource(object.iconId);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }




    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        ImageView Icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listText);
            Icon = (ImageView) itemView.findViewById(R.id.listIcon);
           /* Icon.setOnClickListener(this);*/

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
//            delete(getPosition());
           //context.startActivity(new Intent(context,SubActivity.class));
            if(clickListener != null){
                clickListener.itemClicked(v,getPosition());
            }
        }
    }

    public interface ClickListener{
        public void itemClicked(View view,int position);
    }
}

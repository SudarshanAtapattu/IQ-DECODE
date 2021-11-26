package com.newapp.iq_codes;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
/***
 * FetchAdapter class for set values to recyclerViw
 * @author Pradepa Sudarshana Atapattu
 * Student RegNo.2115417
 */

public class FetchAdapter extends RecyclerView.Adapter<FetchAdapter.FetchViewHolder> {

    Context context;
    ArrayList <Level_Model> list;

    public FetchAdapter(Context context, ArrayList<Level_Model> list) {
        /***
         *   fetching data from the Level_Model class
         */
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public FetchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(context).inflate(R.layout.items,parent,false);
        return  new  FetchViewHolder(view);
        /***
         *  creating  view holder  for  set values
         */
    }

    public void onBindViewHolder(@NonNull FetchViewHolder holder, int position) {
        /***
         *   binding values to casting text views
         */
         Level_Model level_model = list.get(position);
         holder.level.setText(level_model.getLevel());
         holder.correct.setText(level_model.getCorrect());
         holder.incorrect.setText(level_model.getIncorrect());
         holder.name.setText(level_model.getName());
         holder.time.setText(level_model.getTime());

    }

    @Override
    public int getItemCount() {
        return list.size() ;
    }

    public static  class FetchViewHolder extends  RecyclerView.ViewHolder{
        /***
         *   casting values
         */
        TextView level,correct,incorrect,name,time;

        public FetchViewHolder(@NonNull View itemView) {
            super(itemView);

            level = itemView.findViewById(R.id.tvLevelName);
            correct = itemView.findViewById(R.id.tvCorrect);
            incorrect = itemView.findViewById(R.id.tvInCorrect);
            name = itemView.findViewById(R.id.tvName);
            time = itemView.findViewById(R.id.tvTime);


        }
    }
}

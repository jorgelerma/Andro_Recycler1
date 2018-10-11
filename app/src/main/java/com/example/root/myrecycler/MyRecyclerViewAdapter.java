package com.example.root.myrecycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {
    private String[] mDataset;
    private LayoutInflater mInflater;
    private ArrayList<String> mArrayList;
    private boolean arrayIn;
    Context mContext;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView mTextView;
        private ImageView mImageView;

        public MyViewHolder(View v){
            super(v);
            mTextView = itemView.findViewById(R.id.tvAnimalName);
            mImageView = itemView.findViewById(R.id.imAnimalImage);
//            mTextView = v;
        }
    }

    public MyRecyclerViewAdapter(Context context, String[] myDataset){
        mDataset = myDataset;
        this.mInflater = LayoutInflater.from(context);
        mContext = context;
    }

    public MyRecyclerViewAdapter(Context context, ArrayList<String> mArrayList){
        this.mArrayList = mArrayList;
        this.mInflater = LayoutInflater.from(context);
        arrayIn = true;
    }


    @NonNull
    @Override
    public MyRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        TextView v = (TextView) LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.recyclerview_row, parent, false);
//        MyViewHolder vh = new MyViewHolder(v);

        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);


        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.mTextView.setText(mArrayList.get(position));

//        Glide.with(mContext)
//                .load("https://developer.android.com/static/images/landing/android-logo.svg")
//                .into(holder.mImageView);

        holder.mImageView.setImageResource(R.drawable.ic_miniandro);

//        if(arrayIn){
//            holder.mTextView.setText(mArrayList.get(position));
//        }else{
//            holder.mTextView.setText(mDataset[position]);
//        }

    }

    @Override
    public int getItemCount() {
//        return mDataset.length;
        return mArrayList.size();
    }

}

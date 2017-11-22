package com.example.kaligaswag.recyclerviewwigdet;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kaligaswag on 22/11/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<EmojiModel> objectList;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<EmojiModel> objectList) {
        inflater = LayoutInflater.from(context);
        this.objectList = objectList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        EmojiModel current = objectList.get(position);
        holder.setData(current, position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private ImageView imgThumb, imgDelete, imgCopy;
        private int position;
        private EmojiModel currentObject;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.textViewTitle);
            imgThumb = (ImageView) itemView.findViewById(R.id.img_thumb);
            imgDelete = (ImageView) itemView.findViewById(R.id.imageViewDelete);
            imgCopy = (ImageView) itemView.findViewById(R.id.imageViewCopy);
        }

        public void setData(EmojiModel current, int position) {
            this.title.setText(currentObject.getTitle());
            this.position = position;
            this.currentObject = currentObject;
        }
    }
}

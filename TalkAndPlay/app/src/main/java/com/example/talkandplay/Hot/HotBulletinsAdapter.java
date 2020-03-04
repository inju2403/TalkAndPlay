package com.example.talkandplay.Hot;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.talkandplay.R;

import java.util.ArrayList;

public class HotBulletinsAdapter extends RecyclerView.Adapter<HotBulletinsAdapter.ViewHolder> {

    Context context;
    ArrayList<HotBulletinsModel> items;

    public HotBulletinsAdapter(Context context, ArrayList<HotBulletinsModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.hot_bulletins_item, parent, false);
        
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final HotBulletinsModel item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView thumb_up_imageView, thumb_down_imageView;
        private TextView contents_textView, hot_date_textView, thumb_up_number_textView, thumb_down_number_textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            thumb_up_imageView = itemView.findViewById(R.id.thumb_up_imageView);
            thumb_down_imageView = itemView.findViewById(R.id.thumb_down_imageView);
            contents_textView = itemView.findViewById(R.id.contents_textView);
            hot_date_textView = itemView.findViewById(R.id.hot_date_textView);
            thumb_up_number_textView = itemView.findViewById(R.id.thumb_up_number_textView);
            thumb_down_number_textView = itemView.findViewById(R.id.thumb_down_number_textView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    if(pos != RecyclerView.NO_POSITION) {
                        Toast.makeText(context, pos + " clicked", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        public void setItem(HotBulletinsModel item) {
            contents_textView.setText(item.getContents_textView());
            hot_date_textView.setText(item.getHot_date_textView());
            thumb_up_number_textView.setText(Integer.toString(item.getThumb_up_number_textView()));
            thumb_down_number_textView.setText(Integer.toString(item.getThumb_down_number_textView()));
        }
    }
}

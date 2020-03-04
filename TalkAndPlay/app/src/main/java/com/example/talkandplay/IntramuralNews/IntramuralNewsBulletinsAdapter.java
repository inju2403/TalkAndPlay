package com.example.talkandplay.IntramuralNews;

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

public class IntramuralNewsBulletinsAdapter extends RecyclerView.Adapter<IntramuralNewsBulletinsAdapter.ViewHolder> {

    Context context;
    ArrayList<IntramuralNewsBulletinsModel> items;

    public IntramuralNewsBulletinsAdapter(Context context, ArrayList<IntramuralNewsBulletinsModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.intramural_news_bulletins_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final IntramuralNewsBulletinsModel item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView trade_mark_imageView, thumb_up_imageView, thumb_down_imageView;
        private TextView group_name_textView, intramural_news_date_textView, intramural_news_contents_textView,
                intramural_news_group_name_textView, thumb_up_number_textView, thumb_down_number_textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            trade_mark_imageView = itemView.findViewById(R.id.trade_mark_imageView);
            thumb_up_imageView = itemView.findViewById(R.id.thumb_up_imageView);
            thumb_down_imageView = itemView.findViewById(R.id.thumb_down_imageView);
            group_name_textView = itemView.findViewById(R.id.group_name_textView);
            intramural_news_date_textView = itemView.findViewById(R.id.intramural_news_date_textView);
            intramural_news_contents_textView = itemView.findViewById(R.id.intramural_news_contents_textView);
            intramural_news_group_name_textView = itemView.findViewById(R.id.intramural_news_group_name_textView);
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

        public void setItem(IntramuralNewsBulletinsModel item) {
            group_name_textView.setText(item.getGroup_name_textView());
            intramural_news_date_textView.setText(item.getIntramural_news_date_textView());
            intramural_news_contents_textView.setText(item.getIntramural_news_contents_textView());
            intramural_news_group_name_textView.setText(item.getIntramural_news_group_name_textView());
            thumb_up_number_textView.setText(Integer.toString(item.getThumb_up_number_textView()));
            thumb_down_number_textView.setText(Integer.toString(item.getThumb_down_number_textView()));
            trade_mark_imageView.setImageResource(R.drawable.trade_mark_image);
        }
    }
}

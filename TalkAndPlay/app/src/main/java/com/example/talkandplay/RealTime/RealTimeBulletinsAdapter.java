package com.example.talkandplay.RealTime;

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

public class RealTimeBulletinsAdapter extends RecyclerView.Adapter<RealTimeBulletinsAdapter.ViewHolder> {

    private Context context;
    private ArrayList<RealTimeBulletinsModel> items;

    public RealTimeBulletinsAdapter(Context context, ArrayList<RealTimeBulletinsModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.realtime_bulletins_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final RealTimeBulletinsModel item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView face_imageView, thumb_up_imageView, thumb_down_imageView;
        private TextView name_textView, date_textView, title_textView, contents_textView,
                bulletin_board_name_textView, thumb_up_number_textView, thumb_down_number_textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            face_imageView = itemView.findViewById(R.id.face_imageView);
            thumb_up_imageView = itemView.findViewById(R.id.thumb_up_imageView);
            thumb_down_imageView = itemView.findViewById(R.id.thumb_down_imageView);

            name_textView = itemView.findViewById(R.id.name_textView);
            date_textView = itemView.findViewById(R.id.date_textView);
            title_textView = itemView.findViewById(R.id.title_textView);
            contents_textView = itemView.findViewById(R.id.contents_textView);
            bulletin_board_name_textView = itemView.findViewById(R.id.bulletin_board_name_textView);
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

        public void setItem(RealTimeBulletinsModel item) {
            name_textView.setText(item.getName_textView());
            date_textView.setText(item.getDate_textView());
            title_textView.setText(item.getTitle_textView());
            contents_textView.setText(item.getContents_textView());
            bulletin_board_name_textView.setText(item.getBulletin_board_name_textView());
            thumb_up_number_textView.setText(item.getThumb_up_number_textView());
            thumb_down_number_textView.setText(item.getThumb_down_number_textView());
            face_imageView.setImageResource(R.drawable.face_icon_image);
        }
    }
}

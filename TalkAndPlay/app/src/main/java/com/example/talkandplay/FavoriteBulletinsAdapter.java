package com.example.talkandplay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavoriteBulletinsAdapter extends RecyclerView.Adapter<FavoriteBulletinsAdapter.ViewHolder> {

    private Context context;
    private ArrayList<FavoriteBulletinsModel> items;

    public FavoriteBulletinsAdapter(Context context, ArrayList<FavoriteBulletinsModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.favorite_bulletins_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final FavoriteBulletinsModel item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView bulletin_board_name;
        private TextView bulletin_board_contents;
        private ImageView newImageView;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            bulletin_board_name = itemView.findViewById(R.id.bulletin_board_name);
            bulletin_board_contents = itemView.findViewById(R.id.bulletin_board_contents);
            newImageView = itemView.findViewById(R.id.newImageView);

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
        public void setItem(FavoriteBulletinsModel item) {
            bulletin_board_name.setText(item.getName());
            bulletin_board_contents.setText(item.getContents());
            newImageView.setImageResource(R.drawable.new_image);
        }
    }
}

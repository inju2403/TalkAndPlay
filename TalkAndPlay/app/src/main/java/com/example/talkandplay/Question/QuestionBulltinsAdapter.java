package com.example.talkandplay.Question;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.talkandplay.R;

import java.util.ArrayList;

public class QuestionBulltinsAdapter extends RecyclerView.Adapter<QuestionBulltinsAdapter.ViewHolder> {

    private Context context;
    private ArrayList<QuestionBulltinsModel> items;

    public QuestionBulltinsAdapter(Context context, ArrayList<QuestionBulltinsModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.question_bulltins_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final QuestionBulltinsModel item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView question_bulletins_title_textView, question_bulletins_contents_textView,
                question_bulletins_category_textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            question_bulletins_title_textView = itemView.findViewById(R.id.question_bulletins_title_textView);
            question_bulletins_contents_textView = itemView.findViewById(R.id.question_bulletins_contents_textView);
            question_bulletins_category_textView = itemView.findViewById(R.id.question_bulletins_category_textView);

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

        public void setItem(QuestionBulltinsModel item) {
            question_bulletins_title_textView.setText(item.getQuestion_bulletins_title_textView());
            question_bulletins_contents_textView.setText(item.getQuestion_bulletins_contents_textView());
            question_bulletins_category_textView.setText(item.getQuestion_bulletins_category_textView());
        }
    }
}

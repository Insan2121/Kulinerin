package com.example.kulinerin.features.mainscreen.home.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kulinerin.R;
import com.example.kulinerin.models.Category;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private ArrayList<Category> categories;
    private View view;

    public CategoryAdapter(ArrayList<Category> categories) {
        this.categories = categories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cateogry_home, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Category category = categories.get(position);

        holder.title.setText(category.getTitle());
        Log.d("imagenya", category.getImageURL());
//        Picasso
//                .get()
//                .load(category.getImageURL())
//                .resize(90, 50)
//                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;
        public final TextView title;
        public final ImageView image;

        public ViewHolder(@NonNull View view) {
            super(view);
            this.view = view;

            title = view.findViewById(R.id.text_view_category_title);
            image = view.findViewById(R.id.image_view_category);

        }
    }}

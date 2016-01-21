package io.github.ncca_fbla.fabric;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.parse.ParseObject;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private ArrayList<ParseObject> postList;

    public PostAdapter(ArrayList<ParseObject> postList) {
        this.postList = postList;
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    @Override
    public void onBindViewHolder(PostViewHolder viewHolder, int position) {
        // TODO: Write data-binding code.
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View post = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.post, viewGroup, false);

        return new PostViewHolder(post);
    }

    // ViewHolder class for posts.
    public static class PostViewHolder extends RecyclerView.ViewHolder {
        protected TextView title;
        protected ImageButton shareButton;
        protected ImageButton starButton;
        protected ImageView authorImage;
        protected TextView authorName;

        public PostViewHolder(View v) {
            super(v);

            // TODO: ID post view items and add them in here.
        }
    }
}

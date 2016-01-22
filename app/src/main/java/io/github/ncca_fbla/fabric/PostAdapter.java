/*
 * Copyright (c) NCCA FBLA 2016
 * Written by James Parsons
 *
 */

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
    public static class PostViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        protected TextView title;
        protected ImageButton shareButton;
        protected ImageButton starButton;
        protected ImageView authorImage;

        public PostViewHolder(View v) {
            super(v);

            title = (TextView) v.findViewById(R.id.caption);
            shareButton = (ImageButton) v.findViewById(R.id.btn_star);
            starButton = (ImageButton) v.findViewById(R.id.btn_share);
            authorImage = (ImageView) v.findViewById(R.id.avatar);
        }

        @Override
        public void onClick(View v) {
            // Find out who was clicked.
            switch (v.getId()) {
                case R.id.btn_star:
                    // TODO: Toggle start status both on the client and server.
                    break;
                case R.id.btn_share:
                    // TODO: How are we gonna do sharing :P.
                    break;
                case R.id.avatar:
                    // TODO: Oh god :P how are we going to launch an activty from here?
                    break;
            }
        }
    }
}

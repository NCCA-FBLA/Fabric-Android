package io.github.ncca_fbla.fabric;

// RecyclerView classes for building the following and follower screens.

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.parse.ParseUser;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder> {
    private ArrayList<ParseUser> profiles;

    public ProfileAdapter(ArrayList<ParseUser> profiles) {
        this.profiles = profiles;
    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    @Override
    public void onBindViewHolder(ProfileViewHolder holder, int position) {
        // TODO: Write data-binding code.
    }

    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View user = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.profile_item, viewGroup, false);

        return new ProfileViewHolder(user);
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder {
        // TODO: Prototype the view.
        public ProfileViewHolder(View v) {
            super(v);

            // TODO: Get all the view items.
        }
    }
}

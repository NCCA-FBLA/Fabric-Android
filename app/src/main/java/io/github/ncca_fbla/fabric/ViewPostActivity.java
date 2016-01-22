/*
 * Copyright (c) NCCA FBLA 2016
 * Written by James Parsons
 *
 */

package io.github.ncca_fbla.fabric;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ViewPostActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView postCaption;
    private ImageButton btnStar;
    private RecyclerView comments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_post);

        // TODO: Figure out if this is a starred post for the current user.

    }

    @Override
    public void onClick(View v) {
        // Find out what was clicked.
        switch (v.getId()) {
            case R.id.btn_share:
                // TODO: Decide on how to share :P.
                break;
            case R.id.btn_star:
                // TODO: Toggle starred status both on the client and the server.
                break;
        }
    }
}

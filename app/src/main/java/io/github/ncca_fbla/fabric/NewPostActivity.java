package io.github.ncca_fbla.fabric;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);

        // TODO: Load image the user formerly picked if it exists.
        if(savedInstanceState != null) {

        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // TODO: Save the current image the user selects
        super.onSaveInstanceState(savedInstanceState);
    }
}

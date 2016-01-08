package io.github.ncca_fbla.fabric;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class FollowingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_following);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_follow, menu);

        return true;
    }
}

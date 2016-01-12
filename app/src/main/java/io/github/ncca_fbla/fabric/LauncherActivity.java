package io.github.ncca_fbla.fabric;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class LauncherActivity extends Activity {
    public Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        // Store context for later use.
        context = this;

        // TODO: Run the annimation.
        // But for now, we will just head to the next screen.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(context, SignInActivity.class));
            }
        }, 5000);
    }
}

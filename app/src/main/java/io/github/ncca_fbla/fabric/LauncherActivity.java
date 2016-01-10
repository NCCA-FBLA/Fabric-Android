package io.github.ncca_fbla.fabric;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        // TODO: Run the annimation.
        // But for now, we will just head to the next screen.
        try {
            Thread.sleep(2000);
            startActivity(new Intent(this, SignInActivity.class));
        } catch (InterruptedException e) {
            Log.e("Error", e.toString());
        }
    }
}

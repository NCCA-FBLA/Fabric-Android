package io.github.ncca_fbla.fabric;

import android.app.Application;

import com.parse.Parse;

public class FabricApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this);
        Parse.enableLocalDatastore(this);
    }
}

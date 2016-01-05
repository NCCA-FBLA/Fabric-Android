package io.github.ncca_fbla.fabric;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {
    Context self;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // Keeping a reference to the activity, because, once sign in is implemented, it will be out of scope.
        self = this;

        // Set the font for the app name.
        TextView appName = (TextView) findViewById(R.id.app_name_text);
        Typeface thirstyScript = Typeface.createFromAsset(getAssets(), "fonts/ThirstyScriptExtraBoldDemo.otf");
        appName.setTypeface(thirstyScript);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.sign_in_button_facebook:
                // TODO: Facebook sign in.
                // Temporarily just send the user to main screen.
                startActivity(new Intent(self, MainActivity.class));
                break;

            case R.id.sign_in_button_twitter:
                // TODO Twitter sign in.
                // Temporarily just send the user to main screen.
                startActivity(new Intent(self, MainActivity.class));
                break;

            default:
                break;
        }
    }
}

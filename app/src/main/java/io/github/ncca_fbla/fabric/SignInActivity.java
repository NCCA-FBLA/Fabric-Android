package io.github.ncca_fbla.fabric;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {
    Context self;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // Keeping a reference to the activity, because, once sign in is implemented, it will be out of scope.
        self = this;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.sign_in_button_facebook:
                // TODO: Facebook sign in.
                break;

            case R.id.sign_in_button_twitter:
                // TODO Twitter sign in.
                break;

            default:
                break;
        }
    }
}

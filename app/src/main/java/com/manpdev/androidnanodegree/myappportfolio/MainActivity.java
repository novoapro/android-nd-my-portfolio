package com.manpdev.androidnanodegree.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_spotify_streamer).setOnClickListener(this);
        findViewById(R.id.btn_score_app).setOnClickListener(this);
        findViewById(R.id.btn_library_app).setOnClickListener(this);
        findViewById(R.id.btn_build_it_bigger).setOnClickListener(this);
        findViewById(R.id.btn_xyz_reader).setOnClickListener(this);
        findViewById(R.id.btn_capstone).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_spotify_streamer:
                //Same method but listener implemented in this way for feature refactor.

                showApplicationToast(((Button) v).getText().toString());
                break;
            case R.id.btn_score_app:
                showApplicationToast(((Button) v).getText().toString());
                break;
            case R.id.btn_library_app:
                showApplicationToast(((Button) v).getText().toString());
                break;
            case R.id.btn_build_it_bigger:
                showApplicationToast(((Button) v).getText().toString());
                break;
            case R.id.btn_xyz_reader:
                showApplicationToast(((Button) v).getText().toString());
                break;
            case R.id.btn_capstone:
                showApplicationToast(((Button) v).getText().toString());
                break;
        }
    }

    private void showApplicationToast(String app) {
        Toast.makeText(MainActivity.this, getString(R.string.launch_toast_message, app), Toast.LENGTH_LONG).show();
    }

}

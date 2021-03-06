package com.clouddrive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnGoogleDrive, btnDropbox, btnOneDrive, btnBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
    }

    private void setupView() {
        btnGoogleDrive  = (Button) findViewById(R.id.button_google_drive);
        btnDropbox      = (Button) findViewById(R.id.button_dropbox);
        btnOneDrive     = (Button) findViewById(R.id.button_oneDrive);
        btnBox          = (Button) findViewById(R.id.button_box);
        btnGoogleDrive.setOnClickListener(this);
        btnDropbox.setOnClickListener(this);
        btnOneDrive.setOnClickListener(this);
        btnBox.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_google_drive:
                Log.d("Tag", "google drive");
                break;
            case R.id.button_dropbox:
                break;
            case R.id.button_oneDrive:
                break;
            case R.id.button_box:
                break;
        }
    }
}

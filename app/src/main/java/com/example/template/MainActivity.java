package com.example.template;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_land);
        int screenSize = getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK;
        int orientation = getResources().getConfiguration().orientation;

        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button connectBtn= findViewById(R.id.button2);

        connectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                //StrictMode.setThreadPolicy(policy);
                //serverUri = serverUriTextField.getText().toString();
                openActivity();
               /* try {
                    myClient = createClient(serverUri);
                    myClient.connect();
                    openActivity();
                } catch (Exception e) {
                    error = e.toString();
                    showAlert("Error", "Failed to connect");
                }*/
            }
        });

        // Set the appropriate layout based on screen size and orientation
        /*if (screenSize == Configuration.SCREENLAYOUT_SIZE_LARGE && orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main_land);
        } else if (screenSize == Configuration.SCREENLAYOUT_SIZE_LARGE && orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_main);
        } else {
            setContentView(R.layout.a);
        }*/
    }

    private void openActivity() {
        Intent intent = new Intent(getApplicationContext(), Navigate.class);
        startActivity(intent);
    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main_land);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.a);

        }

    }
}





package com.example.pocdoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goToactivityTELUGU(View view) {
        Intent intent = new Intent(this, activityTELUGU.class);
        startActivity(intent);
    }
    public void goToactivityENGLISH(View view) {
        Intent intent = new Intent(this, activityENGLISH.class);
        startActivity(intent);
    }
}

package com.example.pocdoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activityENGLISH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
    }
    public void goToactivityfevereng(View view) {
        Intent intent = new Intent(this, activityfevereng.class);
        startActivity(intent);
    }

    public void goToactivitycoldeng(View view) {
        Intent intent = new Intent(this, activitycoldeng.class);
        startActivity(intent);
    }
    public void goToactivitycougheng(View view) {
        Intent intent = new Intent(this, activitycougheng.class);
        startActivity(intent);
    }
    public void goToactivityheadacheeng(View view) {
        Intent intent = new Intent(this, activityheadacheeng.class);
        startActivity(intent);
    }
    public void goToactivitybodypainseng(View view) {
        Intent intent = new Intent(this, activitybodypainseng.class);
        startActivity(intent);
    }
    public void goToactivityweaknesseng(View view) {
        Intent intent = new Intent(this, activityweaknesseng.class);
        startActivity(intent);
    }
    public void goToactivityscabieseng(View view) {
        Intent intent = new Intent(this, activityscabieseng.class);
        startActivity(intent);
    }
    public void goToactivityeczemaeng(View view) {
        Intent intent = new Intent(this, activityeczemaeng.class);
        startActivity(intent);
    }
    public void goToactivitydiarrheaeng(View view) {
        Intent intent = new Intent(this, activitydiarrheaeng.class);
        startActivity(intent);
    }


}

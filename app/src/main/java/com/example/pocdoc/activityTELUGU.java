package com.example.pocdoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activityTELUGU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telugu);
    }
    public void goToactivityfevertel(View view) {
        Intent intent = new Intent(this, activityfevertel.class);
        startActivity(intent);
    }

    public void goToactivitycoldtel(View view) {
        Intent intent = new Intent(this, activitycoldtel.class);
        startActivity(intent);
    }
    public void goToactivitycoughtel(View view) {
        Intent intent = new Intent(this, activitycooughtel.class);
        startActivity(intent);
    }
    public void goToactivityheadachetel(View view) {
        Intent intent = new Intent(this, activityheadachetel.class);
        startActivity(intent);
    }
    public void goToactivitybodypainstel(View view) {
        Intent intent = new Intent(this, activitybodypainstel.class);
        startActivity(intent);
    }
    public void goToactivityweaknesstel(View view) {
        Intent intent = new Intent(this, activityweaknesstel.class);
        startActivity(intent);
    }
    public void goToactivityscabiestel(View view) {
        Intent intent = new Intent(this, activityscabiestel.class);
        startActivity(intent);
    }
    public void goToactivityeczematel(View view) {
        Intent intent = new Intent(this, activityeczematel.class);
        startActivity(intent);
    }
    public void goToactivitydiarrheatel(View view) {
        Intent intent = new Intent(this, activitydiarrheatel.class);
        startActivity(intent);
    }
}

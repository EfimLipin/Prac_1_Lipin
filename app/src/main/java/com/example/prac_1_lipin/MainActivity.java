package com.example.prac_1_lipin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        useToast("onCreate is called");
    }

    @Override
    protected void onStart(){
        super.onStart();
        useToast("onStart is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        useToast("onStop is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        useToast("onDestroy is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        useToast("onPause is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        useToast("onResume is called");
    }

    public void useToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
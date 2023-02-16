package com.example.prac_1_lipin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Prac_1_Lipin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        useToast("onCreate is called");
        Log.i(TAG, "The app created successfully");
    }

    @Override
    protected void onStart(){
        super.onStart();
        useToast("onStart is called");
        Log.d(TAG, "The app launched successfully");
    }

    @Override
    protected void onStop() {
        super.onStop();
        useToast("onStop is called");
        Log.i(TAG, "The app stopped successfully");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        useToast("onDestroy is called");
        Log.i(TAG, "The app closed successfully");
    }

    @Override
    protected void onPause() {
        super.onPause();
        useToast("onPause is called");
        Log.e(TAG, "No errors have occurred in onPause method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        useToast("onResume is called");
        Log.i(TAG, "The app resumed successfully");
    }

    public void useToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
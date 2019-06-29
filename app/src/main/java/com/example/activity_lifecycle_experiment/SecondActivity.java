package com.example.activity_lifecycle_experiment;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends Activity {
    public static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(this, "SecondActivity onCreate Called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "SecondActivity onCreate Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "SecondActivity onDestroy Called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "SecondActivity onDestroy Called");
    }
}

package com.oaksdance.statepolicydemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Test2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
    }
    public static void startAction(Context context){
        Intent intent = new Intent(context,Test2Activity.class);
        context.startActivity(intent);
    }
}

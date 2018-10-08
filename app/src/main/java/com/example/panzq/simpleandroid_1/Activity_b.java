package com.example.panzq.simpleandroid_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Activity_b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.d("panzqww","B --- onCreate");
        /*Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 0);
        float IQ = intent.getFloatExtra("IQ", 0.0f);
        Log.d("panzqww","name:"+name+",age:"+age+",IQ:"+IQ);*/
        /*Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("name");
        int age = bundle.getInt("age");
        float weight = bundle.getFloat("weight");
        Log.d("panzqww",name+","+age+","+weight);//乔峰,40,70.4*/
        Intent intent = getIntent();
        Person person = intent.getParcelableExtra("person");
        Log.d("panzqww",person.getName()+","+person.getAge()+person.getWeight());

    }
    public void closeb(View view)
    {
        Intent intent = new Intent();
        intent.putExtra("result","来自Activity b");
        Activity_b.this.setResult(RESULT_OK,intent);
        Activity_b.this.finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("panzqww","B --- onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("panzqww","B --- onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("panzqww","B --- onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("panzqww","B --- onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("panzqww","B --- onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("panzqww","B --- onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("panzqww","B --- onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("panzqww","B --- onRestoreInstanceState");
    }
}

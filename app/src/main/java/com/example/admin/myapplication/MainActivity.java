package com.example.admin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Lifecycle", "On Create");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    protected  void startActivityTwo(View view){
        Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
        startActivity(intent);


    }

    protected  void onStart(){
        super.onStart();
        Log.i("Lifecycle", "On Start");
    }

    protected  void onResume(){
        super.onResume();
        Log.i("Lifecycle", "On Resume");
    }

    protected  void onPause(){
        super.onPause();
        Log.i("Lifecycle", "On Resume");
    }

    protected  void onRestart(){
        super.onRestart();
        Log.i("Lifecycle", "On Restart");
    }

    protected  void onStop(){
        super.onStop();
        Log.i("Lifecycle", "On Stop");
    }


    protected  void onDestroy(){
        super.onDestroy();
        Log.i("Lifecycle", "On Destroy");
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.nboob.basketballapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    public int total1=0;
    public int total2 =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onNameClick1(View view)
    {
        total1 =total1 +1;
        TextView scoreView = (TextView) findViewById(R.id.value1);
        scoreView.setText(String.valueOf(total1));
    }
    public void onNameClick(View view)
    {
        total1 =total2 =0;
        TextView scoreView1 = (TextView) findViewById(R.id.value1);
        scoreView1.setText(String.valueOf(total1));
        TextView scoreView2 = (TextView) findViewById(R.id.value2);
        scoreView2.setText(String.valueOf(total2));
    }
    public void onNameClick2(View view)
    {
        total1 =total1 +3;
        TextView scoreView1 = (TextView) findViewById(R.id.value1);
        scoreView1.setText(String.valueOf(total1));
    }
    public void onNameClick3(View view)
    {
        total1 =total1 +5;
        TextView scoreView1 = (TextView) findViewById(R.id.value1);
        scoreView1.setText(String.valueOf(total1));
    }

    public void onNameClick4(View view)
    {
        total2 =total2 +1;
        TextView scoreView = (TextView) findViewById(R.id.value2);
        scoreView.setText(String.valueOf(total2));
    }
    public void onNameClick5(View view)
    {
        total2 =total2 +3;
        TextView scoreView1 = (TextView) findViewById(R.id.value2);
        scoreView1.setText(String.valueOf(total2));
    }
    public void onNameClick6(View view)
    {
        total2 =total2 +5;
        TextView scoreView1 = (TextView) findViewById(R.id.value2);
        scoreView1.setText(String.valueOf(total2));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
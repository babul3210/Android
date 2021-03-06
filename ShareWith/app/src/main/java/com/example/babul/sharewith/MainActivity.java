package com.example.babul.sharewith;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.shareId){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject = "Java programming app";
            String body = "This is help is very helpful to learn JAVA programming \n babul2016.wordpress.com";

            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, body);

            startActivity(Intent.createChooser(intent,"share with"));
        }
        return super.onOptionsItemSelected(item);
    }
}

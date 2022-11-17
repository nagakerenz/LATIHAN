package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MenuAndroid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_android);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ikon:
                Toast.makeText(this, "Anda menekan ikon Android!", Toast.LENGTH_LONG).show();
                break;
            case R.id.teks:
                Toast.makeText(this, "Anda menekan teks menu1!", Toast.LENGTH_LONG).show();
                break;
            case R.id.ikonteks:
                Toast.makeText(this, "Anda menekan menu2!", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}

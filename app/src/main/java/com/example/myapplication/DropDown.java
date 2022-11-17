package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class DropDown extends AppCompatActivity {

        private static final String[] menumenu = {"Soto", "Rawon", "Rujak", "Lotek", "Gudeg", "Lumpia", "Kerak Telor", "Pecel"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_drop_down);

            Spinner variabel1 = (Spinner) findViewById(R.id.spinner1);
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, menumenu);
            mAdapter.setDropDownViewResource(com.google.android.material.R.layout.support_simple_spinner_dropdown_item);
            variabel1.setAdapter(mAdapter);

        }
}
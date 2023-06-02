package com.example.autocompletetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView autoCompleteTextView;
ArrayList<String> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       autoCompleteTextView=findViewById(R.id.auto);
       arrayList.add("c");
        arrayList.add("c++");
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("java spript");
        arrayList.add("php");
        arrayList.add("oprationg system");
        arrayList.add("software engineering");
        arrayList.add("html");
        arrayList.add("css");
        arrayList.add("data structure");
        arrayList.add("neural network");
        arrayList.add("database");
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        autoCompleteTextView.setAdapter(arrayAdapter);


    }
}
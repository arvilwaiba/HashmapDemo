package com.example.mylistviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<HashMap<String ,String>> userDetail=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.myListView);
        String[] data = {"Apple", "BAll", "Cat", "Dog", "Elephant", "Apple", "BAll", "Cat", "dog", "Elephant",
                "Apple", "BAll", "Cat", "dog", "Elephant", "Apple", "BAll", "Cat", "dog", "Elephant"};


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.listview_layout, R.id.nameEditText, data);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = list.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this,item+" is selected", Toast.LENGTH_SHORT).show();
            }
        });


        for(int i=0; i<5 ; i++){
            HashMap<String,String > user=new HashMap<>();

            user.put("name","BAle"+i);
            user.put("Address","baluwatar"+i);

            System.out.println("value in hashmap = "+user);

            userDetail.add(user);

            System.out.println("arrayliust vlaue = "+userDetail);

        }
        // for(int i=0; i <arv.size();i++){

//            userDetail.add(user);
//        for(int i=0; i<userDetail.size() ; i++) {
            System.out.println("=====" + userDetail);
//        }


    }
}




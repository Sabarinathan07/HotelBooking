package com.sabari.hotelbooking;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {
    EditText name,phone,members,time;
    ListView lv;
    Button bt;
    String nameStr,phoneStr,membersStr,timeStr;
    ArrayList<Person> list;//ithula kudukira name la thaan class irukanum
    Adapter adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.name);
        phone=(EditText) findViewById(R.id.phone);
        members=(EditText) findViewById(R.id.members);
        time=(EditText) findViewById(R.id.time);
        lv=(ListView) findViewById(R.id.listView1);
        bt=(Button) findViewById(R.id.button1);
        list = new ArrayList<Person>();
        bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				nameStr=name.getText().toString();
				phoneStr=phone.getText().toString();
				membersStr=members.getText().toString();
				timeStr=time.getText().toString();
				Person customer = new Person(nameStr,phoneStr,membersStr,timeStr);
				list.add(customer);
				Adt adt = new Adt(MainActivity.this,list);
				lv.setAdapter(adt);
				name.setText("");
				phone.setText("");
				members.setText("");
				time.setText("");
				
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private void getQuestions(){
    	//JSONArray 
    }
    
}

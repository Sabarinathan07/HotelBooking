package com.sabari.hotelbooking;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adt extends BaseAdapter {
	LayoutInflater inFlater;
	TextView name,phone,members,time;
	
	ArrayList list;
	

	public Adt(Context context,ArrayList<Person> list){
		this.list=list;
		inFlater=LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int pos, View arg1, ViewGroup arg2) {
		View view = inFlater.inflate(R.layout.activity_adt,arg2, false);
		Person p=(Person)list.get(pos);
		name=(TextView) view.findViewById(R.id.textView1);
		phone=(TextView) view.findViewById(R.id.textView2);
		members=(TextView) view.findViewById(R.id.textView3);
		time=(TextView) view.findViewById(R.id.textView4);
		
		name.setText("Name:"+p.getName());
		phone.setText("Phone"+p.getPhone());
		members.setText("Members:"+p.getMembers());
		time.setText("Hours to stay:"+p.getTime());
		
		return view;
	}

}

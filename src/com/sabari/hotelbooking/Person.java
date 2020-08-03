package com.sabari.hotelbooking;

public class Person {
     private String name,phone,members,time;
     
    public Person(String name,String phone,String members,String time){
    	this.name=name;
    	this.phone=phone;
    	this.members=members;
    	this.time=time;
    }
    
    
    public String getName(){
    	return name;
    }
    
    
    public String getPhone(){
    	return phone;
    }
    
    
    public String getMembers(){
    	return members;
    }
    
    
    public String getTime(){
    	return time;
    }
}

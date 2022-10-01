package com.Rgodella.RESTAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

public class alienRepo {
	//LIST INITIALIZE
	List<Aliens> lst=new ArrayList();
	//CONSTRUCTOR CREATE
	//LIST CREATE
	//DATA INSERT
	public alienRepo() {
		//System.out.println("Executed!");
		Aliens a=new Aliens();
		a.setFname("Rahul");
		a.setLname("Godella");
		a.setId(1);
		Aliens b=new Aliens();
		//System.out.println("Executed!");
		b.setFname("Scott");
		b.setLname("Mccall");
		b.setId(2);
		lst.add(a);
		lst.add(b);
	}
	//TO ADD THE OBJECTS
	public void addAli(Aliens a1) {
		lst.add(a1);
	}
	
	public List<Aliens> ali(){
		System.out.println("WOrking!");
	return lst;
	}
	public Aliens getAli(int id) {
		for(Aliens a:lst) {
			if(a.getId()==id) {
				System.out.println("Successfully Added!");
				return a;
			}
		}
		return null;
	}
	
}

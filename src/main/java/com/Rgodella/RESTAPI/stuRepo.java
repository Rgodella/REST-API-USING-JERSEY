package com.Rgodella.RESTAPI;

//IMPORT THE PACKAGE 
import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class stuRepo {
	
	
	//METHOD TO GET ALL THE ELMENTS IN THE LIST 
	public List<students> print(){
		List<students> lst1=new ArrayList();
		try {
			//LOAD THE DRIVERS
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/Rajasthan";
			//ESTABLISH THE CONNECTION
			Connection con1=DriverManager.getConnection(url, "root", "Zinda$1234");
			//CRAETE THE STATEMENT
			Statement st=con1.createStatement();
			//EXECUTE THE QUERY
			ResultSet re=st.executeQuery("select * from students");
			//PROCESS THE STATEMENT
			while(re.next()) {
			students s=new students();
			s.setId(re.getInt(1));
			s.setName(re.getString(2));
			lst1.add(s);
		}
		}
		catch(Exception e) {
			//TO PRINT THE ERROR AND POSITION WHERE ERROR IS OCCURED
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("System issue is here!");
		}
		return lst1;
	}
	
	//METHOD TO GET ONLY ONE ELEMENT FROM THE LIST
	
	public students getOne(int id) {
		students s=new students();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Rajasthan";
		Connection con1=DriverManager.getConnection(url, "root", "Zinda$1234");
		Statement st=con1.createStatement();
		ResultSet re=st.executeQuery("select * from students where id="+id);
		while(re.next()) {
			if(re.getInt(1)==id) {
				s.setId(re.getInt(1));
				s.setName(re.getString(2));	
			}
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("System issue is here!");
		}
		return s;
		
	}
	
	//METHOD TO INSERT INTO THE DATABASE
	
	public void insert(int x,String name) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Rajasthan";
		Connection con1=DriverManager.getConnection(url, "root", "Zinda$1234");
		Statement st=con1.createStatement();
		int count=st.executeUpdate("insert into students values("+x+","+"'"+name+"'"+")");
		System.out.println("successfully UPdated");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("System issue is here!");
		}
		
	}
	
	//TO UPDATE THE ENTRY IN THE TABLE
	
	public void update(students s) {
		String sql="update students set name=? where id=?";
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Rajasthan";
		Connection con1=DriverManager.getConnection(url, "root", "Zinda$1234");
		PreparedStatement st=con1.prepareStatement(sql);
		st.setString(1, s.getName());
		st.setInt(2, s.getId());
		st.executeUpdate();
		System.out.println("Finally Updated !");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("System issue is here!");
		}
	}
	
	//TO DELETE THE ENTRY
	
	public void delete(students s) {
		String sql="delete from students where id=?";
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Rajasthan";
		Connection con1=DriverManager.getConnection(url, "root", "Zinda$1234");
		PreparedStatement st=con1.prepareStatement(sql);
		st.setInt(1, s.getId());
		st.executeUpdate();
		System.out.println("Finally Deleted !");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("System issue is here!");
		}
	}
	

}

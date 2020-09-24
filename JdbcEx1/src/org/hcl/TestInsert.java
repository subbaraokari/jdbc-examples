package org.hcl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int eno;
		String name,address;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcldb","root","root");
			if(con!=null)
			{
				st=con.createStatement();
				System.out.println("enter the employee details");
				eno=Integer.parseInt(br.readLine());
				name=br.readLine();
				address=br.readLine();
				int i=st.executeUpdate("insert into emp(eno,name,address) values("+eno+",'"+name+"','"+address+"')");
				if(i>0)
					System.out.println("successfully inserted");
				else
					System.out.println("not inserted");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

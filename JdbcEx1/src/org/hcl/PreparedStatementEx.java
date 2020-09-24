package org.hcl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementEx {

	public static void main(String[] args) {
		int eno;
		String name,address;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcldb","root","root");
			if(con!=null)
			{
				pst=con.prepareStatement("insert into emp(eno,name,address) values(?,?,?)");
				System.out.println("enter the employee details");
				eno=Integer.parseInt(br.readLine());
				name=br.readLine();
				address=br.readLine();
				pst.setInt(1, eno);
				pst.setString(2, name);
				pst.setString(3, address);
				int i=pst.executeUpdate();
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

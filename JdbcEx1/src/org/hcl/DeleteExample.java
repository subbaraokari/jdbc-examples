package org.hcl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExample {
	
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcldb","root","root");
			if(con!=null)
			{
				pst=con.prepareStatement("delete from emp where eno=?");
				System.out.println("enter the eno");
				int eno=Integer.parseInt(br.readLine());
				pst.setInt(1, eno);
				int i=pst.executeUpdate();
				if(i>0)
					System.out.println("successfully deleted");
				else
					System.out.println("not deleted");
			}
			pst.close();
			con.close();
		} catch (Exception e) {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		finally {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

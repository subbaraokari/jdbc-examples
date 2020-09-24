package org.hcl.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getConnection(String driver,String url,String uname,String pwd)
	{
		Connection con=null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,uname,pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

package org.hcl.util;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DBUtilTest {
	private String driver;
	private String url;
	private String userName;
	private String pwd;
	@BeforeEach
	void setUp() throws Exception {
		driver=DbConstants.DRIVER;
		url=DbConstants.URL;
		userName=DbConstants.UNAME;
		pwd=DbConstants.PWD;
	}

	@AfterEach
	void tearDown() throws Exception {
		driver=null;
		url=null;
		userName=null;
		pwd=null;
	}

	@Test
	void testGetConnection() {
		Connection con=DBUtil.getConnection(driver, url, userName, pwd);
		assertNotNull(con);
	}

}

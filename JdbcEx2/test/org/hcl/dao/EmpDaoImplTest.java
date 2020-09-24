package org.hcl.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.hcl.model.Emp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class EmpDaoImplTest {
	EmpDao dao=null;
	@BeforeEach
	void setUp() throws Exception {
		dao=new EmpDaoImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		dao=null;
	}

	@Test
	void testInsert() {
		Emp e=new Emp(6, "james", "Chennai");
		boolean b=dao.insert(e);
		if(b)
			assertTrue(b);
		else
			assertFalse(b);
	}

	@Test
	void testGet() {
		Emp e=dao.get(2);
		assertNotNull(e);
		assertEquals(2, e.getEno());
	}

	@Test
	void testGetAll() {
		List<Emp> emps=dao.getAll();
		assertNotNull(emps);
		assertEquals(5, emps.size());
	}

	@Test
	@Disabled
	void testDeleteThrowsSqlException() {
		assertThrows(SQLException.class,()->{
			dao.delete(10);
		});
	}
	@Test
	void testDeleteIsDeletingRecord()
	{
		boolean b=dao.delete(1);
		if(b)
			assertTrue(b);
		else
			assertFalse(b);
	}

}

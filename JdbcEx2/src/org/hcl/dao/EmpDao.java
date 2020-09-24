package org.hcl.dao;

import java.util.List;

import org.hcl.model.Emp;

public interface EmpDao {
	boolean	insert(Emp e);
	Emp get(int eno);
	List<Emp> getAll();
	boolean delete(int eno);
}

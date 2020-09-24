package org.hcl;

import org.hcl.dao.EmpDaoImpl;
import org.hcl.dao.EmpDaoImplTest;
import org.hcl.util.DBUtilTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({EmpDaoImplTest.class,DBUtilTest.class})
//@SelectPackages("org.hcl.dao")
public class AppTestSuite {

}

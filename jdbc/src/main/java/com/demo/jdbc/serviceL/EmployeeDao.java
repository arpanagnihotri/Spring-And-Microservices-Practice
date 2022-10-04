package com.demo.jdbc.serviceL;

import java.util.*;

public interface EmployeeDao {
	Employee getEmployee(int id);
	
	Set<Employee> getAllEmployee(Employee emp);
	boolean insertEmployee(Employee emp);
	boolean updateEmployee(Employee emp);
	boolean deleteEmployee(int id);
}

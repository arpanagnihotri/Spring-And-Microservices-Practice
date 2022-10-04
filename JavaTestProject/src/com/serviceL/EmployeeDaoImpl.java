package com.serviceL;

import java.sql.*;
import java.util.*;

import com.connectionL.ConnectionL;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public Employee getEmployee(int id) {
		try {
			Connection con=ConnectionL.connect();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee where id="+id);
			if(rs.next()) {
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setSalary(rs.getInt("salary"));
				return e;
			}	
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return null;
	}
	@Override
	public Set<Employee> getAllEmployee(Employee emp){
		try {
			Connection con=ConnectionL.connect();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			List<Employee>set= new ArrayList<>();
			while(rs.next()) {
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setSalary(rs.getInt("salary"));
				set.add(e);
			}
			Collections.sort(set);
			for(Employee i:set) {
				System.out.println("Employee [Id: "+i.getId()+" , Name: "+i.getName()+" , Salary: "+i.getSalary()+"]");
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return null;
	}
	@Override
	public boolean insertEmployee(Employee emp) {
		Connection con=ConnectionL.connect();
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1,emp.getId());
			ps.setString(2,emp.getName());
			ps.setInt(3,emp.getSalary());
			int i=ps.executeUpdate();
			if(i==1) {
				return true;
			}
		}
			catch(Exception ex) {
				System.out.println(ex);
			}
		return false;
	}
	@Override
	public boolean updateEmployee(Employee emp) {
		Connection con=ConnectionL.connect();
		try {
			PreparedStatement ps=con.prepareStatement("update employee set id=?,name=?,salary=? where id=?");
			ps.setInt(1,emp.getId());
			ps.setString(2,emp.getName());
			ps.setInt(3,emp.getSalary());
			ps.setInt(4,emp.getId());
			int i=ps.executeUpdate();
			if(i==1) {
				return true;
			}
		}
			catch(Exception ex) {
				System.out.println(ex);
			}
		return false;
	}
	@Override
	public boolean deleteEmployee(int id) {
		try {
			Connection con=ConnectionL.connect();
			Statement st=con.createStatement();
			int i=st.executeUpdate("delete from employee where id="+id);
			if(i==1) {
				return true;
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return false;
	}
}

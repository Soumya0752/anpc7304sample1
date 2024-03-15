package com.ems1.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.ems1.dao.EmployeeDao;
import com.ems1.entity.Employee;
import com.ems1.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao
{

	public Employee createEmployee(Employee employee) 
	{
		    try(Session session=HibernateUtil.getSession())
		    {
		    	  session.beginTransaction();
		    	  session.save(employee);
		    	  session.getTransaction().commit();
		    	  return employee;
		    }
		    catch(HibernateException e)
		    {
		    	System.out.println(e);
		    }
		    catch(Exception e)
		    {
		    	System.out.println(e);
		    }
			return null;
		    
		    
		    
	}

}

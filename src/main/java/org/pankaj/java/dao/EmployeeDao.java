package org.pankaj.java.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.pankaj.java.entity.Employee;

public class EmployeeDao {

	public EmployeeDao() {
	}

	public Employee getEmployeeFor(long pid) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Test");
		EntityManager em = factory.createEntityManager();

		Employee result = new Employee();
		StringBuilder sql = new StringBuilder(300);
		sql.append("SELECT e FROM Employee e ");
		sql.append("WHERE e.employeeId=:id");
		Query q = em.createNamedQuery("Employee.findAll").setParameter("idp", pid);
		Object[] rs = (Object[]) q.getSingleResult();
		result.setFirstName((String) rs[0]);
		return result;
	}
}

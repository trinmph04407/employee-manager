package vn.poly.sof305.group1.record.repositories.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import vn.poly.sof305.group1.common.bases.BaseRepository;
import vn.poly.sof305.group1.common.entities.Employee;
import vn.poly.sof305.group1.record.repositories.EmployeeRepository;

@Repository("reEmployeeRepository")
public class EmployeeRepositoryImpl extends BaseRepository implements EmployeeRepository{

	
	@SuppressWarnings("unchecked")
	public List<Employee> search(String name) {
		 StringBuilder queryStb = new StringBuilder("from Employee ");

	        // Add order conditional
	        queryStb.append(" order by nameStaff");

	        // Build query
	        Query query = this.getCurrentSession().createQuery(queryStb.toString());

	      

	        return query.list();
	}
}

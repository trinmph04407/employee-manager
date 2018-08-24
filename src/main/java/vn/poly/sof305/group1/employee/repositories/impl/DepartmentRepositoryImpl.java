package vn.poly.sof305.group1.employee.repositories.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import vn.poly.sof305.group1.common.bases.BaseRepository;
import vn.poly.sof305.group1.common.entities.Department;
import vn.poly.sof305.group1.employee.repositories.DepartmentRepository;

@Repository("emDepartRepositoryImpl")
public class DepartmentRepositoryImpl extends BaseRepository implements DepartmentRepository{

	@Override
	@SuppressWarnings("unchecked")
	public List<Department> select(String code) {
		
		 StringBuilder queryStb = new StringBuilder("from Department ");

	        // TODO

	        // Add order conditional
	        queryStb.append(" order by code");

	        // Build query
	        Query query = this.getCurrentSession().createQuery(queryStb.toString());

	     
	        return query.list();
	}
}

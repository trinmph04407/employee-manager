
package vn.poly.sof305.group1.department.repositories.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import vn.poly.sof305.group1.common.bases.BaseRepository;
import vn.poly.sof305.group1.common.entities.Department;
import vn.poly.sof305.group1.common.entities.Employee;
import vn.poly.sof305.group1.department.repositories.DepartmentRepository;

@Repository
public class DepartmentRepositoryImpl extends BaseRepository implements DepartmentRepository {

	@SuppressWarnings("unchecked")
	public List<Department> listDepartment() {
		List<Department> listDepart = this.getCurrentSession().createQuery("from Department").list();
		return listDepart;
	}

	public boolean create(Department department) {
		super.insert(department);
		return true;
	}
	
	public boolean update(Department department) {
		super.update(department);
		return true;
	}
	
	public Department select(Long id) {
		Department entity =  this.getCurrentSession().get(Department.class, id);
        return entity;
	}

	public boolean remove(Long id) {
		Session session = this.getCurrentSession();
		Department depart = session.get(Department.class, id);
		session.delete(depart);
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public boolean check(String code) {
		String hql = "FROM Department where code = '" + code + "'";
		List<Department> list = this.getCurrentSession().createQuery(hql).list();
		if (list.size() > 0) {
			return true;
		}
		return false;
	}	
	

}

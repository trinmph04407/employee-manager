package vn.poly.sof305.group1.employee.repositories;

import java.util.List;

import vn.poly.sof305.group1.common.entities.Department;

public interface DepartmentRepository  {
	
	List<Department> select(String code);
}

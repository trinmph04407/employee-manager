package vn.poly.sof305.group1.record.repositories;

import java.util.List;

import vn.poly.sof305.group1.common.entities.Employee;

public interface EmployeeRepository {
	List<Employee> search(String name);
}

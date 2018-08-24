package vn.poly.sof305.group1.employee.service.impl;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import vn.poly.sof305.group1.common.bases.BaseService;
import vn.poly.sof305.group1.common.dto.ListDataDto;
import vn.poly.sof305.group1.common.dto.ListPagingDto;
import vn.poly.sof305.group1.common.entities.Department;
import vn.poly.sof305.group1.common.entities.Employee;
import vn.poly.sof305.group1.common.utils.DataTransformUtil;
import vn.poly.sof305.group1.employee.dto.DepartmentDto;
import vn.poly.sof305.group1.employee.dto.EmployeeDto;
import vn.poly.sof305.group1.employee.repositories.DepartmentRepository;
import vn.poly.sof305.group1.employee.repositories.EmployeeRepository;
import vn.poly.sof305.group1.employee.service.EmployeeService;



@Service
public class EmployeeServiceImpl extends BaseService implements EmployeeService {
	
	@Autowired
	ServletContext context;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	@Qualifier("emDepartRepositoryImpl")
	DepartmentRepository departmentRepository;
	
	@Override
	public ListDataDto<EmployeeDto> listEmp(Long idDepart, String nameStaff, Long pn) {
		
		// Declare result data
				ListDataDto<EmployeeDto> listDataDto = new ListDataDto<EmployeeDto>();

				// Calculating paging
				ListPagingDto pagingDto = listDataDto.getPaging();
				pagingDto.setCurrentPage(pn);

				// Count record
				Long totalRecords = employeeRepository.count(idDepart, nameStaff);
				pagingDto.setTotalRecords(totalRecords);

				// Check no result data
				if (totalRecords.intValue() == 0) {
					return listDataDto;
				}

				// Get list major
				List<Employee> empList = employeeRepository.select(idDepart, nameStaff, pagingDto.getOffset(), pagingDto.getLimit());

				// Cast to major dto
				List<EmployeeDto> empListDto = new ArrayList<>();
				for (Employee employee : empList) {

					// Create new dto
					EmployeeDto empDto = (EmployeeDto) DataTransformUtil.transform(employee, EmployeeDto.class);

					Department depart = employee.getDepartment();
					empDto.setIdDepart(depart.getId());
					empDto.setNameDepart(depart.getNameDepart());
					empListDto.add(empDto);
				}

				// Set list into data dto
				listDataDto.setList(empListDto);

				// Return data list
				return listDataDto;
	}

	@Override
	public List<DepartmentDto> departmentDtos(String code) {
		List<Department> departmentList = departmentRepository.select(code);
		List<DepartmentDto> departmentDtoList = new ArrayList<>();
		for (Department department : departmentList) {
			departmentDtoList.add((DepartmentDto) DataTransformUtil.transform(department, DepartmentDto.class));
		}
		return departmentDtoList;
	}

	@Override
	public boolean create(EmployeeDto employeeDto) {
		Employee employee = (Employee) DataTransformUtil.transform(employeeDto, Employee.class);
		return employeeRepository.insert(employee);
	}

	@Override
	public boolean remove(Long id) {
		Employee employee = employeeRepository.select(id);
		if (employee == null) {
			throw new RuntimeException("Cannot find entity with id or It was deleted");
		}
		employeeRepository.remove(id);
		return true;
	}

	@Override
	public EmployeeDto detail(Long id) {
		Employee employee = employeeRepository.select(id);

		return (EmployeeDto) DataTransformUtil.transform(employee, EmployeeDto.class);
	}

	@Override
	public boolean update(EmployeeDto employeeDto) {
		Employee employee = employeeRepository.select(employeeDto.getId());

		if (employee == null) {
			throw new RuntimeException("Cannot find entity with id or It was deleted");
		}
			
		employee.setNameStaff(employeeDto.getNameStaff());
		employee.setGender(employeeDto.isGender());
		employee.setBirthday(employeeDto.getBirthday());
		employee.setPhoto(employeeDto.getPhoto());
		employee.setEmail(employeeDto.getEmail());
		employee.setPhone(employeeDto.getPhone());
		employee.setSalary(employeeDto.getSalary());
		employee.setNote(employeeDto.getNote());
		employee.setIdDepart(employeeDto.getIdDepart());
		
		employeeRepository.update(employee);
		
		return true;
	}

	@Override
	public boolean check(String code) {
		
		return employeeRepository.check(code);
	}
	
}

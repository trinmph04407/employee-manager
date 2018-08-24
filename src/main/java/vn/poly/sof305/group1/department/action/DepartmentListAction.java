package vn.poly.sof305.group1.department.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

import vn.poly.sof305.group1.department.dto.DepartmentDto;
import vn.poly.sof305.group1.department.service.DepartmentService;

@ResultPath("/views/department")
@InterceptorRef(value = "loginStack")
public class DepartmentListAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<DepartmentDto> listDepart;
	private DepartmentService departmentService;
	
	
	@Action(value = "department",results={@Result (name = SUCCESS, location = "listDepartment.jsp")})
	public String listDepartment() {
		listDepart = departmentService.list();
		return SUCCESS;

	}

	
	public List<DepartmentDto> getListDepart() {
		return listDepart;
	}

	public void setListDepart(List<DepartmentDto> listDepart) {
		this.listDepart = listDepart;
	}

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}

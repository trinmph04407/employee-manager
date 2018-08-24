package vn.poly.sof305.group1.employee.dto;

public class EmployeeDto {
		
	private Long id;
	
	private String code;
	
	private String nameStaff;

	private boolean gender;

	private String birthday;

	private String photo;

	private String email;

	private String phone;

	private float salary;

	private String note;
	
	private String nameDepart;
	
	private Long idDepart;
	
	
	
	public EmployeeDto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameStaff() {
		return nameStaff;
	}

	public void setNameStaff(String nameStaff) {
		this.nameStaff = nameStaff;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNameDepart() {
		return nameDepart;
	}

	public void setNameDepart(String nameDepart) {
		this.nameDepart = nameDepart;
	}

	public Long getIdDepart() {
		return idDepart;
	}

	public void setIdDepart(Long idDepart) {
		this.idDepart = idDepart;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}

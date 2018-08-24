/*
 * (C) Copyright 2018
 *
 * @auth Nguyen Van Doan
 * @date Jul 25, 2018
 */
package vn.poly.sof305.group1.account.form;

public class UpdateAccountForm {
	private Long id;
	private String username;
	private String password;
	private String fullname;

	public UpdateAccountForm() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

}

package vn.poly.sof305.group1.account.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

import vn.poly.sof305.group1.account.dto.AccountDto;
import vn.poly.sof305.group1.account.form.SearchAccountForm;
import vn.poly.sof305.group1.account.service.AccountService;
import vn.poly.sof305.group1.common.dto.ListDataDto;
import vn.poly.sof305.group1.common.dto.ListPagingDto;

@ResultPath("/views/account/")
@InterceptorRef(value = "loginStack")
public class AccountListAction extends ActionSupport {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private List<AccountDto> listAcc;
	private ListDataDto<AccountDto> ListDataDto;
	private ListPagingDto pagination;
	private SearchAccountForm searchAccountForm;
	private String username;
	private Long page;
	private AccountService accountService;

	@Action(value = "account", results = { @Result(name = SUCCESS, location = "listAccount.jsp") })
	public String listAccount() {
		SearchAccountForm form = new SearchAccountForm();
		form.setUsername(username);
		if (page != null) {
			ListDataDto = accountService.list(username, page);
		} else
			ListDataDto = accountService.list(username, page = 1L);	
		listAcc = ListDataDto.getList();
		pagination = ListDataDto.getPaging();
		return SUCCESS;

	}

	public List<AccountDto> getListAcc() {
		return listAcc;
	}

	public void setListAcc(List<AccountDto> listAcc) {
		this.listAcc = listAcc;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public ListDataDto<AccountDto> getListDataDto() {
		return ListDataDto;
	}

	public void setListDataDto(ListDataDto<AccountDto> listDataDto) {
		ListDataDto = listDataDto;
	}

	
	public ListPagingDto getPagination() {
		return pagination;
	}

	public void setPagination(ListPagingDto pagination) {
		this.pagination = pagination;
	}

	public SearchAccountForm getSearchAccountForm() {
		return searchAccountForm;
	}

	public void setSearchAccountForm(SearchAccountForm searchAccountForm) {
		this.searchAccountForm = searchAccountForm;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getPage() {
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

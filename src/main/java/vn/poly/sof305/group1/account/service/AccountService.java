package vn.poly.sof305.group1.account.service;

import java.util.List;

import vn.poly.sof305.group1.account.dto.AccountDto;
import vn.poly.sof305.group1.common.bases.BaseServiceInterface;
import vn.poly.sof305.group1.common.dto.ListDataDto;

public interface AccountService extends BaseServiceInterface {

	public List<AccountDto> list();

	AccountDto findOne(Long id);

	public boolean checkAuth(String userName, String password);

	boolean deleteAccount(Long id);

	boolean add(AccountDto accountDto);

	boolean update(AccountDto accountDto);
	
	boolean checkUsers(String userName);
	
	ListDataDto<AccountDto> list(String username, Long page);
}

package vn.poly.sof305.group1.account.repositories;

import java.util.List;

import vn.poly.sof305.group1.common.bases.BaseRepositoryInterface;
import vn.poly.sof305.group1.common.entities.Account;

public interface AccountRepository extends BaseRepositoryInterface {

	List<Account> listAccount();

	Account findOne(Long id);

	boolean checkAuth(String userName, String password);

	boolean deleteAccount(Long id);

	boolean add(Account acount);

	boolean update(Account account);

	boolean checkUsers(String userName);

	Long count(String username);

	List<Account> select(String username, int offset, int limit);
}

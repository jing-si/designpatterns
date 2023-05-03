package studyjava._06_adapter._02_after;

import studyjava._06_adapter._02_after.Account;
import studyjava._06_adapter._02_after.AccountService;
import studyjava._06_adapter._02_after.AccountUserDetails;
import studyjava._06_adapter._02_after.security.UserDetails;
import studyjava._06_adapter._02_after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {
    //우리가 만들어야 맞춰줘야 하는 Target Interface를 구현하고
    //우리가 원래 가지고 있는 Adaptee에 해당하는 클래스를 선언해 준다.
    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        //accountService는 당연히 Account를 넘겨준다.
        //account와 UserDetail을 연결하기 위하여 새로운 클래스를 생성한다.
        //
        Account account = accountService.findAccountByUsername(username);

        return new AccountUserDetails(account);
    }
}
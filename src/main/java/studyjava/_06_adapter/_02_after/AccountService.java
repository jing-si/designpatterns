package studyjava._06_adapter._02_after;

public class AccountService {
    //Sercurity가 아니라 우리가 어플리케이션에서 사용하는 객체
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

}

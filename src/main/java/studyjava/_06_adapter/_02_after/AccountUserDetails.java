package studyjava._06_adapter._02_after;

import studyjava._06_adapter._02_after.security.UserDetails;

public class AccountUserDetails implements UserDetails {
    //이것도 Adapter

    //Adapter를 별개의 클래스로 만들 때는 내가 Target도 adaptee도 손을 댈 수 없을 경우
    //별도의 클래스를 만들어서 해결할 수가 있다.

    //코드를 수정이 가능하다면 별도로 만들지 않고 기존 코드를 Adapter의 Target 인터페이스가
    //직접 처리할 수 있도록 인터페이스를 구현하여 처리 할 수 있다.
    //이 경우 코드 변경이 들어가지만 별도의 클래스르 생성하지 않고 처리 할 수도 있다.

    //객체 지향 방식에서는 원칙에 의해서 클래스를 나누는 것이 좋겠지만
    //실용적인 측면에서는 클래스를 변경하는 방식을 사용해야 할 수도 있다.


    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}

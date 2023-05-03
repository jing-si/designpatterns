package studyjava._06_adapter._02_after.security;

public class LoginHandler {
    //Spring Sercurity에 포함된
    //login을 처리하는 간단한 메서드

    //Client 코드는 LoghinHandler
    //Client 코드에서 사용하는 userDetailsService와 UserDetails가 Target 객체


    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }
}

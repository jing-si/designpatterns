package studyjava._06_adapter._01_before.security;

public interface UserDetailsService {
    //Spring Sercurity에 포함된
    //User정보를 읽어드리는 간단한 메서드
    UserDetails loadUser(String username);

}

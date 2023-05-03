package studyjava._06_adapter._01_before.security;

public interface UserDetails {
    //Spring Sercurity에 포함된
    //User 정보와 Password를 저장하는 객체
    String getUsername();

    String getPassword();

}

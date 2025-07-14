package builder;

public class MemberCreator {
    private final String username; //필수
    private final String password; //필수
    private final String email; //선택
    private final String phone; //선택
    private final String address; //선택

    public MemberCreator(String username, String password, String email, String phone, String address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    // 필수 값을 지정하는 생성자
    public MemberCreator(String username, String password){
        this(username, password, "", "", "");
    }
    // 필수 값 + email 지정 생성자
    public MemberCreator(String username, String password, String email){
        this(username, password, email, "", "");
    }
    // 필수 값 + email, phone 지정 생성자
    public MemberCreator(String username, String password, String email, String phone){
        this(username, password, email, phone, "");
    }
}

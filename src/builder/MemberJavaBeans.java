package builder;

public class MemberJavaBeans {
    private String username = ""; //필수
    private String password = ""; //필수
    private String email = ""; //선택
    private String phone = ""; //선택
    private String address = ""; //선택

    public MemberJavaBeans() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

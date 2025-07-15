package object_creation_destruction.builder;

public class MemberBuilder {
    private final String username; //필수
    private final String password; //필수
    private final String email; //선택
    private final String phone; //선택
    private final String address; //선택

    public static class Builder {
        private final String username;
        private final String password;

        private String email = "";
        private String phone = "";
        private String address = "";

        public Builder(String username, String password){
            this.username = username;
            this.password = password;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public MemberBuilder build(){
            return new MemberBuilder(this);
        }
    }
    private MemberBuilder(Builder builder){
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }
}

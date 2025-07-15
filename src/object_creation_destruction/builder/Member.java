package object_creation_destruction.builder;

public abstract class Member {
    private final String username;
    private final String password;
    private final String email;

    abstract static class Builder<T extends Builder<T>> {
        private final String username;
        private final String password;
        private String email = "";
        public Builder(String username, String password){
            this.username = username;
            this.password = password;
        }

        public T email(String email){
            this.email = email;
            return self();
        }

        abstract Member build();

        protected abstract T self();
    }

    Member(Builder<?> builder){
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
    }
}

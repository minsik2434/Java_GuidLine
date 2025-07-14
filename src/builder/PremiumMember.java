package builder;

public class PremiumMember extends Member {
    private final int loyaltyPoints;

    private PremiumMember(Builder builder){
        super(builder);
        this.loyaltyPoints = builder.loyaltyPoints;
    }

    public static class Builder extends Member.Builder<Builder> {
        private int loyaltyPoints = 0;

        public Builder(String username, String password){
            super(username, password);
        }

        @Override
        public PremiumMember build(){
            return new PremiumMember(this);
        }

        @Override
        protected Builder self(){
            return this;
        }

        public Builder loyaltyPoints(int points){
            this.loyaltyPoints = points;
            return self();
        }
    }
}

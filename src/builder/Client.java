package builder;

    public class Client {
        public static void main(String[] args) {
            //점층적 생성자 패턴
            MemberCreator creator = new MemberCreator("user1", "pass");

            //자바 빈즈 패턴
            MemberJavaBeans javaBeans = new MemberJavaBeans();
            javaBeans.setUsername("user2");
            javaBeans.setPassword("pass");
            javaBeans.setAddress("서울");

            //빌더 패턴
            MemberBuilder builder = new MemberBuilder.Builder("user3", "pass")
                    .email("minsik")
                    .address("수원")
                    .phone("010-1234-5678").build();

            //계층 빌더 패턴
            PremiumMember premiumMember = new PremiumMember.Builder("user4", "pass")
                    .email("minsik")
                    .loyaltyPoints(3)
                    .build();

        }
    }

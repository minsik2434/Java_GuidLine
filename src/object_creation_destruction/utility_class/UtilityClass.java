package object_creation_destruction.utility_class;

// 클래스 인스턴스화를 막음
public class UtilityClass {
    private UtilityClass(){
        throw new AssertionError();
    }
}

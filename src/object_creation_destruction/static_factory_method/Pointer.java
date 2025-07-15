package object_creation_destruction.static_factory_method;

public class Pointer {
    protected int x;
    protected int y;

    private static Pointer pointer = new Pointer(0, 0);

    protected Pointer(int x, int y){
        this.x = x;
        this.y = y;
    }

    // 1, 이름을 지정할 수 있다
    public static Pointer of(int x, int y){
        return new Pointer(x, y);
    }

    // 2. 호출할 때 마다 인스턴스를 새로 생성하지 않아도 된다
    public static Pointer getInstance(){
        return pointer;
    }

    // 3. 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다
    public static Pointer getType(int x, int y, boolean isLeftClick){
        return new MousePointer(x, y, isLeftClick);
    }

    // 4. 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다
    public static Pointer getType(int x, int y, String type){
        if (type.equals("Mouse")){
            return new MousePointer(x, y, false);
        } else {
            return new TouchPointer(x, y, false);
        }
    }

    // 5. 정적 팩토리 메서드를 작성하는 시점에 반환할 객체의 클래스가 존재하지 않아도 된다
    public static Pointer notExist(){
        throw new UnsupportedOperationException("추후 구현 예정");
    }
}

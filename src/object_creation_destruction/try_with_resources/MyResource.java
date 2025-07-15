package object_creation_destruction.try_with_resources;

public class MyResource implements AutoCloseable{

    public MyResource(){
        System.out.println("자원이 열림");
    }

    public void doSomething(){
        System.out.println("작업 수행");
    }

    @Override
    public void close() throws Exception {
        System.out.println("자원이 닫힘");
    }
}

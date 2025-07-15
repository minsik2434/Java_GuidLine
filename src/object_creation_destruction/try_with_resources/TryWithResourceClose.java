package object_creation_destruction.try_with_resources;

public class TryWithResourceClose {
    public static void resourceClose(){
        try(MyResource resource = new MyResource()){
            resource.doSomething();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

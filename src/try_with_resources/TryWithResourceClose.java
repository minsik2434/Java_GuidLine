package try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourceClose {
    public static void resourceClose(){
        try(MyResource resource = new MyResource()){
            resource.doSomething();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

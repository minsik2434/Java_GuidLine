package object_creation_destruction.singleton;

public class DatabaseSourceFinal {
    public static final DatabaseSourceFinal INSTANCE = new DatabaseSourceFinal();
    private DatabaseSourceFinal(){
    }
}

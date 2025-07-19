package class_interface.immutable_class;

public class Version {
    private String name;
    private int version;

    private Version(String name, int version){
        this.name = name;
        this.version = version;
    }

    public static Version valueOf(String name, int version){
        return new Version(name, version);
    }
}

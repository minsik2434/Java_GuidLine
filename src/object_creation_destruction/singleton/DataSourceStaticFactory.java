package object_creation_destruction.singleton;

public class DataSourceStaticFactory {
    private static final DataSourceStaticFactory INSTANCE = new DataSourceStaticFactory();

    private DataSourceStaticFactory(){
    }

    public static DataSourceStaticFactory getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }
}

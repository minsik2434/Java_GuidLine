package method.empty_collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<String> stock;
    public static void main(String[] args) {

    }

    public List<String> getStock(){
        return new ArrayList<>(stock);
    }
}

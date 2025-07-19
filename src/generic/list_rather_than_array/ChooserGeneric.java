package generic.list_rather_than_array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserGeneric<T> {
    private final List<T> choiceList;

    public ChooserGeneric(Collection<T> choiceList) {
        this.choiceList = new ArrayList<>(choiceList);
    }

    public T choose(){
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}

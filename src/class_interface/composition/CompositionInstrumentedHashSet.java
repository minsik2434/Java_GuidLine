package class_interface.composition;

import java.util.Collection;
import java.util.Set;

public class CompositionInstrumentedHashSet<E> extends ForwardingSet<E>{
    private int addCount = 0;

    public CompositionInstrumentedHashSet(Set<E> s){
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount(){
        return addCount;
    }
}

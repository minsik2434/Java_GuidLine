package enum_annotation.enumset_instead_of_ordinal;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class Plant {
    enum LifeCycle {ANNUAL, PERENNIAL, BIENNIAL}

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle){
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString(){
        return name;
    }

    public static void main(String[] args) {

        Plant[] garden = {new Plant("한해살이풀", LifeCycle.ANNUAL),
                new Plant("여러해살이 풀", LifeCycle.PERENNIAL),
                new Plant("두해살이 풀", LifeCycle.BIENNIAL)};

        Map<LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
        for(Plant.LifeCycle lc : Plant.LifeCycle.values()){
            plantsByLifeCycle.put(lc, new HashSet<>());
        }
        for(Plant p : garden){
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        }

        System.out.println(Arrays.stream(garden).collect(groupingBy(p -> p.lifeCycle,
                () -> new EnumMap<>(LifeCycle.class), toSet())));

    }
}

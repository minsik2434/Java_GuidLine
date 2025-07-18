package class_interface.inheritance;

import java.time.Instant;

public class Sub extends Super{
    private final Instant instant;

    Sub(){
        instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}

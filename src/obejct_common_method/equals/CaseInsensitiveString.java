package obejct_common_method.equals;

import java.util.Objects;

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s){
        this.s = Objects.requireNonNull(s);
    }

    //대칭성 위배
//    @Override
//    public boolean equals(Object o) {
//        if(o instanceof CaseInsensitiveString){
//            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
//        }
//        if(o instanceof String){
//            return s.equalsIgnoreCase((String) o);
//        }
//        return false;
//    }

    //대칭성 준수
    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }
}

package class_interface.access_rights;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Member {

    // private 접근자로 캡슐화
    private String name;
    private String id;

    //상수라면 public static final 로 공개해도 좋음
    public static final int MAX_NAME_LENGTH = 30;

//    public static final 배열 필드는 두어서는 안됨 외부에서 해당 필드를 수정할 수 있음
//    public static final String[] VALUE = {"1", "2"};

    private static final String[] PRIVATE_VALUE = {"1", "2"};
    public static final List<String> VALUES  = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUE));

    public static final String[] values(){
        return PRIVATE_VALUE.clone();
    }
}

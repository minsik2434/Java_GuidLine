package obejct_common_method.equals;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        System.out.println(cis.equals(s)); //true
        System.out.println(s.equals(cis)); //false

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);
        System.out.println(list.contains(s)); //false

    }
}

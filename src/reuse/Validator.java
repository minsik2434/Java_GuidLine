package reuse;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Validator {
    public static boolean isValidPhoneNumber(String number){
        return number.matches("^01[016789]-\\d{3,4}-\\d{4}$");
    }
}

package reuse;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class ValidatorReuse {
    private static final Pattern phoneNumber = Pattern.compile("^01[016789]-\\d{3,4}-\\d{4}$");
    public static boolean isValidPhoneNumber(String number){
        return phoneNumber.matcher(number).matches();
    }
}

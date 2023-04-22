package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TypeValidator {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String TYPE_REGEX = "^[MPE]$";

    public TypeValidator() {
        pattern =Pattern.compile(TYPE_REGEX);
    }
    public boolean validate(String staffType){
       Matcher matcher = pattern.matcher(staffType);
        return matcher.matches();
    }
}

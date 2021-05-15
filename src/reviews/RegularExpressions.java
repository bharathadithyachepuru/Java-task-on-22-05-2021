package reviews;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("Aditya", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("Bharath");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }

	}

}

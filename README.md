import java.util.ArrayList;
import java.util.List;

public class Distinct {

public static void main(String[] args) {

    String  str1 = "workitems are stuck inprogress";  
    String  str2 = "transformation mappting failing";
    String  str3 = "not able to transform failing";
    String  str4 = "workitems are not progressing";
    String  str5 = "tickets are stuck inprogress";
    String  str6 = "inward mapping is failing";
    
 	String[] words1 = str1.split(" ");
 	String[] words2 = str2.split(" ");
 	String[] words3 = str3.split(" ");
 	String[] words4 = str4.split(" ");
 	String[] words5 = str5.split(" ");
 	String[] words6 = str6.split(" ");

    int numberOfStrings = 6;
    List<String[]> strings = new ArrayList<>();
    strings.add(words1);
    strings.add(words2);
    strings.add(words3);
    strings.add(words4);
    strings.add(words5);
    strings.add(words6);
 
    for (int i = 0; i < numberOfStrings; i++) {	
        for (int j = i+1; j < numberOfStrings;j++) {	
            boolean output = wordsInBoth(strings.get(i), strings.get(j));
            System.out.println((i+1)+" "+(j+1)+" "+output);
    }
    }
}

public static boolean wordsInBoth(String[] words1, String[] words2) { 

    for (int i = 0; i < words1.length; i++) {
        for (int j = 0; j < words2.length; j++) {
            if (words1[i].equalsIgnoreCase(words2[j]))
                return true;
        }
    }

    return false;
}
}

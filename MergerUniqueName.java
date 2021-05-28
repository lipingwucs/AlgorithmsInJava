import java.util.ArrayList;
import java.util.Arrays;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
       // throw new UnsupportedOperationException("Waiting to be implemented.");
     
        ArrayList <String> uniqueNames = new ArrayList<String>();
        
        for (String n1: names1){
            if (! uniqueNames.contains(n1))
            uniqueNames.add(n1);
        }
        for (String n2: names2){
            if (! uniqueNames.contains(n2))
            uniqueNames.add(n2);
        }
        String[] arrUnique = uniqueNames.toArray(new String[0]);
        return arrUnique;
       // throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia",  "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma", "Ava",};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
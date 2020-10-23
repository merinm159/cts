import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


//import the necessary packages if needed

@SuppressWarnings("unchecked") // Do not delete this line
public class UniqueWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		UniqueWords u = new UniqueWords();
		System.out.println("Enter Student's Article");
		String inputstring = input.next();
		String[] stringarray = inputstring.split("[\\s.,'?!:;]");
		
		System.out.println("Number of words "+stringarray.length);
		
		Set<String> uniq=new TreeSet<String>();
        Set<String> dups=new TreeSet<String>();
        for(String strarray:stringarray) {
            if(!uniq.add(strarray))
                dups.add(strarray);
        }
        uniq.removeAll(dups);
        System.out.println("Number of unique words "+uniq.size());
        
        System.out.println("The words are");
        for(String w:uniq){
        	System.out.println(w);
        }

	}
}
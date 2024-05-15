import java.util.*;
public class Index {
   public static void main(String[] args) {
      String str = "He is the one and only one male person in our team";
      String word = "one";
      int lastindex = -1;
      int index = str.indexOf(word);
      while (index != -1) {
         lastindex = index;
         index = str.indexOf(word, index + 1);
      }
      if (lastindex == -1) {
         System.out.println("The word not present in string.");
      } else {
         System.out.println("The last index  is " + lastindex);
      }
   }
}
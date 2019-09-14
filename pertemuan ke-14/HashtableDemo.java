import java.util.*;
public class HashtableDemo
{
    public static void main(String args[])
    {
       Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
       ht.put(10, "Chaitanya");
       ht.put(1, "Ajeet");
       ht.put(11, "Test");
       ht.put(9, "Demo");
       ht.put(3, "Anuj");
 
       Set set = ht.entrySet();
              Iterator i = set.iterator();
              while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
   }
}

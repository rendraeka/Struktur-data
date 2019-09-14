import java.util.*;
public class TreeMapDemo
{
   public static void main(String args[])
   {
      TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
      tm.put(10, "Chaitanya");
      tm.put(1, "Ajeet");
      tm.put(11, "Test");
      tm.put(9, "Demo");
      tm.put(3, "Anuj");
            Set set = tm.entrySet();
            Iterator i = set.iterator();
            while(i.hasNext()) {
        Map.Entry me = (Map.Entry)i.next();
        System.out.print(me.getKey() + ": ");
        System.out.println(me.getValue());
      }
  }
}

import java.util.*;

public class Example{
//private List<String> list;
    private List list;
public List getList(){
return list;
}

Example() {
list = new ArrayList();
list.add(new String("Hello world!"));
list.add(new String("Good bye!"));
list.add(new String("hELLO!"));

}

public void printList() {
for (Object s:list) {
System.out.println(s);
}
}

public static void main(String argv[]) {
Example e = new Example();
e.printList();
Collections.sort(e.getList());
e.printList();
}
}


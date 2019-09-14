 import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.JFrame;

public class PercobaanLinkedList extends JFrame {

public static void main(String args[]){
  new PercobaanLinkedList();
  }

  LinkedList l1 = new LinkedList();
  PercobaanLinkedList() {
    l1.add("Test LinkedList");
    l1.add("Coba lagi");
    l1.add(10243);

    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setVisible(true);
    setTitle("Test LinkedList");
}
public void paint(Graphics g) {
  g.drawString("Jumlah Elemen : "+String.valueOf(l1.size()),10,50);
  g.drawString("Elemen ke-1 : "+l1.get(0), 10, 100);
  g.drawString("Elemen ke-2 : "+l1.get(1), 10, 150);
  g.drawString("Elemen ke-3 : "+l1.get(2), 10, 200);
  g.drawString("Method getFirst(): "+l1.getFirst(),10,250);
  g.drawString("Method getLast() : "+l1.getLast(),10,300);
  l1.addLast("Terakhir");
  g.drawString("Method getLast() : "+l1.getLast(),10,350);
  l1.remove();
  g.drawString("Jumlah Elemen Sekarang : " +String.valueOf(l1.size()), 10, 400);
  }
  }


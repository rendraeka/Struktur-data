import java.util.*;
class Node{
char data;
Node left;
Node right;
Node(char x){
this.data = x;
}

}
public class BinarySearchTree {
private Node root;
private boolean isEmpty() {
return (root == null);
}

public void insert(char input) {
Node temp = new Node(input);
if (isEmpty())
root = temp;
else {
Node cursor = root,
parent = null;
while (cursor != null){
parent = cursor;
if (input < cursor.data)
cursor = cursor.left;
else
cursor = cursor.right;
}
if (input < parent.data) {
parent.left = temp;
return;
}
else {
parent.right = temp;
return;
}
}
}

public boolean delete(int key){
Node cursor = root,
parent = null;
boolean found = false,
isLeftChild = true; //menandai apakah Node yang dihapus merupakan left child
if (!isEmpty()) {
while (cursor != null){
parent = cursor;
if (key == cursor.data){
found = true;
break;
}
else if (key < cursor.data){
isLeftChild = true;
cursor = cursor.left;
}
else {
isLeftChild = false;
cursor = cursor.right;
}
}
if (!found)
return false;
else {
if (cursor.left == null && cursor.right == null){
if (cursor == root)
root = null;
else if (isLeftChild)
parent.left = null;
else
parent.right = null;
}
else if (cursor.left == null){
if (cursor == root)
root = cursor.right;
else if (isLeftChild)
parent.left = cursor.right;
else
parent.right = cursor.right;
}
else if (cursor.right == null){
if (cursor == root)
root = cursor.left;
else if (isLeftChild)
parent.left = cursor.left;
else
parent.right = cursor.left;
}
else {
Node successor = getSuccessor(cursor);
if (cursor == root)
root = successor;
else if (isLeftChild)
parent.left = successor;
else
parent.right = successor;
successor.right = cursor.right;
}
}
}
return true;
}
private Node getSuccessor(Node localNode){
Node parent = null,
successor = localNode,
cursor = localNode.left;
while (cursor != null){
parent = successor;
successor = cursor;
cursor = cursor.right;
}
if (successor != localNode.left){
parent.right = successor.left;
successor.left = localNode.left;
}
return successor;
}
public void traverse(int tipe){
switch (tipe){
case 1:
System.out.print("\nPreorderersal:\n");
preOrder(root);
break;
case 2:
System.out.print("\nInorderersal:\n");
inOrder(root);
break;
case 3:
System.out.print("\nPostorderersal:\n");
postOrder(root);
break;
}
System.out.println("\n");
}
private void preOrder(Node localRoot){
if (localRoot == null) return;
System.out.print(localRoot.data+" ");
preOrder(localRoot.right);
preOrder(localRoot.left);
}
private void inOrder(Node localRoot){
if (localRoot == null) return;
inOrder(localRoot.left);
System.out.print(localRoot.data+" ");
inOrder(localRoot.right);
}
private void postOrder(Node localRoot){
if (localRoot == null) return;
postOrder(localRoot.left);
postOrder(localRoot.right);
System.out.print(localRoot.data+" ");
}
public static void main(String[] args) {
BinarySearchTree a = new BinarySearchTree();
a.insert('S');
a.insert('T');
a.insert('M');
a.insert('I');
a.insert('K');
a.traverse(1); //pre-order
a.traverse(2); //in-order
a.traverse(3); //post-order
}
}

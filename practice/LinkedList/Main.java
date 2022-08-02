package practice.LinkedList;
/*

Write a program to :
Add in first position in single ll
add in last position
insert in particular index
Delete in first position in single ll
Delete in last position
Delete in particular index

search a element in ll

*/

public class Main {
    public static void main(String[] args) {
        LL list =new LL();
        list.insertFirst(3);
        list.insertFirst(21);
        list.insertLast(6);
        list.insertLast(3);
        list.insertLast(6);
        list.insertLast(2);
        list.insertLast(1);
        list.insertLast(0);
        list.insert(7,1);
        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.delete(2));

        list.display();
        System.out.println(list.find(6));
    }
}

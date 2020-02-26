package Bai_6_Cau_Truc_Du_Lieu_Va_Giai_Thuat_Co_Ban.Thuc_Hanh.Trien_Khai_Lop_Linkedlist_Don_Gian;
//chưa hiểu vị trí chèn vào add.
public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        //ll.add(7, 6);
        ll.add(8, 6);
        ll.add(4, 9);
        ll.printList();
    }

}

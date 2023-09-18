package Collection;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Иван", 2);
        Student2 st2 = new Student2("Владимир", 1);
        Student2 st3 = new Student2("Мария", 4);
        Student2 st4 = new Student2("Игорь", 3);
        Student2 st5 = new Student2("Яна", 1);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);

        System.out.println("LinkedList " + student2LinkedList);
        System.out.println("\n==============================\n");
        Student2 st6 = new Student2("Святослав",3);
        student2LinkedList.add(1,st6);
        System.out.println(student2LinkedList);

        System.out.println(student2LinkedList.get(3));




    }
}
class Student2 {
    private String name;
    private int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
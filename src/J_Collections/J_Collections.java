package J_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class J_Collections {
    public static void main(String[] args) {

        //List - linkedList , arrayList

        ArrayList<Student> arrayList = new ArrayList<>();

//        using constructor
        Student std = new Student(1, "kv");
        arrayList.add(std);

        // System.out.println(arrayList.get(0).getName());

        //using setter and default constructor
        Student stdSetter = new Student();
        stdSetter.setName("chaitanya");
        stdSetter.setRoll_no(2);
        arrayList.add(stdSetter);

        //System.out.println(arrayList.get(1).getName());

        //using constructor
        arrayList.add(new Student(3, "vishwa"));

        //update using constructor
        arrayList.set(1, new Student(1, "update"));

        System.out.println("----Before removing");
        for (Student x : arrayList) {

        }

            //to remove
            arrayList.remove(0);

            System.out.println("----After removing-------");
            for (Student i : arrayList) {
                System.out.println(i.getName());
            }

            //LinkedList
        LinkedList<Student> students=new LinkedList<>();
            students.add(new Student(1,"chaitanya"));
        System.out.println(students.get(0).getName());
        }
}
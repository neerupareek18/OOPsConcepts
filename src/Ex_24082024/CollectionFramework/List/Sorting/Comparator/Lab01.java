package Ex_24082024.CollectionFramework.List.Sorting.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab01 {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Neeru");
       Student s2 = new Student(1, "Amaya");
       Student s3 = new Student(3, "L");

        List l = new ArrayList();
        l.add(s1);
        l.add(s2);
        l.add(s3);

        System.out.println(l); //This will give the Object ID in the console
        //To get the data, need to override toString method in Student Class

        //Collections.sort(l); //It will give the Runtime Error as JVM doesn't know about how Student data is stored and how to sort it
        //We need to explicitly implemet Comparable/Comparator for this
        Collections.sort(l, new SortById());
        System.out.println(l);

        Collections.sort(l, new SortByIdDesc());
        System.out.println(l);

        Collections.sort(l, new SortByName());
        System.out.println(l);

        Collections.sort(l, new SortByNameDesc());
        System.out.println(l);
    }
}

//Comparator in these classes to be implemented
class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class SortByNameDesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
class SortById implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}
class SortByIdDesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}

class Student implements Comparable<Student> {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id= " + this.id + ", name= " + this.name + "}";
    }

    //We can use only one compare at a time, either by id or by name
    @Override
    public int compareTo(Student o) {
        return CharSequence.compare(this.name, o.name);
    }
//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.id,o.id);
//    }


}


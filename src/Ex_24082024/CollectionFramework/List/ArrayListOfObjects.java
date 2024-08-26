package Ex_24082024.CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Neeru");
        Student s2 = new Student(2, "Amaya");
        Student s3 = new Student(3, "L");

        List l = new ArrayList();
        l.add(s1);
        l.add(s2);
        l.add(s3);

        System.out.println(l); //This will give the Object ID in the console
        //To get the data, need to override toString method in Student Class


    }
}

   class Student{
        private int id;
        private String name;
        Student(int id, String name){
            this.id = id;
            this.name=name;
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
            return "Student{id= "+this.id+", name= "+this.name+"}";
        }


    }

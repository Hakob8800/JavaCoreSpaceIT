package chapter14;

import homeWork.medicalCenter.model.Doctor;

import java.util.Set;
import java.util.TreeSet;

public class CollectionsExample {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("ono");
        names.add("vaxo");
        names.add("hrant");
        names.add("misho");
        Set<String> names2 = new TreeSet<>();
        names2.add("sako");
        names2.add("peto");
        names2.add("ske");
        names2.add("masha");
        names.addAll(names2);
        for (String name : names) {
            System.out.println(name);
        }


        Set<Student> students = new TreeSet<>();
        students.add(new Student(23));
        students.add(new Student(33));
        students.add(new Student(23));
        for (Student student : students) {
            System.out.println(student);
        }

    }
    private static class Student implements Comparable<Student>{
        int age;
        Student(int a){
            age=a;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            if(age==o.age){
                return 0;
            } else if (age > o.age) {
                return 1;
            }
            else return -1;
        }
    }
}

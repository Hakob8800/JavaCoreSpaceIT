package chapter14;

import homeWork.employeesAndCompanys.model.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenClassDemo {
    public static void main(String[] args) {

        GenClass<Integer> num = new GenClass<>(23);
        GenClass<String> str = new GenClass<>("Hello");
        GenClass<Employee> emp = new GenClass<>(new Employee());
        TwoGen<String,Integer> tg = new TwoGen<>("hi",2);

        Integer[] intArr = {2,3,5,6,7};
        Double[] doubleArr = {2.5,3.4,5.4,6.2,7.2};

        Stats<Integer> iStats = new Stats<>(intArr);
        Stats<Double> dStats = new Stats<>(doubleArr);

        System.out.println(num.showType());
        System.out.println(str.showType());
        System.out.println(emp.showType());

        System.out.println(iStats.average());
        System.out.println(dStats.average());
        System.out.println(tg.t);
        System.out.println(tg.v);
    }
}

package chapter12.annotations;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "hello", val = 100)
    public static void method() {
        Meta meta = new Meta();
        Class<?> c = meta.getClass();
        try {
            Method meth = c.getMethod("method");
            MyAnno annotation = meth.getAnnotation(MyAnno.class);
            System.out.println(annotation.str() + " " + annotation.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method has not founds");
        }
    }

    public static void main(String[] args) {
        method();
    }
}

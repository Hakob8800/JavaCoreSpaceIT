package chapter12.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnno(str = "for class", val = 10)
@What(description = "annotation 2 for class")
public class Meta2 {
    @MyAnno(str = "for meth", val = 5)
    @What(description = "annotation 2 for method")
    public static int myMeth() {
        Meta2 meta2 = new Meta2();
        Class<?> c = meta2.getClass();
        Annotation[] annotations = c.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        try {
            Method method = meta2.getClass().getMethod("myMeth");
            Annotation[] methodAnnotations = method.getAnnotations();
            for (Annotation methodAnnotation : methodAnnotations) {
                System.out.println(methodAnnotation);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method is not found");
        }
        return 1;
    }

    public static void main(String[] args) {
        myMeth();
    }
}

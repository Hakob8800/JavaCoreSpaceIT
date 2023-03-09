package chapter14;

public class GenClass<T> {
    T ob;

    GenClass(T ob) {
        this.ob = ob;
    }
    public String showType(){
        return ob.getClass().getName();
    }
}

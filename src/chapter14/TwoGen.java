package chapter14;

public class TwoGen <T,V>{

    T t;
    V v;
    TwoGen(T t,V v){
        this.t = t;
        this.v = v;
    }

    T getT(){
        return t;
    }
    V getV(){
        return v;
    }
}

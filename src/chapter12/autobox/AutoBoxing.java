package chapter12.autobox;

public class AutoBoxing {
    public static void main(String[] args) {
        Integer iob = 23;
        Boolean b = false;
        int i = 20;
        if(iob>i){
            b = true;
        }
        if(b){
            iob++;
            System.out.println("iob ="+iob);
        }
    }
}

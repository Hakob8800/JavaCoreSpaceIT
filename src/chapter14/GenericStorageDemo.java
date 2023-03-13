package chapter14;

public class GenericStorageDemo {
    public static void main(String[] args) throws NoSuchFieldException {

        GenericStorage<String> names = new GenericStorage<>();
        names.add("poxos");
        names.add("petros");
        names.add("vaxo");
        System.out.println(names.getElement(1).getClass());
        System.out.println(names.getClass().getDeclaredField("arr").getType());

    }

}

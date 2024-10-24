package GenericsAndWrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        Integer obj = new Integer(12);

        Integer obj2 = Integer.valueOf("14");

        System.out.println(obj2 * 4);

        Integer obj3 = 18; // This is 'AutoBoxing' -> this wrapper class is directly storing the int value in box this is done by java.

        int age = obj; // This is 'UnBoxing' -> we can directly use the object in the int value of wrapper class.
    }
}

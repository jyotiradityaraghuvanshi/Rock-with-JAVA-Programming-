package OOPs;

public class autoAndunBoxing {
    public static void main(String[] args) {
        int value = 10;
        Integer val1 = value;  // This is Autoboxing-> automatically java gives the value to object without calling constructor.
        Integer val2 = new Integer(value); /* here 'Integer' is a Wrapper class i.e. inbuilt class in java used for
         making java A pure oop language and makes everything as class and object. */

        System.out.println(val1); // this is Unboxing -> unbox the value from the memory.
        System.out.println(val2);

        char store = 'a';
        Character save = store; // autoboxing
        System.out.println(save); // unboxing
    }
}

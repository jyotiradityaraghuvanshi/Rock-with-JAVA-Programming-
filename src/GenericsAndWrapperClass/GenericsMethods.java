package GenericsAndWrapperClass;

public class GenericsMethods {
    public static void main(String[] args) {
        GenericsMethods obj = new GenericsMethods();
        printDate("Adarsh shekhar acciojob se.");
        printDate(8112003);

        obj.<String>getData("24/10/2024");

        System.exit(0x9);
    }

    public static <E> void printDate(E data){
        System.out.println(data);
    }

    public <J> void getData(J inf){
        System.out.println(inf);
    }
}

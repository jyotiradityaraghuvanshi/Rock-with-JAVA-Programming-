package OOPs;
class High{
    int height;
    int length;
    int width;
    High(int height, int length){
         this(height,length,0);
    }
    High(int height, int length, int width){
        this.height = height;
        this.length = length;
        this.width = width;
    }
    // analyze this join function carefully.
    High join(High obj){
        this.height+= obj.height;
        this.length+=obj.length;
        this.width+= obj.width;

        return this;
    }
}
public class returnThis {
    public static void main(String[] args) {
        High obj1 = new High(8,6);
        High obj2 = new High(8, 6 , 2);

        High obj3 = obj1.join(obj2); // now obj1 address has been given to obj3 i.e. now obj1 all the parameters has been changed too.
        High obj4 = obj2.join(obj1); // here now we are adding the changed parameters of obj1 to obj2 and its address has been given to obj4.
        System.out.println(obj3.height + " " + obj3.length + " " + obj3.width);
        System.out.println(obj4.height + " " + obj4.length + " " + obj4.width);

    }
}

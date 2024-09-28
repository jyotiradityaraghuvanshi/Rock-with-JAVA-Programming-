package OOPs;

class Cuboid{
    int height;
    int length;
    int width;
    Cuboid(){
        this(1);
    }
    Cuboid(int height){
        this(height,height,height);
    }
    Cuboid(int height, int length){
        this(height,length,0);
    }
    Cuboid(int height, int length, int width){
        System.out.println(this.height + " " + this.length + " " + this.width);
        this.height = height;
        this.length = length;
        this.width = width;
        System.out.println(this.height + " " + this.length + " " + this.width);
    }
    int volume(){
        return this.area()*this.height;
    }
    int area(){
        return this.length*this.width;
    }
// This is Constructor Chaining.
}
public class chainingConstructor {
    public static void main(String[] args) {
        Cuboid obj1 = new Cuboid();
        Cuboid obj2 = new Cuboid(8);
        Cuboid obj3 = new Cuboid(8, 6);
        Cuboid obj4 = new Cuboid(8,6,2);

        System.out.println(obj1.volume() + " " + obj1.area());
        System.out.println(obj2.volume() + " " + obj2.area());
        System.out.println(obj3.volume() + " " + obj3.area());
        System.out.println(obj4.volume() + " " + obj4.area());

    }
}

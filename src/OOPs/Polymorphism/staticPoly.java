package OOPs.Polymorphism;

class Run{
    int gear;
    String engine;
    Run(){}
    Run(int g , String s){
        this.gear = g;
        this.engine = s;
    }
}
class Fly_run extends Run{
    String pedals;
    Fly_run(String pedals){
        this.pedals = pedals;
    }
    void display(){
        System.out.println(this.pedals + " " + this.engine + " " + this.gear);
    }

    void display(int a , int b){
        System.out.println("Another same name method is call");
    }

}

public class staticPoly {
    public static void main(String[] args) {

        Fly_run obj = new Fly_run("rooter");
    }
}

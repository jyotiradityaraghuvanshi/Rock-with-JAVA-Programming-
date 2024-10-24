package GenericsAndWrapperClass;

public class LearnGenerics {
    public static void main(String[] args) {
        MyClass<String , Object> obj = new MyClass<>("Jyotiraditya");

        MyClass<Integer , Object> obj2 = new MyClass<>(8112003);

        MyClass<String , Integer> obj3 = new MyClass<>("Deepak Chor" , 420);

        System.out.println(obj3.getId());

        System.out.println(obj2.getId());

        System.out.println(obj.getId());

    }
}

class MyClass <J , A>{  // This is a generics class where different type of parameters are can be used ex-> Character , Number , etc.
    J name;    // This J is a Generic Element which is used to set the data type of name(here).
    A id;      // This A is also the same.

    public MyClass(J name){
        this.name = name;
    }


    public MyClass(J name , A id){
        this.name = name;
        this.id = id;
    }

    public A getId(){
        return this.id;
    }
}

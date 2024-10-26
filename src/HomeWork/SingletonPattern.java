package HomeWork;

public class SingletonPattern {

    private SingletonPattern(){

    }

    private static SingletonPattern instance;

    public static SingletonPattern getInstance() { // To double, check this method that only one instance is created we use synchronize
        if(instance == null) {
            synchronized (SingletonPattern.class) { // here we are double-checking that the instance is null or not.
                if (instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }


}

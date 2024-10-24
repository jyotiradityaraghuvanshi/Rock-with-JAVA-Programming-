package GenericsAndWrapperClass;

public class BoundedGenerics <T extends Number>{  // This is a bounded generics class where the generic element is extending
                                                    // a  particular type of category of data types , i.e. 'T' is bounded by Number class.
    T data;

    public BoundedGenerics(T data){
        this.data = data;
    }

    public void display(){
        System.out.println("This is a bounded generic class .");
    }

    @Override
    public String toString(){
        System.out.println("Only numbers are allowed .");
        return data+"";
    }
}

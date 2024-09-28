package OOPs.Encapsulation;
class Admin{
    private int marks = 56;
    private int Roll_no = 21;
    private String name = "Ash";

    static void set_AdminCode(String code){
        if(code.equals("Admin_Passcode")){
            Information("admin32");
        }
        else System.out.println("You are not Admin");
    }
    private static void Information(String admin_pass) {
       if(admin_pass.equals("admin32")){
           System.out.println("This is the personal data and the data is password:seeker1920");
       }
    }
    void set_marks(int marks , String password){
        if(!password.equals("seeker1920")){
            System.out.println("ACCESS DENIED");
        }
        else this.marks = marks;
    }
    void set_ROLL_NO(int Roll_no, String password){
        if(!password.equals("seeker1920")){
            System.out.println("ACCESS DENIED");
        }
        else this.Roll_no =Roll_no;
    }
    void set_name (String name , String password){
        if(!password.equals("seeker1920")){
            System.out.println("ACCESS DENIED");
        }
        else this.name = name;
    }
    int get_marks(){
        return this.marks;
    }
    int get_Roll(){
        return this.Roll_no;
    }
    String get_Name(){
        return this.name;
    }

}
public class moreSecure {
    public static void main(String[] args) {

        Admin ash = new Admin();
        System.out.println(ash.get_marks() + " " + ash.get_Roll() + " " + ash.get_Name());
        System.out.println("Ash crack the password");
        ash.set_marks(98 , "seeker1920");
        System.out.println("Ash update his marks :" + ash.get_marks() + " " + ash.get_Roll() + " " + ash.get_Name());

        Admin.set_AdminCode("Admin_Passcode");
        Admin obj1 = new Admin();
        obj1.set_marks(90 ,"seeker1920" );
        obj1.set_name("Ronald" , "seeker1920");
        obj1.set_ROLL_NO(22 , "seeker1920");
        System.out.println(obj1.get_marks() + " " + obj1.get_Roll() + " " + obj1.get_Name());

        Admin thief = new Admin();
        System.out.print("Thief try to enroll himself : ");
        thief.set_marks(100 , "20276738");
        thief.set_name("Angelo" , " ));");

        Admin teacher = new Admin();
        System.out.print("Teacher wants to know password : ");
        Admin.set_AdminCode("Passcode129");
        teacher.set_name("Teacher" , "0000");
        System.out.println("Teacher fail to add his Name");


    }
}

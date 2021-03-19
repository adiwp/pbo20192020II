interface FuncInterface { 
    // An abstract function 
    void abstractFun(int x);  
  
    // A non-abstract (or default) function 
    default void normalFun() 
    { 
       System.out.println("Hello"); 
    } 
}

public class App {
    public static void main(String[] args) {
        FuncInterface fobj = (int x)->System.out.println(2*x);

        fobj.abstractFun(5);
    }
}
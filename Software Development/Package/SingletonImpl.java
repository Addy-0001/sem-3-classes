package Package;
public class SingletonImpl{
    private static SingletonImpl obj; 
    private SingletonImpl(){

    }

    public static SingletonImpl getInstance(){
        if (obj == null) {
            obj = new SingletonImpl(); 
        }
        return obj; 
    }
}
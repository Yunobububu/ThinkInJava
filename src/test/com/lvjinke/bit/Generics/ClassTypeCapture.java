package test.com.lvjinke.bit.Generics;

public class ClassTypeCapture<T> {
    private Class<T> cl;
    public ClassTypeCapture(){}
    public ClassTypeCapture(Class<T> cl){
        this.cl = cl;
    }
    public  void execute(Class<?> cll){

        try{

            System.out.println(this.cl.isInstance(cll.newInstance()));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

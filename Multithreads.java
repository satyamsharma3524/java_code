class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            if(i==1){
                yield();
            }
            System.out.println("From Thread A : i="+i);
        }
        System.out.println("exit from A ");
    }
}
class B extends Thread{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("From Thread B : J="+j);
            if(j==3){
                stop();
            }
        }
        System.out.println("exit from B ");
    }
}
class C extends Thread{
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("From Thread C : K="+k);
            if(k==3)
            try {
                sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
            }
        System.out.println("exit from C ");
    }
}
public class Multithreads{
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        System.out.println("start thread A");
        threadA.start();
        System.out.println("start thread B");
        threadB.start();
        System.out.println("start thread C");
        threadC.start();
        System.out.println("End of the main thread");
    }
}
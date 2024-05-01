public class ThreadMultiply extends Thread{
int num ;
ThreadMultiply(int num){
this.num = num;
}

public void run(){
multiply();
}
public void multiply(){
for(int i = 0;i <= 12;i++){
System.out.println(num+"*"+i+"="+(num*i));
}
}
public static void main(String[] args){
ThreadMultiply obj = new ThreadMultiply(2);
ThreadMultiply obj1 = new ThreadMultiply(3);
obj.start();
obj1.start();
}
}

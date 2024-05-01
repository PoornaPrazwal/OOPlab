public class RunnableThread implements Runnable{
int num ;
RunnableThread(int num){
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
RunnableThread obj = new RunnableThread(2);
RunnableThread obj1 = new RunnableThread(3);
obj.run();
obj1.run();
}

}

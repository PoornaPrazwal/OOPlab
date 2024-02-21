import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        float n1,n2;
        System.out.print("Enter number 1: ");
        n1=a.nextFloat();
        System.out.print("Enter number 2: ");
        n2=a.nextFloat();
        int choice;
        System.out.println("1.Addition,2.Substraction,3.Multiplication,4.Division.");
        System.out.println("Enter any choice: ");
        choice=a.nextInt();
        if(choice==1){
            System.out.println(n1+"+"+n2+"="+(n1+n2));
            System.out.println("the output"+(n1+n2)+"is printed");
        }
        else if(choice==2)
        {
            System.out.println(n1+"-"+n2+"="+(n1-n2));
            System.out.println("the output"+(n1-n2)+"is printed");
        }
        else if(choice==3){
            System.out.println(n1+"*"+n2+"="+(n1*n2));
            System.out.println("the output"+(n1*n2)+"is printed");
        }
        else if(choice==4){
            System.out.println(n1+"/"+n2+"="+(n1/n2));
            System.out.println("the output"+(n1/n2)+"is printed");
        }
        else{
            System.out.println("Error ! ");
        }
        a.close();
    }
}

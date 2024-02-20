import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value : ");
        int num;
        num=input.nextInt();
        evenorodd(num);
        input.close();
    }
    public static int evenorodd(int a)
    {
        if(a%2==0)
        {
            System.out.println("the number "+a+" is an even number");
        }
        else{
            System.out.println("the number "+a+" is an odd number");
        }
        return 0;
    }
}


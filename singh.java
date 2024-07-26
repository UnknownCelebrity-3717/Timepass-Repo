import java.util.*;
class Sum
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,sum=0;
        System.out.println("Enter a Number: ");
        a=sc.nextInt();
        System.out.println("Enter another number: ");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Sum: "+sum);
    }
}
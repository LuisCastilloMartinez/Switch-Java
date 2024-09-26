import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----Welcome!!----");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        System.out.print("Select which operation you want to do:");
        int x = scanner.nextInt();

        switch (x)
        {
            case 1:
                int result = Addition(scanner);
                System.out.print("Result: "+ result);
                break;
            case 2:
                int result2 = Subtraction(scanner);
                System.out.print("Result: "+ result2);
                break;
            case 3:
                int result3 = Multiplication(scanner);
                System.out.print("Result: "+ result3);
                break;
            case 4:
                int result4 = Division(scanner);
                System.out.print("Result: "+ result4);
                break;
        }
    }
    public static int Addition(Scanner scanner)
    {
        System.out.print("first number:");
        int a = scanner.nextInt();
        System.out.print("second number:");
        int b = scanner.nextInt();
        return a+b;
    }
    public static int Subtraction(Scanner scanner)
    {
        System.out.print("first number:");
        int a = scanner.nextInt();
        System.out.print("second number:");
        int b = scanner.nextInt();
        return a-b;
    }
    public static int Multiplication(Scanner scanner)
    {
        System.out.print("first number:");
        int a = scanner.nextInt();
        System.out.print("second number:");
        int b = scanner.nextInt();
        return a*b;
    }
    public static int Division(Scanner scanner)
    {
        System.out.print("first number:");
        int a = scanner.nextInt();
        System.out.print("second number:");
        int b = scanner.nextInt();
        if(b == 0){
            System.out.print("Impossible divide by zero (0). ");
            return 0;
        }
        return a/b;
    }
}
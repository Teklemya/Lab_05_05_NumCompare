public class Main
{
    public static void main(String[] args)
    {
        double num1 = 29.8;
        double num2 = 29.79;

        if(num1 == num2)
        {
            System.out.println("Both numbers are equal ");
        } else if (num1 < num2)
        {
            System.out.println("The second number is greater");
        } else
        {
            System.out.println("The First number is greater");
        }

    }
}
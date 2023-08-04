import java.util.Scanner;

public class average
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("num " + i + ": ");
            nums[i] = scanner.nextInt();
        }

        float sum = 0;
        for (int num : nums)
        {
            sum += num;
        }

        float average = sum / n;

        System.out.println("Average: " + average);
    }
}

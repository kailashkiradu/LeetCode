import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumber = sc.nextInt();
        int[] nums = new int[totalNumber];
        for(int i=0;i<totalNumber;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int actualSum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            actualSum += i;
        }
        return (actualSum - sum);

    }
}

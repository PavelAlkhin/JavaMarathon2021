package day18;

public class Task1 {
    public static void main(String[] args) {
//        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int[] numbers = {1,2,3};
        int sum = 0;
        System.out.println(recursionSum(numbers, sum));
    }

    public static int recursionSum(int[] numbers, int sum){
        return calculate(numbers, sum, 1);
    }

    private static int calculate(int[] numbers, int sum, int position) {
        if (position <= numbers.length){
            int s = numbers[position-1] + calculate(numbers, sum, position+1);
            sum = sum + s;
        }
        return sum;
    }
}

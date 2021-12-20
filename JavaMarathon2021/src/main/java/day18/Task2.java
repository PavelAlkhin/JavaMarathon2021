package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int num) {
        String str = Integer.toString(num);
        return calc(str, 0, 1);

    }

    private static int calc(String num, int amount, int position){
        if(position <= num.length()){
            int charSum = 0;
            try {
                charSum = Integer.parseInt(String.valueOf(num.charAt(position - 1)));
            }catch (NumberFormatException e){
                charSum = 0;
            }
            if (charSum == 7){
                amount = amount + 1;
            }
            amount = calc(num, amount, position+1);
        }
        return amount;
    }
}

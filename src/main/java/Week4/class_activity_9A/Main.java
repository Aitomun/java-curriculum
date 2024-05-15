package Week4.class_activity_9A;

public class Main {
    public static void main(String[] args) {
            int num1 = 50;
            int num2 = 0;
            int num3;

            try {
                num3= num1/num2;


            } catch (Exception e) {
                num3 = num1/(num2+2);
                System.out.println("num 3 also equal = " + num3);
                throw new RuntimeException(e);
            }

    }
}

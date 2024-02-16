package conkylytor;
import java.util.Scanner;
public class conkulytor {
    public static void main(String[] args) {
        int number1,number2;
        Scanner in = new Scanner(System.in);
        System.out.println("number1 = "); number1 = in.nextInt();
        System.out.println("number2 = "); number2 = in.nextInt();
        if (number1 < 0) {
            System.out.println(" Конкулятор не работает, ведите число от 0 до 10 ");
        } else if (number1 <= 10) {
            System.out.println( " ответ равен = " + (number1 + number2) + " , " + (number1 - number2) +
                    " , " + (number1 * number2) + " , " + (number1 / number2));
        } else if (number1 > 10) {
            System.out.println(" Конкулятор не работает, ведите число от 0 до 10 !!! ");
        }
    }
}

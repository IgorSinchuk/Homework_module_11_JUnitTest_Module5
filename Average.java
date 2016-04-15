import java.util.Scanner;

    public class Average {
        public static void main (String [] args){
            Scanner in = new Scanner(System.in);
            int x;
            float sum = 0;
            float avg, t;
            System.out.println("Программа для вычисления среднего арифметического значения.");
            x = in.nextInt();
            System.out.println("Введите " + x + "  цифр.");
            for(int i=0; i < x ; i++) {
                System.out.print(": ");
                t = in.nextFloat();
                sum += x;
            }
            avg = sum / x;
            System.out.println("Среднее " + avg);

        }
    }


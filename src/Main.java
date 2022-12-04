import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = arrayRandom(30);
        // Найти сумму расходов
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println(sum);
        // Найти максимальный и минимальный расход
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(" Минимальное значение = " + min + "; Максимальное зщанчение = " + max);
        {
            public static int[] arrayRandom(int length){
            Random random = new Random();
            int[] array = new int[length];
            for (int i = 0; i < length; i++) {
                array[i] = random.nextInt(100_000) + 100_000;
            }
            return array;
        }
        }
    }
}


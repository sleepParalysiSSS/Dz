import java.util.Scanner;

// 1. 
public class Dz2010 {
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String[] words = {"Первое", "Второе", "Третье"};
        swap(words, 0, 2);
        for (String w : words) {
            System.out.println(w);
        }
    }
}

// 2.
class Box<A, B, C> {
    A a;
    B b;
    C c;

    public Box(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class BoxTest {
    public static void main(String[] args) {
        Box<String, String, String> boxStr = new Box<>("1", "2", "3");
        Box<Integer, Integer, Integer> boxInt = new Box<>(43, 12, 69);
        Box<Float, Float, Float> boxFloat = new Box<>(1.7f, 6.7f, 1.9f);

        float sum = 0;

        sum += Float.parseFloat(boxStr.a);
        sum += Float.parseFloat(boxStr.b);
        sum += Float.parseFloat(boxStr.c);

        sum += boxInt.a + boxInt.b + boxInt.c;

        sum += boxFloat.a + boxFloat.b + boxFloat.c;

        System.out.println("Сумма всех чисел: " + sum);
    }
}

// 3.
class StringChecker {

    public static void checkString(String s) throws Exception {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                throw new Exception("Строка не должна содержать число!");
            }
        }
        System.out.println("Строка корректная: " + s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для проверки на наличие чисел в ней: ");
        String input = scanner.nextLine();

        try {
            checkString(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
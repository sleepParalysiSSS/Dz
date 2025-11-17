public class Dz0610 {

     // 1. Создание и вывод различных типов переменных
    public void createVariables() {
        byte age = 19;
        short year = 2025;
        int salary = 1200000;
        long population = 8000000000L;
        float temperature = 23.5f;
        double pi = 3.141;
        boolean isActive = true;
        String greeting = "Hello, World!";

        System.out.println("=== Переменные разных типов ===");
        System.out.println("byte (age): " + age);
        System.out.println("short (year): " + year);
        System.out.println("int (salary): " + salary);
        System.out.println("long (population): " + population);
        System.out.println("float (temperature): " + temperature);
        System.out.println("double (pi): " + pi);
        System.out.println("boolean (isActive): " + isActive);
        System.out.println("String (greeting): " + greeting);
        System.out.println();
    }

    // 2. Метод приветствия
    public void greet(String name) {
            System.out.println("=== Приветствие ===");
            System.out.println("Привет, " + name + "!");
        }


    // 3. Проверка числа на отрицательность
    public boolean isNegative(int number) {
        System.out.println("=== Проверка числа на отрицательность ===");
        return number < 0;
    }

    // 4. Определение типа числа
    public void printNumberType(int number) {
        System.out.println("\n=== Определение типа числа ===");
        if (number < 0) {
            System.out.println(number + " — отрицательное число.");
        } else if (number > 0) {
            System.out.println(number + " — положительное число.");
        } else {
            System.out.println("Это просто ноль.");
        }
    }

    // 5. Вывод чисел, кратных 3 от 1000 до 0
    public void printMultiplesOfThree() {
        System.out.println("\n=== Числа от 1000 до 0, кратные 3 ===");
        for (int i = 1000; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    // Запуск всех методов
    public static void main(String[] args) {
        Dz0610 app = new Dz0610();

        app.createVariables();
        app.greet("Григорий");

        int number = -5;
        System.out.println("\nЧисло " + number + " отрицательное? " + app.isNegative(number));

        app.printNumberType(42);
        app.printMultiplesOfThree();
    }
}

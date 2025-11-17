class Animal {
    static int animalsCount = 0;
    String name;

    Animal(String name) {
        this.name = name;
        animalsCount++;
    }
}

class Cat extends Animal {
    static int catsCount = 0;

    Cat(String name) {
        super(name);
        catsCount++;
    }

    void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}

class Dog extends Animal {
    static int dogsCount = 0;

    Dog(String name) {
        super(name);
        dogsCount++;
    }

    void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " м.");
        }
    }
}

class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println("------------------------------");
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}


// ==== MAIN ====
public class Dz1310 {
    public static void main(String[] args) {

        // 1:
        Cat catBarsik = new Cat("Мявка");
        Dog dogBobik = new Dog("МегаМопс");

        catBarsik.run(150);
        catBarsik.swim(5);

        dogBobik.run(300);
        dogBobik.swim(7);

        System.out.println("Всего животных: " + Animal.animalsCount);
        System.out.println("Котов: " + Cat.catsCount);
        System.out.println("Собак: " + Dog.dogsCount);


        // 2:
        Employee[] staff = {
                new Employee("Иванов Иван", "Менеджер", "ivan@mail.com", "8800553535", 50000, 45),
                new Employee("Петров Пётр", "Инженер", "petr@mail.com", "8800553569", 60000, 38),
                new Employee("Сидоров Семён", "Бухгалтер", "sidorov@mail.com", "8800554535", 55000, 50),
                new Employee("Кузнецов Кирил", "Программист", "kiriy@mail.com", "8800733535", 80000, 28),
                new Employee("Соколова Анна", "Аналитик", "anna@mail.com", "88005547524", 70000, 42)
        };

        for (Employee emp : staff) {
            if (emp.age > 40) {
                emp.printInfo();
            }
        }
    }
}
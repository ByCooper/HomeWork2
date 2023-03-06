public class HomeWork2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6_7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        //Задаем переменные и выводим в консоль, каждую отдельно
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
            }

    public static void task2 () {
        System.out.println("Задача 2");
        // Увеличиваем значения переменных из Задача 1 на 4
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4.0;
        cat = cat + 4.0;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
            }

    public static void task3 () {
        System.out.println("Задача 3");
        // Увеличиваем значения переменных из Задача 1 согласно требований в Задача 3
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        }

    public static void task4 () {
        System.out.println("Задача 4");
        //Задать переменную friend = 19, увеличить ее на 2 и разделить на 7
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        //Задать переменную frog = 3.5, произвести вычисления согласно условий Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = (frog * 10) / 3.5 ;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task6_7 () {
        System.out.println("Задача 6,7");
        //Задать переменную var с весом каждого боксера, произвести вычисления согласно условий Задача 6
        var unitBox1 = 78.2;
        System.out.println(unitBox1);
        var unitBox2 = 82.7;
        System.out.println(unitBox2);
        var sumMass = unitBox1 + unitBox2;
        System.out.println(sumMass);
        //Выполнение условий Задачи 7 ==============================================================
        var changeMass = unitBox2 - unitBox1;
        System.out.println(changeMass);
        var divisionMass = unitBox2 % unitBox1;
        System.out.println(divisionMass);

    }
    public static void task8 () {
        //Задать переменые по общему количеству рабочих часов и рабочих часов в сутки
        System.out.println("Задача 8");
        var totalHour = 640;
        var workDay = 8;
        var totalUsers = totalHour / workDay;
        System.out.println("Всего работников в компании — " + totalUsers + " человек");
        var newTotalUsers = totalUsers + 94;
        var newWorkTime = newTotalUsers * workDay;
        System.out.println("Если в компании работает " + newTotalUsers + " человек, то всего " + newWorkTime + " часов работы может быть поделено между сотрудниками");

    }
}
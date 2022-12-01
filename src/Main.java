public class Main {

    public static void main(String[] args) {
        task123();
        task4();
        task5();
        task67();
        task8();

    }

    public static void task123() {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("task1: dog = " + dog + ", cat = " + cat + ", paper = " + paper + ";");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("task2: dog = " + dog + ", cat = " + cat + ", paper = " + paper + ";");

        var a = 3.5;
        var dogA = dog - a;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("task3: dog = " + dogA + ", cat = " + cat + ", paper = " + paper + ";");
    }

    public static void task4() {
        var friend = 19;
        System.out.println("task4: friend = " + friend + ",");
        friend = friend + 2;
        System.out.println("friend = " + friend + ",");
        friend = friend / 7;
        System.out.println("friend = " + friend + ";");
    }

    public static void task5() {
        var frog = 3.5;
        System.out.println("task5: frog = " + frog + ",");
        frog = frog * 10;
        System.out.println("frog = " + frog + ",");
        frog = frog / 3.5;
        System.out.println("frog = " + frog + ",");
        frog = frog + 4;
        System.out.println("frog = " + frog + ";");
    }

    public static void task67() {
        var weightOfTheFirstBoxer = 78.2;
        var weightOfTheSecondBoxer = 82.7;
        var totalWeightOfBoxers = weightOfTheFirstBoxer + weightOfTheSecondBoxer;
        System.out.println("task6: Общий вес двух боксеров = " + totalWeightOfBoxers + " кг,");

        var boxerWeightDifference1 = weightOfTheSecondBoxer - weightOfTheFirstBoxer;
        System.out.println("task7: Разница весов боксеров  = " + boxerWeightDifference1 + " кг,");
        var boxerWeightDifference2 = weightOfTheSecondBoxer % weightOfTheFirstBoxer;
        System.out.println("Разница весов боксеров  = " + boxerWeightDifference2 + " кг,");
    }

    public static void task8() {
        var numberOfWorkingHours = 640;
        var hoursPerWorker = 8;
        var amountOfWorkers = numberOfWorkingHours / hoursPerWorker;
        System.out.println("task8: Всего работников в компании — " + amountOfWorkers + " человек,");

        var newNumberOfEmployees = amountOfWorkers + 94;
        var newNumberOfWorkingHours = newNumberOfEmployees * hoursPerWorker;
        System.out.println("Если в компании работает " + newNumberOfEmployees +
                " человек, то всего " + newNumberOfWorkingHours + " часов работы может быть поделено между сотрудниками.");
    }

}

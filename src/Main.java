public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Значение переменной dog: " + dog);
        System.out.println("Значение переменной cat: " + cat);
        System.out.println("Значение переменной paper: " + paper);
        System.out.println();

        dog *= 4;
        cat *= 4;
        paper *= 4;
        System.out.println("Четырёхкратное значение переменной dog: " + dog);
        System.out.println("Четырёхкратное значение переменной cat: " + cat);
        System.out.println("Четырёхкратное значение переменной paper: " + paper);
        System.out.println();

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("Отнять от переменной dog 3.5: " + dog);
        System.out.println("Отнять от переменной cat 1.6: " + cat);
        System.out.println("Отнять от переменной paper 7639: " + paper);
        System.out.println();

        var friend = 19;
        System.out.println("Начальное значение friend: " + friend);
        friend += 2;
        System.out.println("Прибавление двух к friend: " + friend);
        friend /= 7;
        System.out.println("Деление friend на 7: " + friend);
        System.out.println();

        var frog = 3.5;
        System.out.println("Начальное значение frog: " + frog);
        frog *= 10;
        System.out.println("Увеличение frog в 10 раз: " + frog);
        frog /= 3.5;
        System.out.println("Деление frog на 3.5: " + frog);
        frog += 4;
        System.out.println("Добавление 4 к frog: " + frog);
        System.out.println();

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксёров: " + totalBoxerWeight + " кг.");
        var boxerWeightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе боксёров: " + boxerWeightDifference + " кг.");
        System.out.println();

        boxerWeightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе вычитанием: " + boxerWeightDifference + " кг.");
        boxerWeightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе остатком от деления: " + boxerWeightDifference + " кг.");
        System.out.println();

        var totalWorkHours = 640;
        var individualWorkerHours = 8;
        var totalNumberOfWorkers = totalWorkHours / individualWorkerHours;
        System.out.println("Всего работников в компании - " + totalNumberOfWorkers + " человек.");
        totalNumberOfWorkers += 94;
        totalWorkHours = totalNumberOfWorkers * individualWorkerHours;
        System.out.println("Если в компании работает " + totalNumberOfWorkers + " человека, то всего " + totalWorkHours + " часов работы может быть поделено между сотрудниками.");

    }
}
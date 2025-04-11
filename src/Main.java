public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//Задача №1
        System.out.println("Задача №1");
        int age = 2;
        if ( age >= 18 ) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }   else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
//Задача №2
        System.out.println("Задача №2");
        int temperature = 1;
        if ( temperature < 5 ) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }   else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
//Задача №3
        System.out.println("Задача №3");
        int speed = 50;
        if ( speed > 60 ) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }   else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
//Задача №4
        System.out.println("Задача №4");
        int ageMan = 3;
        if ( ageMan >= 2 && ageMan <= 6 ) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить детский сад.");
        }
        if ( ageMan >= 7 && ageMan <= 17 ) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу.");
        }
        if ( ageMan >= 18 && ageMan <= 24 ) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в университет.");
        }
//Задача №5
        System.out.println("Задача №5");
        int ageChild = 4;
        if ( ageChild < 5 ) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        if ( ageChild >= 5 && ageChild < 14 ) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if ( ageChild >= 14 ) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься без сопровождения взрослого");
        }
//Задача №6
        System.out.println("Задача №6");
        int trainCarCapacity = 102;
        int people = 77;
        int sidM = 60;
        int stM = trainCarCapacity - sidM;
        int stMR = trainCarCapacity - people;
        int sidMR = sidM - people;
        if ( trainCarCapacity > people ) {
            if ( people >= sidM ) {
                System.out.println("В вагоне осталось " + stMR + " стоячих мест");
            } else {
                System.out.println("В вагоне осталось " + sidMR + " сидячих мест и " + stM+ " стоячих мест");
            }
        }   else {
            System.out.println("Вагон уже полностью забит");
        }
//Задача №7
        System.out.println("Задача №7");
        int one = 70;
        int two = 55;
        int three = 44;
        if ( one > two && one > three ) {
            System.out.println("Максимальное число " + one);
        } else {
            if (two > one && two > three ) {
                System.out.println("Максимальное число " + two);
            }   else {
                System.out.println("Максимальное число " + three);
            }
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 18;
        if (age < 18){
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия," +
                    " нужно немного подождать.");
        } else
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");


        for (int i = 0; i < 3; i++){
            System.out.println("\n");
        }
        System.out.println("Задание 2");
        int temp = 5;
        if (temp < 5){
            System.out.println("На улице холодно, нужно надеть шапку");
        } else
            System.out.println("Сегодня тепло, можно идти без шапки");


        for (int i = 0; i < 3; i++){
            System.out.println("\n");
        }
        System.out.println("Задание 3");
        int speed = 60;
        if (speed > 60){
            System.out.println("Если скрость " + speed + " км/ч, придется заплатить штраф.");
        } else
            System.out.println("Если скрость " + speed + " км/ч, можно ездить спокойно.");
    }
}
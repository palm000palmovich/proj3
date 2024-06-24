//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte age = 18;
        if (age < 18){
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия," +
                    " нужно немного подождать.");
        } else
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
    }
}
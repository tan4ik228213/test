import java.util.Scanner;
public class main {
    public static void main(String[] args) {         // G.O.V.N.O 2
        util util = new util();

        System.out.println("Сейчас будет краткий курс как проиграть в G.O.V.N.O 2");            // Для Сани

        String firstHero = util.inputString("Выберете героя: Аппарат или Лион - ");

        if (firstHero.equals("Аппарат")) {
            System.out.println("Вы выбрали героя: " + firstHero);
            int pos = util.inputInt("Какую позицию вы собираетесь выбрать?", 1,5 );
            if (pos == 4) {
                System.out.println("Успех,правильный выбор!");
            }else {
                System.out.println();
            }
        }
    }

    }



















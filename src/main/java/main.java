import java.util.Scanner;
public class main {
    public static void main(String[] args) {         // G.O.V.N.O 2
        util util = new util();
        String aghanim = "Аганим";
        String lens = "Линза";
        String blink = "Блинк";

        System.out.println("Сейчас будет краткий курс как проиграть в G.O.V.N.O 2");            // Для Сани

        String firstHero = util.inputString("Выберете героя: Аппарат или Лион - ");

        if (firstHero.equals("Аппарат")) {
            System.out.println("Вы выбрали героя: " + firstHero);
            int pos = util.inputInt("Какую позицию вы собираетесь выбрать?", 1,5 );
            if (pos == 4) {
                System.out.println("Успех,правильный выбор!");
            }else {
                System.out.println("Поздравляю, ты якорь, у тебя получилось проиграть!");
            System.exit(1);
            }
            String firstItem = util.inputString("Что мы купим первым предметом(помимо сапога) (На выбор: Аганим, Линза, Блинк, Урна )? - ");
            String urnOfShadow = "Урна";
            if (firstItem.equals("Линза")) {
                System.out.println("Удивительно, ты выбрал правильно! ");

            } else if (firstItem.equals("Урна")) {
                System.out.println("Опаньки,научились думать головой? ");
            } else if (firstItem.equals("Блинк")) {
                System.out.println("Ваш интелект примерно равен табуретке ");
                System.exit(1);
            } else if (firstItem.equals("Аганим")) {
                System.out.println("Мб удалим доту?) я считаю тебе пора! ");
                System.exit(1);
            }else {
                System.out.println("Тупой что ли? пора удалять игру");
                System.exit(1);
            }
            System.out.println("Первым действием что мы делаем? ");
            System.out.println("А(eng) - воруем фарм");
            System.out.println("B(eng) - фидим");
            System.out.println("C(eng) - размениваем свое лицо,чтобы кор фармил");
            String firstAction = util.inputString (" ");
            if (firstAction.equals("A")) {
                System.out.println("Идем нахер и удаляем игру");
                System.exit(1);
            } else if (firstAction.equals("B")) {
                System.out.println("Идем нахер и удаляем игру");
                System.exit(1);
            } else if (firstAction.equals("C")) {
                System.out.println("Прогресс на лицо");
                System.out.println("Но остается вопрос, как мы будем разменивать лицо?");
                System.out.println("А(eng) - отдадим 10 фрагов врагам");
                System.out.println("B(eng) - Аккуратно разменивать ресурсы и просто перетягивать на себя внимание");
                String checkBrain = util.inputString(" ");
                if (checkBrain.equals("A")) {
                    System.out.println("Отправляемся в помойку");
                    for (int i = 0; i < 25; i++) {
                        System.out.println(".");
                    }
                    System.out.println("Поздравляю, вы в помойке!!!");
                    System.exit(1);
                } else if (checkBrain.equals("B")) {
                    System.out.println("Умничка,сложный выбор был...");
                }
            }


        }
    }

    }



















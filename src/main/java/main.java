import java.util.Scanner;

public class main {
    static void clear() {
        for (int k = 1; k < 25; k++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {               // G.O.V.N.O 2
        util util = new util();

        String aghanim = "Аганим";
        String lens = "Линза";
        String blink = "Блинк";

        System.out.println("Сейчас будет краткий курс как выйграть в G.O.V.N.O 2");            // Для Сани

        String firstHero = util.inputString("Выберете героя: Аппарат или Лион - ");
        try {
            if (firstHero.equals("Аппарат")) {
                System.out.println("Вы выбрали героя: " + firstHero);
                clear();
                int pos = util.inputInt("Какую позицию вы собираетесь выбрать?", 1, 5);
                clear();
                if (pos == 4) {
                    System.out.println("Успех,правильный выбор!");
                    clear();
                } else {
                    System.out.println("Поздравляю, ты якорь, у тебя получилось проиграть!");
                    System.exit(1);
                }
                String firstItem = util.inputString("Что мы купим первым предметом(помимо сапога) (На выбор: Аганим, Линза, Блинк, Урна )? - ");
                String urnOfShadow = "Урна";
                clear();
                if (firstItem.equals("Линза")) {
                    System.out.println("Удивительно, ты выбрал правильно! ");
                    clear();
                } else if (firstItem.equals("Урна")) {
                    System.out.println("Опаньки,научились думать головой? ");
                    clear();
                } else if (firstItem.equals("Блинк")) {
                    System.out.println("Ваш интелект примерно равен табуретке ");
                    System.exit(1);
                } else if (firstItem.equals("Аганим")) {
                    System.out.println("Мб удалим доту?) я считаю тебе пора! ");
                    System.exit(1);
                } else {
                    System.out.println("Тупой что ли? пора удалять игру");
                    System.exit(1);
                }
                System.out.println("Первым действием что мы делаем? ");
                System.out.println("А(eng) - воруем фарм");
                System.out.println("B(eng) - фидим");
                System.out.println("C(eng) - размениваем свое лицо,чтобы кор фармил");
                String firstAction = util.inputString(" ");
                clear();
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
                    clear();
                    if (checkBrain.equals("A")) {
                        System.out.println("Отправляемся в помойку");
                        for (int i = 0; i < 25; i++) {
                            System.out.println(".");
                        }
                        System.out.println("Поздравляю, вы в помойке!!!");
                        System.exit(1);
                    } else if (checkBrain.equals("B")) {
                        System.out.println("Умничка,сложный выбор был...");
                        clear();
                    } else {
                        System.out.println("Тупой что ли? Не видно,что выбрать надо? Отправляемся к Ленину");
                        System.exit(1);
                    }
                }
                System.out.println("У нас почти получилось! Осталось еще чуть-чуть ");
                System.out.println("Представляем ситуацию: увидели на мини карте много героев,а на другом конце карты фармит кор один, наш кор коллит нажать смок и убить кора,наши действия?");
                System.out.println("A(eng) - Купить смока, и пойти с командой на кора");
                System.out.println("B(eng) - Подумать,стоит ли это делать?");
                String move = util.inputString(" ");
                clear();

                if (move.equals("A")) {
                    System.out.println("Победа! Выйграли! Ура...");
                } else if (move.equals("B")) {
                    System.out.println("НЕ ДУМАЙ! НИКОГДА! ТЫ НЕ УМЕЕШЬ! ДАЖЕ ТУТ ПРОИГРАТЬ УМУДРИЛСЯ");
                    System.exit(0);
                } else {
                    System.out.println("За тупость в помойку");
                    System.exit(0);
                }

            }
        } catch (Exception e) {
            System.out.println("За тупость в помойку");
            System.exit(0);
        }
        try {
        if (firstHero.equals("Лион")) {
            System.out.println("Вы выбрали героя: " + firstHero);
            int pos = util.inputInt("Какую пазицию выюираем?", 1, 5);
            if (pos == 4) {
                System.out.println("Молорик,начало правильное");
            } else {
                System.out.println("Отправляемся в помойку");
                System.exit(0);

            }
            String lionZatar = util.inputString("Что мы купим первой шмоткой?(после сапога). На выбор: Аганим, Линза, Блинк, Глимер");
            String glimer = ("Глимер");

            if (lionZatar.equals("Глимер")) {
                System.out.println("Супер,начинаем думать по немногу головой");
            } else if (lionZatar.equals("Линза")) {
                System.out.println("Красава, идем дальше ");
            } else if (lionZatar.equals("Блинк")) {
                System.out.println("Вся команда в восторге от твоего решения!");
            } else if (lionZatar.equals("Аганим")) {
                System.out.println("Начинаем процесс удаления твоей херни в голове... ERROR 404(Not found brain) initialization...");
            } else {
                System.out.println("Начинаем процесс удаления твоей херни в голове... ERROR 404(Not found brain) initialization...");
            }
            System.out.println("Что мы будет делать на линии?");
            System.out.println("A(eng) - стоять AFK");
            System.out.println("B(eng) - разменивать свое лицо,чтобы дать пространство кору ");
            System.out.println("C(eng) - умрем 10 раз вражескому кору");
            String lionAction = util.inputString(" ");
            if (lionAction.equals("A")) {
                System.out.println("Идем нахер");
                System.exit(0);
            } else if (lionAction.equals("B")) {
                System.out.println("Красава");
            } else if (lionAction.equals("C")) {
                System.out.println("В помойку отправляемся");
                System.exit(0);
            } else {
                System.out.println("За тупость в помойку");
                System.exit(0);
            }
            System.out.println("Идем ставить вард,видим след. ситуацию: кор качает лайн крипов,наши действия?");
            System.out.println("A(eng) - Поставить недалеко вард и стоять не показываться,страховать кора");
            System.out.println("B(eng) - Вебать спелом пачку и уйти");
            String lionMove = util.inputString("");
            if (lionMove.equals("A")) {
                System.out.println("Красава,мы победили! держи подарок!");
            } else if (lionMove.equals("B")) {
                System.out.println("Удаляем игру...");
                System.exit(0);
            } else {
                System.out.println("Удаляем игру...");
                System.exit(0);
            }
        }
        }catch (Exception e) {
            System.out.println("За тупость в помойку");
            System.exit(0);
        }
        System.out.println("Если ты видишь это сообщение,значит еще не все потерянно, твой подарок ожидает тебя по ссылке в дискорде");
    }

}

















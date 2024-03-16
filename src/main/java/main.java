public class main {
    static void clear() {
        for (int k = 1; k < 25; k++) {
            System.out.println();
        }
    }

    static void message(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {               // G.O.V.N.O 2
        Util util = new Util();

        String[] itemBuild = {"Линза", "Урна", "Блинк", "Аганим", "Глимер",};

        message("Сейчас будет краткий курс как выйграть в G.O.V.N.O 2");         // Для Сани

        String firstHero = util.inputString("Выберете героя: Аппарат или Лион - ");
        try {
            if (firstHero.equals("Аппарат")) {
                message("Вы выбрали героя: " + firstHero);
                clear();
                int pos = util.inputInt("Какую позицию вы собираетесь выбрать?", 1, 5);
                clear();
                if (pos == 4) {
                    message("Успех,правильный выбор!");
                    clear();
                } else {
                    message("Поздравляю, ты якорь, у тебя получилось проиграть!");
                    System.exit(1);
                }
                String firstItem = util.inputString("Что мы купим первым предметом(помимо сапога) (На выбор: Аганим, Линза, Блинк, Урна )? - ");
                clear();
                if (firstItem.equals(itemBuild[0])) {
                    message("Удивительно, ты выбрал правильно! ");
                    clear();
                } else if (firstItem.equals(itemBuild[1])) {
                    message("Опаньки,научились думать головой? ");
                    clear();
                } else if (firstItem.equals(itemBuild[2])) {
                    message("Ваш интелект примерно равен табуретке ");
                    System.exit(1);
                } else if (firstItem.equals(itemBuild[3])) {
                    message("Мб удалим доту?) я считаю тебе пора! ");
                    System.exit(1);
                } else {
                    message("Тупой что ли? пора удалять игру");
                    System.exit(1);
                }
                message("Первым действием что мы делаем? " + "\n" + "А(eng) - воруем фарм" + "\n" + "B(eng) - фидим" + "\n" + "C(eng) - размениваем свое лицо,чтобы кор фармил");
                String firstAction = util.inputString(" ");
                clear();
                if (firstAction.equals("A")) {
                    message("Идем нахер и удаляем игру");
                    System.exit(1);
                } else if (firstAction.equals("B")) {
                    message("Идем нахер и удаляем игру");
                    System.exit(1);
                } else if (firstAction.equals("C")) {
                    message("Прогресс на лицо" + "\n" + "Но остается вопрос, как мы будем разменивать лицо?" + "\n" + "А(eng) - отдадим 10 фрагов врагам" + "\n"
                            + "B(eng) - Аккуратно разменивать ресурсы и просто перетягивать на себя внимание");
                    String checkBrain = util.inputString(" ");
                    clear();
                    if (checkBrain.equals("A")) {
                        message("Отправляемся в помойку");
                        for (int i = 0; i < 25; i++) {
                            System.out.println(".");
                        }
                        message("Поздравляю, вы в помойке!!!");
                        System.exit(1);
                    } else if (checkBrain.equals("B")) {
                        message("Умничка,сложный выбор был...");
                        clear();
                    } else {
                        message("Тупой что ли? Не видно,что выбрать надо? Отправляемся к Ленину");
                        System.exit(1);
                    }
                }
                message("У нас почти получилось! Осталось еще чуть-чуть " + "\n" +
                        "Представляем ситуацию: увидели на мини карте много героев,а на другом конце карты фармит кор один, наш кор коллит нажать смок и убить кора,наши действия?" + "\n" +
                        "A(eng) - Купить смока, и пойти с командой на кора" + "\n" + "B(eng) - Подумать,стоит ли это делать?");
                String move = util.inputString(" ");
                clear();
                if (move.equals("A")) {
                    message("Победа! Выйграли! Ура...");
                } else if (move.equals("B")) {
                    message("НЕ ДУМАЙ! НИКОГДА! ТЫ НЕ УМЕЕШЬ! ДАЖЕ ТУТ ПРОИГРАТЬ УМУДРИЛСЯ");
                    System.exit(0);
                } else {
                    message("За тупость в помойку");
                    System.exit(0);
                }

            }
        } catch (Exception e) {
            message("За тупость в помойку");
            System.exit(0);
        }
        try {
            if (firstHero.equals("Лион")) {
                message("Вы выбрали героя: " + firstHero);
                int pos = util.inputInt("Какую позицию выбираем?", 1, 5);
                if (pos == 4) {
                    message("Молорик,начало правильное");
                } else {
                    message("Отправляемся в помойку");
                    System.exit(0);

                }
                String lionZatar = util.inputString("Что мы купим первой шмоткой?(после сапога). На выбор: " + itemBuild[3] + ", " + itemBuild[0] + ", "
                        + itemBuild[2] + ", " + itemBuild[4]);
                if (lionZatar.equals(itemBuild[4])) {
                    message("Супер,начинаем думать по немногу головой");
                } else if (lionZatar.equals(itemBuild[0])) {
                    message("Красава, идем дальше ");
                } else if (lionZatar.equals(itemBuild[2])) {
                    message("Вся команда в восторге от твоего решения!");
                } else if (lionZatar.equals(itemBuild[3])) {
                    message("Начинаем процесс удаления твоей херни в голове... ERROR 404(Not found brain) initialization...");
                } else {
                    message("Начинаем процесс удаления твоей херни в голове... ERROR 404(Not found brain) initialization...");
                }
                message("Что мы будет делать на линии?" + "\n" + "A(eng) - стоять AFK" + "\n" + "B(eng) - разменивать свое лицо,чтобы дать пространство кору " + "\n" +
                        "C(eng) - умрем 10 раз вражескому кору");
                String lionAction = util.inputString(" ");
                if (lionAction.equals("A")) {
                    message("Идем нахер");
                    System.exit(0);
                } else if (lionAction.equals("B")) {
                    message("Красава");
                } else if (lionAction.equals("C")) {
                    message("В помойку отправляемся");
                    System.exit(0);
                } else {
                    message("За тупость в помойку");
                    System.exit(0);
                }
                message("Идем ставить вард,видим след. ситуацию: кор качает лайн крипов,наши действия?" + "\n" +
                        "A(eng) - Поставить недалеко вард и стоять не показываться,страховать кора" + "\n" +
                        "B(eng) - Вебать спелом пачку и уйти");
                String lionMove = util.inputString("");
                if (lionMove.equals("A")) {
                    message("Красава,мы победили! держи подарок!");
                } else if (lionMove.equals("B")) {
                    message("Удаляем игру...");
                    System.exit(0);
                } else {
                    message("Удаляем игру...");
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            message("За тупость в помойку");
            System.exit(0);
        }
        message("Если ты видишь это сообщение,значит еще не все потерянно, твой подарок ожидает тебя по ссылке в дискорде");
    }

}

















public class Main {
    public static void main(String[] args) {

        System.out.println("Hi, man!");
        System.out.println("Hi, JavaDeveloper!");
        letsCheckYear(2021);
        downloadAppVersion(2015, 0);// ВЫЗЫВАЕМ НЕСКОЛЬКО РАЗ ЧТОБЫ ПРОВЕРИТЬ ДАННЫЕ
        downloadAppVersion(2014, 0);// И УБЕДИТЬСЯ ЧТО ПРОГА ОТРРАБОТАЛА ВСЕ
        downloadAppVersion(2015, 0);// ВАРИАНТЫ
        downloadAppVersion(2013, 1);
        downloadAppVersion(2018, 1);

       calculateDeliveryDays(7);
        System.out.println(calculateDeliveryDays(7) + " день доставки будет.Звоните!");
    }

    //task1
    // СОГЛАСНО РЕКОМЕНДАЦИЯМ УБРАЛ 1584 год
    private static void letsCheckYear(int year) {
        if (year > 1600 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.printf("%d год является високосным.\n", year);
        } else if (year > 1584) {
            System.out.printf("%d год не является високосным.\n", year);
        } else {
            System.out.println("Введен некорректный год.");
        }
    }

    //task2
    // ЗДЕСЬ Я ПОРАБОТАЛ С IF-ELSE.ВЛОЖЕННОСТЬ УМЕНЬШЕНА ДО ДВУХ.МЕНЬШЕ ЕЩЁ СДЕЛАТЬ НЕЛЬЗЯ
    private static void downloadAppVersion(int clientDeviceYear, int clientOS) {

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

    }


    private static int calculateDeliveryDays(int deliveryDistance) {
        int dayDelivery = 0;
        if (deliveryDistance <= 20) {
            dayDelivery += 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            dayDelivery += 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            dayDelivery += 3;
        }
        return dayDelivery;

    }
}




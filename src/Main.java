public class Main {

    public static void main(String[] args) {
        System.out.println("Hi, man!");
        System.out.println("Hi, JavaDeveloper!");
        letsCheckYear(202);
        downloadAppVersion(2015,0);

    }
       //task1
      //здесь объявляем метод LetsCheckYear и "заставляем" его работать и интами
      // после проверки условия печатаем
    private static void letsCheckYear(int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.printf("%d год является високосным.\n", year);
        } else if (year > 1584) {
            System.out.printf("%d год не является високосным.\n", year);
        } else {
            System.out.println("Введен некорректный год.");
        }
    }

          //task2
          // здесь я объявляю метод который будет работать с интовыми переменными
          //при вызове метода на точке входа где мэйн мы их передадим
    private static void downloadAppVersion(int clientDeviceYear, int clientOS) {

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }


        }
    }

    //task3
    //согласно усовию задачи дорабатываем код
    private static int sendOFCard(int deliveryDistance) {
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
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nНажмите \"n\", чтобы продолжить или любой другой символ, чтобы завершить программу");

            if(!nextStep(scanner.nextLine())){
                break;
            }

            System.out.println("Введите цифру:\n" +
                    "     Чтобы узнать мои характеристики - 1\n" +
                    "Чтобы узнать мои оценки за 1 семестр - 2\n" +
                    "           Чтобы узнать мои интересы - 3\n");
            choice(scanner.nextLine());

        }

    }

    public static void choice(String stringUser) {
        int stringUserLocal = 0;

        try {
            stringUserLocal = Integer.parseInt(stringUser);
        }
        catch (NumberFormatException e) {
            System.out.println("Вы ввели не правильное значение");
        }

        switch (stringUserLocal){
            case 1:
                System.out.println("Мой рост 179 см\nВес 75кг\nВозраст 18 лет");
                break;
            case 2:
                System.out.println("Алгем - 58\nИнформатика - 64\nМатан - 65");
                break;
            case 3:
                System.out.println("1.С 7 класса мне интересна медицина, хотел пойти учиться на хирурга для этого перешел" +
                        "в школу с мед. уклоном.\n2.Нравится баскетбол, волейбол, когда есть много свободного времени " +
                        "могу поиграть в комтьютерные игры\n3.Кажется начала нравится веб разработка, пока сложно сказать, " +
                        "но работать над проектом мне нравится\n4.Так же нравятся фильмы на разные тематики от вестернов " +
                        "до фентези по типу фильмов Нолана");
        }
    }

    public static boolean nextStep(String stringUser){
        return stringUser.equalsIgnoreCase("n");
    }
}


package lesson4;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(3, "синий", true, false);
        box.info();
        box.open();
        box.full();

        System.out.println();

        String[] names = new String[10];

        names[0] = "Виктор";
        names[1] = "Альберт";
        names[2] = "Александр";
        names[3] = "Леонид";
        names[4] = "Кейн";
        names[5] = "Фред";
        names[6] = "Михаил";
        names[7] = "Матвей";
        names[8] = "Мирон";
        names[9] = "Брюс";

        int[] ages = new int[10];

        ages[0] = 34;
        ages[1] = 45;
        ages[2] = 34;
        ages[3] = 54;
        ages[4] = 36;
        ages[5] = 55;
        ages[6] = 342;
        ages[7] = 65;
        ages[8] = 54;
        ages[9] = 23;

        for (int i = 0; i < 10; i++) {
            if (ages[i] >= 40) {
                System.out.println(names[i] + " " + ages[i] + " лет");
            }
        }
        System.out.println();

        User user = new User("Никита", "Орлов", "Михайлович", "66.666.1666", "orel@mail.ru");

        user.info();

    }
}
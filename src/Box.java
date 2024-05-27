public class Box {

    int size;
    String color;
    boolean IsOpen;
    boolean IsEmpty;

    Box(int size, String color, boolean IsOpen, boolean IsEmpty) {
        this.size = size;
        this.color = color;
        this.IsOpen = IsOpen;
        this.IsEmpty = IsEmpty;
    }

    void info() {
        System.out.println("размер ящика " + size + "\nцвет " + color);
    }

    void open() {
        if (IsOpen) {
            System.out.println("Ящик открыт");
        } else {
            System.out.println("Ящик закрыт");
        }
    }

    void full() {
        if (IsEmpty) {
            System.out.println("Ящик пуст");
        } else {
            System.out.println("Ящик полон");
        }
    }

}


package ru.otus.java.lesson4;

public class Box {

    private int size;
    private String color;
    private boolean isOpen;
    private boolean isEmpty;

    public Box(int size, String color, boolean isOpen, boolean isEmpty) {
        this.size = size;
        this.color = color;
        this.isOpen = isOpen;
        this.isEmpty = isEmpty;
    }

    void info() {
        System.out.println("размер ящика " + size + "\nцвет " + color);
    }

    void open() {
        if (isOpen) {
            System.out.println("Ящик открыт");
        } else {
            System.out.println("Ящик закрыт");
        }
    }

    void full() {
        if (isEmpty) {
            System.out.println("Ящик пуст");
        } else {
            System.out.println("Ящик полон");
        }
    }

}


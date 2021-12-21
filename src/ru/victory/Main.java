package ru.victory;

public class Main {

    public static void main(String[] args) {
        String[] list = Surnames.getRandomSurnameList(50);

        for (int i = 0; i < list.length; i++) {
            if (list[i].startsWith("А"))
                System.out.println(list[i] + " ");
        }
    }
}



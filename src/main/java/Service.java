package src.main.java;

import java.util.Scanner;

public class Service {

    private String scan(int num) {
        String s = (num == 1) ? "summ: " : "desc: ";
        System.out.println("Input a " + s);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public void scanner() {
        System.out.print("Input a comm: ");
        Scanner in = new Scanner(System.in);

        switch (in.nextLine()) {
            case "Добавить" -> {
                LocalRepoList.addToList(scan(1), scan(2));
            }
            case "Показать" -> {
                LocalRepoList.show(scan(1));
            }
            case "Удалить №" -> {
                LocalRepoList.deleteFromList(scan(1));
            }
            case "Редактировать №" -> {
                LocalRepoList.editList(scan(1), scan(2));
            }
        }
    }
}

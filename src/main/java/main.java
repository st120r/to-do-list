package src.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {
        System.out.println("""
                Команда "Добавить" и введённый после неё текст будут добавлять новое дело в список.
                Команда "Редактировать №" и номер дела будет заменять предыдущее описание дела на введённое новое.
                Команда "Удалить №" и номер дела после неё - удаляет выбранное дело. В этой задаче нужно использовать коллекции List
                """);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (name == "Добавить") {
            System.out.println(name);
        }
        System.out.println(name);
        System.out.println();
    }
}


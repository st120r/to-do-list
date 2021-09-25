package src.main.java;

import java.util.ArrayList;

class LocalRepoList {

    private static final ArrayList<Model> list = new ArrayList<>();

    public static ArrayList<Model> getList() {
        return list;
    }

    public static void addToList(String summ, String desc) {
        Model model = new Model();
        model.setSummary(summ);
        model.setDesc(desc);
        list.add(model);
    }

    public static void deleteFromList(String summ) {
        list.stream().filter(s -> !s.getSummary().equals(summ)).forEach(System.out::println);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSummary().equals(summ)) {
                list.remove(list.get(i));
            }
        }
    }

    public static void editList(String summ, String desc) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSummary().equals(summ)) {
                list.remove(list.get(i));
                addToList(summ, desc);
            }
        }
    }

    public static void show(String summ) {
        list.stream().filter(s -> s.getSummary().equals(summ)).forEach(System.out::println);
    }
}
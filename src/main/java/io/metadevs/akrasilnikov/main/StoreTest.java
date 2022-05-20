package io.metadevs.akrasilnikov.main;

public class StoreTest {

    public static void main(String[] args) {

        Store store = new Store();
        store.addProduct(new Hardware("Коса", 2, "У8", "Сельскохозяйственный инструмент"));
        store.addProduct(new Hardware("Коса", 2, "У7", "Сельскохозяйственный инструмент"));
        store.addProduct(new Computer("Оса", 2, 2, "Домашний компьютер"));
        store.addProduct(new Computer("Оса", 2, 4, "Домашний компьютер"));
        store.addProduct(new Wig("Коса", 1, false, "Постижерные изделия"));
        store.addProduct(new Wig("Коса", 1, true, "Постижерные изделия"));

        System.out.println("Тест equality");
        for (int i = 0; i < store.getProducts().size(); i++) {
            Product product1 = store.getProduct(i);
            for (int j = 0; j < store.getProducts().size(); j++) {
                Product product2 = store.getProduct(j);
                boolean pr = product1 == product2;
                System.out.printf("%6s", pr);
            }
            System.out.println();
        }
    }
}
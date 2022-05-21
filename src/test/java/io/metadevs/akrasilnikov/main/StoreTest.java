package io.metadevs.akrasilnikov.main;

public class StoreTest {

    public static void main(String[] args) {

        Store store = new Store();
        store.addProduct(new Hardware("Коса", 2, "У8", "Сельскохозинструмент"));
        store.addProduct(new Hardware("Коса", 2, "У7", "Сельскохозинструмент"));
        store.addProduct(new Computer("Коса", 2, 2, "Домашний компьютер"));
        store.addProduct(new Computer("Коса", 2, 4, "Домашний компьютер"));
        store.addProduct(new Wig("Коса", 1, false, "Постижерные изделия"));
        store.addProduct(new Wig("Коса", 1, true, "Постижерные изделия"));

        System.out.println("Тест Equals");
        for (int i = 0; i < store.getProducts().size(); i++) {
            Product product1 = store.getProduct(i);
            for (int j = 0; j < store.getProducts().size(); j++) {
                Product product2 = store.getProduct(j);
                boolean isEquals =  product1.equals(product2);
                System.out.printf("%6s %s сравниваем с %s%n", isEquals, store.getProduct(i).toString(), store.getProduct(j).toString());
            }
            System.out.println();
        }

        System.out.println("Тест NotEquals");
        for (int i = 0; i < store.getProducts().size(); i++) {
            Product product1 = store.getProduct(i);
            for (int j = 0; j < store.getProducts().size(); j++) {
                Product product2 = store.getProduct(j);
                boolean isNotEquals =  !product1.equals(product2);
                System.out.printf("%6s %s сравниваем с %s%n", isNotEquals, store.getProduct(i).toString(), store.getProduct(j).toString());
            }
            System.out.println();
        }

        System.out.println("Тест HashCode");
        for (int i = 0; i < store.getProducts().size(); i++) {
            Product product1 = store.getProduct(i);
            for (int j = 0; j < store.getProducts().size(); j++) {
                Product product2 = store.getProduct(j);
                boolean isHashCode =  product1.hashCode()==product2.hashCode();
                System.out.printf("%6s %s сравниваем с %s%n", isHashCode, store.getProduct(i).toString(), store.getProduct(j).toString());
            }
            System.out.println();
        }

    }
}
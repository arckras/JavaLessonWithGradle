package io.metadevs.akrasilnikov.main;

import java.util.Objects;

public class Wig implements Product {
    private String name;
    private int weight;
    private boolean isSynthetic;
    private String description;

    public Wig(String name, int weight, boolean isSynthetic, String description) {
        this.name = name;
        this.weight = weight;
        this.isSynthetic = isSynthetic;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Wig{'" + name + ", " + isSynthetic + ", '" + description + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wig)) return false;
        Wig wigStores = (Wig) o;
        return weight == wigStores.weight &&
                isSynthetic == wigStores.isSynthetic &&
                name.equals(wigStores.name) &&
                description.equals(wigStores.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, isSynthetic, description);
    }
}

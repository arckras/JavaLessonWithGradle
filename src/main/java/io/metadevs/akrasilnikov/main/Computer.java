package io.metadevs.akrasilnikov.main;

import java.util.Objects;

public class Computer implements Product {
    private String name;
    private int weight;
    private int coreCount;
    private String description;

    public Computer(String name, int weight, int coreCount, String description) {
        this.name = name;
        this.weight = weight;
        this.coreCount = coreCount;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computers = (Computer) o;
        return weight == computers.weight &&
                coreCount == computers.coreCount &&
                name.equals(computers.name) &&
                description.equals(computers.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, coreCount, description);
    }
}

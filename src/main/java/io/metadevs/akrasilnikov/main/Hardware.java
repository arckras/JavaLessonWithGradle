package io.metadevs.akrasilnikov.main;

import java.util.Objects;

public class Hardware implements Product{
    private String name;
    private int weight;
    private String steel;
    private String description;



    public Hardware(String name, int weight, String steel, String description) {
        this.name = name;

        this.weight = weight;
        this.steel = steel;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hardware)) return false;
        Hardware hardware = (Hardware) o;
        return weight == hardware.weight &&
                name.equals(hardware.name) &&
                steel.equals(hardware.steel) &&
                description.equals(hardware.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, steel, description);
    }
}

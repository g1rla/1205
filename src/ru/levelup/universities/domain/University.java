package ru.levelup.universities.domain;

import java.util.Objects;

public class University {
    private String shortName;
    private String name;
    private int foundationYear;

    public University(String shortName, String name, int foundationYear) {
        this.shortName = shortName;
        this.name = name;
        this.foundationYear = foundationYear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // u2 - из поля - this
        // u3 - argument (o)
        if (o == null || getClass() != o.getClass()) return false;


        University other = (University) o;
        return foundationYear == other.foundationYear &&
                Objects.equals(shortName, other.shortName) &&
                Objects.equals(name, other.name);
                //shortName.equals(other.shortName) &&
                //name.equals(other.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(shortName, name, foundationYear);

    }


    @Override
    public String toString() {
        return "University{" +
                "shortName='" + shortName + '\'' +
                ", name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}

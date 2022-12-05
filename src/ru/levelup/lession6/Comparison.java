package ru.levelup.lession6;

import ru.levelup.universities.domain.University;

public class Comparison {
    public static void main(String[] args) {
        University u1 = new University("СПбГУ", "Государственный университет", 1803);
        University u2 = new University("СПбГПУ", "Политехнический университет", 1804);
        University u3 = new University("СПбГПУ", "Политехнический университет", 1804);
        University u4 = u2;

        int i1 = 123;
        int i2 = 123;

        boolean areEquals = i1 == i2; // -> true
        boolean areObjectEquals = u2 == u3; // -> false, потому что разные ссылки
        boolean areReferenceEquals = u2 == u4; // -> true

        // u2.equals(u3) -> u2 vs u3
        boolean objectComparison = u2.equals(u3);// сравниваем u2 c u3;
        System.out.println("Comparison: " + objectComparison);

    }
}

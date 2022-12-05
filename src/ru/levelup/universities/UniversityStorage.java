package ru.levelup.universities;

import ru.levelup.universities.domain.University;

public class UniversityStorage {

    public University[] universities;

    public UniversityStorage() {
        //this.universities = new University[1];
        //this.universities[0] = new Universities("СПбГУ", "Государственный универститет", "1803"
        //this.universities[0] = new Universities("СПбГТУ", "Государственный универститет", "1804"
        this.universities = new University[] {
                new University("СПбГУ", "Государственный университет", 1803),
                new University("СПбГПУ", "Политехнический университет", 1804)
        };
    }
    //Проверяет, есть ли такой универстите в массиве
    public boolean exists(University university) {
        for (int i = 0; i < universities.length; i++) {
           if (universities[i].equals(university)) {
               return true;
           }
        }
        return false;

    }
}

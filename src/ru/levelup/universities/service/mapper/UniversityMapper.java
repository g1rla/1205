package ru.levelup.universities.service.mapper;

import ru.levelup.universities.domain.University;

//String from file -> University
public class UniversityMapper {
    //String from file -> University
    public University map(String line) {
        String[] values = line.split(",");
        return new University(values[0], values[1], Integer.parseInt(values[2]));

    }
}

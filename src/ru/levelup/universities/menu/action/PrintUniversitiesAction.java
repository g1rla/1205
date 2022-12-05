package ru.levelup.universities.menu.action;

import ru.levelup.universities.domain.University;
import ru.levelup.universities.service.UniversityService;

import java.util.List;

public class PrintUniversitiesAction implements Action {

    private final UniversityService universityService;

    public PrintUniversitiesAction(UniversityService universityService) {
        this.universityService = universityService;
    }

    @Override
    public void doAction() {
        List<University>universities = universityService.getAll();
        for (University u : universities) {
            System.out.println(u);
        }

    }
}

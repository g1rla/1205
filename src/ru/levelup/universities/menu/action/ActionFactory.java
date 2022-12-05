package ru.levelup.universities.menu.action;

import ru.levelup.universities.service.UniversityService;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {
    private  final Map<Integer, Action> actions = new HashMap<>();

    public ActionFactory(UniversityService universityService) {
        PrintUniversitiesAction printUniversitiesAction = new PrintUniversitiesAction(universityService);
        CreatedUniversityAction createdUniversityAction = new CreatedUniversityAction();

        actions.put(1, printUniversitiesAction);
        actions.put(2, createdUniversityAction);

    }
    public Action findAction(int actionNumber) {
        return actions.get(actionNumber);
    }
}

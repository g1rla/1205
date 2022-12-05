package ru.levelup.universities;

import ru.levelup.universities.domain.University;
import ru.levelup.universities.menu.ConsoleMenu;
import ru.levelup.universities.menu.action.Action;
import ru.levelup.universities.menu.action.ActionFactory;
import ru.levelup.universities.service.FileUniversityService;

public class Application {
    public static void main(String[] args) {

        System.out.println("Universities database");

        FileUniversityService fus = new FileUniversityService();
        ActionFactory actionFactory = new ActionFactory(fus);

        ConsoleMenu consoleMenu = new ConsoleMenu();
        consoleMenu.printMainActions();
        int actionNumber;
        do {
            actionNumber = consoleMenu.readActionNumber();
            if (actionNumber > 0 ) {
                System.out.println("You entered number: " + actionNumber);

                Action action = actionFactory.findAction(actionNumber);
                if (action != null) {
                    action.doAction();

                } else {
                    System.out.println("No action for entered number. Please try again. ");
                }


            }
        } while (actionNumber != 0);


    }
}

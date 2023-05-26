package Controller;

import Model.Human;
import Model.Sex;

public class HumanCreator {
    public Human createHuman(String name, String surname, String patronymic, Sex sex) {
        Human human = new Human();
        human.setName(name);
        human.setPatronymic(patronymic);
        human.setSex(sex);
        human.setSurname(surname);
        return human;
    }
    public  Human createTypicalHuman(){
        return createHuman("Angrew","Smith","S",Sex.MALE);
    }
}


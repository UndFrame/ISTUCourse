package ru.undframe.istucourse.animals;

import ru.undframe.istucourse.animals.behavior.Fly;
import ru.undframe.istucourse.animals.behavior.Run;
import ru.undframe.istucourse.animals.behavior.Swim;
import ru.undframe.istucourse.animals.behavior.Voice;
import ru.undframe.istucourse.eat.Food;

public interface Animal extends Run, Fly, Swim, Voice {

    void eat(Food food)

}

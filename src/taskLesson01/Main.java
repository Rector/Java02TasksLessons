package taskLesson01;

import taskLesson01.obstacles.*;
import taskLesson01.participants.*;

public class Main {
//   1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
//   Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//   -
//   2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
//   участники должны выполнять соответствующие действия (бежать или прыгать),
//   результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//   -
//   3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//   -
//   4.* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//   Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
//
    public interface RunAndJump {
        void run();

        void jump();
    }

    public static void main(String[] args) {

        Human aug = new Human("Octavian", 200, 3.0);
        Cat ces = new Cat("August", 500, 5.0);
        Robot r2D2 = new Robot("Cesar", 850, 0.7);

        aug.run();
        aug.jump();
        ces.run();
        ces.jump();
        r2D2.run();
        r2D2.jump();

        Participants[] team = {new Human("Luk Skywalker", 200, 2.5), new Cat("Chewbacca", 100, 3.0), new Robot("R2-D2", 300, 0.5)};
        Obstacles[] obst = {new Treadmill(150), new Wall(2.0)};

        for (int i = 0; i < obst.length; i++) {
            for (int j = 0; j < team.length; j++) {
                if (obst[i] instanceof Treadmill) {
                    ((Treadmill) obst[i]).resultRun(team[j]);
                }

                if (obst[i] instanceof Wall) {
                    ((Wall) obst[i]).resultJump(team[j]);
                }
            }
        }
    }
}

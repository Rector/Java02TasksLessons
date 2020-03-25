package taskLesson01.participants;

import taskLesson01.Main;

public class Cat extends Participants implements Main.RunAndJump {

    public Cat(String name, int limitRun, double limitJump) {
        super(name, limitRun, limitJump);
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public void jump(){
        System.out.println("Cat jump");
    }
}

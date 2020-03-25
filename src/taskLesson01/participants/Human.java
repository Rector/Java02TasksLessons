package taskLesson01.participants;

import taskLesson01.Main;

public class Human extends Participants implements Main.RunAndJump {


    public Human(String name, int limitRun, double limitJump) {
        super(name, limitRun, limitJump);
    }


    @Override
    public void run() {
        System.out.println("Human run");
    }

    @Override
    public void jump(){
        System.out.println("Human jump");
    }

}

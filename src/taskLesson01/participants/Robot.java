package taskLesson01.participants;

import taskLesson01.Main;

public class Robot extends Participants implements Main.RunAndJump {

    public Robot(String name, int limitRun, double limitJump) {
        super(name, limitRun, limitJump);
    }

    @Override
    public void run() {
        System.out.println("Robot run");
    }

    @Override
    public void jump(){
        System.out.println("Robot jump");
    }
}

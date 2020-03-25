package taskLesson01.obstacles;

import taskLesson01.participants.Participants;

public class Wall extends Obstacles {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public void resultJump(Participants p) {
        if (p.getOvercame() == false) {
            System.out.printf("Participant %s didn't cope with the previous obstacle%n", p.getName());
            return;
        }

        if (p.getLimitJump() >= height) {
            System.out.printf("Participant %s jumped over the wall%n", p.getName());
        } else {
            p.setOvercame(false);
            System.out.printf("Participant %s didn't jump over the wall%n", p.getName());
        }
    }
}

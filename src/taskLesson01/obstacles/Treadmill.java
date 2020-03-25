package taskLesson01.obstacles;

import taskLesson01.participants.Participants;

public class Treadmill extends Obstacles {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void resultRun(Participants p) {
        if (p.getOvercame() == false) {
            System.out.printf("Participant %s didn't cope with the previous obstacle%n", p.getName());
            return;
        }

        if (p.getLimitRun() >= length) {
            System.out.printf("Participant %s ran the distance%n", p.getName());
        } else {
            p.setOvercame(false);
            System.out.printf("Participant %s didn't run the distance%n", p.getName());
        }
    }
}

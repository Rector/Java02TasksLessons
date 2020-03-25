package taskLesson01.participants;

public class Participants {
    private String name;
    private int limitRun;
    private double limitJump;
    private boolean overcame;


    public Participants(String name, int limitRun, double limitJump){
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
        overcame = true;
    }

    public String getName(){
        return name;
    }

    public int getLimitRun(){
        return limitRun;
    }

    public double getLimitJump(){
        return limitJump;
    }

    public boolean getOvercame() {
        return overcame;
    }

    public void setOvercame(boolean overcame) {
        this.overcame = overcame;
    }
}

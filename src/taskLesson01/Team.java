package taskLesson01;

public class Team {
    private String commandName;
    private String[] namesParticipants;
    private boolean overcame;
// 2. Добавить класс Team, который будет содержать: название команды, массив из 4-х участников
// (т.е. в конструкторе можно сразу всех участников указывать),
// метод для вывода информации о членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
    public Team(String commandName){
        this.commandName = commandName;
        namesParticipants = new String[]{
                "Felix", "Kassandra", "Dorofei", "Violeta"
        };
    }

    public void infoCommand(){
        System.out.printf("Members Team \"%s\":%nName Participant One: %-12s Name Participant Two: %-12s " +
                        "Name Participant Three: %-12s Name Participant Four: %-12s%n",
                commandName, namesParticipants[0], namesParticipants[1],  namesParticipants[2],  namesParticipants[3]);
    }

    public void quantityOvercameCourse(Course c){

    }
}
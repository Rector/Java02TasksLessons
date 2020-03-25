package taskLesson01;

public class Course {
// 3. Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий,
// метод который будет просить команду пройти всю полосу;
    private int[] obstacles;

    public Course(int trackLength, int wallHeight){
        obstacles = new int[]{
                trackLength, wallHeight
        };
    }

    public void overcameCourse (Team t){

    }
}

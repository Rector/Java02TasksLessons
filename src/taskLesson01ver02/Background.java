package taskLesson01ver02;

import javax.swing.*;
import java.awt.*;

public class Background extends JPanel {

//    Написать класс Бэкграунд, изменяющий цвет канвы в зависимости от времени внутри приложения
//    * Реализовать добавление новых кружков по клику используя ТОЛЬКО массивы
//    ** Реализовать по клику другой кнопки удаление кружков (никаких эррейЛист)

    GameCanvas colorCanvas;

    Background(GameCanvas colorCanvas) {
        this.colorCanvas = colorCanvas;
        colorCanvas.setBackground(new Color(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255)
        ));
    }

    void changeColorBackground() {
            colorCanvas.setBackground(new Color(
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255)
            ));
    }

}

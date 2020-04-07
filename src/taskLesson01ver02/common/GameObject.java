package taskLesson01ver02.common;

import java.awt.*;

public interface GameObject {
    void update(GameCanvas canvas, float deltaTime);
    void render(GameCanvas canvas, Graphics g);
}
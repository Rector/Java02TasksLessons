package taskLesson01ver02.common;

import java.awt.*;

public interface GameCanvasListener {
    void onCanvasRepainted(GameCanvas canvas, Graphics g, float deltaTime);
}

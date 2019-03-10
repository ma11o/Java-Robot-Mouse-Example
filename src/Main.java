import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;

public class Main {

    public static void main(String[] args) throws AWTException {
        // 画面の幅
        int screenWidth =  Toolkit.getDefaultToolkit().getScreenSize().width;

        // 画面の高さ
        int screenHeight =  Toolkit.getDefaultToolkit().getScreenSize().height;

        Robot robot = new Robot();

        // マウスを画面の中央に移動させる
        robot.mouseMove(screenWidth / 2, screenHeight / 2);
    }
}

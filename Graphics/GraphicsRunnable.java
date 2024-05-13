package Graphics;
import Menu.BattleMenu;
import java.lang.Runnable;

public class GraphicsRunnable implements Runnable {
    private int battleMenuChoice;

    @Override
    public void run() {
        try {
            BattleMenu frame = new BattleMenu();
            frame.setVisible(true);
            battleMenuChoice = frame.getMenuChoiceId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int getBattleMenuChoice(){
        return battleMenuChoice;
    }
}
import Characters.*;
import Menu.*;
import java.awt.EventQueue;

public class Main{

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleMenu frame = new BattleMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}







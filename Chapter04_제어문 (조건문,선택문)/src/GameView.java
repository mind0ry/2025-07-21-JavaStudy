import javax.swing.*; //경량
import java.awt.*; //image
public class GameView extends JPanel{

		Image back,air;
		// 초기화
		int x=150;
		int y=100;
		public GameView() {
			// 생성자 => 변수에 대한 초기화
			back=Toolkit.getDefaultToolkit().
					getImage("c:\\javaDev\\background.jpg");
			air=Toolkit.getDefaultToolkit().
					getImage("c:\\javaDev\\jump.gif");
			
		}
		public void paint(Graphics g) {
			g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
			g.drawImage(air, x, y, 300, 300, this);
		}
		
	}

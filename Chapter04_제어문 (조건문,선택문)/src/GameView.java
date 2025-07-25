import javax.swing.*; //경량
import java.awt.*; //image
public class GameView extends JPanel{

		Image back,air;
		// 초기화
		public GameView() {
			// 생성자 => 변수에 대한 초기화
			back=Toolkit.getDefaultToolkit().
					getImage("c:\\javaDev\\background.jpg");
			air=Toolkit.getDefaultToolkit().
					getImage("c:\\javaDev\\airplane.png");
			
		}
		public void paint(Graphics g) {
			g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
			g.drawImage(air, 300, 100, 150, 100, this);
		}
		
	}

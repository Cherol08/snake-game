import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame(){
		// GamePanel panel = new GamePanel();
		this.add(new GamePanel());
		this.setTitle("Classic Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); // takes Jframe and fits it snuggly to all components added to the frame
		this.setVisible(true);
		this.setLocationRelativeTo(null); //lets frame appear in middle of computer screen
	}

}

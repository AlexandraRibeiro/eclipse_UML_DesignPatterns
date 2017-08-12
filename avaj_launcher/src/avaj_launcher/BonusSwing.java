package avaj_launcher;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;

public class BonusSwing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static BonusSwing window;

	private BonusSwing () {}
	
	public static void initWindow() {
		if (window == null) {
			window = new BonusSwing();
			window.init();
		}
	}
	
	private void init() {
		this.setTitle("Generator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		
		JPanel panel1 = new JPanel();
	
		panel1 = new JPanel(new BorderLayout());
		panel1.setBackground(new Color(255,255,255));
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Aircraft's type"),
        BorderFactory.createEmptyBorder(10,10,10,10)));
		
		
		ButtonGroup groupe = new ButtonGroup();
		
		JRadioButton button1 = new JRadioButton("JetPlane");
		groupe.add(button1);
		button1.addActionListener(new StateListener());
		panel1.add(button1);
		
		JRadioButton button2 = new JRadioButton("Helicopter");
		groupe.add(button2);
		button2.addActionListener(new StateListener());
		panel1.add(button2);
		
		JRadioButton button3 = new JRadioButton("Baloon");
		groupe.add(button3);
		button3.addActionListener(new StateListener());
		panel1.add(button3);
		
		JRadioButton button4 = new JRadioButton("Rocket");
		groupe.add(button4);
		button4.addActionListener(new StateListener());
		panel1.add(button4);
		
		JRadioButton button5 = new JRadioButton("Drone");
		groupe.add(button5);
		button5.addActionListener(new StateListener());
		panel1.add(button5);
		
		
		
		JPanel panel2 = new JPanel();
		
		panel2.setBackground(new Color(242,242,242));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Flag"),
        BorderFactory.createEmptyBorder(10,10,10,10)));
		
		JCheckBox flag = new JCheckBox("-g : generate MD5");
		flag.addItemListener(new ItemListen());
		panel2.add(flag);
		
		
		
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,panel1,panel2);
		splitPane.setDividerLocation(100);
		splitPane.setOneTouchExpandable(true);
		
		
		
		
		this.add(splitPane);
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisible(true);
	}		
	
}
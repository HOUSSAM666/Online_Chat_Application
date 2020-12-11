import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class window_1 extends JFrame {
    static String username1;
	private JPanel contentPane;
	


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window_1 frame = new window_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public window_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display1 = new JTextArea();
		display1.setBounds(24, 47, 405, 377);
		contentPane.add(display1);
		
		
		text1 = new JTextArea();
		text1.setBounds(53, 448, 255, 54);
		contentPane.add(text1);
		
		send1 = new JButton("SEND");
		send1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text1.getText();
				if(s.equals("")) {
					return;
					
				}
				display1.append(username1 + ":" + s + "\n");
				window_2.sendText();
				text1.setText("");
				
			}
		});
		send1.setBounds(401, 462, 125, 52);
		contentPane.add(send1);
		
		label1 = new JLabel("Chat window for: " + username1);
		label1.setBounds(24, 10, 284, 27);
		contentPane.add(label1);
	}

	
	public static void sendText() {
	    String s = window_2.text2.getText();
	    if(s.equals("")) {
	    	return;
	    }
	    display1.append(window_2.username2 + ":" + s + "\n");
	    
	    }
	
	
	
	private javax.swing.JLabel label1;
	private static javax.swing.JTextArea display1;
	private javax.swing.JButton send1;
	public static javax.swing.JTextArea text1;
	
}

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

public class window_2 extends JFrame {
    static String username2;
	private JPanel contentPane;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window_2 frame = new window_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public window_2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display2 = new JTextArea();
		display2.setBounds(38, 62, 394, 336);
		contentPane.add(display2);
		
		
		text2 = new JTextArea();
		text2.setBounds(75, 476, 5, 22);
		contentPane.add(text2);
		
		send2 = new JButton("SEND");
		send2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String s = text2.getText();
					if(s.equals("")) {
						return;
						
					}
					display2.append(username2 + ":" + s + "\n");
					window_1.sendText();
					text2.setText("");
					
				
			}
		});
		send2.setBounds(401, 462, 125, 52);
		contentPane.add(send2);
		
		label2 = new JLabel("Chat window for: " + username2);
		label2.setBounds(10, 10, 357, 34);
		contentPane.add(label2);
		
		JTextArea text2 = new JTextArea();
		text2.setBounds(38, 476, 275, 52);
		contentPane.add(text2);
	}

	public static void sendText() {
	    String s = window_1.text1.getText();
	    if(s.equals("")) {
	    	return;
	    }
	    display2.append(window_1.username1 + ":" + s + "\n");
	    
	    }


	private javax.swing.JLabel label2;
	private static javax.swing.JTextArea display2;
	private javax.swing.JButton send2;
	public static javax.swing.JTextArea text2;
	


}



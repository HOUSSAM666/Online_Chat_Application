import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField name1;
	private final JTextField name2 = new JTextField();


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1st username");
		lblNewLabel.setBounds(146, 15, 190, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2nd username");
		lblNewLabel_1.setBounds(146, 99, 190, 25);
		contentPane.add(lblNewLabel_1);
		
		name1 = new JTextField();
		name1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name1.setBounds(104, 50, 237, 31);
		contentPane.add(name1);
		name1.setColumns(10);
		name2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name2.setBounds(104, 134, 237, 31);
		contentPane.add(name2);
		name2.setColumns(10);
		
		JButton btnNewButton = new JButton("JOIN CHAT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		btnNewButton.setBounds(152, 203, 128, 47);
		contentPane.add(btnNewButton);
	}
       
	private void createRoom() {
		String p1, p2;
		
		p1 = name1.getText();
		p2 = name2.getText();
		
		if(p1.equals("") || p2.equals("")) {
			JOptionPane.showMessageDialog(null, "Please enter a valid username");
			return;
		}
		
		
	          window_1.username1 = name1.getText();
	          window_2.username2 = name2.getText();
	          ChatRoom.createRoom();
	          
		}

	
}

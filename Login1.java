import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Login1 extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login1 frame = new Login1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel login = new JLabel("");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Perform login validation when the login label is clicked
                String uname = username.getText();
				
				String pass = password.getText();
				
				if(uname.equals("lezzandrei") & pass.equals("abalbuena")) {
					// If the username and password match, open the main window
					Main main = new Main();
					main.setVisible(true);
					// If the username and password do not match, show an error message
					
				}else {
					
					Login lframe = new	Login();
					JOptionPane.showMessageDialog(lframe, "Invalid Login ");
					
				}
			
			}
           		});
		
		password = new JPasswordField();
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setFont(new Font("Tahoma", Font.BOLD, 24));
		password.setForeground(new Color(75, 0, 130));
		password.setBackground(new Color(255, 239, 213));
		password.setBounds(592, 405, 336, 56);
		contentPane.add(password);
		
		username = new JTextField();
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setFont(new Font("Times New Roman", Font.BOLD, 24));
		username.setForeground(new Color(75, 0, 130));
		username.setBackground(new Color(216, 191, 216));
		username.setBounds(592, 249, 320, 48);
		contentPane.add(username);
		username.setColumns(10);
		login.setBounds(277, 544, 437, 56);
		contentPane.add(login);
		
		JLabel labellogin = new JLabel("");
		labellogin.setBackground(new Color(216, 191, 216));
		labellogin.setIcon(new ImageIcon(Login1.class.getResource("/img/Login.png")));
		labellogin.setBounds(0, 0, 1133, 611);
		contentPane.add(labellogin);
	}
}

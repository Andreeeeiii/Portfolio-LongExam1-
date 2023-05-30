import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AboutMe extends Main {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AboutMe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Clickable JLabel for navigating to the Hobbies screen
		JLabel AMclick = new JLabel("");
		AMclick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					Hobbies hobbies = new Hobbies();
					hobbies.setVisible(true);
					dispose();
			}
		});
		

		// Clickable JLabel for navigating to the Main screen
		JLabel AMclickL = new JLabel("");
		AMclickL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					Main main = new Main();
					main.setVisible(true);
					dispose();
			}
		});
		AMclickL.setBounds(48, 518, 53, 38);
		contentPane.add(AMclickL);
		AMclick.setBounds(981, 518, 95, 38);
		contentPane.add(AMclick);
		
		JLabel lblNewLabel_2 = new JLabel("");
		
		// JLabel for displaying an image
		lblNewLabel_2.setIcon(new ImageIcon(AboutMe.class.getResource("/img/Aboutme.png")));
		lblNewLabel_2.setBounds(0, 0, 1133, 593);
		contentPane.add(lblNewLabel_2);
	}
}

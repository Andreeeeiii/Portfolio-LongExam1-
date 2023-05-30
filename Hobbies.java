import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Hobbies extends Main {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Hobbies() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Create a clickable label for returning to the main screen
		JLabel HBclick = new JLabel("");
		HBclick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// When clicked, create a new instance of the Main class, make it visible, and dispose of the current frame
				Main main = new Main();
				main.setVisible(true);
				dispose();
			}
		});
		HBclick.setBounds(769, 0, 108, 88);
		contentPane.add(HBclick);
		
		// Create a label to display the image
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Hobbies.class.getResource("/img/Hobbies.png")));
		lblNewLabel_3.setBounds(0, 0, 1133, 604);
		contentPane.add(lblNewLabel_3);
	}

}

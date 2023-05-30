import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Education extends Main {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Education() {
		// Set up the main frame for the Education module
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 643);
		
		// Create the content pane and set its layout
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Create a label for the Education module (EDM) and add a mouse click listener
		JLabel EDM = new JLabel("");
		EDM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// When the EDM label is clicked, create a new instance of the Main class, set it visible, and close the current frame
				Main main = new Main();
				main.setVisible(true);
				dispose();
			}
		});
		EDM.setBounds(0, 0, 1133, 604);
		contentPane.add(EDM);
		
		// Create a label for an image and set its icon
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Education.class.getResource("/img/Education.png")));
		lblNewLabel_4.setBounds(0, 0, 1133, 604);
		contentPane.add(lblNewLabel_4);
	}
}

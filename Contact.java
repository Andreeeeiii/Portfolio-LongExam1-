import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class Contact extends Main {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact frame = new Contact();
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
	public Contact() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// fb link label
		JLabel fblink = new JLabel("");
		fblink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					// Handle any exceptions that may occur
					Desktop.getDesktop().browse(new URL("https://www.facebook.com/lezzzzxandrei").toURI()); 
				}
				catch(Exception E1) { 
					// Handle any exceptions that may occur
					
				}
			}
		});
		
		// Instagram link label
		JLabel iglink = new JLabel("");
		iglink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					// Open the Instagram link in the default browser
					Desktop.getDesktop().browse(new URL("https://www.instagram.com/_lezzandrei/").toURI());
				}
				catch(Exception E1) {
					// Handle any exceptions that may occur
				}
			}
		});
		
		// Button to return to the main frame
		JLabel CNTr = new JLabel("");
		CNTr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main main = new Main();
				main.setVisible(true);
				dispose();// Close the current frame
			}
		});
		CNTr.setBounds(1011, 501, 66, 58);
		contentPane.add(CNTr);
		iglink.setBounds(557, 440, 140, 119);
		contentPane.add(iglink);
		fblink.setBounds(408, 423, 108, 112);
		contentPane.add(fblink);
		
		// Background image label
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Contact.class.getResource("/img/Contact.png")));
		lblNewLabel_6.setBounds(0, 0, 1133, 604);
		contentPane.add(lblNewLabel_6);
	}

}

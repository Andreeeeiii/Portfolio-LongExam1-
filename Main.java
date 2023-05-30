import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Create a JLabel for the About Me section
		JLabel ABM = new JLabel("");
		ABM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutMe abm = new AboutMe();
				abm.setVisible(true);
				dispose();
			}
		});
		
		// Create a JLabel for the Education section
		JLabel EDT = new JLabel("");
		EDT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Education edt = new Education();
				edt.setVisible(true);
				dispose();
			}
		});
		
		// Create a JLabel for the Works section
		JLabel WKS = new JLabel("");
		WKS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Works wks = new Works();
				wks.setVisible(true);
				dispose();
			}
		});
		
		// Create a JLabel for the Contact section
		JLabel CNT = new JLabel("");
		CNT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Contact cnt = new Contact();
				cnt.setVisible(true);
				dispose();
			}
		});
		CNT.setBounds(739, 248, 113, 112);
		contentPane.add(CNT);
		WKS.setBounds(573, 261, 113, 99);
		contentPane.add(WKS);
		EDT.setBounds(407, 261, 105, 99);
		contentPane.add(EDT);
		ABM.setBounds(220, 265, 120, 95);
		contentPane.add(ABM);
		
		// Set the background image using an ImageIcon
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/img/Main.png")));
		lblNewLabel_1.setBounds(0, 0, 1133, 604);
		contentPane.add(lblNewLabel_1);
	}
}


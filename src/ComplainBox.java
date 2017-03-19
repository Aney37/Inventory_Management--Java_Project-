import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;


public class ComplainBox {

	public JFrame frmProblemBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComplainBox window = new ComplainBox();
					window.frmProblemBox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComplainBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProblemBox = new JFrame();
		frmProblemBox.setTitle("Problem Box");
		frmProblemBox.setBounds(100, 100, 450, 300);
		frmProblemBox.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmProblemBox.getContentPane().setLayout(null);
		
		JLabel lblReportAProblem = new JLabel("Report a Problem to the Manager");
		lblReportAProblem.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblReportAProblem.setBounds(54, 30, 222, 14);
		frmProblemBox.getContentPane().add(lblReportAProblem);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(54, 67, 349, 118);
		frmProblemBox.getContentPane().add(textArea);
		
		JLabel lblwriteWithin = new JLabel("(Write within 150 words)");
		lblwriteWithin.setBounds(246, 196, 157, 14);
		frmProblemBox.getContentPane().add(lblwriteWithin);
		
		JButton btnSend = new JButton("Send");
		btnSend.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSend.setBounds(167, 221, 89, 23);
		frmProblemBox.getContentPane().add(btnSend);
	}
}

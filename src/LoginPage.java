

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;


public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setupLookAndFeel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterUsernameAnd = new JLabel("Enter username and password to login");
		lblEnterUsernameAnd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterUsernameAnd.setBounds(92, 39, 278, 26);
		contentPane.add(lblEnterUsernameAnd);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(92, 82, 70, 26);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(172, 87, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(92, 119, 70, 26);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				if(s.equals("salesman"))
				{
					s = passwordField.getText();
					if(s.equals("sales"))
					{
						Salesman window = new Salesman();
						window.frmStoreManagement.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Try again");
					}
				}
				
				else if(s.equals("manager"))
				{
					s = passwordField.getText();
					if(s.equals("manager"))
					{
						Manager window = new Manager();
						window.frmStoreManagement.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Try again");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Try again");
				}
				
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setToolTipText("LOGIN");
		btnLogin.setBounds(92, 168, 123, 37);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Why??? plz login...");
			}
		});
		btnExit.setToolTipText("LOGIN");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBounds(225, 168, 123, 37);
		contentPane.add(btnExit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(172, 124, 147, 20);
		contentPane.add(passwordField);
	}
	
	private static void setupLookAndFeel ()
    {
        try
        {
            UIManager.setLookAndFeel ( UIManager.getSystemLookAndFeelClassName () );
        }
        catch ( ClassNotFoundException e )
        {
            e.printStackTrace ();
        }
        catch ( InstantiationException e )
        {
            e.printStackTrace ();
        }
        catch ( IllegalAccessException e )
        {
            e.printStackTrace ();
        }
        catch ( UnsupportedLookAndFeelException e )
        {
            e.printStackTrace ();
        }
    }
}

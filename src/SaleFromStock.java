import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;


public class SaleFromStock extends JDialoguebox {

	public JFrame frmSaleFromStock;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleFromStock window = new SaleFromStock();
					window.frmSaleFromStock.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SaleFromStock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSaleFromStock = new JFrame();
		frmSaleFromStock.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmSaleFromStock.setTitle("Sale From Stock");
		frmSaleFromStock.setBounds(100, 100, 450, 300);
		frmSaleFromStock.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSaleFromStock.getContentPane().setLayout(null);
		
		JLabel lblEnterId = new JLabel("Enter ID :");
		lblEnterId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterId.setBounds(83, 40, 91, 14);
		frmSaleFromStock.getContentPane().add(lblEnterId);
		
		textField1 = new JTextField();
		textField1.setBounds(183, 38, 111, 20);
		frmSaleFromStock.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton btnSaleMore = new JButton("Sale More");
		btnSaleMore.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSaleMore.setBounds(83, 99, 111, 34);
		frmSaleFromStock.getContentPane().add(btnSaleMore);
		
		JButton btnSeeTotal = new JButton("See Total");
		btnSeeTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSeeTotal.setBounds(262, 99, 111, 34);
		frmSaleFromStock.getContentPane().add(btnSeeTotal);
		
		JButton btnNewButton = new JButton("Print Receipt");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(83, 178, 125, 34);
		frmSaleFromStock.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("OK");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(262, 178, 111, 34);
		frmSaleFromStock.getContentPane().add(btnNewButton_1);
		
		btnNewButton_1.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    	try{
		    	 int text=Integer.parseInt(textField1.getText());
		    	dbconnect connect=new dbconnect();
		    	connect.updatedata(text);
		    	System.out.println("DOne ");
		    	}catch(Exception ex){
					
					System.out.println("Error: "+ex);
				}
				
		    }
		});
	}

}

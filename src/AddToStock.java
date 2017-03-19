import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.sql.*;


public class AddToStock extends JFrame {

	public JFrame frmAddToStock;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnDone;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
	
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddToStock window = new AddToStock();
					window.frmAddToStock.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	
		
	}

	/**
	 * Create the application.
	 */
	public AddToStock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddToStock = new JFrame();
		frmAddToStock.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		frmAddToStock.setTitle("Add to Stock");
		frmAddToStock.setBounds(150, 150, 500, 350);
		frmAddToStock.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAddToStock.getContentPane().setLayout(null);
		
		JLabel lblEnterId = new JLabel("Enter ID :");
		lblEnterId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterId.setBounds(75, 57, 111, 14);
		frmAddToStock.getContentPane().add(lblEnterId);
		
		textField = new JTextField();
		textField.setBounds(212, 55, 123, 20);
		frmAddToStock.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterName = new JLabel("Enter Name :");
		lblEnterName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterName.setBounds(75, 97, 123, 14);
		frmAddToStock.getContentPane().add(lblEnterName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(212, 95, 123, 20);
		frmAddToStock.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEnterBuyingPrice = new JLabel("Enter Buying Price :");
		lblEnterBuyingPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterBuyingPrice.setBounds(75, 146, 135, 14);
		frmAddToStock.getContentPane().add(lblEnterBuyingPrice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(212, 144, 123, 20);
		frmAddToStock.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEnterNumberOfProducts = new JLabel("No of products :");
		lblEnterNumberOfProducts.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterNumberOfProducts.setBounds(75, 186, 112, 14);
		frmAddToStock.getContentPane().add(lblEnterNumberOfProducts);
		
		textField_3 = new JTextField();
		textField_3.setBounds(212, 184, 123, 20);
		frmAddToStock.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		 btnDone = new JButton("Add");
		btnDone.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDone.setBounds(162, 213, 89, 23);
		frmAddToStock.getContentPane().add(btnDone);
		
		
		
		btnDone.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    	try{
		    	 int text=Integer.parseInt(textField.getText());
		    	 String text_1=textField_1.getText().toString();
		    	 int text_2=Integer.parseInt(textField_2.getText());
		    	 int text_3=Integer.parseInt(textField_3.getText());
		    		dbconnect connect=new dbconnect();
		    	 connect.insertdata(text,text_1,text_2,text_3);
		    	System.out.println("DOne ");
		    	}catch(Exception ex){
					
					System.out.println("Error: "+ex);
				}
				
		    }
		});
		
		
		
	}
	

	
} 


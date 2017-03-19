import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.table.DefaultTableModel;

import java.sql.*;

public class Salesman extends JDialoguebox {

	public JFrame frmStoreManagement;
	private JTable table;
	private JTextField textField;
	JTextArea  textArea;
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salesman window = new Salesman();
					window.frmStoreManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Salesman() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
			st=con.createStatement();
		}catch(Exception ex){
			
			System.out.println("Error: "+ex);
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStoreManagement = new JFrame();
		frmStoreManagement.setTitle("Store Management - Salesman");
		frmStoreManagement.setBounds(150, 150, 600, 400);
		frmStoreManagement.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmStoreManagement.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mnMenu.add(mntmHelp);
		
		JMenuItem mntmLogOut = new JMenuItem("Log out");
		mnMenu.add(mntmLogOut);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenuItem mntmAboutSoftware = new JMenuItem("About software");
		mnAbout.add(mntmAboutSoftware);
		
		JMenuItem mntmAboutDeveloper = new JMenuItem("About developer");
		mnAbout.add(mntmAboutDeveloper);
		frmStoreManagement.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Sale from Stock");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SaleFromStock window = new SaleFromStock();
				window.frmSaleFromStock.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(194, 258, 151, 40);
		frmStoreManagement.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Report Problem");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ComplainBox window = new ComplainBox();
				window.frmProblemBox.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(379, 258, 136, 40);
		frmStoreManagement.getContentPane().add(btnNewButton_2);
		
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(38, 152, 352, -123);
		frmStoreManagement.getContentPane().add(table);
		
		JLabel lblAvailableStock = new JLabel("Available Stock");
		lblAvailableStock.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAvailableStock.setBounds(48, 29, 103, 14);
		frmStoreManagement.getContentPane().add(lblAvailableStock);
		
		


		
	
		
		
	
		
		JButton btnAddToStock = new JButton("Add to Stock");
		btnAddToStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddToStock window = new AddToStock();
				window.frmAddToStock.setVisible(true);
			}
		});
		btnAddToStock.setBounds(40, 258, 130, 40);
		frmStoreManagement.getContentPane().add(btnAddToStock);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	public void getdata(){
		try{
			String query= "select * from products";
			rs=st.executeQuery(query);
			while(rs.next()){
				String id=rs.getString("id");
				String name=rs.getString("name");
				String price=rs.getString("price");
				String available=rs.getString("available");
			

			
				//textArea.append(id + '\n');
				//System.out.println("Name: "+name+"   "+"Age: "+age);
			}
			
		}catch(Exception ex){
			
			System.out.println("Error: "+ex);
		}
		
	}
	
	
}


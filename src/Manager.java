import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;
import java.awt.Color;

import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.ScrollPane;

import javax.swing.JScrollBar;

import java.awt.Point;

import javax.swing.JScrollPane;
import javax.swing.JList;


public class Manager extends JDialoguebox {
	Vector<String> columnNames = new Vector<String>();
	public JFrame frmStoreManagement;
	private JTable table;
	private JPanel panel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;
	private JTextField textField_4;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager window = new Manager();
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
	public Manager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStoreManagement = new JFrame();
		frmStoreManagement.setTitle("Store Management - Manager");
		frmStoreManagement.setBounds(150, 150, 600, 400);
		frmStoreManagement.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmStoreManagement.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mnMenu.add(mntmHelp);
		
		JMenuItem mntmViewReport = new JMenuItem("View Report");
		mnMenu.add(mntmViewReport);
		
		JMenuItem mntmLogOut = new JMenuItem("Log out");
		mnMenu.add(mntmLogOut);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenuItem mntmAboutSoftware = new JMenuItem("About Software");
		mnAbout.add(mntmAboutSoftware);
		
		JMenuItem mntmAboutDeveloper = new JMenuItem("About Developer");
		mnAbout.add(mntmAboutDeveloper);
		frmStoreManagement.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 564, 318);
		frmStoreManagement.getContentPane().add(tabbedPane);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Review Stock", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblAvailableStock = new JLabel("Available Stock ");
		lblAvailableStock.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAvailableStock.setBounds(29, 11, 124, 14);
		panel_1.add(lblAvailableStock);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 267, 490, -222);
		panel_1.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(502, 43, 17, 213);
		panel_1.add(scrollBar);
		
		/*table_1 = new JTable();
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setBounds(29, 40, 474, 216);
		panel_1.add(table_1);
		*/
		
		
		
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Update Stock", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblEnterIdTo = new JLabel("Enter ID to be Updated :");
		lblEnterIdTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterIdTo.setBounds(65, 46, 167, 14);
		panel_1.add(lblEnterIdTo);
		
		textField = new JTextField();
		textField.setBounds(261, 44, 105, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblEditName = new JLabel("Edit name :");
		lblEditName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEditName.setBounds(65, 88, 76, 14);
		panel_1.add(lblEditName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(262, 86, 104, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEditBuyingPrice = new JLabel("Edit Buying Price :");
		lblEditBuyingPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEditBuyingPrice.setBounds(68, 133, 139, 14);
		panel_1.add(lblEditBuyingPrice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(261, 131, 105, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEditSellingPrice = new JLabel("Edit Selling Price :");
		lblEditSellingPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEditSellingPrice.setBounds(68, 175, 139, 14);
		panel_1.add(lblEditSellingPrice);
		
		textField_3 = new JTextField();
		textField_3.setBounds(261, 173, 105, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdate.setBounds(377, 238, 89, 23);
		panel_1.add(btnUpdate);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Today's Sale", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblTodaysSoldProducts = new JLabel("Today's Sold Products :");
		lblTodaysSoldProducts.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTodaysSoldProducts.setBounds(84, 36, 166, 14);
		panel_2.add(lblTodaysSoldProducts);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Daily Report", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblSeeTodaysTotal = new JLabel("See Today's Total -");
		lblSeeTodaysTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSeeTodaysTotal.setBounds(48, 27, 149, 14);
		panel_3.add(lblSeeTodaysTotal);
		
		JButton btnBuyingPrice = new JButton("Buying Price");
		btnBuyingPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBuyingPrice.setBounds(63, 65, 134, 30);
		panel_3.add(btnBuyingPrice);
		
		JButton btnSellingPrice = new JButton("Selling Price ");
		btnSellingPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSellingPrice.setBounds(63, 117, 134, 30);
		panel_3.add(btnSellingPrice);
		
		JButton btnTodaysProfit = new JButton("Today's Profit");
		btnTodaysProfit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTodaysProfit.setBounds(63, 172, 134, 30);
		panel_3.add(btnTodaysProfit);
		
		JButton btnTodaysSell = new JButton("Today's Sell");
		btnTodaysSell.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTodaysSell.setBounds(63, 223, 134, 30);
		panel_3.add(btnTodaysSell);
		
		JButton btnAddTheseInfo = new JButton("Add These Info to Today's Report");
		btnAddTheseInfo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddTheseInfo.setBounds(269, 117, 251, 53);
		panel_3.add(btnAddTheseInfo);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Monthly Report", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblEnterMonthName = new JLabel("Enter Month Name :");
		lblEnterMonthName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterMonthName.setBounds(99, 35, 142, 14);
		panel_4.add(lblEnterMonthName);
		
		textField_4 = new JTextField();
		textField_4.setBounds(273, 33, 142, 20);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnViewMonthlyReport = new JButton("View Monthly Report");
		btnViewMonthlyReport.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnViewMonthlyReport.setBounds(185, 79, 169, 32);
		panel_4.add(btnViewMonthlyReport);
		
		JButton btnAddTodaysReport = new JButton("Add Today's Report to Monthly Report");
		btnAddTodaysReport.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddTodaysReport.setBounds(121, 144, 310, 32);
		panel_4.add(btnAddTodaysReport);
		
		JButton btnUpdateMonthlyReport = new JButton("Update Monthly Report");
		btnUpdateMonthlyReport.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdateMonthlyReport.setBounds(173, 216, 197, 32);
		panel_4.add(btnUpdateMonthlyReport);
	}
}

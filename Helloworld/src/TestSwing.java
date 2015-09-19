import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Window.Type;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import org.eclipse.wb.swing.EmpInfo;
import org.eclipse.wb.swing.sqLiteConnection;

import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Font;
import java.sql.Connection;

import javax.swing.ImageIcon;


public class TestSwing {

	private JFrame frmTest;
	/**
	 * @wbp.nonvisual location=43,121
	 */
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestSwing window = new TestSwing();
					window.frmTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTest = new JFrame();
		frmTest.setBackground(Color.YELLOW);
		frmTest.setFont(new Font("Times", Font.BOLD, 12));
		frmTest.setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/tqanh/Pictures/QuocAnh.jpg"));
		frmTest.setTitle("test");
		frmTest.setForeground(Color.ORANGE);
		frmTest.setBounds(100, 100, 443, 337);
		frmTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTest.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 0, 134, 28);
		frmTest.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 0, 134, 28);
		frmTest.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(6, 62, 134, 28);
		frmTest.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//try {
				int num1 = Integer.parseInt(textField.getText());
				int num2 = Integer.parseInt(textField_1.getText());
				textField_2.setText(String.valueOf(num1 + num2));
				//}
				//catch (NumberFormatException e1) {
					//JOptionPane.showMessageDialog(frmTest, "Error of inputing parameter");
				//}
			}
		});
		btnAdd.setBounds(6, 31, 117, 29);
		frmTest.getContentPane().add(btnAdd);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/88.JPG")).getImage();
		lblNewLabel.setIcon(new ImageIcon( img));
		lblNewLabel.setBounds(201, 40, 205, 139);
		frmTest.getContentPane().add(lblNewLabel);
		
		JButton btnAnotherFrame = new JButton("Connect DB");
		btnAnotherFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTest.dispose();
				EmpInfo helInfo = new EmpInfo();
				helInfo.setVisible(true);
			}
		});
		btnAnotherFrame.setBounds(6, 200, 117, 29);
		frmTest.getContentPane().add(btnAnotherFrame);
		frmTest.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textField, textField_1, btnAdd, textField_2, frmTest.getContentPane()}));
	}
}

package lab02;
import com.fazecast.jSerialComm.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class mm {

	private JFrame frame;
	private JTextField cfn;
	private JTextField cln;
	private JTextField Bname;
	private JTextField Bmob;
	private JTextField csfn;
	private JTextField csln;
	private JTextField mob;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		 
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mm window = new mm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public mm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 248, 220));
		frame.setBounds(100, 100, 961, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 947, 641);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Home", null, panel_3, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Birthdays", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		panel_7_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 255), null));
		panel_7_1.setBackground(new Color(135, 206, 235));
		panel_7_1.setBounds(0, 0, 978, 629);
		panel_2.add(panel_7_1);
		
		JLabel lblName_1 = new JLabel("Name:");
		lblName_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblName_1.setBounds(56, 68, 84, 36);
		panel_7_1.add(lblName_1);
		
		JLabel lblMobileNo_1 = new JLabel("Mobile No.:");
		lblMobileNo_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblMobileNo_1.setBounds(56, 123, 84, 36);
		panel_7_1.add(lblMobileNo_1);
		
		JLabel lblSend_1_1_1_3 = new JLabel("Set Date:");
		lblSend_1_1_1_3.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblSend_1_1_1_3.setBounds(56, 216, 84, 36);
		panel_7_1.add(lblSend_1_1_1_3);
		
		JComboBox Bday = new JComboBox();
		Bday.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		Bday.setMaximumRowCount(10);
		Bday.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		Bday.setBounds(150, 221, 120, 31);
		panel_7_1.add(Bday);
		
		JComboBox Bmon = new JComboBox();
		Bmon.setModel(new DefaultComboBoxModel(new String[] {"jan", "feb", "march", "apr", "may", "june", "july", "aug", "sep", "oct", "nov", "dec"}));
		Bmon.setMaximumRowCount(10);
		Bmon.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		Bmon.setBounds(309, 221, 120, 31);
		panel_7_1.add(Bmon);
		
		Bname = new JTextField();
		Bname.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		Bname.setColumns(10);
		Bname.setBounds(145, 68, 284, 31);
		panel_7_1.add(Bname);
		
		Bmob = new JTextField();
		Bmob.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		Bmob.setColumns(10);
		Bmob.setBounds(145, 123, 284, 31);
		panel_7_1.add(Bmob);
		
		JLabel lblSend_1_1_1_1_1 = new JLabel("Day");
		lblSend_1_1_1_1_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblSend_1_1_1_1_1.setBounds(150, 182, 84, 36);
		panel_7_1.add(lblSend_1_1_1_1_1);
		
		JLabel lblSend_1_1_1_2_1 = new JLabel("Month");
		lblSend_1_1_1_2_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblSend_1_1_1_2_1.setBounds(310, 182, 84, 36);
		panel_7_1.add(lblSend_1_1_1_2_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Clear");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bname.setText(null);
				Bmob.setText(null);
				Bday.setSelectedIndex(0);
				Bmon.setSelectedIndex(0);
				JOptionPane.showInternalMessageDialog(null, "DONE!");
				
				
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1_2_1.setBounds(56, 308, 182, 31);
		panel_7_1.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_3_1 = new JButton("Save and Next");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B_name=Bname.getText().toUpperCase();
				String B_Phone=Bmob.getText();
				Object MON = Bmon.getSelectedItem();
				Object DDAY = Bday.getSelectedItem();
				 
				
				int lenn=B_Phone.length();
				
				if(B_name.equals("")||lenn!=10) {
					//System.out.println("INVALID INPUTS");
					JOptionPane.showMessageDialog(null,"Invalid Inputs! Please check the data entered.");
					
				}
				else {
			        try {
			            FileWriter writer = new FileWriter((String) MON,true);
			            writer.write(DDAY+ ","+"B"+","+B_name+","+B_Phone);
			            writer.write("\r\n");
			            writer.close();
			
					
						mob.setText("");
						Bname.setText("");
						Bmob.setText("");
						
						Bmon.setSelectedIndex(0);
						Bday.setSelectedIndex(0);
						 JOptionPane.showMessageDialog(null,"DONE!");
						
			            
			        } catch (IOException e1) {
			            e1.printStackTrace();
			            JOptionPane.showMessageDialog(null,"Error Connecting to the database.Contact the developers.");
			        }
			 
					
				}
			}
		});
		btnNewButton_1_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1_3_1.setBounds(284, 305, 182, 36);
		panel_7_1.add(btnNewButton_1_3_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Anniversaries", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 255), null));
		panel_7.setBackground(new Color(135, 206, 235));
		panel_7.setBounds(0, 10, 960, 640);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblName = new JLabel("First Name:");
		lblName.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblName.setBounds(56, 116, 84, 36);
		panel_7.add(lblName);
		
		JLabel lblMobileNo = new JLabel("Last Name:");
		lblMobileNo.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblMobileNo.setBounds(56, 171, 84, 36);
		panel_7.add(lblMobileNo);
		
		JLabel lblSend_1_1_1 = new JLabel("Marriage Anniversary:");
		lblSend_1_1_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblSend_1_1_1.setBounds(208, 382, 169, 36);
		panel_7.add(lblSend_1_1_1);
		
		JComboBox<?> DAYA = new JComboBox();
		DAYA.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		DAYA.setMaximumRowCount(10);
		DAYA.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		DAYA.setBounds(387, 387, 120, 31);
		panel_7.add(DAYA);
		
		JComboBox MONA = new JComboBox();
		MONA.setModel(new DefaultComboBoxModel(new String[] {"jan", "feb", "march", "apr", "may", "june", "july", "aug", "sep", "oct", "nov", "dec"}));
		MONA.setMaximumRowCount(10);
		MONA.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		MONA.setBounds(517, 387, 120, 31);
		panel_7.add(MONA);
		
		cfn = new JTextField();
		cfn.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		cfn.setBounds(145, 116, 284, 31);
		panel_7.add(cfn);
		cfn.setColumns(10);
		
		cln = new JTextField();
		cln.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		cln.setColumns(10);
		cln.setBounds(145, 171, 284, 31);
		panel_7.add(cln);
		
		JLabel lblSend_1_1_1_1 = new JLabel("Day");
		lblSend_1_1_1_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblSend_1_1_1_1.setBounds(387, 349, 34, 36);
		panel_7.add(lblSend_1_1_1_1);
		
		JLabel lblSend_1_1_1_2 = new JLabel("Month");
		lblSend_1_1_1_2.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblSend_1_1_1_2.setBounds(518, 349, 55, 36);
		panel_7.add(lblSend_1_1_1_2);
		
		JButton btnNewButton_1_2 = new JButton("Clear");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cfn.setText("");
				cln.setText("");
				csfn.setText("");
				csln.setText("");
				mob.setText("");
				MONA.setSelectedIndex(0);
				DAYA.setSelectedIndex(0);
				JOptionPane.showMessageDialog(null,"Done!");
			}	});
		
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1_2.setBounds(293, 474, 182, 31);
		panel_7.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Save and Next");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String CSLN =csln.getText().toUpperCase();
				String Phone =mob.getText();
				int len=Phone.length();
				//long PHONE=Long.parseLong(Phone);
				Object month=MONA.getSelectedItem();
				Object day=DAYA.getSelectedItem();
				
				
				
				
				
				if(CSLN.equals("")||Phone.equals("")||len!=10) {
					//System.out.println("INVALID INPUTS");
					JOptionPane.showMessageDialog(null,"Invalid Inputs! Please check the data entered.");
					
				}
				else {
			        try {
			            FileWriter writer = new FileWriter((String) month,true);
			            writer.write(day+ ","+"A"+","+CSLN+","+Phone);
			            writer.write("\r\n");
			            writer.close();
						cfn.setText("");
						cln.setText("");
						csfn.setText("");
						csln.setText("");
						mob.setText("");
						MONA.setSelectedIndex(0);
						DAYA.setSelectedIndex(0);
						 JOptionPane.showMessageDialog(null,"DONE!");
						
			            
			        } catch (IOException e1) {
			            e1.printStackTrace();
			            JOptionPane.showMessageDialog(null,"Error Connecting to the database.Contact the developers.");
			        }
			 
					
				}
				
				
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1_3.setBounds(521, 471, 182, 36);
		panel_7.add(btnNewButton_1_3);
		
		csfn = new JTextField();
		csfn.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		csfn.setColumns(10);
		csfn.setBounds(631, 116, 284, 31);
		panel_7.add(csfn);
		
		csln = new JTextField();
		csln.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		csln.setColumns(10);
		csln.setBounds(631, 171, 284, 31);
		panel_7.add(csln);
		
		JLabel lblName_2 = new JLabel("First Name:");
		lblName_2.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblName_2.setBounds(533, 116, 84, 36);
		panel_7.add(lblName_2);
		
		JLabel lblMobileNo_2 = new JLabel("Last Name:");
		lblMobileNo_2.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblMobileNo_2.setBounds(533, 171, 84, 36);
		panel_7.add(lblMobileNo_2);
		
		JLabel lblClient_1 = new JLabel("Client");
		lblClient_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblClient_1.setBounds(183, 62, 84, 36);
		panel_7.add(lblClient_1);
		
		JLabel lblClient = new JLabel("Spouse");
		lblClient.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblClient.setBounds(700, 62, 84, 36);
		panel_7.add(lblClient);
		
		JLabel lblMobileNo_4 = new JLabel("Mobile No.");
		lblMobileNo_4.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblMobileNo_4.setBounds(56, 239, 84, 36);
		panel_7.add(lblMobileNo_4);
		
		mob = new JTextField();
		mob.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		mob.setColumns(10);
		mob.setBounds(145, 239, 284, 31);
		panel_7.add(mob);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Device Settings", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 139)));
		panel_4.setBackground(new Color(135, 206, 250));
		panel_4.setBounds(10, 132, 534, 217);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblSend = new JLabel("Send Birthday wish at: ");
		lblSend.setBounds(10, 52, 166, 36);
		panel_4.add(lblSend);
		lblSend.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		
		JComboBox bh = new JComboBox();
		bh.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05"}));
		bh.setBounds(195, 57, 120, 31);
		panel_4.add(bh);
		bh.setMaximumRowCount(10);
		bh.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		
		JComboBox bm = new JComboBox();
		bm.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "5", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		bm.setBounds(362, 57, 120, 31);
		panel_4.add(bm);
		bm.setMaximumRowCount(10);
		bm.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblHrs = new JLabel("hrs.");
		lblHrs.setBounds(325, 52, 32, 36);
		panel_4.add(lblHrs);
		lblHrs.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblMin = new JLabel("min.");
		lblMin.setBounds(492, 52, 32, 36);
		panel_4.add(lblMin);
		lblMin.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblSend_1 = new JLabel("Send Birthday wish at: ");
		lblSend_1.setBounds(10, 101, 166, 36);
		panel_4.add(lblSend_1);
		lblSend_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		
		JComboBox ah = new JComboBox();
		ah.setModel(new DefaultComboBoxModel(new String[] {"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		ah.setBounds(195, 106, 120, 31);
		panel_4.add(ah);
		ah.setMaximumRowCount(10);
		ah.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		
		JComboBox am = new JComboBox();
		am.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "5", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		am.setBounds(362, 106, 120, 31);
		panel_4.add(am);
		am.setMaximumRowCount(10);
		am.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblHrs_1 = new JLabel("hrs.");
		lblHrs_1.setBounds(325, 101, 32, 36);
		panel_4.add(lblHrs_1);
		lblHrs_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblMin_1 = new JLabel("min.");
		lblMin_1.setBounds(492, 101, 32, 36);
		panel_4.add(lblMin_1);
		lblMin_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		
		JButton btnNewButton_1 = new JButton("SET");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(196, 165, 182, 31);
		panel_4.add(btnNewButton_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 139)));
		panel_4_1.setBackground(new Color(135, 206, 250));
		panel_4_1.setBounds(10, 355, 534, 231);
		panel.add(panel_4_1);
		
		JLabel lblSetTime = new JLabel("Set Time:");
		lblSetTime.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblSetTime.setBounds(10, 52, 84, 36);
		panel_4_1.add(lblSetTime);
		
		JComboBox hr = new JComboBox();
		hr.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		hr.setMaximumRowCount(10);
		hr.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		hr.setBounds(104, 57, 120, 31);
		panel_4_1.add(hr);
		
		JComboBox min = new JComboBox();
		min.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "5", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		min.setMaximumRowCount(10);
		min.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		min.setBounds(268, 57, 120, 31);
		panel_4_1.add(min);
		
		JLabel lblHrs_2 = new JLabel("hrs.");
		lblHrs_2.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblHrs_2.setBounds(234, 52, 32, 36);
		panel_4_1.add(lblHrs_2);
		
		JLabel lblMin_2 = new JLabel("min.");
		lblMin_2.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblMin_2.setBounds(398, 52, 32, 36);
		panel_4_1.add(lblMin_2);
		
		JLabel lblSend_1_1 = new JLabel("Set Date:");
		lblSend_1_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		lblSend_1_1.setBounds(10, 101, 84, 36);
		panel_4_1.add(lblSend_1_1);
		
		JComboBox year = new JComboBox();
		year.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		year.setMaximumRowCount(10);
		year.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		year.setBounds(104, 106, 120, 31);
		panel_4_1.add(year);
		
		JComboBox month = new JComboBox();
		month.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		month.setMaximumRowCount(10);
		month.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		month.setBounds(244, 106, 120, 31);
		panel_4_1.add(month);
		
		JComboBox day = new JComboBox();
		day.setModel(new DefaultComboBoxModel(new String[] {"2020", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040"}));
		day.setMaximumRowCount(10);
		day.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		day.setBounds(374, 106, 120, 31);
		panel_4_1.add(day);
		
		JButton btnNewButton_1_1 = new JButton("SET");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1_1.setBounds(202, 162, 182, 31);
		panel_4_1.add(btnNewButton_1_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 255), null));
		panel_5.setBackground(new Color(135, 206, 250));
		panel_5.setBounds(554, 132, 378, 454);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Beep on instructions:");
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(24, 47, 147, 30);
		panel_5.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("YES");
		chckbxNewCheckBox.setBackground(new Color(135, 206, 235));
		chckbxNewCheckBox.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox.setBounds(177, 47, 111, 27);
		panel_5.add(chckbxNewCheckBox);
		
		JButton btnNewButton_1_1_1 = new JButton("SET");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1_1_1.setBounds(105, 355, 182, 31);
		panel_5.add(btnNewButton_1_1_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 255), null));
		panel_6.setBackground(new Color(135, 206, 250));
		panel_6.setBounds(554, 60, 378, 63);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Com Port:");
		lblNewLabel.setBounds(10, 17, 75, 36);
		panel_6.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 18));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(95, 22, 120, 31);
		panel_6.add(comboBox);
		comboBox.setMaximumRowCount(10);
		
		comboBox.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		
		JButton btnNewButton = new JButton("Connect");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(225, 22, 131, 31);
		panel_6.add(btnNewButton);
		btnNewButton.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Developer: Ujjawal Tiwari | April 2022 | Version 0.1");
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(10, 596, 471, 18);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("This Window lets you configure your Device Settings: \r\nJust play with the settings and get your device all set-up.");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(10, 10, 869, 29);
		panel.add(lblNewLabel_3);
	}
}

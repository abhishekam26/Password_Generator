package Pass_Generator;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.util.Random;
import javax.swing.ImageIcon;

public class PassGen {

	JFrame frmSrUniversity;
	private JTextField textResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassGen window = new PassGen();
					window.frmSrUniversity.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void passGenerator(int len) {
		String str1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*";
		StringBuilder str2 = new StringBuilder();
		Random rand = new Random();
		while (0 < len--) {
			str2.append(str1.charAt(rand.nextInt(str1.length())));
		}
		textResult.setText(str2.toString());
	}

	public PassGen() {
		initialize();
	}

	private void initialize() {
		frmSrUniversity = new JFrame();
		frmSrUniversity.setTitle("SR UNIVERSITY");
		frmSrUniversity.getContentPane().setForeground(new Color(128, 0, 0));
		frmSrUniversity.getContentPane().setBackground(new Color(0, 0, 0));
		frmSrUniversity.setBounds(100, 100, 649, 580);
		frmSrUniversity.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSrUniversity.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\tGENERATED PASSWORD");
		lblNewLabel.setBounds(188, 216, 249, 27);
		lblNewLabel.setForeground(new Color(255, 255, 128));
		lblNewLabel.setFont(new Font("DialogInput", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmSrUniversity.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("STRONG PASSWORD GENERATOR");
		lblNewLabel_1.setBounds(10, 23, 410, 44);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frmSrUniversity.getContentPane().add(lblNewLabel_1);

		JCheckBox CheckBox1 = new JCheckBox("6 Characters");
		CheckBox1.setBounds(188, 313, 239, 35);
		CheckBox1.setForeground(new Color(255, 255, 255));
		CheckBox1.setBackground(new Color(0, 0, 0));
		buttonGroup.add(CheckBox1);
		CheckBox1.setHorizontalAlignment(SwingConstants.CENTER);
		CheckBox1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		frmSrUniversity.getContentPane().add(CheckBox1);

		JCheckBox CheckBox2 = new JCheckBox("10 Characters");
		CheckBox2.setBounds(188, 360, 239, 35);
		CheckBox2.setForeground(new Color(255, 255, 255));
		CheckBox2.setBackground(new Color(0, 0, 0));
		buttonGroup.add(CheckBox2);
		CheckBox2.setHorizontalAlignment(SwingConstants.CENTER);
		CheckBox2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		frmSrUniversity.getContentPane().add(CheckBox2);

		JCheckBox CheckBox3 = new JCheckBox("12 Characters");
		CheckBox3.setBounds(188, 402, 239, 35);
		CheckBox3.setForeground(new Color(255, 255, 255));
		CheckBox3.setBackground(new Color(0, 0, 0));
		buttonGroup.add(CheckBox3);
		CheckBox3.setHorizontalAlignment(SwingConstants.CENTER);
		CheckBox3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		frmSrUniversity.getContentPane().add(CheckBox3);

		textResult = new JTextField();
		textResult.setBounds(198, 258, 239, 35);
		textResult.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textResult.setHorizontalAlignment(SwingConstants.CENTER);
		frmSrUniversity.getContentPane().add(textResult);
		textResult.setColumns(10);

		JButton btnNewButton = new JButton("GENERATE PASSWORD");
		btnNewButton.setBounds(198, 463, 239, 35);
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frmSrUniversity.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(33, 82, 579, 74);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\K.Naveen\\OneDrive\\Pictures\\Saved Pictures\\sr-university-logo.png"));
		frmSrUniversity.getContentPane().add(lblNewLabel_2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CheckBox1.isSelected()) {
					passGenerator(6);
				} else if (CheckBox2.isSelected()) {
					passGenerator(10);
				} else if (CheckBox3.isSelected()) {
					passGenerator(12);
				} else {
					passGenerator(8);
				}
			}
		});
	}
}

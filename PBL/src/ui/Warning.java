package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Warning extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warning frame = new Warning("1");
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
	public Warning(String timeSinceStartup) {
		setBackground(Color.DARK_GRAY);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setUndecorated(true);
		setBounds(100, 100, 450, 201);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeyThere = new JLabel("Hey there!");
		lblHeyThere.setFont(new Font("Calibri", Font.BOLD, 38));
		lblHeyThere.setForeground(Color.LIGHT_GRAY);
		lblHeyThere.setBounds(12, 0, 224, 59);
		contentPane.add(lblHeyThere);
		
		JTextArea txtrYouveBeenOn = new JTextArea();
		txtrYouveBeenOn.setLineWrap(true);
		txtrYouveBeenOn.setBackground(Color.DARK_GRAY);
		txtrYouveBeenOn.setForeground(Color.WHITE);
		txtrYouveBeenOn.setFont(new Font("Calibri", Font.PLAIN, 24));
		txtrYouveBeenOn.setWrapStyleWord(true);
		txtrYouveBeenOn.setText("You've been on your laptop for " + timeSinceStartup + " minutes. Do you have any homework due soon?");
		txtrYouveBeenOn.setBounds(12, 52, 426, 84);
		contentPane.add(txtrYouveBeenOn);
		
		JButton button = new JButton("OK");
		button.setBackground(Color.LIGHT_GRAY);
		
		ImageIcon icon = new ImageIcon("/images/tick.png");
		Image img = icon.getImage() ;  
		Image newimg = img.getScaledInstance( 32, 32,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );

		
		button.setIcon(new ImageIcon(Warning.class.getResource("/images/tick1.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		button.setMnemonic('O');
		button.setFont(new Font("Calibri", Font.BOLD, 20));
		button.setBounds(12, 148, 184, 41);
		contentPane.add(button);
}
}


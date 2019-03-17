package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import api.Warner;

@SuppressWarnings("serial")
public class Welcome extends JFrame{
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setBackground(Color.DARK_GRAY);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setUndecorated(true);
		setBounds(100, 100, 530, 275);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Creating JLabel
		JLabel lblHeyThere = new JLabel("Welcome");
		lblHeyThere.setFont(new Font("Calibri", Font.BOLD, 38));
		lblHeyThere.setForeground(Color.LIGHT_GRAY);
		lblHeyThere.setBounds(12, 0, 224, 76);
		contentPane.add(lblHeyThere);
		
		//Buttons for OK and Dismiss
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setMnemonic('C');
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon(Welcome.class.getResource("/javax/swing/plaf/metal/icons/ocean/expanded.gif")));
		btnNewButton.setBounds(294, 222, 224, 41);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("OK");
		button.setVerticalAlignment(SwingConstants.TOP);
		button.setBackground(Color.LIGHT_GRAY);
		
		ImageIcon icon = new ImageIcon("/images/tick.png");
		Image img = icon.getImage() ;  
		Image newimg = img.getScaledInstance( 32, 32,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );

		
		button.setIcon(new ImageIcon(Welcome.class.getResource("/images/tick1.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		button.setMnemonic('O');
		btnNewButton.setIcon(new ImageIcon(Welcome.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		button.setFont(new Font("Calibri", Font.BOLD, 20));
		button.setBounds(12, 221, 224, 41);
		contentPane.add(button);
		
		//Creating JLabel
		JLabel lblSelectIntervalTime = new JLabel("Select interval time (in minutes):");
		lblSelectIntervalTime.setForeground(Color.WHITE);
		lblSelectIntervalTime.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblSelectIntervalTime.setBounds(12, 57, 506, 41);
		contentPane.add(lblSelectIntervalTime);
		
		//Creating and formatting radio buttons		
		JRadioButton radioButton = new JRadioButton("5");
		radioButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		radioButton.setSelected(true);
		radioButton.setBackground(Color.DARK_GRAY);
		radioButton.setForeground(Color.WHITE);
		radioButton.setBounds(22, 94, 149, 23);
		radioButton.setFocusPainted(false);	
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("10");
		radioButton_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		radioButton_1.setForeground(Color.WHITE);
		radioButton_1.setBackground(Color.DARK_GRAY);
		radioButton_1.setBounds(203, 94, 149, 23);
		radioButton_1.setFocusPainted(false);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("15");
		radioButton_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		radioButton_2.setForeground(Color.WHITE);
		radioButton_2.setBackground(Color.DARK_GRAY);
		radioButton_2.setBounds(22, 140, 149, 23);
		radioButton_2.setFocusPainted(false);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("20");
		radioButton_3.setFont(new Font("Calibri", Font.PLAIN, 20));
		radioButton_3.setBackground(Color.DARK_GRAY);
		radioButton_3.setForeground(Color.WHITE);
		radioButton_3.setBounds(203, 140, 149, 23);
		radioButton_3.setFocusPainted(false);
		contentPane.add(radioButton_3);
		
		//Adding radio buttons to ButtonGroup
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(radioButton);
		btnGroup.add(radioButton_1);
		btnGroup.add(radioButton_2);
		btnGroup.add(radioButton_3);
		
		/*
		 * Writes selection to file
		 * Failed method
		 * 
		 * 
		try {
			API.WriteToFile(Integer.toString(minuteDelayWarningInterval));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		 *
		 *
		*/
		
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				//Testing
				//System.out.println(minuteDelayWarningInterval);
				
				int minuteDelayForWarning = 0;
				
				//Checking which interval time is chosen by user
				boolean boolFiveMinutes = radioButton.isSelected();
				boolean boolTenMinutes = radioButton_1.isSelected();
				boolean boolFifteenMinutes = radioButton_2.isSelected();
				boolean boolTwentyMinutes = radioButton_3.isSelected();
				
				//Setting chosen interval time to variable
				if(boolFiveMinutes == true) {
					minuteDelayForWarning = 5;
				}
				
				else if(boolTenMinutes == true) {
					minuteDelayForWarning = 10;
				}
				
				else if(boolFifteenMinutes == true) {
					minuteDelayForWarning = 15;
				}
				
				else if(boolTwentyMinutes == true) {
					minuteDelayForWarning = 20;
				}
				
				//Finalizing integer
				@SuppressWarnings("unused")
				final int minuteDelayWarningInterval = minuteDelayForWarning;
				
				
				
				/*
				 * Causes warning to glitch out, causes Welcome screen to freeze
				 * until process is ended
				 * 
				 * 
				try {
					Warner.OnStartUp(minuteDelayWarningInterval);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				 *
				 *
				*/
				
				//After adding "implements Runnable" to Warner.java without adding run method
				/*
				 * Same side effects as above
				 * 
				 * 
				try {
					Warner.OnStartUp(minuteDelayWarningInterval);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 *
				 *
				*/
				
				//Works, but it is a bit glitch-y though
				/*
				 * 
				Thread thread = new Thread(new WarningRunner());
				thread.start();
				 *
				 *
				*/
				
				//Testing purposes only
				//System.out.println(minuteDelayWarningInterval);
				//Works, prints correct interval
				
				Thread thread = new Thread(new Runnable() {

					@Override
					public void run() {
						
						try {
							Warner.OnStartUp(minuteDelayWarningInterval);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
					
				}
				
				);
				thread.start();
				
				
				
			}
		});
}

}


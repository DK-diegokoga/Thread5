package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import controller.Thread5;
import javax.swing.JLabel;

import java.awt.Font;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldN1;
	private JTextField textFieldN2;
	private JTextField textFieldN3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldN1 = new JTextField();
		textFieldN1.setBounds(67, 111, 70, 50);
		contentPane.add(textFieldN1);
		textFieldN1.setColumns(10);
		textFieldN1.setEditable(false);
		textFieldN1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldN1.setFont(new java.awt.Font("sansserif", 1, 20));

		textFieldN2 = new JTextField();
		textFieldN2.setBounds(188, 111, 70, 50);
		contentPane.add(textFieldN2);
		textFieldN2.setColumns(10);
		textFieldN2.setEditable(false);
		textFieldN2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldN2.setFont(new java.awt.Font("sansserif", 1, 20));

		textFieldN3 = new JTextField();
		textFieldN3.setBounds(306, 111, 70, 50);
		contentPane.add(textFieldN3);
		textFieldN3.setColumns(10);
		textFieldN3.setEditable(false);
		textFieldN3.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldN3.setFont(new java.awt.Font("sansserif", 1, 20));
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.addActionListener(new ActionListener() {       
	    	   public void actionPerformed(ActionEvent e) {        
	    		   btnJogar.setEnabled(false);        
	    		   Thread t1 = new Thread5(textFieldN1);    
	    		   t1.start();                  
	    		   Thread t2 = new Thread5(textFieldN2);   
	    		   t2.start();                     
	    		   Thread t3 = new Thread5(textFieldN3);         
	    		   t3.start();  
	    		
	    		   btnJogar.setEnabled(true);
	    	   }        
		});
		
		btnJogar.setBounds(171, 217, 117, 25);
		contentPane.add(btnJogar);
		
		JLabel lblASorteDa = new JLabel("Tente e Perca");
		lblASorteDa.setHorizontalAlignment(SwingConstants.CENTER);
		lblASorteDa.setFont(new Font("Purisa", Font.BOLD, 15));
		lblASorteDa.setBounds(135, 25, 180, 15);
		contentPane.add(lblASorteDa);
	}
}
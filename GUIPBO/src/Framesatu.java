import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Framesatu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField angka1;
	private JTextField angka2;
	private JTextField labelhasil;
	private JTextField labeloperator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Framesatu frame = new Framesatu();
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
	public Framesatu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Judul = new JLabel("Kalkulator");
		Judul.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Judul.setHorizontalAlignment(SwingConstants.CENTER);
		Judul.setBounds(211, 29, 145, 42);
		contentPane.add(Judul);
		
		angka1 = new JTextField();
		angka1.setBounds(67, 125, 86, 20);
		contentPane.add(angka1);
		angka1.setColumns(10);
		
		angka2 = new JTextField();
		angka2.setBounds(245, 125, 86, 20);
		contentPane.add(angka2);
		angka2.setColumns(10);
		
		labelhasil = new JTextField();
		labelhasil.setBounds(419, 125, 86, 20);
		contentPane.add(labelhasil);
		labelhasil.setColumns(10);
		
		labeloperator = new JTextField();
		labeloperator.setBounds(173, 125, 40, 20);
		contentPane.add(labeloperator);
		labeloperator.setColumns(10);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labeloperator.setText("+");
				
			}
		});
		plus.setBounds(30, 265, 89, 23);
		contentPane.add(plus);
		
		
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labeloperator.setText("-");
				
			}
		});
		minus.setBounds(129, 265, 89, 23);
		contentPane.add(minus);
		
		JButton multiple = new JButton("x");
		multiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labeloperator.setText("x");
				
			}
		});
		multiple.setBounds(228, 265, 89, 23);
		contentPane.add(multiple);
		
		JButton divide = new JButton(":");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labeloperator.setText(":");
			}
		});
		divide.setBounds(327, 265, 89, 23);
		contentPane.add(divide);
		
		JButton btnNewButton_3 = new JButton("=");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(angka1.getText());
					double num2 = Double.parseDouble(angka2.getText());
					double hasil = 0 ;
					String operator = labeloperator.getText();
					
					switch(operator) {
					
					case "+" :
						hasil = num1+num2;
						break;
						
					case "-" :
						hasil = num1-num2;
						break;
					case "x" :
						hasil = num1*num2;
						break;
					case":":
						hasil = num1/num2;
						break;
					default :
						labelhasil.setText("Error : Masukkan operator");
						return;
						
					}
					
						
				
					labelhasil.setText(String.valueOf(hasil));
				}

				catch(NumberFormatException ex) {
					labelhasil.setText("error");
				}
			}
		});
		btnNewButton_3.setBounds(426, 265, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}

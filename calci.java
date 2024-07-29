import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class calci {

	private JFrame frame;
	private JTextField textField;
	private JButton btnClear;
	private JButton btn00;
	private JButton btnPlus;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnDot;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnEqual;
	private JButton btnSubtract;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnPercent;
	
	 double first;
	 double second;
	 double result;
	 String operation;
	 String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(SystemColor.info);
		frame.setBounds(100, 100, 302, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 266, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackspace.setBackground(new Color(192, 192, 192));
		btnBackspace.setBounds(10, 88, 68, 54);
		frame.getContentPane().add(btnBackspace);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setBounds(77, 88, 68, 54);
		frame.getContentPane().add(btnClear);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBackground(Color.LIGHT_GRAY);
		btn00.setBounds(142, 88, 68, 54);
		frame.getContentPane().add(btn00);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBackground(Color.LIGHT_GRAY);
		btnPlus.setBounds(208, 88, 68, 54);
		frame.getContentPane().add(btnPlus);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setBounds(10, 140, 68, 54);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}	 
		});
		btn4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setBounds(10, 192, 68, 54);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn1.getText();
				 textField.setText(number);
				}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(10, 245, 68, 54);
		frame.getContentPane().add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setBounds(10, 293, 68, 54);
		frame.getContentPane().add(btn0);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setBounds(77, 140, 68, 54);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setBounds(77, 192, 68, 54);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn2.getText();
				 textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(77, 245, 68, 54);
		frame.getContentPane().add(btn2);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBackground(Color.LIGHT_GRAY);
		btnDot.setBounds(77, 293, 68, 54);
		frame.getContentPane().add(btnDot);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setBounds(142, 140, 68, 54);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setBounds(142, 192, 68, 54);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(142, 245, 68, 54);
		frame.getContentPane().add(btn3);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String number =textField.getText()+btnEqual.getText();
				//textField.setText(number);
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("=%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("=%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("=%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("=%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("=%.2f",result);
					textField.setText(answer);
				}	
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBackground(Color.LIGHT_GRAY);
		btnEqual.setBounds(142, 293, 68, 54);
		frame.getContentPane().add(btnEqual);
		
		btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="-";
			}
        });
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtract.setBackground(Color.LIGHT_GRAY);
		btnSubtract.setBounds(208, 140, 68, 54);
		frame.getContentPane().add(btnSubtract);
		
		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBackground(Color.LIGHT_GRAY);
		btnMultiply.setBounds(208, 192, 68, 54);
		frame.getContentPane().add(btnMultiply);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBackground(Color.LIGHT_GRAY);
		btnDivide.setBounds(208, 245, 68, 54);
		frame.getContentPane().add(btnDivide);
		
		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBackground(Color.LIGHT_GRAY);
		btnPercent.setBounds(208, 293, 68, 54);
		frame.getContentPane().add(btnPercent);
	}
}

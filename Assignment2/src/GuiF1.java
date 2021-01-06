import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.ScrollPane;
import javax.swing.border.CompoundBorder;

public class GuiF1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiF1 frame = new GuiF1();
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
	public GuiF1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 983, 549);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Fikri\\Downloads\\f1-icon.png"));
		label.setBounds(41, 11, 128, 128);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(193, 116, 696, 10);
		contentPane.add(panel);
		
		JLabel lblFormula = new JLabel("FORMULA 1");
		lblFormula.setVerticalAlignment(SwingConstants.TOP);
		lblFormula.setForeground(new Color(255, 255, 255));
		lblFormula.setFont(new Font("Engravers MT", Font.ITALIC, 90));
		lblFormula.setBounds(195, 11, 806, 128);
		contentPane.add(lblFormula);
		
		JButton btnNewButton = new JButton("DRIVER INFO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "NAME                               		ORIGIN                              TEAM                              POINTS\n" + 
						    "1.Lewis Hamilton           England                            Mercedes                        347  \n" + 
						    "2.Valtteri Bottas             Poland                             Mercedes                        223  \n" + 
						    "3.Max Verstappen         Netherlands                         Red Bull                         214  \n" + 
						    "4.Sergio Pérez                Mexico                            Racing Point                     125  \n" + 
						    "5.Daniel Ricciardo         Australia                            Renault                         119  \n" + 
						    "6.Carlos Sainz                Spain                             McLaren                           105  \n" + 
						    "7.Alexander Albon         Thailand                              Red Bull                            105  \n" + 
						    "8.Charles Leclerc          Monaco                                Ferrari                             98	 \n" + 
						    "9.Lando Norris                England                             McLaren                           97	 \n" + 
                            "10.Pierre Gasly               French                            Scuderia                             75	     ");
			}
			
		});
		btnNewButton.setFont(new Font("Dubai", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(102, 102, 102));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(41, 248, 208, 87);
		contentPane.add(btnNewButton);
		
		JButton btnMatches = new JButton("RACE RESULTS");
		btnMatches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Place   : São Paulo, Brazil \nCircuit : José Carlos Pace \nTime    : 01 December 2020 \nfirst   : Lewis Hamilton         01:42:09 \nsecond  : Carlos Sainz           01:43:16 \nthird   : Daniel Ricciardo       01:45:33");
			}
		});
		btnMatches.setForeground(Color.BLACK);
		btnMatches.setFont(new Font("Dubai", Font.BOLD, 20));
		btnMatches.setBackground(new Color(102, 102, 102));
		btnMatches.setBounds(355, 248, 208, 87);
		contentPane.add(btnMatches);
		
		JButton btnBuyTicket = new JButton("BUY TICKET!!!");
		btnBuyTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"place = Milan, italia \ncircuit = Autodromo \nLink = https://www.F1.com/buyticket/");
			}
		});
		btnBuyTicket.setForeground(Color.BLACK);
		btnBuyTicket.setFont(new Font("Dubai", Font.BOLD, 20));
		btnBuyTicket.setBackground(new Color(102, 102, 102));
		btnBuyTicket.setBounds(681, 248, 208, 87);
		contentPane.add(btnBuyTicket);
		
		
	}
}

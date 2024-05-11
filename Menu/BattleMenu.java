package Menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BattleMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	final private int ATAQUE = 3;
	private int menuChoice;

	/**
	 * Create the frame.
	 */
	public BattleMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Fugir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Você fugiu da Luta");
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Defesa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Você defendeu o ataque inimigo");
			}
		});
		btnNewButton_1.setBounds(335, 193, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Itens");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Mostrar Inventário");
			}
		});
		btnNewButton_2.setBounds(236, 227, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ataque");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Você atacou o inimigo");
				sendBattleMenuChoiceId(ATAQUE);
			}
		});
		btnNewButton_3.setBounds(236, 193, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Sua próxima ação?");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 197, 216, 53);
		contentPane.add(lblNewLabel);
	}

	/**
	 * Send signal id
	 * id 0 - fugir
	 * id 1 - itens
	 * id 2 - defesa
	 * id 3 - ataque
	 */
	
	public void sendBattleMenuChoiceId(int id) {
		menuChoice = id;
	}


	/**
	 * Getters and Setters
	 */
	public int getMenuChoiceId() {
		return menuChoice;
	}
}

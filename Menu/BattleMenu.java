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
	private MenuInventario inventario;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleMenu frame = new BattleMenu();
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
	public BattleMenu() {
		inventario = new MenuInventario(this);
		
		inventario.adicionarItem("Poção de Cura",  2);
		inventario.adicionarItem("Poção de Mana", 3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFugir = new JButton("Fugir");
		btnFugir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fugir();
			}
		});
		btnFugir.setBounds(335, 227, 89, 23);
		contentPane.add(btnFugir);
		
		JButton btnDefesa = new JButton("Defesa");
		btnDefesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defender();
			}
		});
		btnDefesa.setBounds(335, 193, 89, 23);
		contentPane.add(btnDefesa);
		
		JButton btnItens = new JButton("Itens");
		btnItens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				inventario.setVisible(true);
				inventario.atualizarInventario();
			}
		});
		btnItens.setBounds(236, 227, 89, 23);
		contentPane.add(btnItens);
		
		JButton btnAtaque = new JButton("Ataque");
		btnAtaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atacar();
			}
		});
		btnAtaque.setBounds(236, 193, 89, 23);
		contentPane.add(btnAtaque);
		
		JLabel lblNewLabel = new JLabel("Sua próxima ação?");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 197, 216, 53);
		contentPane.add(lblNewLabel);
	}
	
	private void fugir() {
		JOptionPane.showMessageDialog(null, "Você fugiu da Luta");
	}
	private void defender() {
		JOptionPane.showMessageDialog(null, "Você fugiu da Luta");
	}
	private void atacar() {
		JOptionPane.showMessageDialog(null, "Você fugiu da Luta");
	}

}
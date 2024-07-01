package Menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Characters.Enemies.Enemies;
import Characters.Itens.Itens;
import Characters.Players.Party;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BattleMenu extends Menu {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private InventoryMenu inventario;
	private int currChoice; /// 
	private boolean battleRunning = true;

	
	public int getCurrChoice() {
		return currChoice;
	}

	public void setCurrChoice(int currChoice) {
		this.currChoice = currChoice;
	}

	public BattleMenu(Enemies enemies, Party party) {

		while (battleRunning) {
				
			inventario = new InventoryMenu(this);
			
			inventario.adicionarItem(new Itens("Poção de Cura"),  2);
			inventario.adicionarItem(new Itens("Poção de Mana"), 3);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			setVisible(true);
			
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
					showInventory();
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

			if (enemies.getHealth() <= 0) {
				battleRunning = false;
			}
		}
	}
	
	private void fugir() {
		JOptionPane.showMessageDialog(null, "Você fugiu da Luta");
	}
	private void defender() {
		JOptionPane.showMessageDialog(null, "Você fugiu da Luta");
	}
	private void atacar() {
		this.setCurrChoice(1);
	}
	
	private void showInventory() {
		inventario.setVisible(true);
		inventario.atualizarInventario();
	}

}
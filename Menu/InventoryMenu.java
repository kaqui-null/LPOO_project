package Menu;

import java.awt.EventQueue;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class InventoryMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private HashMap<String, Integer> itens;
	private JPanel mostrarItens;
	private BattleMenu battleMenu;
	
	public InventoryMenu(BattleMenu battleMenu) {
		this.battleMenu = battleMenu;
		itens = new HashMap<>();
		initialize();
	}
	
	public void adicionarItem (String nome, int quantidade) {
		if (itens.containsKey(nome)) {
			itens.put(nome, itens.get(nome) + quantidade);
		} else {
			itens.put(nome, quantidade);
		}
		atualizarInventario();
	}
	
	public void removerItem(String nome, int quantidade) {
		if (itens.containsKey(nome)) {
			int novaQuantidade = itens.get(nome) - quantidade;
			if (novaQuantidade > 0) {
				itens.put(nome, novaQuantidade);
			} else {
				itens.remove(nome);
			}
		}
		atualizarInventario();
	}
	
	public int getQuantidade(String nome) {
		return itens.getOrDefault(nome, 0);
	}
	
	public HashMap<String, Integer> getItens() {
		return itens;
	}
	
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 414, 200);
        contentPane.add(scrollPane);
        
        mostrarItens = new JPanel();
        scrollPane.setViewportView(mostrarItens);
        mostrarItens.setLayout(null);
    }
	
	public void atualizarInventario() {
        StringBuilder inventarioTexto = new StringBuilder();
        mostrarItens.removeAll();
        int y = 0;
        for (String item : itens.keySet()) {
            int quantidade = itens.get(item);

            JLabel lblItem = new JLabel(item + ": " + quantidade);
            lblItem.setBounds(10, y, 200, 30);
            mostrarItens.add(lblItem);

            JButton btnEscolher = new JButton("Escolher");
            btnEscolher.setBounds(250, y, 100, 30);
            btnEscolher.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    removerItem(item, 1);
                    setVisible(false);
                    battleMenu.setVisible(true);
                }
            });
            mostrarItens.add(btnEscolher);

            y += 40;
        }
        mostrarItens.revalidate();
        mostrarItens.repaint();
    }	
}
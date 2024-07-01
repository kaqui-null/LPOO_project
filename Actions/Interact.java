package Actions;

import Characters.NPC;
import Characters.Enemies.Boss;
import Characters.Itens.Itens;
import Characters.Players.Party;
import Characters.Players.Player;
import Menu.BattleMenu;

public class Interact<Target>{

    private Dialog dialog;

    public Interact(Target target, Player player, Party party) {
        if (target instanceof Itens) {
            player.addToInventory((Itens) target);
        }
        else if (target instanceof NPC) {
            dialog = ((NPC)target).getDialog();
        }
        else if (target instanceof Boss) {
            BattleMenu battle = new BattleMenu((Boss) target, party);
        }
    }

    public String getDialogMessage(int line) {
        return dialog.returnLineString(line);
    }
}

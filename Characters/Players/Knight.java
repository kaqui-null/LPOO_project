package Characters.Players;

public class Knight extends Player{
    
    public Knight(int[] healthMana, int[] Stats) {
        super(new int[] {120, 60}, new int[] {0,0,0});
    }
    
    @Override
    protected void addAbility(int level) {
    	switch (level) {
    	case 1:
    		newAbility("Ataque Pesado");
    		break;
    		
    	case 2:
    		newAbility("Honra do Herói");
    		break;
    		
    	case 3:
    		newAbility("Bater com o Escudo");
    		break;
    		
    	case 4:
    		newAbility("Batida Rápida");
    		break;
    		
    	case 5:
    		newAbility("Golpe Triplo");
    		break;
    	}
    }
}

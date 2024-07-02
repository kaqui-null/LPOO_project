package Characters.Players;


public class Mage extends Player {

    public Mage(int[] healthMana, int[] Stats){
        super(new int[] {70, 140}, new int[] {0,0,0});
    }
    
    @Override
    protected void addAbility(int level) {
    	switch (level) {
    	case 1:
    		newAbility("Bola de Fogo");
    		break;
    		
    	case 2:
    		newAbility("Águas Calmas");
    		break;
    		
    	case 3:
    		newAbility("Tornados");
    		break;
    		
    	case 4:
    		newAbility("Lance de Pedra");
    		break;
    		
    	case 5:
    		newAbility("Raios");
    		break;
    	}
    //TODO: diff black mage and white mage
}
}

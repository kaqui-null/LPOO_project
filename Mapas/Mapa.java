package Mapas;

import java.util.Arrays;


// to be replaced
public class Mapa {
    
	private char[][] Map = new char[20][20];
	private char[][] newMap = Map;
	private char fillChar = '.';
	
	public Mapa() {
		for (int i = 0; i < Map.length; i++){
			Arrays.fill(Map[i], fillChar);
		}
	}
	
    public int[] blacklistTile() {
        int[] re = {0, 0};
        return re;
    }
    
    public void draw() {
    	for (int i = 0; i < newMap.length; i++) {
    		for (int j = 0; j < newMap[0].length; j++) {
    			System.out.print(newMap[j][i]);
    		}
    		System.out.println();
    	}
    }
    
    public char[][] replacePlayerSprite(int[] position, char sprite){
		newMap = Map;
    	newMap[position[1]][position[0]] = sprite;
    	return newMap;
    }
    
    public void setNewMap(char[][] map){
    	newMap = map;
    }
    
    public char[][] getMap() {
    	return Map;
    }
    
}

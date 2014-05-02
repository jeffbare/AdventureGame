/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MonsterFighter;

import java.util.*;

/**
 *
 * @author JBare
 */
public class MapBuilder {
    
    int xLength;
    int yLenght;
    int currPost;
    int lastPost;
    char[][] newMap;
    
    MapBuilder()
    {

        int i =0;
        int j =0;
        char terrain;
        //char newMap[][];
        newMap = new char[8][8];
        
        for(i = 0; i <= 7; i++)
        {
           if(i != 0) 
           {
               //System.out.print("\n");
           }
           
           for(j = 0; j <= 7; j++)
           {
               terrain = terrain();
               newMap[i][j] = terrain;
               //System.out.print("[" + terrain + "]");
           }
            
        }
        
    }
    
    public static char terrain()
    {
        Random numGen = new Random();
        int num = numGen.nextInt(3) + 1;
        char terrainChar;
        
        switch(num)
        {
            case 1:
            terrainChar = 'G';
                break;
            case 2:
                terrainChar = 'W';
                break;
            case 3:
                terrainChar = 'M';
                break;
            default:
                terrainChar = 'E';
            
        }
        return terrainChar;
    }
    
    public void printMap()
    {
        int i = 0;
        int j = 0;
        //char [][]newMap = map;
        
        for(i = 0; i <= 7; i++)
        {
            if(i != 0)
            {
                System.out.print("\n");
            }
                    
            
            for(j = 0; j <= 7; j++)
            {
                System.out.print("[" + getTerrain(i,j) + "]");
            }
        }
    }
    
    public char getTerrain(int x, int y)
    {
        //System.out.println("ERROR in getTerrain method X = " + x + " Y = " + y);
        char terrain = newMap[x][y];
        return terrain;

    }
    
    public char moveNorth()
    {
        char terrainType = 'a';
        
        return terrainType;
    }
    
    public char moveEast()
    {
        char terrainType = 'a';
        
        return terrainType;
    }
    
    public char moveSouth()
    {
        char terrainType = 'a';
        
        return terrainType;
    }
    
    public char moveWest()
    {
        char terrainType = 'a';
        
        return terrainType;
    }
    
    

}

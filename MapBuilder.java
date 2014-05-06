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
    char currTerrain;
    int curX;
    int curY;
    
    MapBuilder()
    {

        int i;
        int j;
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
                terrainChar = 'F';
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
        int i;
        int j;
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
        System.out.println(); //Add blank line after map output.
        System.out.println();
    }
    
    public char getTerrain(int x, int y)
    {
        //System.out.println("ERROR in getTerrain method X = " + x + " Y = " + y);
        char terrain = newMap[x][y];
        //System.out.println("Current Terrain: " + terrain);
        return terrain;

    }
    
    public char moveNorth()
    {
        char terrainType = 'a';

        setTerrain(curX, curY, currTerrain);
        
        if((curX - 1) > -1)
        {
            currTerrain = newMap[curX - 1][curY];
            terrainType = newMap[curX][curY];
            newMap[curX - 1][curY] = 'I';
            curX = curX - 1;
            //terrainType = newMap[curX][curY];
        }
        else
        {
            return 'e';
        }
        
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
        
        setTerrain(curX, curY, currTerrain);
        
        if((curX - 1) < 8)
        {
            currTerrain = newMap[curX + 1][curY];
            terrainType = newMap[curX][curY];
            newMap[curX + 1][curY] = 'I';
            curX = curX + 1;
            //terrainType = newMap[curX][curY];
        }
        else
        {
            return 'e';
        }
        
        return terrainType;
    }
    
    public char moveWest()
    {
        char terrainType = 'a';
        
        return terrainType;
    }
    
    public void setPost(int x, int y)
    {  
        //Save inital terrain type
        
        curX = x;
        curY = y;
        currTerrain = newMap[x][y];
        
        //move player cursor to terrain.
        newMap[x][y] = 'I';
    }

    public void setTerrain(int x, int y, char t)
    {
        newMap[x][y] = t;
    }
}

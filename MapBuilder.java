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
    int yLength;
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
        xLength = 8;
        yLength = 8;
        //char newMap[][];
        newMap = new char[xLength][yLength];
        boolean flag = false;
        
        for(i = 0; i <= xLength - 1; i++)
        {
           if(i != 0) 
           {
               //System.out.print("\n");
           }
           
           for(j = 0; j <= yLength - 1; j++)
           {
               terrain = terrain();
               newMap[i][j] = terrain;
               if(terrain == 'T')
               {
                   flag = true;
               }
               //System.out.print("[" + terrain + "]");
           }
            
        }
        
        
        Random numGen = new Random();
        
        int xNum = numGen.nextInt(6) + 1;
        int yNum = numGen.nextInt(6) + 1;
        
        if(flag == false){
            newMap[xNum][yNum] = 'T';
        
            System.out.println("Xnum: " + xNum + " Ynum: " + yNum); 
        }

    }
    
    public static char terrain()
    {
        Random numGen = new Random();
        int num = numGen.nextInt(99) + 1;
        char terrainChar;
        
        if(num >= 50)
        {
            //create grass land tile
            num = 1;
        }
        else if(num < 50 && num >= 20)
        {
            num = 2;
        }
        else if(num < 20 && num >= 3)
        {
            num = 3;
        }
        else if(num < 3)
        {
            num = 4;
        }
        
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
            case 4:    
                terrainChar = 'T';
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
        
        for(i = 0; i <= xLength - 1; i++)
        {
            if(i != 0)
            {
                System.out.print("\n");
            }
                    
            
            for(j = 0; j <= yLength - 1; j++)
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
    
    public char getTerrain()
    {
        return currTerrain;
    }
    
    public char moveNorth()
    {
        char terrainType = 'a';

        setTerrain(curX, curY, currTerrain);
        
        if((curX - 1) > -1)
        {
            currTerrain = newMap[curX - 1][curY];
            terrainType = getTerrain();
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

        setTerrain(curX, curY, currTerrain);
        
        if((curY + 1) < yLength)
        {
            currTerrain = newMap[curX][curY + 1];
            terrainType = getTerrain();
            newMap[curX][curY + 1] = 'I';
            curY = curY + 1;
            //terrainType = newMap[curX][curY];
        }
        else
        {
            return 'e';
        }
        
        return terrainType;
    }
    
    public char moveSouth()
    {
        char terrainType = 'a';
        
        setTerrain(curX, curY, currTerrain);
        
        if((curX + 1) < xLength)
        {
            currTerrain = newMap[curX + 1][curY];
            terrainType = getTerrain();
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

        setTerrain(curX, curY, currTerrain);
        
        if((curY - 1) > -1)
        {
            currTerrain = newMap[curX][curY - 1];
            terrainType = getTerrain();
            newMap[curX][curY - 1] = 'I';
            curY = curY - 1;
            //terrainType = newMap[curX][curY];
        }
        else
        {
            return 'e';
        }
        
        return terrainType;
    }
    
    public void setPost(int x, int y)
    {  
        //Save inital terrain type
        
        curX = x;
        curY = y;
        currTerrain = newMap[x][y];
        
        //move player cursor to terrain.
        setTerrain(x,y,'I');
        //newMap[x][y] = 'I';
    }

    public void setTerrain(int x, int y, char t)
    {
        newMap[x][y] = t;
    }
    

}

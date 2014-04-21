/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MonsterFighter;

import java.util.*;

/**
 *
 * @author JeffBare
 */
public class EnemyClass {
    
    //Type of enemy being created.  Pulled from a switch statement that keeps
    //track of the types of enemies available to battle.
    private int enemyType;
    
    //Holds the maximum of Hit Points
    private int maxHP;
    
    
    //Holds the amount of enemy attack power.
    private int attackPower;
    
    //Holds the amount of enemy defense power.
    private int defensePower;
    
    private String enemyName;
    
    private int expGained;
    
    private String logoName;
    

    
    
    EnemyClass(int eType)
    {
        
        int hp, atk, def, exp;
        int type = eType;
        String name = "";
        String lName = "";
    
        switch(type){
            case(1):
                name = "Imp";
                lName = "impguy.jpg";
                hp = 15;
                atk = 2;
                def = 1;
                exp = 6;
                break;
            case(2):
                name = "Wolf";
                hp = 25;
                atk = 4;
                def = 3;
                exp = 10;
                break;
            case(3):
                name = "Ogre";
                hp = 50;
                atk = 10;
                def = 10;
                exp = 28;
                break;
            default:
                name = "UNKNOWN";
                hp = 0;
                atk = 0;
                def = 0;
                exp = 0;
                break;      
    }
        enemyName = name;
        logoName = lName;
        maxHP = hp;
        attackPower = atk;
        defensePower = def;
        expGained = exp;

        
    }
    
    
    


    public void setMaxHP(int enemyType)
    {
        int hp;
        int type = enemyType;

        switch(type){
            case(1):
                hp = 15;
                break;
            case(2):
                hp = 25;
                break;
            case(3):
                hp = 50;
                break;
            default:
                hp = 0;
                break;      
        }

        maxHP = hp;

    }

    public void setAttack(int enemyType)
    {
        int attack = 15;
        int type = enemyType;

        switch(type){
            case(1):
                attack = 1;
                break;
            case(2):
                attack = 2;
                break;
            case(3):
                attack = 5;
                break;
            default:
                attack = 0;
                break;      
        }
    
     attackPower = attack;

}


    public void setDefense(int enemyType)
    {
        int defense;
        int type = enemyType;

        switch(type){
            case(1):
                defense = 1;
                break;
            case(2):
                defense = 2;
                break;
            case(3):
                defense = 5;
                break;
            default:
                defense = 0;
                break;      
        }

         defensePower = defense;

    }

    public int getHP()
    {

        return maxHP;
    }

    public int getAttack()
    {

        return attackPower;
    }

    public int getDefense()
    {

        return defensePower;
    }

    public String getName()
    {
        return enemyName;
    }

    public int getExp()
    {
        return expGained;
    }

    public void printEnemy(EnemyClass e)
    {
        //String test;
        System.out.println("The enemy's Name: " + e.getName());
        System.out.println("The enemy's HP: " + e.getHP());
        System.out.println("The enemy's Attack Power: " + e.getAttack());
        System.out.println("The enemy's Defense Power: " + e.getDefense());
        System.out.println("You gained " + e.getExp() + " experience points.");
        //test = "The enemy's HP is: " + e.getHP() + "\n The enemy's Attack Power is: " +
        //        e.getAttack() + "\n The enemy's Defense Power is: " + e.getDefense();

        //return test;
    }


    public String getLogo()
    {
        return logoName;
    }

}

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
public class HeroClass {
    
    private String name;
    private int maxHP;
    private int currentHP;
    private int attackPower;
    private int defensePower;
    private int expPoints;
    private int levelUpPoints;
    private int level;
    private Random num;
    
    HeroClass()
    {
        String tempName;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of your Hero: ");
        tempName = input.next();
        int length = tempName.length();
        if (length < 4)
        {
            //Do Nothing
        }
        else
        {
        tempName = tempName.substring(0,4);
        }
        name = tempName.toUpperCase();
        maxHP = 40;
        currentHP = maxHP;
        attackPower = 10;
        defensePower = 8;
        expPoints = 0;
        levelUpPoints = 50;
        level = 0;
        
        Random gen = new Random();
     
    }
    
    public int attack()
    {
        int damage;
        Random num = new Random();
        //System.out.println("Begin Method");
        int atkPwr = getAtkPwr();
        //System.out.println("Attack Power: " + atkPwr);
        damage = num.nextInt(4)+ 1;
        
        damage = damage + (int)(Math.floor(damage * (2 / atkPwr)));
        //System.out.println("Damage Dealt: " + damage);
        return damage;      
    }
    
    public int getAtkPwr()
    {
        return attackPower;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setHP(int damage)
    {
        int hp = getHP();
        currentHP = hp - damage;
    }

    public int getHP()
    {
        return currentHP;
    }
    
    public void addEXP(int exp)
    {
        expPoints = expPoints + exp;
        
        if(expPoints >= levelUpPoints)
        {
            setLevelUp();
            setExp(0);
            level++;
            
        }
    }
    
    public int getExp()
    {
        return expPoints;
    }
    
    public void setExp(int num)
    {
        expPoints = num;
    }
    
    public void setLevelUp()
    {
        int levUP = getLevelUp();
        double levPercent = levUP * 1.2;
        levelUpPoints = (int)(levPercent);
        System.out.println("You have leveled up!");
    }
    
    public int getLevelUp()
    {
        return levelUpPoints;
    }
    
    public void printHero()
    {
        //Prints out Hero's Stats
        System.out.println("Your Hero's name is: " + name);
        System.out.println(name + " is level " + level);
        System.out.println("Your max HP is: " + maxHP);
        System.out.println("Your current HP is: " + currentHP);
        System.out.println("Your total EXP Points: " + expPoints);
        System.out.println("You need " + (levelUpPoints - getExp()) + " to level up.");
    }
}

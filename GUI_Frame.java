package MonsterFighter;

//import MonsterFighter.EnemyClass;
//import MonsterFighter.HeroClass;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JBare
 */
public class GUI_Frame extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Frame
     */
    public GUI_Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Hit Points:");

        jLabel2.setText("Total EXP:");

        jLabel3.setText("To Level Up:");

        jLabel4.setText("Name:");

        jLabel5.setText("Hit Points");

        jLabel8.setText("Hero Name:");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel6.setText("Damage Dealt:");

        jTextField5.setText("jTextField5");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Potions");

        jTextField6.setText("jTextField6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(14, 14, 14)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel6, jLabel7, jLabel8});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jLabel5});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField4, jTextField7});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton6.setText("START");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\JBare\\Documents\\NetBeansProjects\\MonsterFighter\\potion.jpg")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\JBare\\Documents\\NetBeansProjects\\MonsterFighter\\sword.jpg")); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton2.setText("W");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("E");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("S");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("N");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(2, 2, 2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("EXIT");
        jMenuItem1.setToolTipText("Click to Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        char newTerrain= map.moveNorth();
        ImageIcon newi2;
        switch(newTerrain)
        {
            case 'G':
                newi2 = new ImageIcon("tallgrass.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'F':
                newi2 = new ImageIcon("forrest.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'M':
                newi2 = new ImageIcon("mountains.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'e':
                jTextArea1.append("You cannot move farther North!\n");
                break;        
        }
        
        System.out.println("Returned Terrrain: " + newTerrain);
        map.printMap();

    }                                        

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        System.exit(0);
    }                                          

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        //ImageIcon newi = new ImageIcon(newEnemy.getLogo());
    }                                        

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        //String name = newHero.getName();
        //jTextField8.setText(String.valueOf(name));
    }                                           

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        //Start Button Stuff
        
        ImageIcon newi, newi2;
        
        int tempX = num.nextInt(6) + 1;
        int tempY = num.nextInt(6) + 1;
        
        map.printMap();             //Print map before change
        
        //map.setPost(tempX, tempY);  //Set starting position
        map.setPost(2,2);
        //terrain = map.getTerrain(6, 6);
        terrain = map.getTerrain();
        
        map.printMap(); 
        
        //eType = CreateEnemy();
        System.out.println("Random enemy number: " + eType);
        
        if(eType == 1)
        {
            newi = new ImageIcon("impguy.jpg");
            newEnemy = imp;
            jButton5.setIcon(newi);
        }
        else if(eType == 2)
        {
            newi = new ImageIcon("wolfguy.jpg");
            newEnemy = wolf;
            jButton5.setIcon(newi);            
        }
        else if(eType == 3)
        {
            newi = new ImageIcon("ogreguy.jpg");
            newEnemy = ogre;
            jButton5.setIcon(newi);            
        }
        
        switch(terrain)
        {
            case 'G':
                newi2 = new ImageIcon("tallgrass.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'F':
                newi2 = new ImageIcon("forrest.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'M':
                newi2 = new ImageIcon("mountains.jpg");
                jButton7.setIcon(newi2);
                break;
        }
        
        int eStartHP = newEnemy.getHP();
        int hStartHP = newHero.getHP();
        
        String name = newHero.getName();
        int hp = newHero.getHP();
        int exp = newHero.getExp();
        int expNeeded = newHero.getLevelUp();
        
        String eName = newEnemy.getName();
        int eHP = newEnemy.getHP();
        
        jTextField8.setText(String.valueOf(name));
        jTextField1.setText(String.valueOf(hp));
        jTextField2.setText(String.valueOf(exp));
        jTextField3.setText(String.valueOf(expNeeded));
        jTextField6.setText(String.valueOf(newHero.getPotionCount()));
        
        jTextField7.setText(String.valueOf(eName));
        jTextField4.setText(String.valueOf(eHP));
        
        turnCounter = 0;
            //Print map with Player in field.
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
    }                                        

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        //This is the POTION button.

        
        
        int health,potionCount;
        int healAmount;
        if(newHero.getPotionCount() > 0)
        {
            
            health = newHero.getHP();
            healAmount = newHero.usePotion();
            potionCount = newHero.getPotionCount();
            
            if((health + healAmount) >= newHero.getMaxHP())
            {
                int currHP = newHero.getHP();
                int maxHP = newHero.getMaxHP();
                
                System.out.println("Current HP: " + currHP);
                System.out.println("Max HP: " + maxHP);
                newHero.setHP();
                System.out.println("HP after set: " + newHero.getHP());
                System.out.println("Healed for: " + (health + healAmount));
                jTextField1.setText(String.valueOf(newHero.getHP()));
                //System.out.println("Using greater than or equal.");
                //newHero.setPotionCount(-1);
                //jTextField6.setText(String.valueOf(newHero.getPotionCount()));
            }
            else
            {
                newHero.setHP(health + healAmount);
                System.out.println("Healed for: " + (health + healAmount));
                jTextField1.setText(String.valueOf(newHero.getHP()));
                //System.out.println("Using less than.");
                //newHero.setPotionCount(-1);
                //jTextField6.setText(String.valueOf(newHero.getPotionCount()));
            }
            //newHero.decreasePotionCount();
            jTextField6.setText(String.valueOf(newHero.getPotionCount()));
            jTextArea1.append(String.valueOf("You have been healed " + healAmount + " HP.\n"));
        }
        else
        {
            
            jTextArea1.append(String.valueOf("You are out of potions.\n"));
        }
        
        turnCounter ++;


    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        // TODO add your handling code here:
        //This is the ATTACK button
        
        
        int eStartHP = newEnemy.getHP();
        int hStartHP = newHero.getHP();
        int hDamage = 0;
        int eDamage = 0;
        int hHP = hStartHP;
        int eHP = eStartHP;
        int hAttack, eAttack;
        
        if(turnCounter == 0)
        {
            hAttack = newHero.attack();
            jTextField5.setText(String.valueOf(hAttack)); 
            
            eAttack = newEnemy.attack(newEnemy);
            
            eHP = eHP - hAttack;
            hHP = hHP - eAttack;
            jTextField1.setText(String.valueOf(hHP));
            jTextField4.setText(String.valueOf(eHP));
            newHero.setHP(hHP);
            newEnemy.setHP(eHP);
            
            System.out.println("Damage dealt by Enemy: " + eAttack);
            System.out.println("Hero HP: " + hHP);
            System.out.println("Damage dealt by Hero: " + hAttack);
            System.out.println("Enemy HP: " + eHP);
            turnCounter++;
        }
        else if(turnCounter > 0 && hHP > 0 && eHP > 0)
        {
            if(hHP > 0 && eHP > 0)
            {
                eHP = (int)(Float.parseFloat(jTextField4.getText()));
                hHP = (int)(Float.parseFloat(jTextField1.getText()));
                
                hAttack = newHero.attack();
                eAttack = newEnemy.attack(newEnemy);
                
                eHP = eHP - hAttack;
                hHP = hHP - eAttack;
                
                jTextField5.setText(String.valueOf(hAttack)); 
                jTextField1.setText(String.valueOf(hHP));
                jTextField4.setText(String.valueOf(eHP));
                newHero.setHP(hHP);
                newEnemy.setHP(eHP);
                
                turnCounter++;
                
                System.out.println("Number of turns: " + turnCounter);
            }

        }
        

        
        if(hHP <= 0)
        {

            jTextArea1.append("The Hero is dead!\n");
        }
        else if(eHP <= 0)
        {
            int currEXP = newHero.getExp();
            int newEXP = newEnemy.getExp();
            newHero.addEXP(newEnemy.getExp());
            
            if(currEXP >= newHero.getLevelUp())
            {
                newHero.setLevelUp();
                jTextField3.setText(String.valueOf(newHero.getExp()));
            }
            jTextField2.setText(String.valueOf(newHero.getExp()));
            jTextArea1.append("The enemy is dead!\n");
            jTextArea1.append("You gained " + newEnemy.getExp() + " EXP.\n");
        }
 
        
        /*
        if(eHP <= 0)
        {
            System.out.println("The Enemy is dead!");
        }
        else if(hHP <= 0)
        {
            System.out.println("You have died!");
        }
        */

    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        //Move South Button
        
        char newTerrain= map.moveSouth();
        ImageIcon newi2;
        switch(newTerrain)
        {
            case 'G':
                newi2 = new ImageIcon("tallgrass.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'F':
                newi2 = new ImageIcon("forrest.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'M':
                newi2 = new ImageIcon("mountains.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'e':
                jTextArea1.append("You cannot move farther South!\n");
                break;        
        }
        
        System.out.println("Returned Terrrain: " + newTerrain);
        map.printMap();
        
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        // Move East Button
        
                
        char newTerrain= map.moveEast();
        ImageIcon newi2;
        switch(newTerrain)
        {
            case 'G':
                newi2 = new ImageIcon("tallgrass.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'F':
                newi2 = new ImageIcon("forrest.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'M':
                newi2 = new ImageIcon("mountains.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'e':
                jTextArea1.append("You cannot move farther East!\n");
                break;        
        }
        
        System.out.println("Returned Terrrain: " + newTerrain);
        map.printMap();

    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        // Move West Button
        
        char newTerrain= map.moveWest();
        ImageIcon newi2;
        switch(newTerrain)
        {
            case 'G':
                newi2 = new ImageIcon("tallgrass.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'F':
                newi2 = new ImageIcon("forrest.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'M':
                newi2 = new ImageIcon("mountains.jpg");
                jButton7.setIcon(newi2);
                break;
            case 'e':
                jTextArea1.append("You cannot move farther West!\n");
                break;        
        }
        
        System.out.println("Returned Terrrain: " + newTerrain);
        map.printMap();
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI_Frame().setVisible(true);
        });
        

        
       
        
        

        
        /*
        int i = 1;
        int j = 0;
        int random = 0;
        char terrain = 'a';
        String move = "a";
        char [][] terrainMap = new char [8][8];
        Scanner input = new Scanner(System.in);
        int enemyType;
        int attacked;
        
        //Set up Terrain Map
        
        
        char grass = 'G';
        char water = 'W';
        char mountain = 'M';
       
        //Testing Enemy and Hero Creation Classes and methods.
        
        Random numGen = new Random();
        
        EnemyClass newEnemy = new EnemyClass(enemyType = (numGen.nextInt(3)+ 1));
        
        //System.out.println("Random Number: " + enemyType);
        
        newEnemy.printEnemy(newEnemy);
        
        HeroClass newHero = new HeroClass();
        

        
        /*newHero.printHero();
        
        newHero.addEXP(28);
        newHero.printHero();
        
        newHero.addEXP(30);
        newHero.printHero();
        
        newHero.addEXP(17);
        newHero.printHero();
        */
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration                   
    
    Random num = new Random();
    HeroClass newHero = new HeroClass();
    int eType = num.nextInt(2) + 1;
    //int eType = 3;
    //EnemyClass newEnemy = new EnemyClass(eType);       //Random Enenmy
    EnemyClass newEnemy;
    EnemyClass imp = new EnemyClass(1);                  //Test the Imp Enemy
    EnemyClass wolf = new EnemyClass(2);                 //Test the Wolf Enemy
    EnemyClass ogre = new EnemyClass(3);                 //Test the Ogre Enemy
    int turnCounter;
    int terrain;// = num.nextInt(2) + 1;
    boolean attacked = false;
    MapBuilder map = new MapBuilder();
    
    
    /*
    public int CreateEnemy()
    {
        eType = num.nextInt(2) + 1;
        EnemyClass newEnemy = new EnemyClass(eType);
        return eType;
    }
    
    */
}

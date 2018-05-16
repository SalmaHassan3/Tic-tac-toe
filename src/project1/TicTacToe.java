
package project1;

import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {
    
    JPanel p = new JPanel();
    static XOButton b[][]= new XOButton[6][7];
    static int turn=0,i,j,counter;
     
  //constructor
  public TicTacToe(){
      //setting some properties to the frame
    setTitle("TIC TAC TOE GAME");      
    setSize(700,600);
    setResizable(false);
    setVisible(true);
    setLocationRelativeTo(null);
    setState(Frame.ICONIFIED);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //setting layuot of the panel
    p.setLayout(new GridLayout(6,7));
    //adding panel to the frame
    add(p);
   //adding buttons to the panel
    for(i=0;i<6;i++){
        for(j=0;j<7;j++)
        p.add(b[i][j]=new XOButton());}  
    
  }
  
   //a method to check rows
   static int checkWinner1(){
     for(i=0;i<6;i++)
        for(j=0;j<5;j++)
            if(b[i][j].getText()==b[i][j+1].getText()&&b[i][j].getText()==b[i][j+2].getText()&&b[i][j].getText()!=null&&b[i][j+1].getText()!=null&&b[i][j+2].getText()!=null)
                if(b[i][j].getText()=="X")
                   return 1;
                else  if(b[i][j].getText()=="O")
                    return 0;
    return 2;
    }

    //a method to check columns
    static int checkWinner2(){
     for(i=0;i<4;i++)
        for(j=0;j<7;j++)
            if(b[i][j].getText()==b[i+1][j].getText()&&b[i][j].getText()==b[i+2][j].getText()&&b[i][j].getText()!=null&&b[i+1][j].getText()!=null&&b[i+2][j].getText()!=null)
                if(b[i][j].getText()=="X")
                   return 1;
                else  if(b[i][j].getText()=="O")
                    return 0;
    return 2;
    }
   
    //a method to check diagonals
     static int checkWinner3(){
     for(i=0;i<4;i++)
        for(j=0;j<5;j++)
            if(b[i][j].getText()==b[i+1][j+1].getText()&&b[i][j].getText()==b[i+2][j+2].getText()&&b[i][j].getText()!=null&&b[i+1][j+1].getText()!=null&&b[i+2][j+2].getText()!=null)
                if(b[i][j].getText()=="X")
                   return 1;
                else  if(b[i][j].getText()=="O")
                   return 0;
    return 2;
    }
     
     //another method to check diagonals in opp. direction 
     static int checkWinner4(){
     for(i=5;i>1;i--)
        for(j=0;j<5;j++)
            if(b[i][j].getText()==b[i-1][j+1].getText()&&b[i][j].getText()==b[i-2][j+2].getText()&&b[i][j].getText()!=null&&b[i-1][j+1].getText()!=null&&b[i-2][j+2].getText()!=null)
                if(b[i][j].getText()=="X")
                   return 1;
                else  if(b[i][j].getText()=="O")
                   return 0;
    return 2;
    }
     
    //a method to reset the game
     static void reset(){
         for(i=0;i<6;i++){
        for(j=0;j<7;j++)
        b[i][j].setText(null);}}         
    //a method to check if there's a tie
    static int Tie(){
        counter=0;
    for(i=0;i<6;i++)
        for(j=0;j<7;j++)
            if(b[i][j].getText()=="X"||b[i][j].getText()=="O"){
                counter++;}
    return counter;}
    //main 
    public static void main(String args[]){
       //creating an instance of TicTacToe class
       TicTacToe frame = new TicTacToe();  
      }
    
    
  } 
 
 
 
   

  




  

package project1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class XOButton extends JButton implements ActionListener {
    //constructor
    public XOButton(){
        //setting properties of the buttons
       this.setBackground(Color.WHITE);
       this.setFont(new Font("Arial",Font.BOLD,80));
       validate();    
       this.addActionListener(this);}
    
    @Override
    //turn=0 means O will play and turn=1 means x will play
    public void actionPerformed(ActionEvent e) {
        int n; 
        if (TicTacToe.turn==0&&this.getText()!="X"&&this.getText()!="O"){
                this.setForeground(Color.CYAN);
                this.setText("O");
                TicTacToe.turn=1;
                if(TicTacToe.checkWinner1()==0||TicTacToe.checkWinner2()==0||TicTacToe.checkWinner3()==0||TicTacToe.checkWinner4()==0){   
                  n=JOptionPane.showConfirmDialog(null, "Player O has won!\nDo you want to play again?","Tic Tac Toe",YES_NO_OPTION);
                   if (n == JOptionPane.YES_OPTION)
                       TicTacToe.reset();
                   //close the frame
                   else System.exit(0);}            
        }       
                
        else if(TicTacToe.turn==1&&this.getText()!="X"&&this.getText()!="O"){ 
                this.setForeground(Color.PINK);
                this.setText("X");
                TicTacToe.turn=0;
                if(TicTacToe.checkWinner1()==1||TicTacToe.checkWinner2()==1||TicTacToe.checkWinner3()==1||TicTacToe.checkWinner4()==1){   
                   n =JOptionPane.showConfirmDialog(null, "Player X has won!\nDo you want to play again?","Tic Tac Toe",YES_NO_OPTION);
                   if (n ==JOptionPane.YES_OPTION)
                       TicTacToe.reset();
                   else System.exit(0);}         
        }
        
        TicTacToe.Tie();
        if(TicTacToe.counter==42){
            n =JOptionPane.showConfirmDialog(null, "It's a tie!\nDo you want to play again?","Tic Tac Toe",YES_NO_OPTION);
                   if (n ==JOptionPane.YES_OPTION)
                       TicTacToe.reset();
                   else System.exit(0);}         
          
    }     
}    
    
    

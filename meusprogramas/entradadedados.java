package meusprogramas;

import javax.swing.JOptionPane;

public class entradadedados{
    public static void main(String[] args){
       
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        //System.out.println("O cliente tem "+idade+" de idade!");    
        JOptionPane.showMessageDialog(null ,"O cliente tem "+idade+" de idade!");
        JOptionPane.showMessageDialog(null, "O cliente tem "+idade+" de idade!", "Informação", 2);
    }
}
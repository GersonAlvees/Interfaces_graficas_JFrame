import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {
    public Screen() {

        setTitle("Testes interface");   //Titulo
        setVisible(true);   //Faz com que a tela fique visível
        setSize(800, 500);  //Tamanho da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //Quando a tela é fechada o programa também PARA
        //setResizable(false);    //Para não alterar o tamanho da tela
        setLocationRelativeTo(null);    //A janela abre no meio da tela

        setLayout(null);

        JButton jButton = new JButton("BOTÃO DO BEM");
        jButton.setBounds(540, 360, 280, 90);
        Font font = new Font("Oswald", Font.BOLD,  25);
        jButton.setFont(font);
        jButton.setForeground(new Color(72, 0, 100));
        jButton.setBackground(new Color(7, 6, 6));


        add(jButton);





    }
}

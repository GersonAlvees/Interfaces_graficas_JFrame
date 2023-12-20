import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {

    JTextField valor1;
    JTextField valor2;

    public Screen() {

        setTitle("Testes interface");   //Titulo
        setVisible(true);   //Faz com que a tela fique visível
        setSize(800, 500);  //Tamanho da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //Quando a tela é fechada o programa também PARA
        //setResizable(false);    //Para não alterar o tamanho da tela
        setLocationRelativeTo(null);    //A janela abre no meio da tela

        setLayout(null);

        JButton jButton = new JButton("BOTÃO DA SOMA");
        jButton.setBounds(540, 360, 280, 90);
        Font font = new Font("Oswald", Font.BOLD,  25);
        jButton.setFont(font);
        jButton.setForeground(new Color(72, 0, 100));
        jButton.setBackground(new Color(7, 6, 6));


        add(jButton);

        jButton.addActionListener(this::caixa);


        valor1 = new JTextField(); //Implementações das caixas de texto
        valor1.setBounds(400, 200, 200, 100);
        valor1.setFont(new Font("Arial", Font.ITALIC,  25));

        add(valor1);

        valor2 = new JTextField();
        valor2.setBounds(400, 50, 200, 100);
        valor2.setFont(new Font("Arial", Font.ITALIC,  25));

        add(valor2);


        JLabel primeironumero = new JLabel("Primeiro: "); //Implementações com o JLabel
        primeironumero.setBounds(100, 80, 100, 100);
        primeironumero.setFont(new Font("Arial", Font.ITALIC, 15));
        add(primeironumero);

        JLabel segundonumero = new JLabel("Segundo: ");
        segundonumero.setBounds(100, 240, 100, 100);
        segundonumero.setFont(new Font("Arial", Font.ITALIC, 15));
        add(segundonumero);

        JLabel titleinicial = new JLabel("DIGITE DOIS VALORES");
        titleinicial.setBounds(400, 10, 400, 100);
        titleinicial.setFont(new Font("Oswald", Font.PLAIN, 30));
        add(titleinicial);


    }

    private void caixa(ActionEvent actionEvent){

        Integer primierovalor = Integer.parseInt(valor1.getText());
        Integer segundovalor = Integer.parseInt(valor2.getText());

        Integer soma = primierovalor + segundovalor;


        JOptionPane.showMessageDialog(null,
                "A soma dos valores é: " + soma, "Mais um calango online",
                JOptionPane.INFORMATION_MESSAGE);

    }
}

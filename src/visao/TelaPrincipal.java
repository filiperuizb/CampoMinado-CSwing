package visao;

import modelo.Tabuleiro;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        Tabuleiro tabuleiro = new Tabuleiro(16,30, 50);
        add(new PainelTabuleiro(tabuleiro));

        setTitle("Campo minado - Filipe");
        setSize(690,438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        setVisible(true);
    }
    public static void main(String[] args) {

        new TelaPrincipal();
    }
}

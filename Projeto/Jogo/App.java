import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class App {

    JFrame window;
    Container container;
    JPanel titleNamePanel;

    public static void main(String[] args){
        new App();
    }

    public App(){
        window = new JFrame();
        window.setSize(720, 480);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);

        container = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(50, 100, 600, 150);
        titleNamePanel.setBackground(Color.blue);
        titleNamePanel = new JLabel();
        container.add(titleNamePanel);
    }
}

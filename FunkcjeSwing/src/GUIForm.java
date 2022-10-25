import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIForm {
    private JPanel JPanel1;
    private JButton JButton;
    private JTextArea JTextAreaToWieloLinioweTextArea;
    private JTextPane TP;
    private JButton JPanelB;
    private JTextPane TP1;
    private JTextPane TP2;
    private JTextField JTextField;

    public static void main(String[] args) {
        GUIForm Example1 = new GUIForm();
    }
    public GUIForm()
    {
        JFrame frame = new JFrame("Funkcje Swing");
        frame.setContentPane(this.JPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600,300);
        frame.setLocation(50,50);
        JButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "JButton jest przyciskiem funkcyjnym w Javie Swing");
            }
        });
        JPanelB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "JPanel jest ''pojemnikiem'' na różne komponenty");
            }
        });
    }
}

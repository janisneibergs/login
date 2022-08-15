import javax.swing.*;
import java.awt.*;
class NewPage extends JFrame {
    NewPage() {
        setDefaultCloseOperation(javax.swing.
                WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");
        setSize(400, 200);
        JButton american_football = new JButton("American Football");
        JButton basketball = new JButton("Basketball");
        JButton cricket = new JButton("Cricket");
        JButton mixed_martial_arts = new JButton("Mixed Martial Arts");
        JButton rugby_league = new JButton("Rugby League");
        JButton soccer_other = new JButton("Soccer - Other");


        JPanel newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(american_football);
        newPanel.add(basketball);
        newPanel.add(cricket);
        newPanel.add(mixed_martial_arts);
        newPanel.add(rugby_league);
        newPanel.add(soccer_other);
        JOptionPane.showMessageDialog(null, "My sport Ausekla iela +371 20000 40 euro");
        add(newPanel, BorderLayout.CENTER);

    }
}

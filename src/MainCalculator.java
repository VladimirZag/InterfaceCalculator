import javax.swing.*;
import java.awt.*;

public class MainCalculator {
    public static void main(String[] args) {
        JFrame calculator = new JFrame("Калькулятор");
        calculator.setSize(250, 350);
        calculator.setResizable(false);
        calculator.setLocationRelativeTo(null);
        calculator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        calculator.setVisible(true);

        ImageIcon icon = new ImageIcon();
        calculator.setIconImage(Toolkit.getDefaultToolkit().getImage(MainCalculator.class.getResource("CalculatorIcon.png")));
    }
}

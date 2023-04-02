import javax.swing.*;
import java.awt.*;

public class MainCalculator {
    public static void main(String[] args) {
        CalculatorConfig calculator = new CalculatorConfig("Калькулятор");
        calculator.setSize(200, 270);
        calculator.setResizable(false);
        calculator.setLocationRelativeTo(null);
        calculator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        calculator.setVisible(true);
        calculator.setIconImage(Toolkit.getDefaultToolkit().getImage(MainCalculator.class.getResource("CalculatorIcon.png")));
    }
}

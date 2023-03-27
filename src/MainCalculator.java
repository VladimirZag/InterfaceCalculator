import javax.swing.*;

public class MainCalculator {
    public static void main(String[] args) {
        JFrame calculator = new JFrame("Калькулятор");
        calculator.setSize(250, 350);
        calculator.setResizable(false);
        calculator.setLocationRelativeTo(null);
        calculator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        calculator.setVisible(true);
    }
}

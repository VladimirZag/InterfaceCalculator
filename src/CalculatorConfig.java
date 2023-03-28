import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorConfig extends JFrame {
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bSum, bDif, bMul, bDiv, bEq, bDel;
    private JTextField text;
    private int sum, dif, mul, div, intA, intB;
    private String a, b;

    public CalculatorConfig(String title) throws HeadlessException {
        super(title);
        setLayout(new FlowLayout());
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bSum = new JButton("+");
        bDif = new JButton("-");
        bMul = new JButton("*");
        bDiv = new JButton("/");
        bEq = new JButton("          =          ");
        bDel = new JButton("      CE      ");
        text = new JTextField(15);
        text.setEditable(false);
        sum = 0;
        dif = 0;
        mul = 0;
        div = 0;
        intA = 0;
        intB = 0;

        add(text); add(bSum); add(bDif); add(bMul); add(bDiv); add(b1); add(b2); add(b3); add(b4); add(b5); add(b6); add(b7); add(b8); add(b9); add(b0); add(bDel); add(bEq);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"1");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"2");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"3");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"4");
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"5");
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"6");
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"7");
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"8");
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"9");
            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"0");
            }
        });
        bDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(null);
            }
        });
        bSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = text.getText();
                text.setText(null);
                sum++;
            }
        });
        bDif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = text.getText();
                text.setText(null);
                dif++;
            }
        });
        bMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = text.getText();
                text.setText(null);
                mul++;
            }
        });
        bDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = text.getText();
                text.setText(null);
                div++;
            }
        });
        bEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = text.getText();
                text.setText(null);
                intA = Integer.parseInt(a);
                intB = Integer.parseInt(b);
                if (sum==1){
                    text.setText(String.valueOf(intA+intB));
                    sum = 0;
                    a = "";
                    b = "";
                }
                if (dif==1){
                    text.setText(String.valueOf(intA-intB));
                    dif = 0;
                    a = "";
                    b = "";
                }
                if (mul==1){
                    text.setText(String.valueOf(intA*intB));
                    mul = 0;
                    a = "";
                    b = "";
                }
                if (div==1){
                    text.setText(String.valueOf(intA/intB));
                    div = 0;
                    a = "";
                    b = "";
                }
            }
        });
    }
}

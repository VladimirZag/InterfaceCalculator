import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CalculatorConfig extends JFrame {
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bSum, bDif, bMul, bDiv, bEq, bDel, bPoint;
    private JTextField text;
    private int sum, dif, mul, div;
    private long longA, longB;
    private double doubleA, doubleB;
    private String a, b;

    public CalculatorConfig(String title) throws HeadlessException {
        super(title);
        setLayout(new FlowLayout());
        a = "";
        b = "";
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
        bPoint = new JButton(",");
        text = new JTextField(15);
        text.setEditable(false);

        add(text); add(bSum); add(bDif); add(bMul); add(bDiv); add(b1); add(b2); add(b3); add(b4); add(b5); add(b6); add(b7); add(b8); add(b9); add(b0); add(bDel); add(bEq); add(bPoint);
        List<JButton> buttons = new ArrayList<>();
        buttons.add(b0);
        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);
        for (int i = 0; i < buttons.size(); i++){
            int stringI = i;
            buttons.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setText(text.getText() + Integer.toString(stringI));
                    bPoint.setEnabled(true);
                }
            });
        }
        bDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(null);
                sum = 0;
                dif = 0;
                mul = 0;
                div = 0;
                bSum.setEnabled(true);
                bDif.setEnabled(true);
                bMul.setEnabled(true);
                bDiv.setEnabled(true);
            }
        });
        bPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!text.getText().contains(".") && !text.getText().equals("")){
                    text.setText(text.getText()+".");
                }
            }
        });
        bSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!text.getText().equals("")){
                    a = text.getText();
                    text.setText(null);
                    bSum.setEnabled(false);
                    bDif.setEnabled(false);
                    bMul.setEnabled(false);
                    bDiv.setEnabled(false);
                    sum++;
                }
            }
        });
        bDif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!text.getText().equals("")){
                    a = text.getText();
                    text.setText(null);
                    bSum.setEnabled(false);
                    bDif.setEnabled(false);
                    bMul.setEnabled(false);
                    bDiv.setEnabled(false);
                    dif++;
                }
            }
        });
        bMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!text.getText().equals("")){
                    a = text.getText();
                    text.setText(null);
                    bSum.setEnabled(false);
                    bDif.setEnabled(false);
                    bMul.setEnabled(false);
                    bDiv.setEnabled(false);
                    mul++;
                }
            }
        });
        bDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!text.getText().equals("")){
                    a = text.getText();
                    text.setText(null);
                    bSum.setEnabled(false);
                    bDif.setEnabled(false);
                    bMul.setEnabled(false);
                    bDiv.setEnabled(false);
                    div++;
                }
            }
        });
        bEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = text.getText();
                if (a.equals("") || b.equals("")){
                    return;
                }
                bSum.setEnabled(true);
                bDif.setEnabled(true);
                bMul.setEnabled(true);
                bDiv.setEnabled(true);
                DecimalFormat df = new DecimalFormat("#.#######");
                doubleA = Double.parseDouble(a);
                doubleB = Double.parseDouble(b);
                if (a.contains(".") || b.contains(".") || doubleA % doubleB != 0){
                    if (sum == 1){
                            text.setText(df.format(doubleA + doubleB).replace(',' , '.'));
                        sum = 0;
                        a = "";
                        b = "";
                    }
                    if (dif == 1){
                            text.setText(df.format(doubleA - doubleB).replace(',' , '.'));
                        dif = 0;
                        a = "";
                        b = "";
                    }
                    if (mul == 1){
                            text.setText(df.format(doubleA * doubleB).replace(',' , '.'));
                        mul = 0;
                        a = "";
                        b = "";
                    }
                    if (div == 1){
                            text.setText(df.format(doubleA / doubleB).replace(',' , '.'));
                        div = 0;
                        a = "";
                        b = "";
                    }
                }else {
                    longA = Long.parseLong(a);
                    longB = Long.parseLong(b);
                    if (sum == 1){
                        int maxLength = Math.min(String.valueOf(longA + longB).length(), 16);
                        text.setText(String.valueOf(longA + longB).substring(0, maxLength));
                        sum = 0;
                        a = "";
                        b = "";
                    }
                    if (dif == 1){
                        int maxLength = Math.min(String.valueOf(longA - longB).length(), 16);
                        text.setText(String.valueOf(longA - longB).substring(0 , maxLength));
                        dif = 0;
                        a = "";
                        b = "";
                    }
                    if (mul == 1){
                        int maxLength = Math.min(String.valueOf(longA * longB).length(), 16);
                        text.setText(String.valueOf(longA * longB).substring(0 , maxLength));
                        mul = 0;
                        a = "";
                        b = "";
                    }
                    if (div == 1){
                        int maxLength = Math.min(String.valueOf(longA / longB).length(), 16);
                        text.setText(String.valueOf(longA / longB).substring(0 , maxLength));
                        div = 0;
                        a = "";
                        b = "";
                    }
                }
            }
        });
    }
}
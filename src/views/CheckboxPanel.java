package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CheckboxPanel extends JPanel {

    private JCheckBox jcbDiscount1;
    private JCheckBox jcbDiscount2;

    public CheckboxPanel(ActionListener listener){
        initComponents(listener);
    }

    public void initComponents(ActionListener listener){
        this.setLayout(new GridLayout());
        jcbDiscount1 = new JCheckBox("Aplica primer descuento. ");
        add(jcbDiscount1);
        jcbDiscount2 = new JCheckBox("Aplica segundo descuento. ");
        add(jcbDiscount2);
    }

}
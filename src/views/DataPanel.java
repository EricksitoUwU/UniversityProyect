package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DataPanel extends JPanel {

    private JLabel lblArea;
    private JLabel lblAValue;
    private JLabel lblUse;
    private JLabel lblUValue;

    public DataPanel(ActionListener listener) {
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        this.setLayout(new GridLayout(2, 2));
        lblArea = new JLabel("Area: ");
        add(lblArea);
        lblAValue = new JLabel("");
        add(lblAValue);
        lblUse = new JLabel("Uso: ");
        add(lblUse);
        lblUValue = new JLabel("");
        add(lblUValue);
    }

    public void setLblAValue(String value) {
        lblAValue.setText(value);
    }

    public void setLblUValue(String value) {
        lblUValue.setText(value);
    }

}
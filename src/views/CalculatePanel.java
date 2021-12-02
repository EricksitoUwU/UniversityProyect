package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatePanel extends JPanel{

    private JButton btnLiquidate;
    private JLabel lblLValue;

    public CalculatePanel(ActionListener listener){
        initComponents(listener);
    }

    public void initComponents(ActionListener listener){
        this.setLayout(new GridLayout());
        btnLiquidate = new JButton("Liquidar: ");
        btnLiquidate.setActionCommand("liquidar");
        btnLiquidate.addActionListener(listener);
        add(btnLiquidate);
        lblLValue = new JLabel("");
        add(lblLValue);
    }

    public void setLblLValue(String value){
        lblLValue.setText(value);
    }

    public String getCatastral(){
        return btnLiquidate.getText();
    }

}
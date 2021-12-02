package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TaxView extends JFrame {

    private SearchPanel sp;
    private DataPanel dp;
    private CheckboxPanel cbp;
    private CalculatePanel cp;

    public TaxView(ActionListener listener){
        super("Calcular impuestos de un predio. ");
        initComponents(listener);
        this.setSize(100,100);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void initComponents(ActionListener listener){
        this.setLayout(new GridLayout(4,1));
        sp = new SearchPanel(listener);
        add(sp);
        dp = new DataPanel(listener);
        add(dp);
        cbp = new CheckboxPanel(listener);
        add(cbp);
        cp = new CalculatePanel(listener);
        add(cp);
    }

    public String getPropertyNumber(){
        return sp.getPropertyNumber();
    }

    public void setLblLValue(String value){
        cp.setLblLValue(value);
    }

    public void setLblAValue(String value) {
        dp.setLblAValue(value);
    }

    public void setLblUValue(String value) {
        dp.setLblUValue(value);
    }

}
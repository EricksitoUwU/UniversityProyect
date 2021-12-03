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
        super("APP TAXES © Jorge, Erick, Carlos ");
        initComponents(listener);
        this.setSize(400,300); //Tamaño de la mondaquera esta
        // this.setExtendedState(JFrame.MAXIMIZED_BOTH); //QUIEN PUSO ESTA LINEA >:C pd. creo que fui yo XD
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void initComponents(ActionListener listener){
        this.setLayout(new GridLayout(4,1));
        sp = new SearchPanel(listener);
        sp.setBackground(new Color( 46, 94, 170)); //Color con propositos de testing
        add(sp);
        dp = new DataPanel(listener);
        dp.setBackground(new Color(188, 128, 52)); //cOLOR para puntos de stylo
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
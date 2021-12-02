package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SearchPanel extends JPanel {

    private JButton btnSearch;
    private JTextField txtPropertyNumber;

    public SearchPanel(ActionListener listener){
        initComponents(listener);
    }

    public void initComponents(ActionListener listener){
        this.setLayout(new GridLayout());
        btnSearch = new JButton("Buscar predio: ");
        add(btnSearch);
        txtPropertyNumber = new JTextField(5);
        add(txtPropertyNumber);
    }

    public String getPropertyNumber(){
        return txtPropertyNumber.getText();
    }

}

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
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        btnSearch = new JButton("Buscar predio: ");
        btnSearch.setSize(20, 20);
        add(btnSearch, gbc); // Gbc con valores default
        gbc.gridx = 1; // Grid x a 0
        gbc.gridy = 0; // Grid Y a 0
        txtPropertyNumber = new JTextField(15);
        add(txtPropertyNumber,gbc);
    }

    public String getPropertyNumber(){
        return txtPropertyNumber.getText();
    }

}

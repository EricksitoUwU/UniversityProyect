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

    public void initComponents(ActionListener listener){ //Componentes del panel de busqueda
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        btnSearch = new JButton("Buscar predio: ");
        btnSearch.setBackground(new Color(255, 248, 240));  //LE DA EL COLOR ROSADO AL BOTON
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

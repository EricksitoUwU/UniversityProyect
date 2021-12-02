package presenters;

import models.TaxCalculator;
import views.TaxView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Presenter implements ActionListener {

    private TaxCalculator taxCalculator;
    private TaxView taxView;

    public Presenter(){
        taxCalculator = new TaxCalculator();
        try {
            taxCalculator.loadLand();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //taxView = new TaxView();
    }

    @Override
    public  void actionPerformed(ActionEvent e){
        switch (e.getActionCommand()){
            case "liquidar":
                break;
        }
    }
}
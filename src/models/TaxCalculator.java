package models;

import persitence.FileOperation;

import java.io.IOException;
import java.util.ArrayList;

public class TaxCalculator {

    private boolean discountDate;
    private boolean discountExcepting;
    private double rrate1, rrate2, rrate3, rrate4, rrate5, rrate6, crange1, crange2, crange3, crange4, crange5,
            crate1, crate2, crate3, crate4, crate5, crate6;
    private ArrayList<Property> propertiesList;

    public TaxCalculator() {

    }

    public void addProperty(Property property) {
        propertiesList.add(property);
    }

    public Property searchProperty(String cadastralNumber) {
        Property object = null;
        for (Property property : propertiesList) {
            if (property != null && property.getCadastralNumber().equals(cadastralNumber)) {
                object = property;
            }
        }
        return object;
    }

    public double calculateResidencialTaxes() {
        double tax = 0;
        for (Property property : propertiesList) {
            switch (property.getStratum()) {
                case 1:
                    property.setCadastralAppraisal(rrate1 * 1000);
                    break;
                case 2:
                    property.setCadastralAppraisal(rrate2 * 1000);
                    break;
                case 3:
                    property.setCadastralAppraisal(rrate3 * 1000);
                    break;
                case 4:
                    property.setCadastralAppraisal(rrate4 * 1000);
                    break;
                case 5:
                    property.setCadastralAppraisal(rrate5 * 1000);
                    break;
                case 6:
                    property.setCadastralAppraisal(rrate6 * 1000);
                    break;
                default:
                    break;
            }
            tax = property.getCadastralAppraisal();
        }
        return tax;
    }

    public double calculateComercialTaxes() {
        double tax = 0;
        for (Property property : propertiesList) {
            if (property.getCadastralAppraisal() <= crange1) {
                property.setCadastralAppraisal(crate1 * 1000);
            } else if (property.getCadastralAppraisal() >= crange1 && property.getCadastralAppraisal() <= crange2) {
                property.setCadastralAppraisal(crate2 * 1000);
            } else if (property.getCadastralAppraisal() >= crange2 && property.getCadastralAppraisal() <= crange3) {
                property.setCadastralAppraisal(crate3 * 1000);
            } else if (property.getCadastralAppraisal() >= crange3 && property.getCadastralAppraisal() <= crange4) {
                property.setCadastralAppraisal(crange4 * 1000);
            } else if (property.getCadastralAppraisal() >= crange4 && property.getCadastralAppraisal() <= crange5) {
                property.setCadastralAppraisal(crate5 * 1000);
            } else if (property.getCadastralAppraisal() >= crange5) {
                property.setCadastralAppraisal(crate6 * 1000);
            }
            tax = property.getCadastralAppraisal();
        }
        return tax;
    }

    public boolean applyDiscountDate() {
        return !discountDate;
    }

    public boolean applyDiscountExcepting() {
        return !discountExcepting;
    }

    public double calculateTaxes(Property property) {
        double rate = 0;
        switch (property.getUse()) {
            case RESIDENCIAL -> rate = calculateResidencialTaxes();
            case COMERCIAL -> rate = calculateComercialTaxes();
        }
        return rate;
    }

    public double calculateDiscount(Property property) {
        return applyDiscountDate() ? (calculateTaxes(property) * 85) / 100 :
                applyDiscountExcepting() ? (calculateTaxes(property) * 20) / 100 : calculateTaxes(property);
    }

    public void loadLand() throws IOException {
        ArrayList<String> line = FileOperation.loadTextFile("src/resources/BOYACA_REG1.txt");
        for (int i = 1; i < line.size(); i++) {
            String[] parts = line.get(i).split("\t");
            Property property = new Property(parts[2], parts[3], parts[4].compareTo("A")==0?Use.COMERCIAL:Use.RESIDENCIAL, Double.parseDouble(parts[5])
                    , (int) (Math.random() * 6), Double.parseDouble(parts[5]) * 1000);
            System.out.println("" + property.toString());
        }

        
    }

}
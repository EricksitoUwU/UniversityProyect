package models;

public class Property{

    private String cadastralNumber;
    private String address;
    private double area;
    private int stratum;
    private Use use;
    private double cadastralAppraisal;

    public Property(String cadastralNumber, String address, Use use, double area, int stratum, double cadastralAppraisal) {
        this.cadastralNumber = cadastralNumber;
        this.address = address;
        this.area = area;
        this.stratum = stratum;
        this.use = use;
        this.cadastralAppraisal = cadastralAppraisal;
    }

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public void setCadastralNumber(String cadastralNumber) {
        this.cadastralNumber = cadastralNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getStratum() {
        return stratum;
    }

    public void setStratum(int stratum) {
        this.stratum = stratum;
    }

    public Use getUse() {
        return use;
    }

    public void setUse(Use use) {
        this.use = use;
    }

    public double getCadastralAppraisal() {
        return cadastralAppraisal;
    }

    public void setCadastralAppraisal(double cadastralAppraisal) {
        this.cadastralAppraisal = cadastralAppraisal;
    }

    @Override
    public String toString() {
        return "Property{" +
                "cadastralNumber='" + cadastralNumber + '\'' +
                ", address='" + address + '\'' +
                ", area=" + area +
                ", stratum=" + stratum +
                ", use=" + use +
                ", cadastralAppraisal=" + cadastralAppraisal +
                '}';
    }

}
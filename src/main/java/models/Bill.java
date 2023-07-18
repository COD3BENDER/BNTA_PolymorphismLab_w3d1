package models;

import interfaces.ICost;

public class Bill implements ICost {
    private int insuranceBracket;
    private String vehicletoinsure;
    private int totalInsurance;
    private int motCost;
    private int roadTaxCost;
    private int parkingPermitCost;

    public Bill(int insuranceBracket,
                String vehicletoinsure,
                int motCost,
                int roadTaxCost,
                int parkingPermitCost){

        this.insuranceBracket = insuranceBracket;
        this.vehicletoinsure = vehicletoinsure;
        this.totalInsurance = 0;
        this.motCost = motCost;
        this.roadTaxCost = roadTaxCost;
        this.parkingPermitCost = parkingPermitCost;

    }

    public int calculateInsurance(){
        int insurance = 0;

        if(this.insuranceBracket == 50){
            insurance = 1000;
        }
        else {
            insurance = 200;
        }
        return this.totalInsurance = insurance;
    }

    public int calculateInsurance(int vatAmount){
        int insurance = 0;

        if(this.insuranceBracket == 50){
            insurance = 1000;
        }
        else {
            insurance = 200;
        }
        return this.totalInsurance = insurance + vatAmount;
    }

    public int totalCost(){
        return this.totalInsurance + this.motCost + this.roadTaxCost + this.parkingPermitCost;
    }

}

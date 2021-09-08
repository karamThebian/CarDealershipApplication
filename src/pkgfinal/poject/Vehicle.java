/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.poject;

/**
 *
 * @author khaled
 */
public class Vehicle {
    private int Model;
    private String CarName;
    private int MileAge;
    private String Color;
    private String Transmition;
    private String Status;
    private double Price;
    public Vehicle(int Model, String CarName, int MileAge, String Color, String Transmition,  double Price)
    {
        this.setColor(Color);
        this.setModel(Model);
        this.setCarName(CarName);
        this.setMileAge(MileAge);
        this.setColor(Color);
        this.setTransmition(Transmition);
        this.setStatus("Available");
        this.setPrice(Price);
        
    }
    
     public int getModel() {
        return Model;
    }

    public void setModel(int Model) {
        this.Model = Model;
    }
    
     public String getCarName() {
        return CarName;
    }

    public void setCarName(String CarName) {
        this.CarName = CarName;
    }
    
     public int getMileAge() {
        return MileAge;
    }

    public void setMileAge(int MileAge) {
        this.MileAge = MileAge;
    }
    
     public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
     public String getTransmition() {
        return Transmition;
    }

    public void setTransmition(String Transmition) {
        this.Transmition = Transmition;
    }
     public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
     public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public void showinfo()
     {
         System.out.println("******************************************************************************");
         System.out.println("Car Name:"+this.CarName);
         System.out.println("Model:"+getModel());
         System.out.println("Mile Age:"+this.MileAge);
         System.out.println("Color:"+this.Color);
         System.out.println("Transmition Type:"+this.Transmition);
         System.out.println("The car is:"+this.Status);
         System.out.println("The price is:"+this.Price+"$");
         System.out.println("******************************************************************************");
     }
}

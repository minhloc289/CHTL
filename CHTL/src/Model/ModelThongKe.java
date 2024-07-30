/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author NK
 */
public class ModelThongKe {
    String month;
    double amount;
    double cost;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public ModelThongKe() {
    }

    public ModelThongKe(String month, double amount, double cost) {
        this.month = month;
        this.amount = amount;
        this.cost = cost;
    }
    public ModelThongKe(String month, double cost) {
        this.month = month;
        this.cost = cost;
    }
    
}

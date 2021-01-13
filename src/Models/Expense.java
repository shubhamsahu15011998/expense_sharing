package Models;

import java.util.ArrayList;

public class Expense {
    private Integer id;
    private String description;
    private int total_cost;  // convert to double
    private Integer payerId;  // convert to int or use object of payer
    private ArrayList<Integer> debtorId;

    public Expense(int id, String description, int total_cost, Integer payerId, ArrayList<Integer> debtorId) {
        this.id = id;
        this.description = description;
        this.total_cost = total_cost;
        this.payerId = payerId;
        this.debtorId = debtorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(int total_cost) {
        this.total_cost = total_cost;
    }

    public Integer getPayerId() {
        return payerId;
    }

    public void setPayer_id(User payer) {
        this.payerId = payerId;
    }

    public ArrayList<Integer> getDebtorId() {
        return debtorId;
    }

    public void setDebtorId(ArrayList<Integer> debtorId) {
        this.debtorId = debtorId;
    }
}

import java.util.ArrayList;

public class expense {
    private int id;
    private String description;
    private int total_cost;
    private String payer_id;
    private ArrayList<Integer> debtorId;

    public expense(int id, String description, int total_cost, String payer_id, ArrayList<Integer> debtorId) {
        this.id = id;
        this.description = description;
        this.total_cost = total_cost;
        this.payer_id = payer_id;
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

    public String getPayer_id() {
        return payer_id;
    }

    public void setPayer_id(String payer_id) {
        this.payer_id = payer_id;
    }

    public ArrayList<Integer> getDebtorId() {
        return debtorId;
    }

    public void setDebtorId(ArrayList<Integer> debtorId) {
        this.debtorId = debtorId;
    }
}

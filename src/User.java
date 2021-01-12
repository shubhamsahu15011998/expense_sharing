public class User {
    private int id;
    private String name;
    private String phoneNumber;
    private int moneyOwe;

    public User(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.moneyOwe = 0;
    }

    public int getMoneyOwe() {
        return moneyOwe;
    }

    public void setMoneyOwe(int moneyOwe) {
        this.moneyOwe = moneyOwe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
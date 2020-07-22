package snackBar;

public class Snack
{
    //fields
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    //constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        maxId = id;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    //Methods
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int machineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
            "name: " + name + "\n" +
            "quantity: " + quantity + "\n" +
            "cost: " + cost + "\n" +
            "vendingMachineId " + vendingMachineId + "\n";
        return rtnStr;
    }

}


// Snack has methods (so can)

// * add quantity when given how many to add
// * buy snack when given how many to buy
// * get total cost given a quantity */
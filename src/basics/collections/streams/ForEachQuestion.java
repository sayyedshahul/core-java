package basics.collections.streams;

/*
You are given a List<Order>:

class Order {
    private int id;
    private String customer;
    private double amount;
    private boolean processed;

    // constructor + getters + setters
}

Task

Print all orders with amount > 1000

For each of these orders, mark them as processed (setProcessed(true))

Print them in the format:

Order <id> for <customer> : <amount> INR - Processed=<true/false>
 */

import java.util.List;

class Order {
    private int id;
    private String customer;
    private double amount;
    private boolean processed;

    public Order(int id, String customer, double amount, boolean processed) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
        this.processed = processed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}

public class ForEachQuestion {
    public static void main(String[] args){
        List<Order> orders = List.of(new Order(1, "A", 23, false),
                new Order(2, "B", 24, false),
                new Order(3, "C", 2500, false),
                new Order(4, "D", 2300, false));
        orders.stream().filter(x -> x.getAmount() > 1000).forEach((x) -> {
            x.setProcessed(true);
            System.out.printf("Order <%d> for <%s> : <%f> INR - Processed=<%b>%n",
                    x.getId(), x.getCustomer(), x.getAmount(), x.isProcessed());
        });
        System.out.println(orders.get(2).isProcessed());
    }
}

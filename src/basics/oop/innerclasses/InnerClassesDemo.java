package basics.oop.innerclasses;

class Order{
    private String orderId;

    class OrderItem{
        private String dishName;
        private String dishId;
        private int quantity;
        private double price;
    }
}

public class InnerClassesDemo {
    public static void main(String[] args){
        Order order = new Order();
        Order.OrderItem orderItem = order.new OrderItem(); // When inner class is non-static.
        //Order.OrderItem orderItem = new Order.OrderItem(); // This is allowed when inner class is static.
    }
}

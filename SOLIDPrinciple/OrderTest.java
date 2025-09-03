public class OrderTest {

    public static void main(String[] args) {
        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");
    
        Invoice invoice = new InvoiceAction();
        invoice.generateInvoice("order_123.pdf");
    
        Notification notification = new NotificationAction();
        notification.sendEmailNotification("johndoe@example.com");
    }
}
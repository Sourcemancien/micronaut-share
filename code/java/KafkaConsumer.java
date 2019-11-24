@KafkaListener(groupId = "my-group-id")
public class KafkaConsumer {

    @Inject OrderService orderService;
    
    @Topic(patterns="orders-*")
    void receiveAnyOrder(Order order){
        orderService.processAny(order);
    }

    @Topic("${kafka.topics.orders}")
    @SendTo("ordernumbers")
    int receiveLocalOrder(Order order){
        return orderService.processLocal(order);
    }
}

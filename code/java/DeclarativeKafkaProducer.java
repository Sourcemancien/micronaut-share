@KafkaClient(id="simple-producer")
public interface DeclarativeKafkaProducer {

    @Topic("${kafka.topics.producer}")
    void send(@KafkaKey String key, String message);
}

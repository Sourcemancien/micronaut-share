public class Application {
    
    public static void main(String[] args) {
        Micronaut.build(null).mainClass(Application.class)
                .environmentPropertySource(false)
                .start();
    }
}
package soap;

import javax.xml.ws.Endpoint;

// Endpoint publisher
public class DatabasePublisher {
    public static void main(String[] args) {
        QueryDatabase service = new QueryDatabase();
        service.loadDatabase("D://4//IT//java-technologies-master//java-technologies-master//dasha.json");
        Endpoint.publish("http://localhost:7779/ws/database", service);
        System.out.println("Service started!");
    }
}
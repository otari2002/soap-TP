import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServiceJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:9090/";
        Endpoint.publish(url, new BankService());
        System.out.println("Web service started at " + url);
    }
}

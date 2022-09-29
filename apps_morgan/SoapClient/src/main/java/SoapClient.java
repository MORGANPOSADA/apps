import utez.Service;
import utez.ServiceService;

public class SoapClient {
    public static void main(String[] args) {
        ServiceService service = new ServiceService();
        Service port = service.getServicePort();
        String response = port.responseMessage("Morgan :D");
        System.out.println(response);
}
}

import utez.Service;
import utez.ServiceService;

import java.util.Scanner;

public class SoapClient {
    public static void main(String[] args) {
        ServiceService service = new ServiceService();
        Service port = service.getServicePort();

        Scanner obj= new Scanner(System.in);
        int num;
        String response="";

        do
        {
             System.out.println("Introduzca un número: ");
             num=obj.nextInt();
             response = port.responseMessage(String.valueOf(num));
            System.out.println(response);
        }
        while(!response.equals("You win!"));
        //String response = port.responseMessage("Morgan :D");
        //System.out.println(response);

}
}

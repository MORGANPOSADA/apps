import utez.Service;
import utez.ServiceService;

import java.util.Scanner;

public class SoapClient {
    public static void main(String[] args) {
        ServiceService service = new ServiceService();
        Service port = service.getServicePort();
        Scanner obj= new Scanner(System.in);
        String name, Apaterno, Amaterno, year, month, day;
        System.out.println("Enter your name: ");
        name = obj.nextLine();
        System.out.println("Enteer your First last name: ");
        Apaterno = obj.nextLine();
        System.out.println("Enter your second last name: ");
        Amaterno = obj.nextLine();
        System.out.println("Enter the year are you currently have: ");
        year = obj.nextLine();
        System.out.println("Enter the month: ");
        month = obj.nextLine();
        System.out.println("Enter the day: ");
        day = obj.nextLine();
        String response = port.responseMessag(name,Apaterno, Amaterno, year, month, day);
        System.out.println(response);

}
}

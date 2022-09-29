import utez.Service;
import utez.ServiceService;

import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        ServiceService service = new ServiceService();
        Service port = service.getServicePort();

        Scanner obj= new Scanner(System.in);
       String word;
        //String response = port.responseMessage("Morgan :D");
        //System.out.println(response);
        System.out.println("Enter a word: ");
        word = obj.nextLine();

        public static boolean vocal (char c){
            if ((Character.toLowerCase(c)=='a') || (Character.toLowerCase(c)=='e') || (Character.toLowerCase(c)=='i') || (Character.toLowerCase(c)=='o') || (Character.toLowerCase(c)=='u'))
                return true;
            else
                return false;
        }



    }
}

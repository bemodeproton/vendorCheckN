import java.util.Scanner;

public class vendorList{
    String vName;
    String vID;

    public vendorList(String vendorName, String vendorID){
        vName = vendorName;
        vID = vendorID;
    }
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        System.out.println("Scan your badge: ");
        String badgeID = userIn.nextLine();
        
      vendorList coke = new vendorList("Coca Cola", "049000000443");
      vendorList pepsi = new vendorList("Pepsi", "012000001291");
      vendorList frito = new vendorList("Frito Lay", "028400084116");
      
      if (badgeID.equals("049000000443")){
       System.out.println("Welcome " + coke.vName);
       
      } else if (badgeID.equals("012000001291")){
          System.out.println("Welcome " + pepsi.vName);
          
      } else if (badgeID.equals("028400084116")){
          System.out.println("Welcome " + frito.vName);
          
      } else{
          System.out.println("Vendor not on file");
      }
    }
}
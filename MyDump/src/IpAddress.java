import java.net.InetAddress;

class IpAddress
{
   public static void main(String args[]) throws Exception
   {
     
      InetAddress myIP=InetAddress.getLocalHost();
 
      
      System.out.println("My IP Address is:");
      System.out.println(myIP.getHostAddress());
  }
}
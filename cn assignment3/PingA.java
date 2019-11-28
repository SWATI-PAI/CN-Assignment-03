import java.io.*;  
import java.net.*;

public class PingA
{
public static void sendPingRequest(String ipAddress) throws UnknownException, IOException
{
InetAddress addr = InetAddress.getByName(ipAddress); 
byte [] buf=args[1].getByte();
DatagramPacket dp=new DatagramPacket(buf,buf.length,addr,20081);  //create datagram packet
DatagramSocket ds=new DatagramSocket();  //create datagram socket
System.out.println("Sending ping request to " +ipAddress);
if(addr.isReachable(20081))  //to check if port is reachable or not
System.out.println("Host is reachable");
else
System.out.println("We cant reach this host");

Thread t=new Thread();  
{
try
{
for(int i=1;i<=60;i++)
{
System.out.println("Sender packet number"+i);  //send 60messages/second
t.sleep(1000);  //wait for 1second before sending the next message
}
t.sleep(30000);  //after 1minute wait for 30seconds
}
try 
{
for(int i=61;i<=120;i++)
{
System.out.println("Sender packet number"+i);  //after 30seconds send the message again for 1min
t.sleep(1000); //wait for 1second before sending the next message
}
}


public static void main (String [] args) throws UnknownHostException, IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //to read the input
System.out.println("Enter the ip address");  
String ipAddress = br.readLine();  //enter any ip address to represent machine A
sendPingRequest(ipAddress);  //call the function sendPingRequest


}
}
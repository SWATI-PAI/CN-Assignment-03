import java.io.*;  
import java.net.*;

public class PingB
{
public static void main (String [] args) throws UnknownHostException, IOException
{
Thread t=new Thread();
byte buf []=new byte[256];
DatagramSocket ds=new DatagramSocket(20040);  //datagram socket with the same port number 20081
DatagramPacket dp=new DatagramPacket(buf,buf.length); //datagram packet
System.out.println("waiting...");
ds.receive(dp);  //receive the message with the help of socket 
if(ipAddress=="127.0.0.1")
{
System.out.println("There will not be any packet loss from this machine"); //this is the machine ip w/o any packet loss
if((ds.receive(dp))!=null)
{
for(int i=1;i<=60;i++)
{
System.out.printlln("Received packet number "+ i);  //reply 
t.sleep(1000);
}
}
}
if((ds.receive(dp))!=null)
{
for(int i=1;i<=60;i++)
{
if((i%2)==0) //request is lost for every even packet number
System.out.printlln(i+ "request lost");
System.out.printlln("Received packet number "+ i);  //but the reply is not lost
}
}

}
}

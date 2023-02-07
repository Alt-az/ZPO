import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server
{
    private ServerSocket server = null;
//    private BufferedReader input = null;

    HashMap<String,ClientConnection> sockets;
    public Server(int port) {
        sockets = new HashMap<>();
        try {
            server = new ServerSocket(port);
//            input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Server started");
        } catch(IOException u)
        {
            System.out.println(u);
        }
    }
    public void odbieraj(ClientConnection client){
        String line = "";
        while (!line.equals("Over")) {
            try {
                line = client.getIn().readUTF();
                if(line.compareTo("bye")==0){
                    sockets.remove(client.getName());
                    break;
                }
                String [] split= line.split(" ");
                ClientConnection odp = sockets.get(split[0]);
                String wys = line.substring(split[0].length());
                if(split[0].toUpperCase().compareTo("ALL")==0){
                    for(String c: sockets.keySet()){
                        if(c.compareTo(client.getName())!=0){
                            sockets.get(c).getOut().writeUTF("ALL:"+wys);
                        }
                    }
                }
                else{
                    if(odp!=null){
                        odp.getOut().writeUTF(client.getName()+":"+wys);
                    }
                }
                System.out.println("Client:"+line);
            } catch (IOException e) {
                System.out.println(e);
                break;
            }
        }
        try
        {
            client.getIn().close();
            client.getSocket().close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
//    public void wysylaj(ClientConnection client){
//        while (!line.equals("Over")) {
//            try {
//                    line = input.readLine();
//                    client.getOut().writeUTF(line);
//
//            } catch (IOException i) {
//                System.out.println(i);
//                break;
//            }
//        }
//        try {
//            input.close();
//            client.getOut().close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }

    public void przyjmuj(Server serverMain){
        while(server==null){}
        while(true){
            try {
                Socket socket = server.accept();
                System.out.println("Client accepted");

                DataInputStream in = new DataInputStream(
                        new BufferedInputStream(socket.getInputStream()));
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                ClientConnection client = new ClientConnection(socket,in,out);
                client.setName(client.getIn().readUTF());
                sockets.put(client.getName(),client);
                Thread thread1 = new Thread() {
                    public void run() {
                        serverMain.odbieraj(client);
                    }
                };
//                Thread thread2 = new Thread() {
//                    public void run() {
//                        serverMain.wysylaj(client);
//                    }
//                };
                thread1.start();
//                thread2.start();
            } catch(IOException u)
            {
                System.out.println(u);
            }
        }
    }
    public static void main(String[] args)
    {
        Server serverMain = new Server(5000);
        Thread thread3 = new Thread() {
            public void run() {
                serverMain.przyjmuj(serverMain);
            }
        };
        thread3.start();

    }
}

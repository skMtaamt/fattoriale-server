/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermultithread;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pogliani.mattia
 */
public class ServerThread implements Runnable {
    private Socket clientSocket;
    public static int i = 0;

    public ServerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String s = in.readLine();
            int sksk = Integer.parseInt(s);
            Thread t = null;
            for(int x = sksk; x > 0; x--){
                t = new Thread(new thread(x));
                t.start();
            } 
            while(true){
                if(t.isAlive() == false){
                    System.out.println(i);
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

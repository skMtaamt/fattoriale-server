/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermultithread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amati.mattia
 */
public class thread implements Runnable {
    int i, nome;

    public thread(int nome) {
        this.i = i;
        this.nome = nome;
    }

    @Override
    public void run() {
        aggingi();
    }
    
    synchronized void aggingi(){
        ServerThread.i = ServerThread.i + nome;
    }
}

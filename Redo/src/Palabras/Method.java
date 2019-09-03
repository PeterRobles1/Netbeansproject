/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Palabras;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Method {
    protected File f1;

    public Method(String dir) {
        this.f1=new File(dir);
    }
    
    
    void insertarPalabras(String a,String b,String c,String d,String e){
    String[] ar = {a,b,c,d,e};
    try {
    FileWriter fw = new FileWriter(this.f1);
        for (int i = 0; i < ar.length; i++) {
            fw.write(ar[i]+" ");
        }
        fw.close();
    } catch (IOException s) {
       s.printStackTrace();
    }
}
    void Leerfichero(){
        
        try {
        FileReader fr =new FileReader(this.f1);
        int palabra=fr.read();
        String texto="";
            while(palabra!=-1){
                texto=texto+(char)palabra;
                System.out.println(texto);
                palabra=fr.read();
            }
        JOptionPane.showMessageDialog(null, texto);
        
            fr.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

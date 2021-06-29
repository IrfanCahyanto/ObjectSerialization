/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Irfan
 */
public class Mitigation implements Serializable {
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa(42010, "Anya Geraldine");
        File f = new File("mhs.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
            oos.writeObject(mhs);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            Mahasiswa mhs2 = (Mahasiswa) ois.readObject();
        }
        System.out.println(mhs.toString());
    }   
}
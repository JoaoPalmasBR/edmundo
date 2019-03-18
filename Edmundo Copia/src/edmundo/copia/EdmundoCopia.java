/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edmundo.copia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Path;

/**
 *
 * @author Asus H310M-D
 */
public class EdmundoCopia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String input = "D:\\app_list.txt";
        String output = "D:\\app_list1.txt";
        // So mudar esses caminhos
        ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c","copy "+input+" "+output );
        System.out.println("copy "+input+" "+output );
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }
}

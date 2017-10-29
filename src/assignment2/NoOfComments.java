/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author User
 */
public class NoOfComments {
 String line = "";
    int count = 0;
    try {
        BufferedReader br = new BufferedReader(new FileReader("comments.txt"));
        while ((line = br.readLine()) != null) {
            if (line.startsWith("//")) {
                count++;
            } else if (line.startsWith("/*")) {
                count++;
                while (!(line = br.readLine()).endsWith("'*\'")) {
                    count++;
                    break;
                }
            }
        }
        br.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.println("count=" + count);
}   


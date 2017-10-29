/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 *
 * @author User
 */
public class BlankLines {
    public void Lines()throws IOException
//counting the lines
{
File f = new File("assignment.txt");
FileReader fr = new FileReader(f);
BufferedReader br = new BufferedReader(fr);
br.readLine();
LineNumberReader ln = new LineNumberReader(br);
int count = 0;
while (ln.readLine()!=null)
{
count++;
}
System.out.println("No. of lines = " + count);
}
}

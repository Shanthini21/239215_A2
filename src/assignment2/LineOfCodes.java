/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author User
 */
public class LineOfCodes {
    try{
    // Open the file that is the first
    // command line parameter
    //the text file is in the project
    FileInputStream fstream = new FileInputStream("xanadu.txt");
    // Get the object of DataInputStream
    DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
    String strLine;
    int count = 0;
    int count2 = 0;
    //Read File Line By Line
    while((strLine = br.readLine())!= null ){
    	if (strLine.trim().length() != 0){
    		System.out.println(strLine);
    		count++;
    	}else{
    		count2++;
    	}
    }
    System.out.println("number of lines:" + count);
    System.out.println("number of lines:" + count2);
    //Close the input stream
    in.close();
    }catch (Exception e){//Catch exception if any
      System.err.println("Error: " + e.getMessage());
    }
}
}
}

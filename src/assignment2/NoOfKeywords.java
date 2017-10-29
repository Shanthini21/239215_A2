/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.FileNotFoundException;

/**
 *
 * @author User
 */
public class NoOfKeywords {
    throws FileNotFoundException{
       
        if(args.length != 1){
            System.out.println("Usage: java Test filename");
            System.exit(0);
	}
        //Command line.
        Scanner input = new Scanner(new File(args[0]));

        while (true){ //runs forever
	String s = input.next(); //reads one string
	System.out.println(s);
    }
    }

    public void countKeywords(){

        Scanner file = new Scanner(System.in) ;

        String comment = "//";
        int keywordCounter = 0;
        Set<String> set = new HashSet<String>();
        set.add("public");
        set.add("void");
        set.add("static");
        set.add("class");
        set.add("if");
        set.add("else");
        set.add("throws");
        set.add("null");
        set.add("true");
        set.add("false");
        set.add("import");
        set.add("new");
        set.add("int");
        set.add("boolean");
        set.add("long");
        set.add("double");
        set.add("return");


        if(file.hasNext()){
            if(file.next().equalsIgnoreCase(comment)){
                file.nextLine();
            }
            if(set.contains(file.next())){
                keywordCounter++;
            }

        }
        System.out.println("There are " + keywordCounter + " keywords in this"
                + "program");
        return;

	}

    private static class args {

        public args() {
        }
    }

    }
}

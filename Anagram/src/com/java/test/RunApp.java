package test;

import java.io.IOException;


public class RunApp {

	  private RunApp() {
	  }
	   
      public static void main (String [] args) throws IOException {
    	     ReadFile readFile = new ReadFile();
    	     readFile.readWordList();
      }
	
}

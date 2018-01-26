import hsa.*;
public class typexcode{
    public static void main (String[] args){
	int count = -1;
	String label[]=new String[8];
	label[1] =  "abcdefghijklmnopqrstuvwxyz ";//input rotor
	String rotor[]=new String[8];
	rotor[1] = "DMTWSILRUYQNKFEJCAZBPGXOHV ";
	rotor[2] = "UQNTLSZFMREHDPXKIBVYGJCWOA ";
	rotor[3] = "FKQHTLXOCBJSPDZRAMEWNIUYGV ";
	
       
	
	Stdout.print("Rotor Number:");
	int rotation3 = Stdin.readInt();
	
	
	
	char letter;
	String inpu = Stdin.readLine ();
	int hm=inpu.length();
	Stdout.println("");
	do{
	    count++;
	    //Stdout.print ("letter: ");
	    if (count<hm){
		letter = inpu.charAt (count);
	    
	    int position = label[1].indexOf (letter);
	    position = (position + rotation3) % rotor[3].length ();
	    letter = rotor[3].charAt (position);

	    Stdout.print (letter);

	    // rotate rotor 3
	    rotation3++;}
	    else{
		Stdout.println();
		inpu=Stdin.readLine();
		hm = inpu.length();
		Stdout.println();
		
	    }
	}while (rotation3 < rotor[3].length ());
    }
}

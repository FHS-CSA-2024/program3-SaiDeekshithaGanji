//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class program3{
    public static void main(String[] args){
        
        //Make a Scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Create my variables
        int length = 0;
        int width = 0;
       
        //Ask for user input
        System.out.print("Enter Length: ");
        //Get input
        length = myScanner.nextInt();
        
        System.out.print("Enter Width: ");
        //Get input
        width = myScanner.nextInt();
        
        //Calculate
        int area = length*width;
        int perimeter = 2*(length+width);
        
        
        //Output
        System.out.println();
        System.out.println("The Length is " + length);
        System.out.println ("The Width is " + width);
        System.out.println ("The Area is " + area);
        System.out.println("The perimeter is " + perimeter);        
    }
    
    
}




//Paste console output below:
/*
Enter Length: 143
Enter Width: 82

The Length is 143
The Width is 82
The Area is 11726
The perimeter is 450


*/

import java.util.Scanner; 

public class triangulos
{
   
    public static void main(String[] args)
    {
        
        Scanner input =  new Scanner(System.in);

        int a;
        int b; 
        int c;

        System.out.print("Enter first integer: "); 
        a = input.nextInt(); 

        System.out.print("Enter second integer: "); 
        b = input.nextInt();

        System.out.print("Enter tree integer: "); 
        c = input.nextInt(); 

        if (a < (b + c) && b < (a + c) && c < (a + b))
        {
		    if (a == b && a == c){
		    System.out.println("Triangulo Equilátero!!");
        }else if( a != b && a != c && b != c ){
                System.out.println("Triangulo Escaleno!!");
        }else{
                System.out.println("Triangulo Isósceles!!");

        }
    } else {
        System.out.println(" Isto não é um triangulo");
    }
    }
}

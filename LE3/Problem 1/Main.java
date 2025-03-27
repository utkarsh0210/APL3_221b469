/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        
        // Creating objects of Pandav, Kaurav, and Vikarn
        Bharatvanshi pandav = new Pandav();
        Bharatvanshi kaurav = new Kaurav();
        Bharatvanshi vikarn = new Vikarn();
        
        // Testing Pandav
        System.out.println("Pandav:");
        System.out.println("Fight: " + pandav.fight());
        System.out.println("Obey: " + pandav.obey());
        System.out.println("Kind: " + pandav.kind());
        
        System.out.println();
        
        // Testing Kaurav
        System.out.println("Kaurav:");
        System.out.println("Fight: " + kaurav.fight());
        System.out.println("Obey: " + kaurav.obey());
        System.out.println("Kind: " + kaurav.kind());
        
        System.out.println();
        
        // Testing Vikarn
        System.out.println("Vikarn (special Kaurav):");
        System.out.println("Fight: " + vikarn.fight());
        System.out.println("Obey: " + vikarn.obey());
        System.out.println("Kind: " + vikarn.kind());
    }
}


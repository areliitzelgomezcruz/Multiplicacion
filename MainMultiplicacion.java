import java.util.Scanner;

class MainMultiplicacion {
   public static void main(String[] args) {
      Scanner op = new Scanner(System.in);
      System.out.print("\nDeme la primer variable: ");
      int X = op.nextInt();
      System.out.print("Deme la segunda variable: ");
      int Y = op.nextInt();

      Multiplicacion primera = new Multiplicacion();
      primera.x = X;
      primera.y = Y;
      
      primera.mostrarMultiplicacion();
   }
}
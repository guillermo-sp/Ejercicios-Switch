/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author Usuario DAM 1
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota = 50;
       if (nota<0 || nota>10){
           System.out.println("La nota no es valida");
       }
        else if (nota<5){
           System.out.println("Tu nota esta suspensa");
       }else{
            switch (nota) {
           
            case 5:
                System.out.println("La nota es 5");
                break;
            case 6:
                System.out.println("La nota es 6");
                break;
            case 7:
                System.out.println("La nota es 7");
                break;
            case 8:
                System.out.println("La nota es 8");
                break;
            case 9:
                System.out.println("La nota es 9");
                break;
            case 10:
                System.out.println("La nota es 10");
                break;
            default:
                System.out.println("La nota introducida no es correcta");

        }
         
       }
        String palabra ="hola";
          switch (palabra.toUpperCase()){
              case "HOLA":
                  System.out.println("Esta entrando");
                  break;
              case "ADIOS":
                  System.out.println("Esta saliendo");
                  break;
              default : 
                  System.out.println("No te entiendo");
          }
    }

}

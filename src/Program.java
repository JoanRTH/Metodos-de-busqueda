
import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {
        int vector1[]={5,6,3,44,22,1};
        int vector2[]={55,4,43,44,2,10,4567,638,3,0,-5,-9};
        int vector3[]={5,2,1,8,3,9,7};
        int opcion=0;
        
        do {       
            try {
               opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                  "1. Metodo secuencial\n"
                                + "2. Busqueda binaria\n"
                                + "3. Metodo Hash\n"
                                + "4 salir\n"
                                + "Elige una opción...",
                        "Metodos de busqueda",JOptionPane.QUESTION_MESSAGE)); 
            
            switch(opcion){
                
                case 1:
                    Metodo_Secuencial A = new Metodo_Secuencial();
                    int Buscar = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero a buscar"));
                    A.mostrarArreglos(vector2);
                    int indice = A.busquedainicial(vector2,Buscar);
                    if (indice!=-1){
                        System.out.println("Elemento econtrado en el indice: " + indice);
                    }else{System.out.println("Elemento no encuntrado");}
                    break;
                    
                case 2:
                    
                    Busqueda_Binaria bus = new Busqueda_Binaria();
                    int Bak = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero a buscar"));
                    bus.mostrarArreglos(vector2);
                    int indice2 = bus.busquedabinaria(vector2,Bak);
                    if (indice2!=-1){
                        System.out.println("Elemento econtrado en el indice: " + indice2);
                    }else{System.out.println("Elemento no encuntrado");}
                    break;
                    
                case 3:
                    
                    MetodoHash has = new MetodoHash(8);
                    String [] elementos = {"20","33","21","10","12","14","56","100"};
                    has.funcionHash(elementos, has.arreglo);
                    has.MostrarTabla();
                    String buscado=has.buscarClave("33");
                    if (buscado==null) {
                        System.out.println("El elemento 33 no se econtra");
                    }
                    break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta","Cuidado",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
            }
            
        } catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Error " + n.getMessage());}
        
        } while (opcion != 4);
        
    }//fin del main
}

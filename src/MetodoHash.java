import java.util.Arrays;
public class MetodoHash {
    String [] arreglo;
    int tamanio,contador;
    public MetodoHash(int tam){
        tamanio=tam;
        arreglo = new String[tam];
        Arrays.fill(arreglo,"-1");
    }
    public void funcionHash(String[] cadenaArrelgo, String[]arreglo){
        int i;
        for(i = 0; i < cadenaArrelgo.length; i++){
            String elemento = cadenaArrelgo[i];
            int indeceArreglo=Integer.parseInt(elemento) % 7; 
            System.out.println("El indice es " + indeceArreglo + " para el elemento " + elemento);
            while(arreglo[indeceArreglo]!="-1"){
                indeceArreglo++;
                System.out.println("Ocurrio una colision en el indice " + (indeceArreglo-1) 
                        + " cabiar al indice " + indeceArreglo);
                indeceArreglo%=tamanio;
            }
            arreglo[indeceArreglo]=elemento;
        }
    }
    
    public void MostrarTabla(){
        int incremento =0,i,j;
        for (i = 0; i < 1; i++) {
            incremento +=8;
            for(j=0; j<71;j++){
                System.out.print("-");
            }
            
            System.out.println();
            for (j=incremento - 8; j < incremento; j++){
                System.out.format("| %3s " + " ",j); 
            }
            
            System.out.println("|");
            for (int n = 0; n < 71; n++){
                System.out.print("-");
            }
            
            System.out.println();
            for (j = incremento - 8; j < incremento; j++){
                if (arreglo[j].equals("-1")){
                    System.out.print("|     ");
                }else{
                    System.out.print(String.format("| %3s " + " ", arreglo[j]));
                }
            }
            System.out.println("|");
            for (j=0; j < 71; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    
    public String buscarClave (String elemento){
        int indiceArreglo=Integer.parseInt(elemento)%7;
        int contador=0;
        while (arreglo[indiceArreglo]!="-1") {            
            if (arreglo[indiceArreglo] ==elemento) {
                System.out.println("El elemento " + elemento + " fue encontrado en el indice " + indiceArreglo);
                return arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo%=tamanio;
            contador++;
            if (contador > 7 ) {
                break;
            }
        }
        return null; 
    }
}

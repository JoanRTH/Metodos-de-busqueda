public class Busqueda_Binaria {
    
    public int busquedabinaria (int arreglo[], int elemento){
        int centro, primero, ultimo, ValorCentro;
        primero = 0;
        ultimo = arreglo.length-1;
        while(primero<=ultimo){
            centro= (primero + ultimo)/2;
            ValorCentro=arreglo[centro];
            System.out.println("Comparando a " + elemento + " con " + arreglo[centro]);
            if (elemento==ValorCentro){
                return centro;
            }else if (elemento<ValorCentro) {
                ultimo=centro-1;
            }else{
                primero=centro+1;
            }
        }
        return -1;
    }
    
    //Mostrar los datos del vector
    public void mostrarArreglos(int [] arreglo){
        int k;
        for(k=0; k < arreglo.length; k++){
               System.out.print("["+ arreglo[k] +"]");
        }
        System.out.println();
    }
}

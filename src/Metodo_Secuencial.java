public class Metodo_Secuencial {
    
    public int busquedainicial(int arreglo [], int elemeto){
        int i;
        boolean encontrado = false;
        for (i = 0; i < arreglo.length && encontrado == false; i++){
            if(elemeto == arreglo[i]){
                encontrado=true;
                return i;
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

package main;

import java.util.*;


public class LogicaClasificacion {

    /**
     * Invierte una cadena de texto utilizando una pila (Stack).
     *
     * @param texto Cadena original a invertir.
     * @return Cadena invertida.
     *
     *         Ejemplo:
     *         Entrada: "Hola Mundo"
     *         Salida: "odnuM aloH"
     */

    public String invertirCadena(String texto) {
        Stack<Character> stack = new Stack<>();


        return "";
    }

    /**
     * Verifica si los símbolos de paréntesis, corchetes y llaves están bien
     * balanceados.
     *
     * @param expresion Cadena con símbolos.
     * @return true si está balanceada, false en caso contrario.
     *
     *         Ejemplo:
     *         Entrada: "{[()]}"
     *         Salida: true
     */
    public boolean validarSimbolos(String expresion) {
        Stack<Character> stack = new Stack<>();
        for (char z: expresion.toCharArray()){
            if(esApertura(z)){
                stack.push(z);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                char max= stack.pop(); 
                if((z==')'&& max !='(')||
                (z==']'&& max !='[')||  
                (z=='}'&& max != '{')){

                    return false;
                }             
            }
        }
        return stack.isEmpty();

        
    }
    private boolean esApertura(char z){
        return z=='('|| z =='['|| z=='{';
    }
    /**
     * Ordena una pila de enteros en orden ascendente usando otra pila auxiliar.
     *
     * @return Lista ordenada.
     *
     *         Ejemplo:
     *         Entrada: [3, 1, 4, 2]
     *         Salida: [1, 2, 3, 4]
     */
    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> aux = new Stack<>();
        while(!pila.isEmpty()){//mientras la pila no este vacia
            int actual = pila.pop();//en la variable  actual saca el ultimo en entrar

            while(!aux.isEmpty()&& aux.peek()>actual){//mientras que el aux no este vacio
                                    //y el de arriba del aux sea mayor al actual

                pila.push(aux.pop());//mete a la plia lo que saca y borra del aux

            }
            aux.push(actual);

        }

        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }
        

        return new ArrayList<>(pila);
    }
    

    /**
     * Clasifica una lista de enteros separando pares e impares.
     * Usa LinkedList para mantener el orden de inserción.
     *
     * @return Lista con pares primero, luego impares.
     *
     *         Ejemplo:
     *         Entrada: [1, 2, 3, 4, 5, 6]
     *         Salida: [2, 4, 6, 1, 3, 5]
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {

        return new ArrayList<>();


        
    }
}

package pr2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph<V>{

	//Lista de adyacencia.
	private Map<V, Set<V>> adjacencyList = new HashMap<>();
	

	/**
	 * Añade el vértice ` v` al grafo.
	 * @param v vértice a añadir.
	 * @return ` true` si no estaba anteriormente y ` false` en caso
	 * contrario.
	*/

	public boolean addVertex(V v){
		HashMap<Object, Object> adjencyList = new HashMap<>();
		if(!adjencyList.containsKey(v)){
			adjencyList.put(v, new HashSet<v>();
		return true;

		}else{
			return false;
		}
	}
	/**
	 * Añade un arco entre los vértices ` v1` y ` v2` al grafo. En
	 * caso de que no exista alguno de los vértices, lo añade
	 * también.
	 *
	 * @param v1 el origen del arco.
	 * @param v2 el destino del arco.
	 * @return ` true` si no existía el arco y ` false` en caso contrario.
	 */

	public boolean addEdge(V v1, V v2){
		if(!containsVertex(v1)){
			addVertex(v1);
		}
		if(!containsVertex(v2)){
			addVertex(v2);
		}

		if(!adjacencyList.get(v1).contains(v2)){
			adjacencyList.get(v1).add(v2);
		return true;
		}else{
			return false;/*
		if(!adjencyList.get(v2).contains(v1)){
                        adjencyList.get(v2).add(v1);
                return true;
                }*/
		}
	}
	/**
	 * Obtiene el conjunto de vértices adyacentes a ` v`.
	 *
	 * @param v vértice del que se obtienen los adyacentes.
	 * @return conjunto de vértices adyacentes.
	*/

	public Set<V> obtainAdjacents(V v) throws Exception{
		int[][] distancias = new int[adjacencyList.size()][2];
		return null;		//Este código hay que modificarlo.
	}
	/**
	 * Comprueba si el grafo contiene el vértice dado.
	 *
	 * @param v vértice para el que se realiza la comprobación.
	 * @return ` true` si ` v` es un vértice del grafo.
	*/

	public boolean containsVertex(V v){
		return adjacencyList.keySet().contains(v);
	}
	/**
	 * Método ` toString()` reescrito para la clase ` Grafo. java`.
	 * @return una cadena de caracteres con la lista de
	 * adyacencia.
	*/

	@Override
	public String toString(){

		return ""; //Este código hay que modificarlo.
	}
	/**
	 * Obtiene, en caso de que exista, el camino má s corto entre
	 * ` v1` y ` v2`. En caso contrario, devuelve ` null`.
	 *
	 * @ param v1 el vé rtice origen.
	 * @ param v2 el vé rtice destino.
	 * @ return lista con la secuencia de vértices del camino más corto
	 * entre ` v1` y ` v2`
	 */
	public List<V> shortestPath(V v1, V v2){

		return null; // Esto código hay que modificarlo.
	}
}


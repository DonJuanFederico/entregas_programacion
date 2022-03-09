/*
Copyright [2022] [Juan Federico Garcia Alonso-Buron Cañedo Argüelles Chaves Fernandez Fabregas]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License
*/

package aplicacion;

import mates.*;
/**
 * @author Juan Federico
 *
 * @param inicio del prgrama
 * @see mates se llama a mates
 */

public class Principal{
	public static void main(String[] args){
		double numeroDeDardos = 4999;
		double resultado = (4*(Matematicas.generarNumeroPiIterativo(numeroDeDardos))/numeroDeDardos);
		System.out.println(resultado);

	}
}

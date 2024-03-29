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

package mates;

import java.lang.Math;
import aplicacion.*;
import java.util.Random;
/**
 * @author Juan Federico
 *
 * @param clase Mates
 * @see se calcula el numero Pi
 */

public class Matematicas{
	public static double generarNumeroPiIterativo(double numeroDeDardos){
	double memoria = numeroDeDardos;
	double dardosDentro = 0;
	double x = Math.random();
	double y = Math.random();
	if((x * x) + (y * y) <= 1){
		dardosDentro = dardosDentro + 1;
	}
	memoria = memoria - 1;
	if (memoria >= 1){
		dardosDentro = dardosDentro + generarNumeroPiIterativo(memoria);
	}
	return dardosDentro;
	}
}

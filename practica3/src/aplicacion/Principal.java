package aplicacion;

import java.util.Random;
import interfaz.*;

public class Principal{

	public static void main(String args[]){
		double dardosLanzados = 100000;
		Interfaz calculadora = (a)->{double memoria = a; double dardosDentro = 0;
			while(memoria >=1){
				double x = Math.random();
				double y = Math.random();
				if((x * x) + (y * y) <= 1){dardosDentro = dardosDentro + 1;}
				memoria = memoria - 1;
			}System.out.println(4*dardosDentro/a);
		};
		System.out.println("La aproximacion al numero Pi es:");
		calculadora.calcularPi(dardosLanzados);
	}
}

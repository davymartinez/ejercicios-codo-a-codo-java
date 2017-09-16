public class Ej0705_MatrizCalificaciones {
	
	/* 7.5) Se tiene una matriz llamada calificaciones de 5 x 3, que representa las 3 calificaciones de cada uno de los 
	 * 5 alumnos de un curso.
	 * int[][] calificaciones = { {2,7,9} , {5,5,6} , {10,6,5} , {8,2,9} , {1,1,3} };
	 * Dada la matriz, se pide hallar:
	 * ◦ Promedio de cada alumno.
	 * ◦ Promedio de cada materia.
	 * ◦ Promedio general del curso (todos los alumnos).
	 * ◦ Cantidad de alumnos con al menos un aplazo (calificación menor que 4).*/

	public static void main(String[] args) {
		
		int[][] calificaciones = { {2,7,9} , {5,5,6} , {10,6,5} , {8,2,9} , {1,1,3} };
		
		System.out.println("::: Promedios de notas de los alumnos ::: ");
		promedioAlumnos(calificaciones);
		
		System.out.println("::: Promedios de cada materia ::: ");
		promedioMaterias(calificaciones);
		
		System.out.println("::: Promedio general del curso ::: ");
		promedioGeneral(calificaciones);
		
		System.out.println("::: Cantidad de aplazados ::: ");
		cantAplazados(calificaciones);
		
	}
	
	static void promedioAlumnos(int[][] calificaciones) {
		int acumulador = 0;
		float promedio = 0;
		for (int i = 0; i < calificaciones.length; i++) {
			acumulador = 0; // reiniciamos acumulador en cada iteracion de filas 'i'
			for (int j = 0; j < calificaciones[0].length; j++) {
				acumulador += calificaciones[i][j];
				promedio = (float) acumulador / calificaciones[j].length;
			}
			System.out.println("Alumno #" + (i+1) + ": " + promedio);
		}
	}
	
	static void promedioMaterias(int[][] calificaciones) {
		int acumulador = 0;
		float promedio = 0;
		for (int i = 0; i < calificaciones[0].length; i++) {
			acumulador = 0;
			for (int j = 0; j < calificaciones.length; j++) {
				acumulador += calificaciones[j][i];
				promedio = (float) acumulador / calificaciones.length;
			}
			System.out.println("Materia #" + (i+1) + ": " + promedio);
		}
	}
	
	static void promedioGeneral(int[][] calificaciones) {
		int acumulador = 0;
		float promedio = 0;
		for (int i = 0; i < calificaciones.length; i++) {
			for (int j = 0; j < calificaciones[0].length; j++) {
				acumulador += calificaciones[i][j];
				promedio = (float) acumulador / (calificaciones.length * calificaciones[i].length);
			}	
		}
		System.out.println("El promedio general de todos los alumnos es: " + promedio);
	}
	
	static void cantAplazados(int[][] calificaciones) {
		int acumulador = 0;
		for (int i = 0; i < calificaciones.length; i++) {
			for (int j = 0; j < calificaciones[0].length; j++) {
				if (calificaciones[i][j] < 4) {
					acumulador++;
					break; // nos salimos del if-loop al encontrar la primera nota menor a 4
				}
			}
		}
		System.out.println("Total de alumnos con materias aplazadas: " + acumulador);
	}

}

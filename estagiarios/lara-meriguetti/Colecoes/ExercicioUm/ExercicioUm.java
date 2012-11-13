import java.util.*;
	public class ExercicioUm {

		public static void main(String[] args){

			TreeSet<Integer> numeros = new TreeSet<Integer>();
			for (int i = 0; i<1001; i++){
				numeros.add(i);
			}
			System.out.println(numeros.descendingSet());
		}

	}

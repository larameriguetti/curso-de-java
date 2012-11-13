import java.util.*;

	public class ExercicioQuatro {
			
			public static void main(String[] args){
				
				List<Integer> list = new ArrayList<Integer>();
				
				System.out.println("Digite os elementos: ");
					for (int i = 0; i < 3; i++) {
						Scanner s = new Scanner(System.in);
						list.add(s.nextInt());
					}
								
						double tempo = System.currentTimeMillis();
						System.out.println("Tempo da operação: " + tempo);
				
				
			}
			
	}


import java.util.*;

	public class ExercicioTres {

		public static void main(String[] args){

		List<Integer> listaUm = new ArrayList<Integer>();
        	List<Integer> listaDois = new ArrayList<Integer>();
        	TreeSet<Integer> uniao = new TreeSet<Integer>();
        	
        	System.out.println("Digite os numeros da lista 1 : ");

        	for (int i = 0; i < 3; i++) {
        		Scanner s = new Scanner(System.in);
        		listaUm.add(s.nextInt());

        	}

        	System.out.println("Digite os numeros da lista 2 : ");

        	for (int i = 0; i < 3; i++) {

        		Scanner s = new Scanner(System.in);
        		listaDois.add(s.nextInt());

        	}
        
        	System.out.println("Digite + para união ou * para interseção: ");
        	Scanner scan = new Scanner (System.in);
       		String operacao = scan.nextLine();
       			if(operacao.equals("+")){
       				uniao.addAll(listaUm);
       				uniao.addAll(listaDois);
       				System.out.println(uniao);
       					}else if (operacao.equals("*")){
       		 				intersecao.retainAll(listaUm, listaDois);
       		 				System.out.println(intersecao);
        						}else{
        							System.out.println("Operação Inválida");
        					}
    					}
	}

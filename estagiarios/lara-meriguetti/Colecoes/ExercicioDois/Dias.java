import java.util.*;


public class Dias {
	
	public static void main(String[] args) {
		Lembrete lembrete = new Lembrete();
		lembrete.segunda.add("Aula de Inglês");
		lembrete.terca.add("Pagar contas");
		lembrete.quarta.add("Aula de Inglês");
		lembrete.quinta.add("Estudar");
		lembrete.sexta.add("Happy Hour com amigos");
		lembrete.sabado.add("Dormir");
		lembrete.domingo.add("Dormir");
	
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("segunda", lembrete.segunda);
		map.put("terca", lembrete.terca);
		map.put("quarta", lembrete.quarta);
		map.put("quinta", lembrete.quinta);
		map.put("sexta", lembrete.sexta);
		map.put("sabado", lembrete.sabado);
		map.put("domingo", lembrete.domingo);
		System.out.println(map);
	}
}




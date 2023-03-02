package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        Map<String, String> aluno1 = new HashMap<>();

        aluno1.put("Nome", "Maria");
        aluno1.put("Idade", "18");
        aluno1.put("Media", "9.5");
        aluno1.put("Turma", "3b");

        listaAlunos.add(aluno);
        listaAlunos.add(aluno1);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));

    }
}

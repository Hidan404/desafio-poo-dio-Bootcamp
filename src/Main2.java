import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Bootcamp");
        bootcamp.setDescricao("Desenvolvimento em Backend Java");

        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o título do curso: ");
            String cursoTitulo = entrada.nextLine();

            System.out.println("Digite a descrição do curso: ");
            String cursoDescricao = entrada.nextLine();

            System.out.println("Digite a carga horária: ");
            int cargaHoraria = entrada.nextInt();
            entrada.nextLine(); // Consumir a nova linha

            Curso curso = new Curso();
            curso.setTitulo(cursoTitulo);
            curso.setDescricao(cursoDescricao);
            curso.setCargaHoraria(cargaHoraria);

            bootcamp.getConteudos().add(curso);

            System.out.println("Deseja adicionar outro curso? (s/n): ");
            String resposta = entrada.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        continuar = true;

        while (continuar) {
            System.out.println("Deseja adicionar um aluno: ");

            System.out.println("Digite o nome do aluno: ");
            String nomeDoDev = entrada.nextLine();

            Dev dev = new Dev();
            dev.setNome(nomeDoDev);

            dev.inscreverBootcamp(bootcamp);
            dev.progredir();
            dev.progredir();

            System.out.println("O meu XP é de " + dev.calcularTotalXp() + 
                           "\nE meus conteúdos concluídos são " + dev.getConteudosConcluidos() + 
                           "\nE inscritos " + dev.getConteudosInscritos());
            System.out.println("Deseja adicioanar mais alunos S/N");
            String verificar = entrada.nextLine();
            if(!verificar.equalsIgnoreCase("s")){
                continuar = false;
            }          
        }

        
        
        

        entrada.close();
    }
}



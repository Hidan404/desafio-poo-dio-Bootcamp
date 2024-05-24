import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Java backend development");
        curso1.setCargaHoraria(80);
        curso1.calcularXp();

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Python com pygame");
        curso2.setCargaHoraria(50);
        curso2.calcularXp();


        Curso curso3 = new Curso();
        curso3.setTitulo("Javascript");
        curso3.setDescricao("Manipulando o dom");


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("java curso");
        bootcamp.setDescricao("desenvolvimento em backend java");
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso1);



        Dev ronald = new Dev();
        ronald.setNome("Ronald");
        ronald.inscreverBootcamp(bootcamp);
        ronald.progredir();

        System.out.println("O meu xp e de " + ronald.calcularTotalXp() + "e meu conteudos sao " + ronald.getConteudosConcluidos());



       

    }

}

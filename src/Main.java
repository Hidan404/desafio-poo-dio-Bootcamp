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

        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Logica para programação");
        mentoria1.setDescricao("Logica para desenvolvimento agil");
        mentoria1.setData(LocalDate.now());
        mentoria1.calcularXp();

        Curso curso3 = new Curso();
        curso3.setTitulo("Javascript");
        curso3.setDescricao("Manipulando o dom");
        curso3.setCargaHoraria(40);
        curso3.calcularXp();


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("java curso");
        bootcamp.setDescricao("desenvolvimento em backend java");
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);



        Dev ronald = new Dev();
        ronald.setNome("Ronald");
        ronald.inscreverBootcamp(bootcamp);
        ronald.progredir();
        ronald.progredir();

        System.out.println("O meu xp e de " + ronald.calcularTotalXp() + "\ne meu conteudos sao " + ronald.getConteudosConcluidos() + "\ne inscritos " + ronald.getConteudosInscritos());



       

    }

}

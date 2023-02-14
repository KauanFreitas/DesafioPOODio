import com.github.KauanFreitas.desafio.dominio.Bootcamp;
import com.github.KauanFreitas.desafio.dominio.Curso;
import com.github.KauanFreitas.desafio.dominio.Dev;
import com.github.KauanFreitas.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso2);
//        System.out.println(curso1);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricaoBootcamp("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devKauan = new Dev();
        devKauan.setNome("Kauan");
        devKauan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Kauan:"+ devKauan.getConteudosInscrito());

        devKauan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Kauan:"+ devKauan.getConteudosInscrito());
        System.out.println("Conteúdos Concluídos Kauan:"+ devKauan.getConteudosConcluidos());
        System.out.println("XP:" + devKauan.calcularTotalXp());

        System.out.println("----------------");

        Dev devKelly = new Dev();
        devKelly.setNome("Kelly");
        devKelly.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Kelly:"+ devKelly.getConteudosInscrito());

        devKelly.progredir();
        devKelly.progredir();
        devKelly.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Kelly:"+ devKelly.getConteudosInscrito());
        System.out.println("Conteúdos Concluídos Kelly:"+ devKelly.getConteudosConcluidos());
        System.out.println("XP:" + devKelly.calcularTotalXp());
    }
}

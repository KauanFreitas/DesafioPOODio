import com.github.KauanFreitas.desafio.dominio.Curso;
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

        System.out.println(curso2);
        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}

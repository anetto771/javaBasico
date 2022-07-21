package aula5;

public class principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Professor p1 = new Professor();

        p1.setNome("Reginaldo Pereira");
        p1.setEndereco("Rua das Flores, 220");
        p1.setTelefone("(16)98836.4425");
        p1.setCpf("221.256.774-39");
        p1.setNomeCurso("Java Spring Web");
        p1.setSalario(24.20);

        a1.setNome("Murilo Pacheco");
        a1.setEndereco("Rua das Alfeneiros, 4");
        a1.setTelefone("(21)99756.5623");
        a1.setCpf("506.632.855-19");
        a1.setCurso("Java Spring Web");
        double[] notas = {9.5, 6.5, 8.5, 6.3, 9.7, 8.6, 6.2, 7.5, 4.9};
        a1.setNotas(notas);

        a2.setNome("Helena Carlos");
        a2.setEndereco("Rua das Pinheiras, 4");
        a2.setTelefone("(16)99823.5623");
        a2.setCpf("302.552.456-56");
        a2.setCurso("Ciencia de Dados");
        double[] notas2 = {7.5, 6.5, 2.5, 6.3, 8.7, 6.6};
        a2.setNotas(notas2);
        a2.setEstagio(true);

        System.out.println(p1.montaHolerite());
        System.out.println(a1.montaBoletim());
        System.out.println(a2.montaBoletim(a2.getEstagio()));
    }
}

package aula5;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;
    private boolean estagio = false;

    // #region Encapsulamento [Getters e Setters]
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean getEstagio() {
        return estagio;
    }

    public void setEstagio(boolean estagio) {
        this.estagio = estagio;
    }

    // #endregion

    // #region Regras de Negócios
    private double calculaMedia() {
        double media = 0;
        if (notas.length > 3 && notas.length < 10) {
            for (int i = 0; i < this.notas.length; i++) {
                media += notas[i];
            }
            return (media / notas.length);
        } else {
            return -1;
        }

    }

    private double calculaMedia(double peso) {
        double media = 0;
        if (notas.length > 5 && notas.length < 13) {
            for (int i = 0; i < notas.length; i++) {
                if (i >= 3) {
                    media += (notas[i] * peso);
                } else {
                    media += notas[i];
                }
            }
            return (media / notas.length);
        } else {
            return -1;
        }
    }

    private String verificaAprovacao(double media) {
        if (media >= 7) {
            return "aprovado";
        } else if (media < 7 && media > 0) {
            return "reprovado";
        } else {
            return "Errado";
        }
    }

    public String montaBoletim() {
        String boletim = "Nome do Aluno: " + super.getNome() + System.lineSeparator();
        boletim += ("O Aluno está matriculado em: " + getCurso() + System.lineSeparator());
        if (this.verificaAprovacao(this.calculaMedia()) == "reprovado") {
            boletim += (System.lineSeparator() +
                    "Devido a política da academia, o resultado está disponivel online");
        } else if (this.verificaAprovacao(this.calculaMedia()) == "aprovado") {
            boletim += ("CPF" + super.getCpf() + System.lineSeparator() + System.lineSeparator());
            for (int i = 0; i < this.notas.length; i++) {
                boletim += " avaliacao: " + this.notas[i] + " | " + System.lineSeparator();
            }
            boletim += ("Resultado: Aprovado." + System.lineSeparator());
            boletim += ("Media final: " + this.calculaMedia());
        } else {
            boletim = "Digite uma quantidade valida de notas";
        }

        return boletim;
    }

    public String montaBoletim(boolean estagio) {
        String boletim = "Nome do Aluno: " + super.getNome() + System.lineSeparator();
        boletim += ("O Aluno está matriculado em: " + getCurso() + System.lineSeparator());
        if (estagio) {
            if (this.verificaAprovacao(this.calculaMedia(1.2)) == "reprovado") {
                boletim += (System.lineSeparator() +
                        "Devido a política da academia, o resultado está disponivel online");
            } else if (this.verificaAprovacao(this.calculaMedia(1.2)) == "aprovado") {
                boletim += ("CPF" + super.getCpf() + System.lineSeparator() + System.lineSeparator());
                for (int i = 0; i < this.notas.length; i++) {
                    boletim += " avaliacao: " + this.notas[i] + " | " + System.lineSeparator();
                }
                boletim += ("Resultado: Aprovado." + System.lineSeparator());
                boletim += ("Media final: " + this.calculaMedia(1.2));
            } else {
                boletim = "Digite uma quantidade valida de notas";
            }

            return boletim;
        } else {
            boletim += ("Reformule o estágio do aluno");
            return boletim;
        }
    }
    // #endregion
}

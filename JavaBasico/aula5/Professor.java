package aula5;

import java.lang.Math;

public class Professor extends Pessoa {
    private double salario;
    private String nomeCurso;

    // #region Encapsulamento [Getters e Setters]
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    // #endregion

    // #region Regras de Netgócios
    private double calculaSalario() {
        return Math.round((this.salario * 44) * 4.5);
    }

    public String montaHolerite() {
        String holerite;
        holerite = ("Nome do Professor: " + super.getNome() + System.lineSeparator());
        holerite += (" | CPF: " + super.getCpf() + System.lineSeparator());
        holerite += (" | Valor Hora: " + this.getSalario() + System.lineSeparator());
        holerite += (" | Curso Referente: " + this.getNomeCurso() + System.lineSeparator());
        holerite += (" | Salario Bruto:  R$ " + this.calculaSalario() + System.lineSeparator());
        holerite += (" | Valor INSS: R$ " + this.caculaINSS() + System.lineSeparator());
        holerite += (" | Valor IRPF: R$ " + this.calculaIRPF() + System.lineSeparator());
        holerite += (" | Valor adicionais: R$ " + this.calculaAdicionais()) + System.lineSeparator();
        holerite += (" | Salario Liquido: R$ " +(this.calculaSalario() + this.calculaAdicionais() - this.caculaINSS() - this.calculaIRPF()));
        return holerite;
    }

    public double caculaINSS() {
        double aliquotaInss = 0;
        if (calculaSalario() <= 1212) {
            aliquotaInss = 0.075;
        } else if (calculaSalario() > 1212 && calculaSalario() <= 2427.35) {
            aliquotaInss = 0.09;
        } else if (calculaSalario() >= 2427.36 && calculaSalario() <= 3641.03) {
            aliquotaInss = 0.12;
        } else if (calculaSalario() > 3641.03 && calculaSalario() <= 7087.22) {
            aliquotaInss = 0.14;
        }
        return aliquotaInss * calculaSalario();
    }

    public double calculaIRPF() {
        double aliquotaIrpf = 0;
        if (calculaSalario() <= 1903.98) {
            aliquotaIrpf = 0;
        } else if (calculaSalario() > 1903.99 && calculaSalario() <= 2826.65) {
            aliquotaIrpf = 0.075;
        } else if (calculaSalario() >= 2826.66 && calculaSalario() <= 3751.05) {
            aliquotaIrpf = 0.15;
        } else if (calculaSalario() > 3751.06 && calculaSalario() <= 4664.68) {
            aliquotaIrpf = 0.225;
        } else if (calculaSalario() > 4664.68) {
            aliquotaIrpf = 0.275;
        }
        return aliquotaIrpf * calculaSalario();
    }

    public double calculaAdicionais(){
        double addPlan = 0.3 * calculaSalario();
        double addDsr = 0.2 * calculaSalario();
        double adicionais = addDsr + addPlan;
        return adicionais;

    }
    // #endregion
}

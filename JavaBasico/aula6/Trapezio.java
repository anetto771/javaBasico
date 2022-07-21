package aula6;

public class Trapezio implements FormaGeometrica {
    private int baseMenor;
    private int baseMaior;
    private int altura;
    private int ladoA;
    private int ladoB;

    // #region Encapsulamento
    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    // #endregion

    @Override
    public String getNomeFigura(){
        return "Trapezio";
    }

    @Override
    public int getArea(){
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    @Override
    public int getPerimetro(){
        return (baseMaior+baseMenor+ladoA+ladoB);
    }
}

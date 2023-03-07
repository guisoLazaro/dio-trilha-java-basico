public class Calculos implements OperacoesMatematicas {

    @Override
    public double Soma(double a, double b)
    {
        return a + b;
    }
    @Override
    public double Subtracao(double a, double b)
    {
        return a - b;
    }
    @Override
    public double Multiplicacao(double a, double b)
    {
        return a * b;
    }
    @Override
    public double Divisao(double a, double b)
    {
        return a / b;
    }

}

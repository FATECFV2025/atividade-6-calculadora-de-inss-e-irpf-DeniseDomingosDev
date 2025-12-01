public class FuncionarioCLT extends Contribuinte {

    public FuncionarioCLT(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    @Override
    public double calcularINSS() {
        return salarioBruto * 0.11;
    }

    @Override
    public double calcularIRPF() {
        return salarioBruto * 0.075;
    }

    @Override
    public double calcularSalarioLiquido() {
        return salarioBruto - calcularINSS() - calcularIRPF();
    }
}

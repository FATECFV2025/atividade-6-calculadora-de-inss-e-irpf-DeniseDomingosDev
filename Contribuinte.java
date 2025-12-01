public abstract class Contribuinte implements CalculadoraTributo {

    protected String nome;
    protected String cpf;
    protected double salarioBruto;

    public Contribuinte(String nome, String cpf, double salarioBruto) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    public void exibirResumo() {
        System.out.println("===== RESUMO DO CONTRIBUINTE =====");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("INSS: " + calcularINSS());
        System.out.println("IRPF: " + calcularIRPF());
        System.out.println("Salário Líquido: " + calcularSalarioLiquido());
        System.out.println("----------------------------------\n");
    }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public double getSalarioBruto() { return salarioBruto; }
}

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;
    public Funcionario (Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void setId (Integer id){
        this.id = id;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public void setSalario (Double salario){
        this.salario = salario;
    }

    public Integer getId(){
        return id;
    };
    public String getNome(){return nome;};
    public Double getSalario(){return salario;};

    public void aumentoSario(Double porcentagem){
        this.salario += salario * (porcentagem/100);
    }


    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}

public class Veiculo{
    private String nome;
    private String placa;
    private double nivelCombustivel;
    public Veiculo(String nome, String placa){
        this.nome=nome;
        this.placa=placa;
    }
    public void setModelo(String nome){
        this.nome=nome;
    }
    public void setPlaca(String placa){
        this.placa=placa;
    }
    public void acelerar(){
        System.out.printf("%s acelerando\n",nome);
    }
    public void abastecer(){
        System.out.printf("%s Abastecendo\n",nome);
    
    

    }
}




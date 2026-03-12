
public class TesteVeiculo{
    public static void main(String[] args){
        Veiculo veiculo1=new Veiculo("Fiesta",  "PLA-4445");
       
        var veiculo2=new Veiculo("corolla", "DDD-1111");
        veiculo1.acelerar();
        veiculo1.abastecer();
        veiculo2.acelerar();
        veiculo2.abastecer();
    }

}
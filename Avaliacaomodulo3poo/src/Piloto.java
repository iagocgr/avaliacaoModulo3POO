public class Piloto {
    private String _nome;
    private String _cpf;
   

    public Piloto (String nome, String cpf) {
        _nome = nome;
        _cpf = cpf;   
    }

    public String get_nome() {
        return _nome;
    }
    public String get_cpf() {
        return _cpf;
    }
   
    
    @Override
    public String toString(){
        return "Nome: " + _nome + " CPF: " + _cpf;
    }
    
}

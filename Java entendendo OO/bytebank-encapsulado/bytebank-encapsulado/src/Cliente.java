package src;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;  


    //getters
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }


    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
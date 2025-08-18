import java.util.Scanner;
public class Funcionario {
    String nome;
    String endereco;
    int cpf;
    int telefone;
    String cargo;
    int dataAdimissao;
    int dataDeDemissao;
    String email;
    char sexo;
    String nivelDeEscolaridade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String nome) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getDataAdimissao() {
        return dataAdimissao;
    }

    public void setDataAdimissao(int dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }
    public int getDataDeDemissao() {
        return dataDeDemissao;
    }

    public void setDataDeDemissao(int dataDeDemissao) {
        this.dataDeDemissao = dataDeDemissao;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getNivelDeEscolaridade() {
        return nivelDeEscolaridade;
    }

    public void setNivelDeEscolaridade(String nivelDeEscolaridade) {
        this.nivelDeEscolaridade = nivelDeEscolaridade;
    }

}

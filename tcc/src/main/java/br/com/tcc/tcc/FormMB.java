package br.com.tcc.tcc;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class FormMB implements Serializable {

    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String mensagemValidacao;

    public FormMB() {
    }

    public void validar() {
        StringBuilder sb = new StringBuilder("");

        if (!validate()) {
            sb.append("Campos obrigatórios não informados.");
        } else {
            sb.append("Cadastro realizado com sucesso!");
        }

        this.mensagemValidacao = sb.toString();
    }

    private boolean validate() {
        return (this.nome != null && !this.nome.isEmpty()
                && this.email != null && !this.email.isEmpty()
                && this.endereco != null && !this.endereco.isEmpty()
                && this.telefone != null && !this.telefone.isEmpty());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMensagemValidacao() {
        return mensagemValidacao;
    }

    public void setMensagemValidacao(String mensagemValidacao) {
        this.mensagemValidacao = mensagemValidacao;
    }
}

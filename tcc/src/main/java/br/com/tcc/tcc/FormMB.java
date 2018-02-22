package br.com.tcc.tcc;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;

@ManagedBean
@ApplicationScoped
public class FormMB {

    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String mensagemValidacao;

    public FormMB() {
    }

    public void validar(ActionEvent actionEvent) {
        StringBuilder sb = new StringBuilder("");

        if (!validate()) {
            sb.append("Campos obrigatórios não informados.");
        } else {
            sb.append("Cadastro realizado com sucesso!");
            sb.append("Nome: ").append(this.nome).append("\n");
            sb.append("E-mail: ").append(this.email).append("\n");
            sb.append("Endereço: ").append(this.endereco).append("\n");
            sb.append("Telefone: ").append(this.telefone).append("\n");
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

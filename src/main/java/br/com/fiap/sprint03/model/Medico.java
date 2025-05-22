package br.com.fiap.sprint03.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@Document(collection = "medicos")
@Validated
public class Medico {

    @Id
    private String id;

    @NotNull
    private String nome;

    @NotNull
    @Size(max = 15, message = "O telefone não pode exceder 15 caracteres.")
    private String telefone;

    @NotNull
    @Email(message = "Email deve ser válido.")
    private String email;

    @NotNull
    @Size(min = 5, max = 15, message = "CRM deve ter entre 5 e 15 caracteres.")
    private String crm;

    public Medico() {}

    public Medico(String id, String nome, String telefone, String email, String crm) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}

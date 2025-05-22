package br.com.fiap.sprint03.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Document(collection = "pacientes")
@Validated
public class Paciente {

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
    private LocalDate dataDeNascimento;

    public Paciente(String id, String nome, String telefone, String email, LocalDate dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Paciente() {}

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

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}

package br.com.fiap.sprint03.model.DTO;

public class MedicoDTO {
    private String id;
    private String nome;
    private String telefone;
    private String email;
    private String crm;

    public MedicoDTO() {}

    public MedicoDTO(String id, String nome, String telefone, String email, String crm) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCrm() { return crm; }
    public void setCrm(String crm) { this.crm = crm; }
}
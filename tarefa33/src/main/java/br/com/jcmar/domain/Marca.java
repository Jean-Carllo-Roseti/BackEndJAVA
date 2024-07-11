package br.com.jcmar.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_MARCA")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="marca_seq")
    @SequenceGenerator(name = "marca_seq", sequenceName = "sq_marca", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", nullable = false, length = 10, unique = true)
    private String codigo;

    @Column(name = "NOME", nullable = false, length = 15)
    private String nome;

    @Column(name = "NACIONALIDADE", nullable = false, length = 15)
    private String nacionalidade;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private List<Carro> carros;

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}

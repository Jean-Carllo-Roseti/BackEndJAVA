package br.com.jcmar.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_CARRO")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", nullable = false, length = 10, unique = true)
    private String codigo;

    @Column(name = "COR", nullable = false, length = 15)
    private String cor;

    @Column(name = "ANO", nullable = false, length = 4)
    private String ano;

    @Column(name = "MODELO", nullable = false, length = 20)
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "marca_id", foreignKey = @ForeignKey(name = "fk_carros_marcas"))
    private Marca marca;

    @OneToMany
    @JoinColumn(name = "acessorio_id", foreignKey = @ForeignKey(name = "fk_carros-acessorio"))
    private List<Acessorio> acessorios;

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}

package br.com.jcmar.domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="acessorio_seq")
    @SequenceGenerator(name = "acessorio_seq", sequenceName = "sq_acessorio", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", nullable = false, length = 10, unique = true)
    private String codigo;

    @Column(name = "ALARME", nullable = false, length = 10)
    private String alarme;

    @Column(name = "AR_CONDICIONADO", nullable = false, length = 10)
    private String arCondicionado;

    @Column(name = "MOLAS_ESPORTIVAS", nullable = false, length = 10)
    private String molasEsportivas;

    @Column(name = "FAROIS_DE_LED", nullable = false, length = 10)
    private String faroisLed;

    @ManyToOne
    @JoinColumn(name = "carro_id", foreignKey = @ForeignKey(name = "fk_acessorios_carros"))
    private Carro carro;

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
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

    public String getAlarme() {
        return alarme;
    }

    public void setAlarme(String alarme) {
        this.alarme = alarme;
    }

    public String getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(String arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String getMolasEsportivas() {
        return molasEsportivas;
    }

    public void setMolasEsportivas(String molasEsportivas) {
        this.molasEsportivas = molasEsportivas;
    }

    public String getFaroisLed() {
        return faroisLed;
    }

    public void setFaroisLed(String faroisLed) {
        this.faroisLed = faroisLed;
    }
}

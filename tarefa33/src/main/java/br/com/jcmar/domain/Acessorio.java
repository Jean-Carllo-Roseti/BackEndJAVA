package br.com.jcmar.domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="acessorio_seq")
    @SequenceGenerator(name = "acessrio_seq", sequenceName = "sq_acessorio", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", nullable = false, length = 10, unique = true)
    private String codigo;

    @Column(name = "ALARME", nullable = false, length = 10)
    private String alarme;

    @Column(name = "AR_CONDICIONADO", nullable = false, length = 10)
    private String arCondicioando;

    @Column(name = "MOLAS_ESPORTIVAS", nullable = false, length = 10)
    private String molasEsportivas;

    @Column(name = "FAROIS_DE_LED", nullable = false, length = 10)
    private String faroisLed;


    @OneToMany(mappedBy = "acessorio")

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

    public String getArCondicioando() {
        return arCondicioando;
    }

    public void setArCondicioando(String arCondicioando) {
        this.arCondicioando = arCondicioando;
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

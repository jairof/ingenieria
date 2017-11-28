package com.prueba.demo.modelo;

import org.hibernate.validator.constraints.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Entity
@Table(name = "tg000001", schema = "${schema}")
public class Tg000001 implements java.io.Serializable {
    @Id
    @NotNull
    private String codBanco;
    private String nomBanco;
    private Set<Tg000008> tg000008s = new HashSet<Tg000008>(0);
    private Set<Tlp00001> tlp00001s = new HashSet<Tlp00001>(0);

    public Tg000001() {
    }

    public Tg000001(String codBanco, String nomBanco, Set<Tg000008> tg000008s,
        Set<Tlp00001> tlp00001s) {
        this.codBanco = codBanco;
        this.nomBanco = nomBanco;
        this.tg000008s = tg000008s;
        this.tlp00001s = tlp00001s;
    }

    public String getCodBanco() {
        return this.codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public String getNomBanco() {
        return this.nomBanco;
    }

    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    public Set<Tg000008> getTg000008s() {
        return this.tg000008s;
    }

    public void setTg000008s(Set<Tg000008> tg000008s) {
        this.tg000008s = tg000008s;
    }

    public Set<Tlp00001> getTlp00001s() {
        return this.tlp00001s;
    }

    public void setTlp00001s(Set<Tlp00001> tlp00001s) {
        this.tlp00001s = tlp00001s;
    }
}

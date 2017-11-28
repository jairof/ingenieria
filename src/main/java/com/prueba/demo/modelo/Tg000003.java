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
@Table(name = "tg000003", schema = "${schema}")
public class Tg000003 implements java.io.Serializable {
    @Id
    @NotNull
    private String codEmpresa;
    @NotNull
    private Tg000002 tg000002;
    @NotNull
    private Tg000006 tg000006;
    private String apartado;
    private String apeContacto;
    private Double cotizacionnoCaja;
    private Double cotizacionredondeada;
    private Double cotizacionresiduoMayor;
    private Double de16hasta17;
    private Double de4amenosde16;
    private String departamentoCargo;
    private String depto;
    private String despedida;
    private String direccion;
    private String dvemp;
    private String email;
    private String fax;
    private Date fechaPrimerPago;
    private Date fechaSegundoPago;
    private String firmadaPor;
    private Double fondoArp;
    private Double ibcnoCaja;
    private Double ibcredondeado;
    private Double ibcresiduoMayor;
    private Double masde17hasta18;
    private Double masde18hasta19;
    private Double masde19hasta20;
    private Double mayora20;
    @NotNull
    @NotEmpty
    @Size(max = 15)
    private String nit;
    private String nomContacto;
    private String nomRegistroPila;
    private String notaAlpieRecibo;
    private String numeroEmpresas;
    private String observacion;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String pagaMesActual;
    private Double porAfp;
    private Double porMoraPlanilla;
    private Double porMoraRecibo;
    private Double porcAporteSocial;
    private Double porcCaja;
    private Double porcEps;
    private Double porcIcbf;
    private Double porcIva;
    private Double porcSena;
    private String profesion;
    private String razonSocial;
    private Double riesgo1;
    private Double riesgo2;
    private Double riesgo3;
    private Double riesgo4;
    private Double riesgo5;
    private Double salarioBasico;
    private String sigla;
    private String telefono;
    private String tipoAportante;
    private String tipoDocumentoC;
    private Double valAdmon;
    private Integer valAdmonAfp;
    private Double valorMensajeriaRecibo;
    private Double valorReactivacion;
    private Double valorRetiro;
    private Set<Tg000008> tg000008s = new HashSet<Tg000008>(0);
    private Set<Tg000010> tg000010s = new HashSet<Tg000010>(0);
    private Set<Tg000011> tg000011s = new HashSet<Tg000011>(0);
    private Set<Tlp00001> tlp00001s = new HashSet<Tlp00001>(0);
    private Set<Tp000004> tp000004s = new HashSet<Tp000004>(0);
    private Set<Tr000004> tr000004s = new HashSet<Tr000004>(0);

    public Tg000003() {
    }

    public Tg000003(String codEmpresa, String apartado, String apeContacto,
        Double cotizacionnoCaja, Double cotizacionredondeada,
        Double cotizacionresiduoMayor, Double de16hasta17,
        Double de4amenosde16, String departamentoCargo, String depto,
        String despedida, String direccion, String dvemp, String email,
        String fax, Date fechaPrimerPago, Date fechaSegundoPago,
        String firmadaPor, Double fondoArp, Double ibcnoCaja,
        Double ibcredondeado, Double ibcresiduoMayor, Double masde17hasta18,
        Double masde18hasta19, Double masde19hasta20, Double mayora20,
        String nit, String nomContacto, String nomRegistroPila,
        String notaAlpieRecibo, String numeroEmpresas, String observacion,
        String pagaMesActual, Double porAfp, Double porMoraPlanilla,
        Double porMoraRecibo, Double porcAporteSocial, Double porcCaja,
        Double porcEps, Double porcIcbf, Double porcIva, Double porcSena,
        String profesion, String razonSocial, Double riesgo1, Double riesgo2,
        Double riesgo3, Double riesgo4, Double riesgo5, Double salarioBasico,
        String sigla, String telefono, Tg000002 tg000002, Tg000006 tg000006,
        Set<Tg000008> tg000008s, Set<Tg000010> tg000010s,
        Set<Tg000011> tg000011s, String tipoAportante, String tipoDocumentoC,
        Set<Tlp00001> tlp00001s, Set<Tp000004> tp000004s,
        Set<Tr000004> tr000004s, Double valAdmon, Integer valAdmonAfp,
        Double valorMensajeriaRecibo, Double valorReactivacion,
        Double valorRetiro) {
        this.codEmpresa = codEmpresa;
        this.tg000002 = tg000002;
        this.tg000006 = tg000006;
        this.apartado = apartado;
        this.apeContacto = apeContacto;
        this.cotizacionnoCaja = cotizacionnoCaja;
        this.cotizacionredondeada = cotizacionredondeada;
        this.cotizacionresiduoMayor = cotizacionresiduoMayor;
        this.de16hasta17 = de16hasta17;
        this.de4amenosde16 = de4amenosde16;
        this.departamentoCargo = departamentoCargo;
        this.depto = depto;
        this.despedida = despedida;
        this.direccion = direccion;
        this.dvemp = dvemp;
        this.email = email;
        this.fax = fax;
        this.fechaPrimerPago = fechaPrimerPago;
        this.fechaSegundoPago = fechaSegundoPago;
        this.firmadaPor = firmadaPor;
        this.fondoArp = fondoArp;
        this.ibcnoCaja = ibcnoCaja;
        this.ibcredondeado = ibcredondeado;
        this.ibcresiduoMayor = ibcresiduoMayor;
        this.masde17hasta18 = masde17hasta18;
        this.masde18hasta19 = masde18hasta19;
        this.masde19hasta20 = masde19hasta20;
        this.mayora20 = mayora20;
        this.nit = nit;
        this.nomContacto = nomContacto;
        this.nomRegistroPila = nomRegistroPila;
        this.notaAlpieRecibo = notaAlpieRecibo;
        this.numeroEmpresas = numeroEmpresas;
        this.observacion = observacion;
        this.pagaMesActual = pagaMesActual;
        this.porAfp = porAfp;
        this.porMoraPlanilla = porMoraPlanilla;
        this.porMoraRecibo = porMoraRecibo;
        this.porcAporteSocial = porcAporteSocial;
        this.porcCaja = porcCaja;
        this.porcEps = porcEps;
        this.porcIcbf = porcIcbf;
        this.porcIva = porcIva;
        this.porcSena = porcSena;
        this.profesion = profesion;
        this.razonSocial = razonSocial;
        this.riesgo1 = riesgo1;
        this.riesgo2 = riesgo2;
        this.riesgo3 = riesgo3;
        this.riesgo4 = riesgo4;
        this.riesgo5 = riesgo5;
        this.salarioBasico = salarioBasico;
        this.sigla = sigla;
        this.telefono = telefono;
        this.tipoAportante = tipoAportante;
        this.tipoDocumentoC = tipoDocumentoC;
        this.valAdmon = valAdmon;
        this.valAdmonAfp = valAdmonAfp;
        this.valorMensajeriaRecibo = valorMensajeriaRecibo;
        this.valorReactivacion = valorReactivacion;
        this.valorRetiro = valorRetiro;
        this.tg000008s = tg000008s;
        this.tg000010s = tg000010s;
        this.tg000011s = tg000011s;
        this.tlp00001s = tlp00001s;
        this.tp000004s = tp000004s;
        this.tr000004s = tr000004s;
    }

    public String getCodEmpresa() {
        return this.codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public Tg000002 getTg000002() {
        return this.tg000002;
    }

    public void setTg000002(Tg000002 tg000002) {
        this.tg000002 = tg000002;
    }

    public Tg000006 getTg000006() {
        return this.tg000006;
    }

    public void setTg000006(Tg000006 tg000006) {
        this.tg000006 = tg000006;
    }

    public String getApartado() {
        return this.apartado;
    }

    public void setApartado(String apartado) {
        this.apartado = apartado;
    }

    public String getApeContacto() {
        return this.apeContacto;
    }

    public void setApeContacto(String apeContacto) {
        this.apeContacto = apeContacto;
    }

    public Double getCotizacionnoCaja() {
        return this.cotizacionnoCaja;
    }

    public void setCotizacionnoCaja(Double cotizacionnoCaja) {
        this.cotizacionnoCaja = cotizacionnoCaja;
    }

    public Double getCotizacionredondeada() {
        return this.cotizacionredondeada;
    }

    public void setCotizacionredondeada(Double cotizacionredondeada) {
        this.cotizacionredondeada = cotizacionredondeada;
    }

    public Double getCotizacionresiduoMayor() {
        return this.cotizacionresiduoMayor;
    }

    public void setCotizacionresiduoMayor(Double cotizacionresiduoMayor) {
        this.cotizacionresiduoMayor = cotizacionresiduoMayor;
    }

    public Double getDe16hasta17() {
        return this.de16hasta17;
    }

    public void setDe16hasta17(Double de16hasta17) {
        this.de16hasta17 = de16hasta17;
    }

    public Double getDe4amenosde16() {
        return this.de4amenosde16;
    }

    public void setDe4amenosde16(Double de4amenosde16) {
        this.de4amenosde16 = de4amenosde16;
    }

    public String getDepartamentoCargo() {
        return this.departamentoCargo;
    }

    public void setDepartamentoCargo(String departamentoCargo) {
        this.departamentoCargo = departamentoCargo;
    }

    public String getDepto() {
        return this.depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDespedida() {
        return this.despedida;
    }

    public void setDespedida(String despedida) {
        this.despedida = despedida;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDvemp() {
        return this.dvemp;
    }

    public void setDvemp(String dvemp) {
        this.dvemp = dvemp;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Date getFechaPrimerPago() {
        return this.fechaPrimerPago;
    }

    public void setFechaPrimerPago(Date fechaPrimerPago) {
        this.fechaPrimerPago = fechaPrimerPago;
    }

    public Date getFechaSegundoPago() {
        return this.fechaSegundoPago;
    }

    public void setFechaSegundoPago(Date fechaSegundoPago) {
        this.fechaSegundoPago = fechaSegundoPago;
    }

    public String getFirmadaPor() {
        return this.firmadaPor;
    }

    public void setFirmadaPor(String firmadaPor) {
        this.firmadaPor = firmadaPor;
    }

    public Double getFondoArp() {
        return this.fondoArp;
    }

    public void setFondoArp(Double fondoArp) {
        this.fondoArp = fondoArp;
    }

    public Double getIbcnoCaja() {
        return this.ibcnoCaja;
    }

    public void setIbcnoCaja(Double ibcnoCaja) {
        this.ibcnoCaja = ibcnoCaja;
    }

    public Double getIbcredondeado() {
        return this.ibcredondeado;
    }

    public void setIbcredondeado(Double ibcredondeado) {
        this.ibcredondeado = ibcredondeado;
    }

    public Double getIbcresiduoMayor() {
        return this.ibcresiduoMayor;
    }

    public void setIbcresiduoMayor(Double ibcresiduoMayor) {
        this.ibcresiduoMayor = ibcresiduoMayor;
    }

    public Double getMasde17hasta18() {
        return this.masde17hasta18;
    }

    public void setMasde17hasta18(Double masde17hasta18) {
        this.masde17hasta18 = masde17hasta18;
    }

    public Double getMasde18hasta19() {
        return this.masde18hasta19;
    }

    public void setMasde18hasta19(Double masde18hasta19) {
        this.masde18hasta19 = masde18hasta19;
    }

    public Double getMasde19hasta20() {
        return this.masde19hasta20;
    }

    public void setMasde19hasta20(Double masde19hasta20) {
        this.masde19hasta20 = masde19hasta20;
    }

    public Double getMayora20() {
        return this.mayora20;
    }

    public void setMayora20(Double mayora20) {
        this.mayora20 = mayora20;
    }

    public String getNit() {
        return this.nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNomContacto() {
        return this.nomContacto;
    }

    public void setNomContacto(String nomContacto) {
        this.nomContacto = nomContacto;
    }

    public String getNomRegistroPila() {
        return this.nomRegistroPila;
    }

    public void setNomRegistroPila(String nomRegistroPila) {
        this.nomRegistroPila = nomRegistroPila;
    }

    public String getNotaAlpieRecibo() {
        return this.notaAlpieRecibo;
    }

    public void setNotaAlpieRecibo(String notaAlpieRecibo) {
        this.notaAlpieRecibo = notaAlpieRecibo;
    }

    public String getNumeroEmpresas() {
        return this.numeroEmpresas;
    }

    public void setNumeroEmpresas(String numeroEmpresas) {
        this.numeroEmpresas = numeroEmpresas;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getPagaMesActual() {
        return this.pagaMesActual;
    }

    public void setPagaMesActual(String pagaMesActual) {
        this.pagaMesActual = pagaMesActual;
    }

    public Double getPorAfp() {
        return this.porAfp;
    }

    public void setPorAfp(Double porAfp) {
        this.porAfp = porAfp;
    }

    public Double getPorMoraPlanilla() {
        return this.porMoraPlanilla;
    }

    public void setPorMoraPlanilla(Double porMoraPlanilla) {
        this.porMoraPlanilla = porMoraPlanilla;
    }

    public Double getPorMoraRecibo() {
        return this.porMoraRecibo;
    }

    public void setPorMoraRecibo(Double porMoraRecibo) {
        this.porMoraRecibo = porMoraRecibo;
    }

    public Double getPorcAporteSocial() {
        return this.porcAporteSocial;
    }

    public void setPorcAporteSocial(Double porcAporteSocial) {
        this.porcAporteSocial = porcAporteSocial;
    }

    public Double getPorcCaja() {
        return this.porcCaja;
    }

    public void setPorcCaja(Double porcCaja) {
        this.porcCaja = porcCaja;
    }

    public Double getPorcEps() {
        return this.porcEps;
    }

    public void setPorcEps(Double porcEps) {
        this.porcEps = porcEps;
    }

    public Double getPorcIcbf() {
        return this.porcIcbf;
    }

    public void setPorcIcbf(Double porcIcbf) {
        this.porcIcbf = porcIcbf;
    }

    public Double getPorcIva() {
        return this.porcIva;
    }

    public void setPorcIva(Double porcIva) {
        this.porcIva = porcIva;
    }

    public Double getPorcSena() {
        return this.porcSena;
    }

    public void setPorcSena(Double porcSena) {
        this.porcSena = porcSena;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Double getRiesgo1() {
        return this.riesgo1;
    }

    public void setRiesgo1(Double riesgo1) {
        this.riesgo1 = riesgo1;
    }

    public Double getRiesgo2() {
        return this.riesgo2;
    }

    public void setRiesgo2(Double riesgo2) {
        this.riesgo2 = riesgo2;
    }

    public Double getRiesgo3() {
        return this.riesgo3;
    }

    public void setRiesgo3(Double riesgo3) {
        this.riesgo3 = riesgo3;
    }

    public Double getRiesgo4() {
        return this.riesgo4;
    }

    public void setRiesgo4(Double riesgo4) {
        this.riesgo4 = riesgo4;
    }

    public Double getRiesgo5() {
        return this.riesgo5;
    }

    public void setRiesgo5(Double riesgo5) {
        this.riesgo5 = riesgo5;
    }

    public Double getSalarioBasico() {
        return this.salarioBasico;
    }

    public void setSalarioBasico(Double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoAportante() {
        return this.tipoAportante;
    }

    public void setTipoAportante(String tipoAportante) {
        this.tipoAportante = tipoAportante;
    }

    public String getTipoDocumentoC() {
        return this.tipoDocumentoC;
    }

    public void setTipoDocumentoC(String tipoDocumentoC) {
        this.tipoDocumentoC = tipoDocumentoC;
    }

    public Double getValAdmon() {
        return this.valAdmon;
    }

    public void setValAdmon(Double valAdmon) {
        this.valAdmon = valAdmon;
    }

    public Integer getValAdmonAfp() {
        return this.valAdmonAfp;
    }

    public void setValAdmonAfp(Integer valAdmonAfp) {
        this.valAdmonAfp = valAdmonAfp;
    }

    public Double getValorMensajeriaRecibo() {
        return this.valorMensajeriaRecibo;
    }

    public void setValorMensajeriaRecibo(Double valorMensajeriaRecibo) {
        this.valorMensajeriaRecibo = valorMensajeriaRecibo;
    }

    public Double getValorReactivacion() {
        return this.valorReactivacion;
    }

    public void setValorReactivacion(Double valorReactivacion) {
        this.valorReactivacion = valorReactivacion;
    }

    public Double getValorRetiro() {
        return this.valorRetiro;
    }

    public void setValorRetiro(Double valorRetiro) {
        this.valorRetiro = valorRetiro;
    }

    public Set<Tg000008> getTg000008s() {
        return this.tg000008s;
    }

    public void setTg000008s(Set<Tg000008> tg000008s) {
        this.tg000008s = tg000008s;
    }

    public Set<Tg000010> getTg000010s() {
        return this.tg000010s;
    }

    public void setTg000010s(Set<Tg000010> tg000010s) {
        this.tg000010s = tg000010s;
    }

    public Set<Tg000011> getTg000011s() {
        return this.tg000011s;
    }

    public void setTg000011s(Set<Tg000011> tg000011s) {
        this.tg000011s = tg000011s;
    }

    public Set<Tlp00001> getTlp00001s() {
        return this.tlp00001s;
    }

    public void setTlp00001s(Set<Tlp00001> tlp00001s) {
        this.tlp00001s = tlp00001s;
    }

    public Set<Tp000004> getTp000004s() {
        return this.tp000004s;
    }

    public void setTp000004s(Set<Tp000004> tp000004s) {
        this.tp000004s = tp000004s;
    }

    public Set<Tr000004> getTr000004s() {
        return this.tr000004s;
    }

    public void setTr000004s(Set<Tr000004> tr000004s) {
        this.tr000004s = tr000004s;
    }
}

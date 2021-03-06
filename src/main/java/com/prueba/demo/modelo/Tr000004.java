package com.prueba.demo.modelo;

import org.hibernate.validator.constraints.*;

import java.util.Date;

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
@Table(name = "tr000004", schema = "${schema}")
public class Tr000004 implements java.io.Serializable {
    @Id
    @NotNull
    private Tr000004Id id;
    @NotNull
    private Tg000003 tg000003;
    @NotNull
    private Tp000003 tp000003;
    @NotNull
    private Tp000004 tp000004;
    @NotNull
    private Tp000005 tp000005;
    @NotNull
    private Tp000006 tp000006;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String afiliacion;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String afiliacionporcobrar;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String afp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String anulado;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String arp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String caja;
    private String codBancoCheque;
    private String codBancoConsignacion;
    private String codUsuario;
    private Integer codigoPagoMes;
    private Double comisionAsesor;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String cuota;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String cuotaporcobrar;
    private Integer diasCotizadosAfp;
    private Integer diasCotizadosArp;
    private Integer diasCotizadosCaja;
    private Integer diasCotizadosEps;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String eps;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String facturado;
    private Double faltanteConsignacion;
    private Date fechaIngPagoSistema;
    private Date fechaPago;
    private Date horaIngPagoSistema;
    private Date horaPago;
    private Double ibc;
    private String idenEmpresa;
    private String identificacion;
    private String numCheque;
    private String numConsignacion;
    private String numCuentaCobro;
    private String numPersonas;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String otros;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String pagoCheque;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String pagoConsignacion;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String pagoEfectivo;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String pagoRetiro;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String pagoRetiroporcobrar;
    private String periodo;
    private String periodoRp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planilladoAfp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planilladoArp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planilladoCaja;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planilladoEps;
    private Double porcRiesgo;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String reactivacion;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String reactivacionporcobrar;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String recibPrimeraAfp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String recibPrimeraArp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String recibPrimeraCaja;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String recibPrimeraEps;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String reciboCuentaCobro;
    private Integer riesgos;
    private Double valAdmonAfprec;
    private Double valAdmonRec;
    private Double valorAfiliacion;
    private Double valorCheque;
    private Double valorConsignacion;
    private Double valorDiasCotizadosAfp;
    private Double valorDiasCotizadosArp;
    private Double valorDiasCotizadosCaja;
    private Double valorDiasCotizadosEps;
    private Double valorEfectivo;
    private Double valorFpsolidaridad;
    private Double valorFpsubsistencia;
    private Double valorIcbf;
    private Double valorMensajeriaRecibo;
    private Double valorMora;
    private Double valorOtrosServicios;
    private Double valorPagoMora;
    private Double valorPagoUpc;
    private Double valorReactivacion;
    private Double valorSalario;
    private Double valorSena;
    private Double valorTotal;
    private String valorenletras;

    public Tr000004() {
    }

    public Tr000004(Tr000004Id id, String afiliacion,
        String afiliacionporcobrar, String afp, String anulado, String arp,
        String caja, String codBancoCheque, String codBancoConsignacion,
        String codUsuario, Integer codigoPagoMes, Double comisionAsesor,
        String cuota, String cuotaporcobrar, Integer diasCotizadosAfp,
        Integer diasCotizadosArp, Integer diasCotizadosCaja,
        Integer diasCotizadosEps, String eps, String facturado,
        Double faltanteConsignacion, Date fechaIngPagoSistema, Date fechaPago,
        Date horaIngPagoSistema, Date horaPago, Double ibc, String idenEmpresa,
        String identificacion, String numCheque, String numConsignacion,
        String numCuentaCobro, String numPersonas, String otros,
        String pagoCheque, String pagoConsignacion, String pagoEfectivo,
        String pagoRetiro, String pagoRetiroporcobrar, String periodo,
        String periodoRp, String planilladoAfp, String planilladoArp,
        String planilladoCaja, String planilladoEps, Double porcRiesgo,
        String reactivacion, String reactivacionporcobrar,
        String recibPrimeraAfp, String recibPrimeraArp,
        String recibPrimeraCaja, String recibPrimeraEps,
        String reciboCuentaCobro, Integer riesgos, Tg000003 tg000003,
        Tp000003 tp000003, Tp000004 tp000004, Tp000005 tp000005,
        Tp000006 tp000006, Double valAdmonAfprec, Double valAdmonRec,
        Double valorAfiliacion, Double valorCheque, Double valorConsignacion,
        Double valorDiasCotizadosAfp, Double valorDiasCotizadosArp,
        Double valorDiasCotizadosCaja, Double valorDiasCotizadosEps,
        Double valorEfectivo, Double valorFpsolidaridad,
        Double valorFpsubsistencia, Double valorIcbf,
        Double valorMensajeriaRecibo, Double valorMora,
        Double valorOtrosServicios, Double valorPagoMora, Double valorPagoUpc,
        Double valorReactivacion, Double valorSalario, Double valorSena,
        Double valorTotal, String valorenletras) {
        this.id = id;
        this.tg000003 = tg000003;
        this.tp000003 = tp000003;
        this.tp000004 = tp000004;
        this.tp000005 = tp000005;
        this.tp000006 = tp000006;
        this.afiliacion = afiliacion;
        this.afiliacionporcobrar = afiliacionporcobrar;
        this.afp = afp;
        this.anulado = anulado;
        this.arp = arp;
        this.caja = caja;
        this.codBancoCheque = codBancoCheque;
        this.codBancoConsignacion = codBancoConsignacion;
        this.codUsuario = codUsuario;
        this.codigoPagoMes = codigoPagoMes;
        this.comisionAsesor = comisionAsesor;
        this.cuota = cuota;
        this.cuotaporcobrar = cuotaporcobrar;
        this.diasCotizadosAfp = diasCotizadosAfp;
        this.diasCotizadosArp = diasCotizadosArp;
        this.diasCotizadosCaja = diasCotizadosCaja;
        this.diasCotizadosEps = diasCotizadosEps;
        this.eps = eps;
        this.facturado = facturado;
        this.faltanteConsignacion = faltanteConsignacion;
        this.fechaIngPagoSistema = fechaIngPagoSistema;
        this.fechaPago = fechaPago;
        this.horaIngPagoSistema = horaIngPagoSistema;
        this.horaPago = horaPago;
        this.ibc = ibc;
        this.idenEmpresa = idenEmpresa;
        this.identificacion = identificacion;
        this.numCheque = numCheque;
        this.numConsignacion = numConsignacion;
        this.numCuentaCobro = numCuentaCobro;
        this.numPersonas = numPersonas;
        this.otros = otros;
        this.pagoCheque = pagoCheque;
        this.pagoConsignacion = pagoConsignacion;
        this.pagoEfectivo = pagoEfectivo;
        this.pagoRetiro = pagoRetiro;
        this.pagoRetiroporcobrar = pagoRetiroporcobrar;
        this.periodo = periodo;
        this.periodoRp = periodoRp;
        this.planilladoAfp = planilladoAfp;
        this.planilladoArp = planilladoArp;
        this.planilladoCaja = planilladoCaja;
        this.planilladoEps = planilladoEps;
        this.porcRiesgo = porcRiesgo;
        this.reactivacion = reactivacion;
        this.reactivacionporcobrar = reactivacionporcobrar;
        this.recibPrimeraAfp = recibPrimeraAfp;
        this.recibPrimeraArp = recibPrimeraArp;
        this.recibPrimeraCaja = recibPrimeraCaja;
        this.recibPrimeraEps = recibPrimeraEps;
        this.reciboCuentaCobro = reciboCuentaCobro;
        this.riesgos = riesgos;
        this.valAdmonAfprec = valAdmonAfprec;
        this.valAdmonRec = valAdmonRec;
        this.valorAfiliacion = valorAfiliacion;
        this.valorCheque = valorCheque;
        this.valorConsignacion = valorConsignacion;
        this.valorDiasCotizadosAfp = valorDiasCotizadosAfp;
        this.valorDiasCotizadosArp = valorDiasCotizadosArp;
        this.valorDiasCotizadosCaja = valorDiasCotizadosCaja;
        this.valorDiasCotizadosEps = valorDiasCotizadosEps;
        this.valorEfectivo = valorEfectivo;
        this.valorFpsolidaridad = valorFpsolidaridad;
        this.valorFpsubsistencia = valorFpsubsistencia;
        this.valorIcbf = valorIcbf;
        this.valorMensajeriaRecibo = valorMensajeriaRecibo;
        this.valorMora = valorMora;
        this.valorOtrosServicios = valorOtrosServicios;
        this.valorPagoMora = valorPagoMora;
        this.valorPagoUpc = valorPagoUpc;
        this.valorReactivacion = valorReactivacion;
        this.valorSalario = valorSalario;
        this.valorSena = valorSena;
        this.valorTotal = valorTotal;
        this.valorenletras = valorenletras;
    }

    public Tr000004Id getId() {
        return this.id;
    }

    public void setId(Tr000004Id id) {
        this.id = id;
    }

    public Tg000003 getTg000003() {
        return this.tg000003;
    }

    public void setTg000003(Tg000003 tg000003) {
        this.tg000003 = tg000003;
    }

    public Tp000003 getTp000003() {
        return this.tp000003;
    }

    public void setTp000003(Tp000003 tp000003) {
        this.tp000003 = tp000003;
    }

    public Tp000004 getTp000004() {
        return this.tp000004;
    }

    public void setTp000004(Tp000004 tp000004) {
        this.tp000004 = tp000004;
    }

    public Tp000005 getTp000005() {
        return this.tp000005;
    }

    public void setTp000005(Tp000005 tp000005) {
        this.tp000005 = tp000005;
    }

    public Tp000006 getTp000006() {
        return this.tp000006;
    }

    public void setTp000006(Tp000006 tp000006) {
        this.tp000006 = tp000006;
    }

    public String getAfiliacion() {
        return this.afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public String getAfiliacionporcobrar() {
        return this.afiliacionporcobrar;
    }

    public void setAfiliacionporcobrar(String afiliacionporcobrar) {
        this.afiliacionporcobrar = afiliacionporcobrar;
    }

    public String getAfp() {
        return this.afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getAnulado() {
        return this.anulado;
    }

    public void setAnulado(String anulado) {
        this.anulado = anulado;
    }

    public String getArp() {
        return this.arp;
    }

    public void setArp(String arp) {
        this.arp = arp;
    }

    public String getCaja() {
        return this.caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getCodBancoCheque() {
        return this.codBancoCheque;
    }

    public void setCodBancoCheque(String codBancoCheque) {
        this.codBancoCheque = codBancoCheque;
    }

    public String getCodBancoConsignacion() {
        return this.codBancoConsignacion;
    }

    public void setCodBancoConsignacion(String codBancoConsignacion) {
        this.codBancoConsignacion = codBancoConsignacion;
    }

    public String getCodUsuario() {
        return this.codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodigoPagoMes() {
        return this.codigoPagoMes;
    }

    public void setCodigoPagoMes(Integer codigoPagoMes) {
        this.codigoPagoMes = codigoPagoMes;
    }

    public Double getComisionAsesor() {
        return this.comisionAsesor;
    }

    public void setComisionAsesor(Double comisionAsesor) {
        this.comisionAsesor = comisionAsesor;
    }

    public String getCuota() {
        return this.cuota;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    public String getCuotaporcobrar() {
        return this.cuotaporcobrar;
    }

    public void setCuotaporcobrar(String cuotaporcobrar) {
        this.cuotaporcobrar = cuotaporcobrar;
    }

    public Integer getDiasCotizadosAfp() {
        return this.diasCotizadosAfp;
    }

    public void setDiasCotizadosAfp(Integer diasCotizadosAfp) {
        this.diasCotizadosAfp = diasCotizadosAfp;
    }

    public Integer getDiasCotizadosArp() {
        return this.diasCotizadosArp;
    }

    public void setDiasCotizadosArp(Integer diasCotizadosArp) {
        this.diasCotizadosArp = diasCotizadosArp;
    }

    public Integer getDiasCotizadosCaja() {
        return this.diasCotizadosCaja;
    }

    public void setDiasCotizadosCaja(Integer diasCotizadosCaja) {
        this.diasCotizadosCaja = diasCotizadosCaja;
    }

    public Integer getDiasCotizadosEps() {
        return this.diasCotizadosEps;
    }

    public void setDiasCotizadosEps(Integer diasCotizadosEps) {
        this.diasCotizadosEps = diasCotizadosEps;
    }

    public String getEps() {
        return this.eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getFacturado() {
        return this.facturado;
    }

    public void setFacturado(String facturado) {
        this.facturado = facturado;
    }

    public Double getFaltanteConsignacion() {
        return this.faltanteConsignacion;
    }

    public void setFaltanteConsignacion(Double faltanteConsignacion) {
        this.faltanteConsignacion = faltanteConsignacion;
    }

    public Date getFechaIngPagoSistema() {
        return this.fechaIngPagoSistema;
    }

    public void setFechaIngPagoSistema(Date fechaIngPagoSistema) {
        this.fechaIngPagoSistema = fechaIngPagoSistema;
    }

    public Date getFechaPago() {
        return this.fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getHoraIngPagoSistema() {
        return this.horaIngPagoSistema;
    }

    public void setHoraIngPagoSistema(Date horaIngPagoSistema) {
        this.horaIngPagoSistema = horaIngPagoSistema;
    }

    public Date getHoraPago() {
        return this.horaPago;
    }

    public void setHoraPago(Date horaPago) {
        this.horaPago = horaPago;
    }

    public Double getIbc() {
        return this.ibc;
    }

    public void setIbc(Double ibc) {
        this.ibc = ibc;
    }

    public String getIdenEmpresa() {
        return this.idenEmpresa;
    }

    public void setIdenEmpresa(String idenEmpresa) {
        this.idenEmpresa = idenEmpresa;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNumCheque() {
        return this.numCheque;
    }

    public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
    }

    public String getNumConsignacion() {
        return this.numConsignacion;
    }

    public void setNumConsignacion(String numConsignacion) {
        this.numConsignacion = numConsignacion;
    }

    public String getNumCuentaCobro() {
        return this.numCuentaCobro;
    }

    public void setNumCuentaCobro(String numCuentaCobro) {
        this.numCuentaCobro = numCuentaCobro;
    }

    public String getNumPersonas() {
        return this.numPersonas;
    }

    public void setNumPersonas(String numPersonas) {
        this.numPersonas = numPersonas;
    }

    public String getOtros() {
        return this.otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getPagoCheque() {
        return this.pagoCheque;
    }

    public void setPagoCheque(String pagoCheque) {
        this.pagoCheque = pagoCheque;
    }

    public String getPagoConsignacion() {
        return this.pagoConsignacion;
    }

    public void setPagoConsignacion(String pagoConsignacion) {
        this.pagoConsignacion = pagoConsignacion;
    }

    public String getPagoEfectivo() {
        return this.pagoEfectivo;
    }

    public void setPagoEfectivo(String pagoEfectivo) {
        this.pagoEfectivo = pagoEfectivo;
    }

    public String getPagoRetiro() {
        return this.pagoRetiro;
    }

    public void setPagoRetiro(String pagoRetiro) {
        this.pagoRetiro = pagoRetiro;
    }

    public String getPagoRetiroporcobrar() {
        return this.pagoRetiroporcobrar;
    }

    public void setPagoRetiroporcobrar(String pagoRetiroporcobrar) {
        this.pagoRetiroporcobrar = pagoRetiroporcobrar;
    }

    public String getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodoRp() {
        return this.periodoRp;
    }

    public void setPeriodoRp(String periodoRp) {
        this.periodoRp = periodoRp;
    }

    public String getPlanilladoAfp() {
        return this.planilladoAfp;
    }

    public void setPlanilladoAfp(String planilladoAfp) {
        this.planilladoAfp = planilladoAfp;
    }

    public String getPlanilladoArp() {
        return this.planilladoArp;
    }

    public void setPlanilladoArp(String planilladoArp) {
        this.planilladoArp = planilladoArp;
    }

    public String getPlanilladoCaja() {
        return this.planilladoCaja;
    }

    public void setPlanilladoCaja(String planilladoCaja) {
        this.planilladoCaja = planilladoCaja;
    }

    public String getPlanilladoEps() {
        return this.planilladoEps;
    }

    public void setPlanilladoEps(String planilladoEps) {
        this.planilladoEps = planilladoEps;
    }

    public Double getPorcRiesgo() {
        return this.porcRiesgo;
    }

    public void setPorcRiesgo(Double porcRiesgo) {
        this.porcRiesgo = porcRiesgo;
    }

    public String getReactivacion() {
        return this.reactivacion;
    }

    public void setReactivacion(String reactivacion) {
        this.reactivacion = reactivacion;
    }

    public String getReactivacionporcobrar() {
        return this.reactivacionporcobrar;
    }

    public void setReactivacionporcobrar(String reactivacionporcobrar) {
        this.reactivacionporcobrar = reactivacionporcobrar;
    }

    public String getRecibPrimeraAfp() {
        return this.recibPrimeraAfp;
    }

    public void setRecibPrimeraAfp(String recibPrimeraAfp) {
        this.recibPrimeraAfp = recibPrimeraAfp;
    }

    public String getRecibPrimeraArp() {
        return this.recibPrimeraArp;
    }

    public void setRecibPrimeraArp(String recibPrimeraArp) {
        this.recibPrimeraArp = recibPrimeraArp;
    }

    public String getRecibPrimeraCaja() {
        return this.recibPrimeraCaja;
    }

    public void setRecibPrimeraCaja(String recibPrimeraCaja) {
        this.recibPrimeraCaja = recibPrimeraCaja;
    }

    public String getRecibPrimeraEps() {
        return this.recibPrimeraEps;
    }

    public void setRecibPrimeraEps(String recibPrimeraEps) {
        this.recibPrimeraEps = recibPrimeraEps;
    }

    public String getReciboCuentaCobro() {
        return this.reciboCuentaCobro;
    }

    public void setReciboCuentaCobro(String reciboCuentaCobro) {
        this.reciboCuentaCobro = reciboCuentaCobro;
    }

    public Integer getRiesgos() {
        return this.riesgos;
    }

    public void setRiesgos(Integer riesgos) {
        this.riesgos = riesgos;
    }

    public Double getValAdmonAfprec() {
        return this.valAdmonAfprec;
    }

    public void setValAdmonAfprec(Double valAdmonAfprec) {
        this.valAdmonAfprec = valAdmonAfprec;
    }

    public Double getValAdmonRec() {
        return this.valAdmonRec;
    }

    public void setValAdmonRec(Double valAdmonRec) {
        this.valAdmonRec = valAdmonRec;
    }

    public Double getValorAfiliacion() {
        return this.valorAfiliacion;
    }

    public void setValorAfiliacion(Double valorAfiliacion) {
        this.valorAfiliacion = valorAfiliacion;
    }

    public Double getValorCheque() {
        return this.valorCheque;
    }

    public void setValorCheque(Double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public Double getValorConsignacion() {
        return this.valorConsignacion;
    }

    public void setValorConsignacion(Double valorConsignacion) {
        this.valorConsignacion = valorConsignacion;
    }

    public Double getValorDiasCotizadosAfp() {
        return this.valorDiasCotizadosAfp;
    }

    public void setValorDiasCotizadosAfp(Double valorDiasCotizadosAfp) {
        this.valorDiasCotizadosAfp = valorDiasCotizadosAfp;
    }

    public Double getValorDiasCotizadosArp() {
        return this.valorDiasCotizadosArp;
    }

    public void setValorDiasCotizadosArp(Double valorDiasCotizadosArp) {
        this.valorDiasCotizadosArp = valorDiasCotizadosArp;
    }

    public Double getValorDiasCotizadosCaja() {
        return this.valorDiasCotizadosCaja;
    }

    public void setValorDiasCotizadosCaja(Double valorDiasCotizadosCaja) {
        this.valorDiasCotizadosCaja = valorDiasCotizadosCaja;
    }

    public Double getValorDiasCotizadosEps() {
        return this.valorDiasCotizadosEps;
    }

    public void setValorDiasCotizadosEps(Double valorDiasCotizadosEps) {
        this.valorDiasCotizadosEps = valorDiasCotizadosEps;
    }

    public Double getValorEfectivo() {
        return this.valorEfectivo;
    }

    public void setValorEfectivo(Double valorEfectivo) {
        this.valorEfectivo = valorEfectivo;
    }

    public Double getValorFpsolidaridad() {
        return this.valorFpsolidaridad;
    }

    public void setValorFpsolidaridad(Double valorFpsolidaridad) {
        this.valorFpsolidaridad = valorFpsolidaridad;
    }

    public Double getValorFpsubsistencia() {
        return this.valorFpsubsistencia;
    }

    public void setValorFpsubsistencia(Double valorFpsubsistencia) {
        this.valorFpsubsistencia = valorFpsubsistencia;
    }

    public Double getValorIcbf() {
        return this.valorIcbf;
    }

    public void setValorIcbf(Double valorIcbf) {
        this.valorIcbf = valorIcbf;
    }

    public Double getValorMensajeriaRecibo() {
        return this.valorMensajeriaRecibo;
    }

    public void setValorMensajeriaRecibo(Double valorMensajeriaRecibo) {
        this.valorMensajeriaRecibo = valorMensajeriaRecibo;
    }

    public Double getValorMora() {
        return this.valorMora;
    }

    public void setValorMora(Double valorMora) {
        this.valorMora = valorMora;
    }

    public Double getValorOtrosServicios() {
        return this.valorOtrosServicios;
    }

    public void setValorOtrosServicios(Double valorOtrosServicios) {
        this.valorOtrosServicios = valorOtrosServicios;
    }

    public Double getValorPagoMora() {
        return this.valorPagoMora;
    }

    public void setValorPagoMora(Double valorPagoMora) {
        this.valorPagoMora = valorPagoMora;
    }

    public Double getValorPagoUpc() {
        return this.valorPagoUpc;
    }

    public void setValorPagoUpc(Double valorPagoUpc) {
        this.valorPagoUpc = valorPagoUpc;
    }

    public Double getValorReactivacion() {
        return this.valorReactivacion;
    }

    public void setValorReactivacion(Double valorReactivacion) {
        this.valorReactivacion = valorReactivacion;
    }

    public Double getValorSalario() {
        return this.valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Double getValorSena() {
        return this.valorSena;
    }

    public void setValorSena(Double valorSena) {
        this.valorSena = valorSena;
    }

    public Double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getValorenletras() {
        return this.valorenletras;
    }

    public void setValorenletras(String valorenletras) {
        this.valorenletras = valorenletras;
    }
}

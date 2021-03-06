package com.prueba.demo.modelo.control;

import com.prueba.demo.dataaccess.dao.*;
import com.prueba.demo.dto.mapper.ITlp00001Mapper;
import com.prueba.demo.exceptions.*;
import com.prueba.demo.modelo.*;
import com.prueba.demo.modelo.dto.Tlp00001DTO;
import com.prueba.demo.utilities.Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Scope("singleton")
@Service("Tlp00001Logic")
public class Tlp00001Logic implements ITlp00001Logic {
    private static final Logger log = LoggerFactory.getLogger(Tlp00001Logic.class);

    /**
     * DAO injected by Spring that manages Tlp00001 entities
     *
     */
    @Autowired
    private ITlp00001DAO tlp00001DAO;
    @Autowired
    private ITlp00001Mapper tlp00001Mapper;
    @Autowired
    private Validator validator;

    /**
    * Logic injected by Spring that manages Tg000001 entities
    *
    */
    @Autowired
    ITg000001Logic logicTg0000011;

    /**
    * Logic injected by Spring that manages Tg000003 entities
    *
    */
    @Autowired
    ITg000003Logic logicTg0000032;

    /**
    * Logic injected by Spring that manages Tg000026 entities
    *
    */
    @Autowired
    ITg000026Logic logicTg0000263;

    public void validateTlp00001(Tlp00001 tlp00001) throws Exception {
        try {
            Set<ConstraintViolation<Tlp00001>> constraintViolations = validator.validate(tlp00001);

            if (constraintViolations.size() > 0) {
                StringBuilder strMessage = new StringBuilder();

                for (ConstraintViolation<Tlp00001> constraintViolation : constraintViolations) {
                    strMessage.append(constraintViolation.getPropertyPath()
                                                         .toString());
                    strMessage.append(" - ");
                    strMessage.append(constraintViolation.getMessage());
                    strMessage.append(". \n");
                }

                throw new Exception(strMessage.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tlp00001> getTlp00001() throws Exception {
        log.debug("finding all Tlp00001 instances");

        List<Tlp00001> list = new ArrayList<Tlp00001>();

        try {
            list = tlp00001DAO.findAll();
        } catch (Exception e) {
            log.error("finding all Tlp00001 failed", e);
            throw new ZMessManager().new GettingException(ZMessManager.ALL +
                "Tlp00001");
        } finally {
        }

        return list;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveTlp00001(Tlp00001 entity) throws Exception {
        log.debug("saving Tlp00001 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tlp00001");
            }

            validateTlp00001(entity);

            if (getTlp00001(entity.getId()) != null) {
                throw new ZMessManager(ZMessManager.ENTITY_WITHSAMEKEY);
            }

            tlp00001DAO.save(entity);

            log.debug("save Tlp00001 successful");
        } catch (Exception e) {
            log.error("save Tlp00001 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void deleteTlp00001(Tlp00001 entity) throws Exception {
        log.debug("deleting Tlp00001 instance");

        if (entity == null) {
            throw new ZMessManager().new NullEntityExcepcion("Tlp00001");
        }

        if (entity.getId().getNumPlanilla() == null) {
            throw new ZMessManager().new EmptyFieldException("numPlanilla");
        }

        if (entity.getId().getCodEmpresa() == null) {
            throw new ZMessManager().new EmptyFieldException("codEmpresa");
        }

        try {
            tlp00001DAO.delete(entity);

            log.debug("delete Tlp00001 successful");
        } catch (Exception e) {
            log.error("delete Tlp00001 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void updateTlp00001(Tlp00001 entity) throws Exception {
        log.debug("updating Tlp00001 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tlp00001");
            }

            validateTlp00001(entity);

            tlp00001DAO.update(entity);

            log.debug("update Tlp00001 successful");
        } catch (Exception e) {
            log.error("update Tlp00001 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = true)
    public List<Tlp00001DTO> getDataTlp00001() throws Exception {
        try {
            List<Tlp00001> tlp00001 = tlp00001DAO.findAll();

            List<Tlp00001DTO> tlp00001DTO = new ArrayList<Tlp00001DTO>();

            for (Tlp00001 tlp00001Tmp : tlp00001) {
                Tlp00001DTO tlp00001DTO2 = tlp00001Mapper.tlp00001ToTlp00001DTO(tlp00001Tmp);
                tlp00001DTO.add(tlp00001DTO2);
            }

            return tlp00001DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tlp00001 getTlp00001(Tlp00001Id id) throws Exception {
        log.debug("getting Tlp00001 instance");

        Tlp00001 entity = null;

        try {
            entity = tlp00001DAO.findById(id);
        } catch (Exception e) {
            log.error("get Tlp00001 failed", e);
            throw new ZMessManager().new FindingException("Tlp00001");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public List<Tlp00001> findPageTlp00001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        List<Tlp00001> entity = null;

        try {
            entity = tlp00001DAO.findPage(sortColumnName, sortAscending,
                    startRow, maxResults);
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tlp00001 Count");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public Long findTotalNumberTlp00001() throws Exception {
        Long entity = null;

        try {
            entity = tlp00001DAO.count();
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tlp00001 Count");
        } finally {
        }

        return entity;
    }

    /**
    *
    * @param varibles
    *            este arreglo debera tener:
    *
    * [0] = String variable = (String) varibles[i]; representa como se llama la
    * variable en el pojo
    *
    * [1] = Boolean booVariable = (Boolean) varibles[i + 1]; representa si el
    * valor necesita o no ''(comillas simples)usado para campos de tipo string
    *
    * [2] = Object value = varibles[i + 2]; representa el valor que se va a
    * buscar en la BD
    *
    * [3] = String comparator = (String) varibles[i + 3]; representa que tipo
    * de busqueda voy a hacer.., ejemplo: where nombre=william o where nombre<>william,
        * en este campo iria el tipo de comparador que quiero si es = o <>
            *
            * Se itera de 4 en 4..., entonces 4 registros del arreglo representan 1
            * busqueda en un campo, si se ponen mas pues el continuara buscando en lo
            * que se le ingresen en los otros 4
            *
            *
            * @param variablesBetween
            *
            * la diferencia son estas dos posiciones
            *
            * [0] = String variable = (String) varibles[j]; la variable ne la BD que va
            * a ser buscada en un rango
            *
            * [1] = Object value = varibles[j + 1]; valor 1 para buscar en un rango
            *
            * [2] = Object value2 = varibles[j + 2]; valor 2 para buscar en un rango
            * ejempolo: a > 1 and a < 5 --> 1 seria value y 5 seria value2
                *
                * [3] = String comparator1 = (String) varibles[j + 3]; comparador 1
                * ejemplo: a comparator1 1 and a < 5
                    *
                    * [4] = String comparator2 = (String) varibles[j + 4]; comparador 2
                    * ejemplo: a comparador1>1  and a comparador2<5  (el original: a > 1 and a <
                            * 5) *
                            * @param variablesBetweenDates(en
                            *            este caso solo para mysql)
                            *  [0] = String variable = (String) varibles[k]; el nombre de la variable que hace referencia a
                            *            una fecha
                            *
                            * [1] = Object object1 = varibles[k + 2]; fecha 1 a comparar(deben ser
                            * dates)
                            *
                            * [2] = Object object2 = varibles[k + 3]; fecha 2 a comparar(deben ser
                            * dates)
                            *
                            * esto hace un between entre las dos fechas.
                            *
                            * @return lista con los objetos que se necesiten
                            * @throws Exception
                            */
    @Transactional(readOnly = true)
    public List<Tlp00001> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        List<Tlp00001> list = new ArrayList<Tlp00001>();
        String where = new String();
        String tempWhere = new String();

        if (variables != null) {
            for (int i = 0; i < variables.length; i++) {
                if ((variables[i] != null) && (variables[i + 1] != null) &&
                        (variables[i + 2] != null) &&
                        (variables[i + 3] != null)) {
                    String variable = (String) variables[i];
                    Boolean booVariable = (Boolean) variables[i + 1];
                    Object value = variables[i + 2];
                    String comparator = (String) variables[i + 3];

                    if (booVariable.booleanValue()) {
                        tempWhere = (tempWhere.length() == 0)
                            ? ("(model." + variable + " " + comparator + " \'" +
                            value + "\' )")
                            : (tempWhere + " AND (model." + variable + " " +
                            comparator + " \'" + value + "\' )");
                    } else {
                        tempWhere = (tempWhere.length() == 0)
                            ? ("(model." + variable + " " + comparator + " " +
                            value + " )")
                            : (tempWhere + " AND (model." + variable + " " +
                            comparator + " " + value + " )");
                    }
                }

                i = i + 3;
            }
        }

        if (variablesBetween != null) {
            for (int j = 0; j < variablesBetween.length; j++) {
                if ((variablesBetween[j] != null) &&
                        (variablesBetween[j + 1] != null) &&
                        (variablesBetween[j + 2] != null) &&
                        (variablesBetween[j + 3] != null) &&
                        (variablesBetween[j + 4] != null)) {
                    String variable = (String) variablesBetween[j];
                    Object value = variablesBetween[j + 1];
                    Object value2 = variablesBetween[j + 2];
                    String comparator1 = (String) variablesBetween[j + 3];
                    String comparator2 = (String) variablesBetween[j + 4];
                    tempWhere = (tempWhere.length() == 0)
                        ? ("(" + value + " " + comparator1 + " " + variable +
                        " and " + variable + " " + comparator2 + " " + value2 +
                        " )")
                        : (tempWhere + " AND (" + value + " " + comparator1 +
                        " " + variable + " and " + variable + " " +
                        comparator2 + " " + value2 + " )");
                }

                j = j + 4;
            }
        }

        if (variablesBetweenDates != null) {
            for (int k = 0; k < variablesBetweenDates.length; k++) {
                if ((variablesBetweenDates[k] != null) &&
                        (variablesBetweenDates[k + 1] != null) &&
                        (variablesBetweenDates[k + 2] != null)) {
                    String variable = (String) variablesBetweenDates[k];
                    Object object1 = variablesBetweenDates[k + 1];
                    Object object2 = variablesBetweenDates[k + 2];
                    String value = null;
                    String value2 = null;

                    try {
                        Date date1 = (Date) object1;
                        Date date2 = (Date) object2;
                        value = Utilities.formatDateWithoutTimeInAStringForBetweenWhere(date1);
                        value2 = Utilities.formatDateWithoutTimeInAStringForBetweenWhere(date2);
                    } catch (Exception e) {
                        list = null;
                        throw e;
                    }

                    tempWhere = (tempWhere.length() == 0)
                        ? ("(model." + variable + " between " + value +
                        " and " + value2 + ")")
                        : (tempWhere + " AND (model." + variable + " between " +
                        value + " and " + value2 + ")");
                }

                k = k + 2;
            }
        }

        if (tempWhere.length() == 0) {
            where = null;
        } else {
            where = "(" + tempWhere + ")";
        }

        try {
            list = tlp00001DAO.findByCriteria(where);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } finally {
        }

        return list;
    }
}

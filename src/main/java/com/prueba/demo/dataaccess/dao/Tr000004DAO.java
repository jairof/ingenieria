package com.prueba.demo.dataaccess.dao;

import com.prueba.demo.dataaccess.api.HibernateDaoImpl;
import com.prueba.demo.modelo.Tr000004;
import com.prueba.demo.modelo.Tr000004Id;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.hibernate.criterion.Example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tr000004 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tr000004
 */
@Scope("singleton")
@Repository("Tr000004DAO")
public class Tr000004DAO extends HibernateDaoImpl<Tr000004, Tr000004Id>
    implements ITr000004DAO {
    private static final Logger log = LoggerFactory.getLogger(Tr000004DAO.class);
    @Resource
    private SessionFactory sessionFactory;

    public static ITr000004DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITr000004DAO) ctx.getBean("Tr000004DAO");
    }
}

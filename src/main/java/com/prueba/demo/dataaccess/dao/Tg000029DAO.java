package com.prueba.demo.dataaccess.dao;

import com.prueba.demo.dataaccess.api.HibernateDaoImpl;
import com.prueba.demo.modelo.Tg000029;

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
 * Tg000029 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tg000029
 */
@Scope("singleton")
@Repository("Tg000029DAO")
public class Tg000029DAO extends HibernateDaoImpl<Tg000029, String>
    implements ITg000029DAO {
    private static final Logger log = LoggerFactory.getLogger(Tg000029DAO.class);
    @Resource
    private SessionFactory sessionFactory;

    public static ITg000029DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITg000029DAO) ctx.getBean("Tg000029DAO");
    }
}

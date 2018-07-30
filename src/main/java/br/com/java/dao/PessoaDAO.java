/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.dao;

import br.com.java.domain.HibernateUtil;
import br.com.java.domain.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;

/**
 *
 * @author henrique
 */
public class PessoaDAO {

    public void addPessoa(Pessoa pessoa) throws Exception {
        EntityManager em = HibernateUtil.getEntityManagerFactory()
                .createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(pessoa);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();

            throw new Exception(e);
        } finally {
            em.close();
        }
    }

    public Pessoa seleciona(long id) throws Exception {
        Pessoa pessoa;

        EntityManager em = HibernateUtil.getEntityManagerFactory()
                .createEntityManager();

        try {
            pessoa = em.find(Pessoa.class, id);
        } finally {
            em.close();
        }

        return pessoa;
    }

    @SuppressWarnings("unchecked")
    public List<Pessoa> listaPessoa() throws Exception {
        List<Pessoa> list = new ArrayList<Pessoa>();
//        Session s = HibernateUtil.getEntityManagerFactory().;
//        s.beginTransaction();

        EntityManager em = HibernateUtil.getEntityManagerFactory()
                .createEntityManager();

        try {
            em.getTransaction().begin();
//            em.persist(pessoa);
            list = em.createQuery("from Pessoa").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();

            throw new Exception(e);
        } finally {
            em.close();
            return list;
        }

    }


    public void removePessoa(Integer id) throws Exception {
        EntityManager em = HibernateUtil.getEntityManagerFactory()
                .createEntityManager();
        em.getTransaction().begin();
        Pessoa c = (Pessoa) em.find(Pessoa.class, id);
        em.remove(c);
        em.getTransaction().commit();
        em.close();

    }

//    public void updatePessoa(Pessoa pessoa)  throws IOException {
//        Session s = HibernateUtil.getSessionFactory().openSession();
//        s.beginTransaction();
//        s.update(pessoa);
//        s.getTransaction().commit();
//        s.close();
//    }
}

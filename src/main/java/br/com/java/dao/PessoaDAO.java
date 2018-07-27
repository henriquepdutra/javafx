/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.dao;

import br.com.java.domain.HibernateUtil;
import br.com.java.domain.Pessoa;
import javax.persistence.EntityManager;

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

//    public void addPessoa(Pessoa pessoa) throws IOException {
//
//        Session s = HibernateUtil.getSessionFactory().openSession();
//        s.beginTransaction();
//        s.save(pessoa);
//        s.getTransaction().commit();
//        s.close();
//
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<Pessoa> listPessoa()  throws IOException {
//        List<Pessoa> list = new ArrayList<Pessoa>();
//        Session s = HibernateUtil.getSessionFactory().openSession();
//        s.beginTransaction();
//        list = s.createQuery("from Pessoa").list();
//        s.getTransaction().commit();
//        s.close();
//        return list;
//    }
//
//    public void removePessoa(Integer id)  throws IOException {
//        Session s = HibernateUtil.getSessionFactory().openSession();
//        s.beginTransaction();
//        Pessoa c = (Pessoa) s.load(Pessoa.class, id);
//        s.delete(c);
//        s.delete(c);
//        s.getTransaction().commit();
//        s.close();
//
//    }
//
//    public void updatePessoa(Pessoa pessoa)  throws IOException {
//        Session s = HibernateUtil.getSessionFactory().openSession();
//        s.beginTransaction();
//        s.update(pessoa);
//        s.getTransaction().commit();
//        s.close();
//    }
}

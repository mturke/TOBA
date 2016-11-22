
package toba.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import toba.newcustomer.User;

public class UserDB {
    public static void insert(User user){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(user);
            trans.commit();
        }
        catch(Exception e){
            System.out.println(e);
            trans.rollback();
        }
        finally{
            em.close();
        }
    }
    
    public static void update(User user) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(user);
            trans.commit();
        }
        catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        }
        finally {
            em.close();
            
        }
    }
    
    public static User get(String username){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT u FROM User u " +
                         "WHERE u.username = :username";
        User user = null;
        try {
            TypedQuery<User> q = em.createQuery(qString, User.class);
            q.setParameter("username", username);
        
            user = q.getSingleResult();
        }
        catch (NoResultException e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        }
        finally {
            em.close();
        }
        return user;
    }
}

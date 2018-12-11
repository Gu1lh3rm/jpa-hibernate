package repositories.persistence;

import domain.common.EntidadeBase;

import javax.persistence.EntityManager;

public class JpaGeneric<T extends EntidadeBase> {

    public static EntityManager entityManager = ConnectionFactory.getEntityManager();


    public T findById(Class<T> clazz, Long id){
        T t = null;
        try{
            t = entityManager.find(clazz, id);
        } finally {
            entityManager.close();
        }
        return t;
    }

    public T save(T obj) throws Exception{
        try{
            entityManager.getTransaction().begin();
            if(obj.getId() == null){
                entityManager.persist(obj);
            }else{
                if(!entityManager.contains(obj)) {
                    if(entityManager.find(obj.getClass(), obj.getId()) == null)
                        throw new Exception("Erro ao salvar");
                }
                entityManager.merge(obj);
            }
            entityManager.getTransaction().commit();
        }catch(Exception e){
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return obj;
    }

    public void remove(Class<T> clazz, Long id){
        T t = findById(clazz, id);
        try{
            entityManager.getTransaction().begin();
            entityManager.remove(t);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }
}

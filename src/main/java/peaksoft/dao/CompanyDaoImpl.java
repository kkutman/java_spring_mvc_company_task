package peaksoft.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import peaksoft.models.Company;

import java.util.List;

/**
 * name : kutman
 **/
@Repository
@Transactional
@EnableTransactionManagement
public class CompanyDaoImpl implements CompanyDao{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void save(Company company) {
        entityManager.persist(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return entityManager.createQuery("select c from Company  c", Company.class).getResultList();
    }

    @Override
    public Company getCompanyById(Long id) {

        return null;
    }

    @Override
    public void deleteCompany(Long id) {
        entityManager.remove(entityManager.find(Company.class,id));;
    }

    @Override
    public void updateCompany(Long id, Company updatedCompany) {
        entityManager.createQuery("update Company set name = :name , image = :img , country = :count", Company.class)
                .setParameter("name",updatedCompany.getName())
                .setParameter("img",updatedCompany.getImage())
                .setParameter("count",updatedCompany.getCountry())
                .executeUpdate();
    }
}

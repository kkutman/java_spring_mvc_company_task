package peaksoft.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.dao.CompanyDao;
import peaksoft.models.Company;

import java.util.List;

/**
 * name : kutman
 **/
@Service
public class CompanyServicesImpl implements CompanyServices{
    private final CompanyDao companyDao;

    @Autowired
    public CompanyServicesImpl(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    public void save(Company company) {
        companyDao.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyDao.getAllCompanies();
    }

    @Override
    public Company getCompanyById(Long id) {
        return null;
    }

    @Override
    public void deleteCompany(Long id) {
        companyDao.deleteCompany(id);
    }

    @Override
    public void updateCompany(Long id, Company updatedCompany) {
        companyDao.updateCompany(id,updatedCompany);
    }
}

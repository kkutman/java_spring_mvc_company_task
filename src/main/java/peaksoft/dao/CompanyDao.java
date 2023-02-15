package peaksoft.dao;

import peaksoft.models.Company;

import java.util.List;

/**
 * name : kutman
 **/
public interface CompanyDao {
    void save(Company company);
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
    void deleteCompany(Long id);
    void updateCompany( Long id,Company updatedCompany);
}

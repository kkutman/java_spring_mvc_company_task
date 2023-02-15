package peaksoft.services;

import peaksoft.models.Company;

import java.util.List;

/**
 * name : kutman
 **/
public interface CompanyServices {
    void save(Company company);
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
    void deleteCompany(Long id);
    void updateCompany(Long id, Company updatedCompany);
}

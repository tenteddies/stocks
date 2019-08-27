package spring.project.stockTrading.service;

import spring.project.stockModel.model.Company;
import spring.project.stockModel.repository.CompanyRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class companyService implements ICompanyRepository {

    @Autowired
    private CompanyRepository repository;

    @Override
    public List<Company> findAll() {

        return (List<Company>) repository.findAll();
    }
}
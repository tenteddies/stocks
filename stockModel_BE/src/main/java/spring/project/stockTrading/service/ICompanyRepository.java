package spring.project.stockTrading.service;

import java.util.List;

import spring.project.stockModel.model.Company;

public interface ICompanyRepository {
	List<Company> findAll();

}

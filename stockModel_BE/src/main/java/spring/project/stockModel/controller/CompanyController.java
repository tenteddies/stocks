package spring.project.stockModel.controller;


import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.project.stockModel.repository.CompanyRepository;
import spring.project.stockModel.exception.CompanyNotFoundException;
import spring.project.stockModel.model.Company;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/")
public class CompanyController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final CompanyRepository companyRepository;

	public CompanyController(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Company> getAllRttmVars() {
		LOG.info("Getting all variables.");
		return (List<Company>) companyRepository.findAll();
	}

/*	@PutMapping("/company/{id}")
	@RequestMapping(value = "/{id}", produces = "application/json",  method = RequestMethod.PUT)
	public Company updateCompany(@PathVariable(value = "id")Long id, @Valid @RequestBody Company comp1)
	{
		Company company = companyRepository.findById(id).orElseThrow(() -> new CompanyNotFoundException(id));
		company.setPrice(comp1.getPrice());
		
		Company updatedCompany = companyRepository.save(company);
		return updatedCompany;
	}
*/
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Company updateCompany(Long id, double price)
	{
		Company company = companyRepository.findById(id).orElseThrow(() -> new CompanyNotFoundException(id));
		company.setPrice(price);
		
		Company updatedCompany = companyRepository.save(company);
		return updatedCompany;
	}
	
}

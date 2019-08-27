package spring.project.stockModel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.project.stockModel.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
package spring.project.stockModel.model;

//import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "companylist")
@EntityListeners(AuditingEntityListener.class)
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String symbol;

    private String companyName;
    private String url;
    private double previousClose;
    private double price;

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Company() {
    }

	public Company(String symbol, String name, String url, double previousClose, double price) {
        this.symbol = symbol;
        this.companyName = name;
        this.url = url;
        this.previousClose = previousClose;
        this.price = price;
    }

    public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public double getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(double previousClose) {
		this.previousClose = previousClose;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
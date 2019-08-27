package spring.project.stockModel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CompanyNotFoundException extends RuntimeException {
	private long id;
	
	public CompanyNotFoundException(Long id2)
	{
		super(String.format("Company %d not found.", id2));
		this.id = id2;
	}

	public Long getId() {
		return id;
	}
}

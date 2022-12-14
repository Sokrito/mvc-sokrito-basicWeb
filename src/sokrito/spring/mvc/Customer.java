package sokrito.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import sokrito.spring.mvc.validation.SokritoCode;

public class Customer {
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to zero")
	private Integer freePasses;
	
	@Pattern(regexp="[a-zA-Z0-9]{4}", message="only 4 chars/digits")
	private String postalCode;
	
	@SokritoCode(value="KEY", message="Must be start with KEY")
	private String sokritoCode;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getSokritoCode() {
		return sokritoCode;
	}
	public void setSokritoCode(String sokritoCode) {
		this.sokritoCode = sokritoCode;
	}
	
	
	
}

/*
 * @author Mayank
 */
package in.co.rays.project_0.form;

import javax.validation.constraints.Pattern;

import org.eclipse.jdt.internal.compiler.ast.IfStatement;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.bind.annotation.InitBinder;

import in.co.rays.project_0.dto.BaseDTO;
import in.co.rays.project_0.dto.UserDTO;
import in.co.rays.project_0.util.Util;

/**
 * The Class UserRegistrationForm.
 */

public class UserRegistrationForm extends BaseForm {

	/** The first name. */
	@NotEmpty 
	@Pattern(regexp ="^([^-\\s][\\p{L} .']+$)*$", message="{Pattern.form.fname}")
	private String firstName;
	
	/** The last name. */
	@NotEmpty
	@Pattern(regexp = "^([^-\\s][\\p{L} .']+$)*$", message = "{Pattern.form.fname}")
	private String lastName;
	
	/** The login. */
	@Email
	@NotEmpty
	private String login;
	
	/** The gender. */
	@NotEmpty
	private String gender;
	
	/** The dob. */
	@NotEmpty
	private String dob;
	
	/** The password. */
	@NotEmpty
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})*$", message = "{Pattern.password}")
	private String password;
	
	/** The confirm password. */
	@NotEmpty
	private String confirmPassword;
	
	/** The mobile no. */
	@NotEmpty
	@Pattern(regexp = "(\\d{10})*$", message = "{Pattern.form.phoneNo}")
	private String mobileNo;
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the login.
	 *
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	
	/**
	 * Sets the login.
	 *
	 * @param login the new login
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	
	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	
	/**
	 * Sets the dob.
	 *
	 * @param dob the new dob
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Gets the confirm password.
	 *
	 * @return the confirm password
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}
	
	/**
	 * Sets the confirm password.
	 *
	 * @param confirmPassword the new confirm password
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	/**
	 * Gets the mobile no.
	 *
	 * @return the mobile no
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	
	/**
	 * Sets the mobile no.
	 *
	 * @param mobileNo the new mobile no
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	/* (non-Javadoc)
	 * @see in.co.rays.project_0.form.BaseForm#getDto()
	 */
	@Override
	public BaseDTO getDto() 
	{
	   UserDTO dto = new UserDTO();
	   
	   dto.setId(id);
	   dto.setFirstName(firstName);
	   dto.setLastName(lastName);
	   dto.setGender(gender);
	   dto.setMobileNo(mobileNo);
	   dto.setPassword(password);
	   dto.setDob(Util.getDate(dob));
	   dto.setLogin(login);
	   dto.setConfirmPassword(confirmPassword);
	   
		return dto;
	}
	
	/* (non-Javadoc)
	 * @see in.co.rays.project_0.form.BaseForm#populate(in.co.rays.project_0.dto.BaseDTO)
	 */
	@Override
	public void populate(BaseDTO bDto) 
	{
		UserDTO dto = (UserDTO)bDto;
		
		id = dto.getId();
		firstName = dto.getFirstName();
		lastName = dto.getLastName();
		login = dto.getLogin();
		password = dto.getPassword();
		System.out.println("........."+dto.getDob());
		if (dob != null) {
			dob = Util.getDate(dto.getDob());
			System.out.println("in form method"+dob);
		}
		mobileNo = dto.getMobileNo();
		gender = dto.getGender();
		confirmPassword = dto.getConfirmPassword();
	}

}

/*
 * @author Mayank
 */
package in.co.rays.project_0.service;

import java.util.List;

import in.co.rays.project_0.dto.StudentDTO;
import in.co.rays.project_0.exception.DuplicateRecordException;

/**
 * The Interface StudentServiceInt.
 */
public interface StudentServiceInt {

	/**
	 * Adds the.
	 *
	 * @param dto the dto
	 * @return the long
	 * @throws DuplicateRecordException the duplicate record exception
	 */
	public long add(StudentDTO dto)throws DuplicateRecordException;
	
	/**
	 * Update.
	 *
	 * @param dto the dto
	 */
	public void update(StudentDTO dto);
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	public void delete(long id);
	
	/**
	 * Find by PK.
	 *
	 * @param pk the pk
	 * @return the student DTO
	 */
	public StudentDTO findByPK(long pk);
	
	/**
	 * Find by email.
	 *
	 * @param email the email
	 * @return the student DTO
	 */
	public StudentDTO findByEmail(String email);
	
	/**
	 * Search.
	 *
	 * @param dto the dto
	 * @return the list
	 */
	public List search(StudentDTO dto);
	
	/**
	 * Search.
	 *
	 * @param dto the dto
	 * @param pageNo the page no
	 * @param pageSize the page size
	 * @return the list
	 */
	public List search(StudentDTO dto,int pageNo,int pageSize);
}

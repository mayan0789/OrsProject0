/*
 * @author  Mayank
 */
package in.co.rays.project_0.dao;

import java.util.List;

import in.co.rays.project_0.dto.UserDTO;

/**
 * The Interface UserDAOInt.
 */
public interface UserDAOInt {

	/**
	 * Adds the.
	 *
	 * @param dto the dto
	 * @return the long
	 */
	public long add(UserDTO dto);
	
	/**
	 * Update.
	 *
	 * @param dto the dto
	 */
	public void update(UserDTO dto);
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	public void delete(long id);
	
	/**
	 * Find by login.
	 *
	 * @param login the login
	 * @return the user DTO
	 */
	public UserDTO findByLogin(String login);
	
	/**
	 * Find by PK.
	 *
	 * @param pk the pk
	 * @return the user DTO
	 */
	public UserDTO findByPK(long pk);
	
	/**
	 * Search.
	 *
	 * @param dto the dto
	 * @param pageNo the page no
	 * @param pageSize the page size
	 * @return the list
	 */
	public List search(UserDTO dto, int pageNo, int pageSize);
	
	/**
	 * Search.
	 *
	 * @param dto the dto
	 * @return the list
	 */
	public List search(UserDTO dto);
}

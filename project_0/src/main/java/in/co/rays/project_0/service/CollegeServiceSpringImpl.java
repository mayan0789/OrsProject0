/*
 * @author Mayank
 */
package in.co.rays.project_0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.rays.project_0.dao.CollegeDAOInt;
import in.co.rays.project_0.dto.CollegeDTO;
import in.co.rays.project_0.dto.CourseDTO;
import in.co.rays.project_0.exception.DuplicateRecordException;

/**
 * The Class CollegeServiceSpringImpl.
 */
@Service(value = "collegeService")
public class CollegeServiceSpringImpl implements CollegeServiceInt {

	/** The dao. */
	@Autowired
	private CollegeDAOInt dao;

	/* (non-Javadoc)
	 * @see in.co.rays.project_0.service.CollegeServiceInt#add(in.co.rays.project_0.dto.CollegeDTO)
	 */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public long add(CollegeDTO dto) throws DuplicateRecordException {
		CollegeDTO dto1 = findByName(dto.getName());
		if (dto1 != null) {
			throw new DuplicateRecordException("college already exist");

		}
		return dao.add(dto);
	}

	/* (non-Javadoc)
	 * @see in.co.rays.project_0.service.CollegeServiceInt#delete(long)
	 */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(long id) {
		dao.delete(id);
	}

	/* (non-Javadoc)
	 * @see in.co.rays.project_0.service.CollegeServiceInt#update(in.co.rays.project_0.dto.CollegeDTO)
	 */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void update(CollegeDTO dto) {
		dao.update(dto);
	}

	/* (non-Javadoc)
	 * @see in.co.rays.project_0.service.CollegeServiceInt#findByName(java.lang.String)
	 */
	@Transactional(readOnly = true)
	public CollegeDTO findByName(String name) {
		return dao.findByName(name);
	}

	/* (non-Javadoc)
	 * @see in.co.rays.project_0.service.CollegeServiceInt#findByPK(long)
	 */
	@Transactional(readOnly = true)
	public CollegeDTO findByPK(long pk) {
		return dao.findByPK(pk);
	}

	/* (non-Javadoc)
	 * @see in.co.rays.project_0.service.CollegeServiceInt#search(in.co.rays.project_0.dto.CollegeDTO)
	 */
	@Transactional(readOnly = true)
	public List search(CollegeDTO dto) {
		return dao.search(dto);
	}

	/* (non-Javadoc)
	 * @see in.co.rays.project_0.service.CollegeServiceInt#search(in.co.rays.project_0.dto.CollegeDTO, int, int)
	 */
	@Transactional(readOnly = true)
	public List search(CollegeDTO dto, int pageNo, int pageSize) {
		return dao.search(dto, pageNo, pageSize);
	}

}

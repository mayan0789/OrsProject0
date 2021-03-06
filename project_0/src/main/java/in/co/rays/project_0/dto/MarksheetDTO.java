/*
 * @author  Mayank
 */
package in.co.rays.project_0.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The Class MarksheetDTO.
 */
@Entity
@Table(name = "ST_MARKSHEET")
public class MarksheetDTO extends BaseDTO {

	/** The roll no. */
	@Column(name = "ROLL_NO", length = 20)
	protected String rollNo = null;

	/** The name. */
	@Column(name = "NAME", length = 50)
	protected String name = null;

	/** The physics. */
	@Column(name = "PHYSICS")
	protected Integer physics;

	/** The chemistry. */
	@Column(name = "CHEMISTRY")
	protected Integer chemistry;

	/** The maths. */
	@Column(name = "MATHS")
	protected Integer maths;

	/** The student id. */
	@Column(name = "STUDENT_ID")
	protected Long studentId;

	/**
	 * Gets the roll no.
	 *
	 * @return the roll no
	 */
	public String getRollNo() {
		return rollNo;
	}

	/**
	 * Sets the roll no.
	 *
	 * @param rollNo the new roll no
	 */
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the physics.
	 *
	 * @return the physics
	 */
	public Integer getPhysics() {
		return physics;
	}

	/**
	 * Sets the physics.
	 *
	 * @param physics the new physics
	 */
	public void setPhysics(Integer physics) {
		this.physics = physics;
	}

	/**
	 * Gets the chemistry.
	 *
	 * @return the chemistry
	 */
	public Integer getChemistry() {
		return chemistry;
	}

	/**
	 * Sets the chemistry.
	 *
	 * @param chemistry the new chemistry
	 */
	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}

	/**
	 * Gets the maths.
	 *
	 * @return the maths
	 */
	public Integer getMaths() {
		return maths;
	}

	/**
	 * Sets the maths.
	 *
	 * @param maths the new maths
	 */
	public void setMaths(Integer maths) {
		this.maths = maths;
	}

	/**
	 * Gets the student id.
	 *
	 * @return the student id
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * Sets the student id.
	 *
	 * @param studentId the new student id
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(BaseDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see in.co.rays.project_0.dto.DropdownList#getKey()
	 */
	public String getKey() {
		// TODO Auto-generated method stub
		return id+"";
	}

	/* (non-Javadoc)
	 * @see in.co.rays.project_0.dto.DropdownList#getValue()
	 */
	public String getValue() {
		// TODO Auto-generated method stub
		return rollNo;
	}
	
	
}

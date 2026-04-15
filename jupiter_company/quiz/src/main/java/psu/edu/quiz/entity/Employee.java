package psu.edu.quiz.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee_record")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empno")
	private Integer empno;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="hiredate")
	private String hiredate;
	
	@Column(name="salary")
	private Integer salary;
	
	@Column(name="comm")
	private Integer comm;
	
	@Column(name="deptno")
	private Integer deptno;
	
	public Employee()
	{
		
	}
	
	public Employee(int empno, String first_name, String last_name, String designation, String hiredate, int salary,
			int comm, int deptno) {
		super();
		this.empno = empno;
		this.first_name = first_name;
		this.last_name = last_name;
		this.designation = designation;
		this.hiredate = hiredate;
		this.salary = salary;
		this.comm = comm;
		this.deptno = deptno;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getComm() {
		return comm;
	}

	public void setComm(Integer comm) {
		this.comm = comm;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee{" +
                "empno=" + empno+
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", designation='" + designation + '\'' +
                ", hiredate='" + hiredate + '\'' +
                ", salary='" + salary + '\'' +
                ", comm='" + comm + '\'' +
                ", deptno='" + deptno + '\'' +
                '}';
	}
}

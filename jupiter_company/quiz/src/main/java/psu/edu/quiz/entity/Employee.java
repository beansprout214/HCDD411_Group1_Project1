package psu.edu.quiz.entity;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="employee_record")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_id")
	private Integer employee_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="start_date")
	private Date start_date;
	
	@Column(name="start_salary")
	private Double start_salary;
	
	@Column(name="contract_signed")
	private String contract_signed;
	
	@Column(name="ssn")
	private Integer ssn;
	
	@Column(name="birthdate")
	private Date birthdate;
	
	@Column(name="phone_number")
	private String phone_number;
	
	@Column(name="emergency_contact_name")
	private String emergency_contact_name;
	
	@Column(name="emergency_contact_phone")
	private String emergency_contact_phone;

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
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

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Double getStart_salary() {
		return start_salary;
	}

	public void setStart_salary(Double start_salary) {
		this.start_salary = start_salary;
	}

	public String getContract_signed() {
		return contract_signed;
	}

	public void setContract_signed(String contract_signed) {
		this.contract_signed = contract_signed;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmergency_contact_name() {
		return emergency_contact_name;
	}

	public void setEmergency_contact_name(String emergency_contact_name) {
		this.emergency_contact_name = emergency_contact_name;
	}

	public String getEmergency_contact_phone() {
		return emergency_contact_phone;
	}

	public void setEmergency_contact_phone(String emergency_contact_phone) {
		this.emergency_contact_phone = emergency_contact_phone;
	}

	public Employee(Integer employee_id, String first_name, String last_name, Date start_date, Double start_salary,
			String contract_signed, Integer ssn, Date birthdate, String phone_number, String emergency_contact_name,
			String emergency_contact_phone) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.start_date = start_date;
		this.start_salary = start_salary;
		this.contract_signed = contract_signed;
		this.ssn = ssn;
		this.birthdate = birthdate;
		this.phone_number = phone_number;
		this.emergency_contact_name = emergency_contact_name;
		this.emergency_contact_phone = emergency_contact_phone;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", start_date=" + start_date + ", start_salary=" + start_salary + ", contract_signed="
				+ contract_signed + ", ssn=" + ssn + ", birthdate=" + birthdate + ", phone_number=" + phone_number
				+ ", emergency_contact_name=" + emergency_contact_name + ", emergency_contact_phone="
				+ emergency_contact_phone + "]";
	}
	
	
	
}

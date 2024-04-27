package com.Actividad18ArchivosTexto.PagoDeImpuestos;

public class Employee {
	private final int employeeID;
	private final String employeeName;
	private double wage;

	// Employee name and ID should be immutable as it does not make sense that the employee changes his/her name or ID, even in an internal position switch.
	// Wage, however, can and may change.

	public Employee(int employeeID, String employeeName, double wage) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.wage = wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getWage() {
		return wage;
	}

	public double getSATTax() {
		return wage * 0.18;
	}

	public double getIMSSTax() {
		return wage * 0.12;
	}

	public double getINFONAVITTax() {
		return wage * 0.06;
	}
}

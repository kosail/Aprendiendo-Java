package com.Actividad18ArchivosTexto.ControlDeVehiculos;

public class Vehicle {
	String licensePlate, description;
	int model;
	double cost;
	
	public Vehicle(String licensePlate, String description, int model, double cost) {
		this.licensePlate = licensePlate;
		this.description = description;
		this.model = model;
		this.cost = cost;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public String getDescription() {
		return description;
	}

	public int getModel() {
		return model;
	}

	public double getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%d\t%.2f", licensePlate, description, model, cost);
	}
}
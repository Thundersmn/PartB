package com.unimelb.swen30006.metromadness.passengers;

import java.util.Random;

import com.unimelb.swen30006.metromadness.stations.Station;

public class Passenger {

	
	
	final public int id;
	private Station beginning;
	private Station destination;
	private float travelTime;
	private boolean reachedDestination;
	private Cargo cargo;

	public Passenger(int id, Random random, Station start, Station end) {
		this.id = id;
		this.beginning = start;
		this.destination = end;
		this.reachedDestination = false;
		this.travelTime = 0;
		this.cargo = generateCargo(random);
	}

	public void update(float time) {
		if (!this.reachedDestination) {
			this.travelTime += time;
		}
	}

	public Cargo getCargo() {
		return cargo;
	}

	public Cargo generateCargo(Random random) {
		return new Cargo(random.nextInt(51));
	}

	public class Cargo {
		private int weight;

		public Cargo(int weight) {
			this.setWeight(weight);
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}
	}

	public Station getBeginning() {
		return beginning;
	}

	public void setBeginning(Station beginning) {
		this.beginning = beginning;
	}

	public Station getDestination() {
		return destination;
	}

	public void setDestination(Station destination) {
		this.destination = destination;
	}

	public float getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(float travelTime) {
		this.travelTime = travelTime;
	}

	public boolean isReachedDestination() {
		return reachedDestination;
	}

	public void setReachedDestination(boolean reachedDestination) {
		this.reachedDestination = reachedDestination;
	}

	public int getId() {
		return id;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}

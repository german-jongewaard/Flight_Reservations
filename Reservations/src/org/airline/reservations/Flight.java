/* Flight.java
 * Developer by Germán Jongewaard 
 */

package org.airline.reservations;

public class Flight {
	
	//fields
	private String departureCity;
	private String arrivalCity;
	private int flightNumber;
	
	//constructor
	public Flight() {		
		this.departureCity = "Unknown Departure City";
		this.arrivalCity = "Unknown Arrival City";
		this.flightNumber = 100;		
	}
	
	public Flight(int flightNumber, String departureCity, String arrivalCity) {		
		setFlightNumber(flightNumber);
		setDepartureCity(departureCity);
		setArrivalCity(arrivalCity);		
		
	}

	//getters and setters
	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	
	public void setCities(String deprtureCitie, String arrivalCitie) {
		
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;	
		
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String toString() {
		return "Flight: " + this.getFlightNumber() + " " + this.getDepartureCity() + " - " + this.getArrivalCity(); 
						
	} 	

}

/*
 *UC2:- To Find the cheapest Hotel for a given date range
 *       i/p-->10sep2020,11sep2020.
 * 
 * @author: Navya shree
 * @since : 26-10-2021
 */
package com.bridgelabz;

public class HotelReservation {
	public static void main(String[] args) {

		HotelReservationSystem hotel = new HotelReservationSystem();

		System.out.println("--Welcome to Hotel Rates Program--");
		System.out.println(" ");

		hotel.addHotel();
		hotel.showHotelInfo();

		System.out.println(" ");
		System.out.println("*Cheapest Hotel Based on WeekdayRegularRate");
		hotel.findCheapestHotelOne("10-Sep-2020", "11-Sep-2020");
		System.out.println(" ");

	}

}

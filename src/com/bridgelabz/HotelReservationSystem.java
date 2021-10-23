package com.bridgelabz;

import java.util.ArrayList;

public class HotelReservationSystem {
	static ArrayList<Hotel> HotelsList = new ArrayList<>();

	// To view total HotelList
	public static void view() {
		for (Hotel i : HotelsList) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Hotel RadissonBlu = new Hotel();
		RadissonBlu.setHotelName("Radisson BLu Hotel Ranchi");
		RadissonBlu.setRatePerDay(368);
		HotelsList.add(RadissonBlu);

		Hotel TreeboTrend = new Hotel();
		TreeboTrend.setHotelName("Treebo Trend Archi regency");
		TreeboTrend.setRatePerDay(250);
		HotelsList.add(TreeboTrend);

		Hotel CapitolHill = new Hotel();
		CapitolHill.setHotelName("capitol Hill");
		CapitolHill.setRatePerDay(220);
		HotelsList.add(CapitolHill);

		view();

	}

}

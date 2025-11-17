package main;

import java.time.LocalDate;

import model.Flight;
import model.FlightConnection;

/**
 * Attributes
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D240_Attributes {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      /* Ansatz ohne Objektorientierung */
      String airline = "Lufthansa";
      String connectionId = "0400";
      String departureAirport = "Frankfurt Airport";
      String arrivalAirport = "JFK International Airport";

      LocalDate flightDate1 = LocalDate.of(2026, 10, 24);
      double flightPriceInEuro1 = 812.50;

      LocalDate flightDate2 = LocalDate.of(2026, 12, 6);
      double flightPriceInEuro2 = 740;

      /* Ansatz mit Objektorientierung */
      FlightConnection flightConnection = new FlightConnection();
      flightConnection.airline = "Lufthansa";
      flightConnection.connectionId = "0400";
      flightConnection.departureAirport = "Frankfurt Airport";
      flightConnection.arrivalAirport = "JFK International Airport";

      Flight flight1 = new Flight();
      flight1.flightConnection = flightConnection;
      flight1.flightDate = LocalDate.of(2026, 10, 24);
      flight1.flightPriceInEuro = 812.50;

      Flight flight2 = new Flight();
      flight2.flightConnection = flightConnection;
      flight2.flightDate = LocalDate.of(2026, 12, 6);
      flight2.flightPriceInEuro = 740;
   }

}

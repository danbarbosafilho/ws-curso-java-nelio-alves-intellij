package aulas.aula94_array_desafio_pensionato;

import java.util.Locale;
import java.util.Scanner;

import aulas.aula94_array_desafio_pensionato_entities.Rooms;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		
		Rooms[] roomsArray = new Rooms[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("\nRent #%d:", i + 1);
			System.out.print("\nName: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.nextLine();
			System.out.print("Room: ");
			int room = scan.nextInt();
			
			Rooms.addRoom(roomsArray, name, email, room);
		}
		
		System.out.println("\nBusy rooms:");
		for (Rooms rooms : roomsArray) {
			if (rooms != null) {
				System.out.println(rooms);
			} 
		}

		scan.close();
	}

}

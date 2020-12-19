package course;

public class Project1Module6 {

	public static void main(String[] args) {
		
		int WashingPowderExpected = 18; //Kilograms
		int NeedWashingPowder = 5; //Kilograms
		
		int MuddleExpected = 8;
		int NeedMuddle = 3;
		
		int ShampooExpected = 10; //Liters
		int NeedShampoo = 3; //Liters
		
		boolean Holidays = false;
		
		if(Holidays) {
			ShampooExpected = ShampooExpected / 2;
			MuddleExpected = MuddleExpected / 2;
		}
		
		int WashingPowder = WashingPowderExpected - NeedWashingPowder;
		int Muddle = MuddleExpected - NeedMuddle;
		int Shampoo = ShampooExpected - NeedShampoo;
		
		System.out.println("You have " + WashingPowder + " kilograms of washing powder, " + Muddle + " pieces of muddle and " + Shampoo + " liters of shampoo.");
		
	}

}

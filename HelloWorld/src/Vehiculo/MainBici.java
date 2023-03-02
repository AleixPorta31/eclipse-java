package Vehiculo;

public class MainBici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bici RockyMountain = new Bici(2);
		System.out.println(RockyMountain.getCambios());
		
		RockyMountain.setCambios(4);
		System.out.println(RockyMountain.getCambios());
	}

}

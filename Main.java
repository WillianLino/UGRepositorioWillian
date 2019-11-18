package net.ug.hibernate;

public class Main {
	
	
	public static void main(String[] args) {
		crear();
		read();
		update();
		delete();
	}
	
	public static void crear() {
		DaoTuristas daoTuristas = new DaoTuristas();
		Turistas turistas = new Turistas(1, 12345 , "Willian" , "Lino" , "Bastion popular bloque 6" , "2148350" , "lino-paguay96@hotmail.com");				
		daoTuristas.setup();
		daoTuristas.crear(turistas);
		turistas = new Turistas(1, 12345, "Willian" , "Lino" , "Bastion popular bloque 6" , "2148350" , "lino-paguay96@hotmail.com");
		daoTuristas.crear(turistas);		
	}

	public static void read() {
		DaoTuristas daoTuristas = new DaoTuristas();
		daoTuristas.setup();
		Turistas turistas = daoTuristas.read(1);
		turistas.imprimir();
	}

	public static void update() {

		DaoTuristas daoTuristas = new DaoTuristas();
		daoTuristas.setup();
		Turistas turistas = daoTuristas.read(1);
		//turistas.setNombres("Historia del Ecuador");
		daoTuristas.update(turistas);
	}
	
	public static void delete() {
		DaoTuristas daoTuristas = new DaoTuristas();
		daoTuristas.setup();
		daoTuristas.delete(1);
		daoTuristas.delete(2);
	}
}

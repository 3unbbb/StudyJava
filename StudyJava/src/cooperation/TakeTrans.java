package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stuJames = new Student("James", 5000);
		Student stuTomas = new Student("Tomas", 10000);
		Student stuEdward = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		stuJames.takeBus(bus100);
		stuJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		stuTomas.takeSubway(subwayGreen);
		stuTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi01 = new Taxi(1);
		stuEdward.takeTaxi(taxi01);
		stuEdward.showInfo();
		taxi01.showInfo();

	}

}

class IctStudent {
	public static void main(String[] args) {
		IctStudent student1 = new IctStudent();
		student1.Exec();
	}
	public void StelJezelfVoor() {
		System.out.println("Naam: Tom Van Hoof");
		System.out.println("Klas: 1ICT6");
		System.out.println("E-mail adres: tom.vanhoof@kahosl.be");
	}
	public void BeschrijfJeVoorKennis() {
		BeschijfJeVoorOpleiding();
		BeschrijfJeProgrammeerErvaring();
	}
	public void BeschijfJeVoorOpleiding() {
		System.out.println("School: Don Bosco T.I. Hoboken");
		System.out.println("Richting: Industriele ICT");
	}
	public void BeschrijfJeProgrammeerErvaring() {
	System.out.println("Programmeerervaring: 5e en 6e jaar Visual Basic en ASP.Net");
	}
	public void Exec() {
		StelJezelfVoor();
		BeschrijfJeVoorKennis();
	}
}
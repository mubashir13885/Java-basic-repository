package mavenparctice;

final class Finalclass {
int code;

	Finalclass(int code){
		this.code = code;
	}
	
	void Diplaydetails() {
		
		System.out.println(this.code);
	}
	
	final void Calculte() {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {

		Finalclass fn = new Finalclass(56);
		fn.Diplaydetails();
		fn.Calculte();
		
		
	}

}

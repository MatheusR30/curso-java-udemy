public class Main {

	public static void main(String[] args) {
	
        System.out.println("Iniciou o programa no metodo main.");
        a();
        System.out.println("Finalizou o programa no metodo main.");
    }
    static void a() {
        System.out.println("Entrou no metodo a.");
        b();
        System.out.println("Finalizou o metodo a.");
    }
    static void b() {
        System.out.println("Iniciou o metodo b.");
        for(int i = 0; i <= 4; i ++) 
        	System.out.println(i);
        c();
        System.out.println("Finalizou o metodo b.");
    }
    static void c() {
        System.out.println("Iniciou o metodo c.");
//        Thread.dumpStack();
        System.out.println("Finalizou o metodo c.");
    }

}

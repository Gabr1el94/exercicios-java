package one.dio.gss.singleton;

/**
 * Lazy Holder Singleton: 
 * 	Nessa abordagem, a inst�ncia � criada apenas quando necess�ria, 
 * 	mas de uma maneira mais segura e eficiente, utilizando uma classe 
 * 	interna para garantir a inicializa��o pregui�osa da inst�ncia 
 * 	de forma segura e concorrente.
 * 
	**Vantagens:**
	- Garante a inicializa��o pregui�osa da inst�ncia de forma segura e eficiente, utilizando uma classe interna.
	
	- Permite a inicializa��o segura e concorrente da inst�ncia quando necess�ria.
	
	**Desvantagens:**
	- Pode ser mais complexa de implementar em compara��o com as outras abordagens.
 * 
 * @author gabriel.soares.silva
 * */
public class SingletonLazyHolder {
	
	private static class Holder {
		public static SingletonLazyHolder instance = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstance(){
		return Holder.instance;
	}
}

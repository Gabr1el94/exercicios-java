package one.dio.gss.singleton;

/**
 * Eager Singleton: 
 * 	Na implementa��o do Eager Singleton, a inst�ncia � criada no momento 
 * 	em que a classe � carregada, independentemente de ser necess�ria ou n�o. 
 * 	Isso garante que a inst�ncia esteja sempre dispon�vel, 
 * 	mas pode consumir mais recursos de mem�ria, especialmente se a inst�ncia 
 * 	n�o for utilizada durante a execu��o do programa.
 *  
	**Vantagens:**
	- Garante que a inst�ncia esteja sempre dispon�vel, independentemente de ser necess�ria ou n�o.
	
	**Desvantagens:**
	- Pode consumir mais recursos de mem�ria, especialmente se a inst�ncia n�o for utilizada durante a execu��o do programa.
 * 
 * 
 * @author gabriel.soares.silva
 * */
public class SingletonEager {
	
	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstance() {
		return instance;
	}
}

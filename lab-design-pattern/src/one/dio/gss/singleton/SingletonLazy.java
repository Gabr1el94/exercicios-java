package one.dio.gss.singleton;

/**
 *  Lazy Initialization: 
 *  	Nessa abordagem, a inst�ncia � criada apenas quando necess�ria. 
 *  	Isso pode ajudar a economizar recursos de mem�ria, mas pode resultar 
 *  	em um pequeno atraso no tempo de inicializa��o da inst�ncia.
 * 
 * 
	**Vantagens**:
	- Economia de recursos de mem�ria, pois a inst�ncia � criada apenas quando necess�ria.
	
	**Desvantagens:**
	- Pode resultar em um pequeno atraso no tempo de inicializa��o da inst�ncia quando � necess�ria.
 * 
 * 
 * 
 * 
 * @author gabriel.soares.silva
 * */
public class SingletonLazy {
	
	private static SingletonLazy instance;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstance(){
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}

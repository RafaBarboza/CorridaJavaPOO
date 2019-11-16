/**
 * 
 * @author Rafael Barboza
 * Classe ajuda, herda de informa��es e implementa o m�todo info.
 *
 */
public class Autores extends Informacoes{
	
	/**
	 * Retorna dados dos atributos fixos da classe pai
	 * sobre as regras do jogo.
	 */
	@Override //Sobrescrevendo o m�todo.
	public void info() {
		System.out.println("Autores:");
		System.out.println(ID_AUTOR + ": " + ID_RA_UM);
		System.out.println(CURSO);
		System.out.println();
	}

}

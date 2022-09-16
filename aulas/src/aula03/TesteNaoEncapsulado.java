package aula03;

public class TesteNaoEncapsulado {

	public static void main(String[] args) {
   		 NaoEncapsulado ne = new NaoEncapsulado();
	     ne.setComProtecao(10); //acesso direto ao atributo
	     System.out.println("Valor sem proteção:  "+ ne.getComProtecao());
	}

}

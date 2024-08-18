/*3. Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres
(Ex.: entrada = teste ; saída = etset):
Deve se u�lizar a função SUBSTRING da Java
O código deve trazer como comentários:
• A condição de parada
• Como escrever a função para o termo n em função do termo anterior*/
package controller;

public class ControllerInverte {
	
	public ControllerInverte() {
		super();
	}
	
	public String invertePalavra(String palavra, int indiceEsq, int indiceDir) {
		String invertida = "";
		if(indiceDir == 0) {
			return invertida;//Quando o indice da direita chegar a 0, a String foi completamente percorrida e retornamos ela invertida.
		} else {
			invertida = palavra.substring(indiceEsq, indiceDir);
			return invertida + invertePalavra(palavra, indiceEsq - 1, indiceDir - 1);//Senão, invertida recebe a letra correspondente ao indice da direita, e retorna invertida mais a recursiva decrescendo os indices.
		}
	}
}

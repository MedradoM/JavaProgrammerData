package myProgrammerData;

class Pessoa {
	static int id = 1;
	static void metodo() {
		System.out.println(id); //PODEMOS ACESSAR POR MEIO DE UM METODO EST�TICO MUITO IZI SLC
	}
}

public class firstStep {
	
	String nomes = "Matheus, J�o"; /*QUANDO � DECLARADO DENTRO DA CLASSE, PODE SER
									ACESSADO DE QUALQUER PARTE (EX: LINHA 51)*/
	String nomesCompleto = nomes + "Rafinha"; /*NESTE CASO, PODEMOS AT� MESMO USAR UMA
	VARIAVEL E DECLARAR DENTRO DE OUTRA (OUTRA VARIAVEL DE OBJETO, LOUCURA BIXO)*/
	
	public void m1() {
		int x = 10;
		// VARIAVEIS LOCAIS S� EXISTEM DENTRO DE BLOCOS
		if (x >= 10) {
			int y = 50;
			System.out.println(y);
		}
		/*POR ISSO VAI OCASIONAR EM ERRO NA PR�XIMA LINHA, POIS O ELEMENTO 'Y'
	    	S� EXISTE DENTRO DO ESCOPO*/
		System.out.println(y);
		System.out.println(x);
	}
	
	public void m2() {
		for(int i=0, j=0;i<=10;i++){
			j++;
		} /*O MESMO ACONTECE AQUI, AS VARIAVEIS 'I' E 'J' EST�O DENTRO DO LA�O 'FOR'
			POR CONTA DISSO, VAI GERAR UM ERRO NAS LINHAS ABAIXO*/
		System.out.println(i);
		System.out.println(j);
	}
	
	public void m3(String nome) {
		System.out.println(nome);
		/*NESTE CASO, N�O TEREMOS ERROS NA HORA DA COMPILA��O, VISTO QUE ESTE METODO
			EXISTE E PODE SER COMPILADO*/
	}
	
	public void m4() {
		System.out.println(nome); //VAI DAR ERRO :(
		/*O QUE � TOTALMENTE DIFERENTE NESTE CASO, VISTO QUE UMA VARIAVEL LOCAL S�
			EXISTE DENTRO DO BLOCO QUE ELA FOI DEFINIDA*/
	}
	
	public void m5() {
		System.out.println(nomes); //QUALQUER PARTE MEEEESMO :)
	}
	
	public void m6() {
		System.out.println(nomesCompleto); //MUITO FACIL DE ENTENDER, AT� UMA PEDRA ENTENDE
	}
	
	int x = 0;
	public void setX(int x) {
		this.x = x;
	}
	
	public static void main(String[] args) {
		firstStep t = new firstStep();
		t.m1();
		t.m2();
		t.m3("Guilherme");
		t.m4();
		t.m5();
		t.nomes = "Theuzin"; /*NESTE CASO, PODEMOS SIMPLESMENTE ALTERAR O VALOR DA 
								VARIAVEL PELA INSTANCIA */
		System.out.println(t.nomes);
		
		//-----------------------------------------------------------------------
		
		Pessoa p = new Pessoa();
		System.out.println(p.id); /*VARIAVEIS EST�TICAS PODEM SER ACESSADAS ATRAV�S
									DE QUALQUER ESCOPO*/
		System.out.println(Pessoa.id);
		Pessoa.metodo(); //UM METODO EST�TICO PODE ACESSAR VARIAVEIS EST�TICAS...
		
		//-----------------------------------------------------------------------
		
		//ESSA PARTE � MAIS PRA EXPLICAR OS CUIDADOS COM VARIAVEIS COM MESMO NOME :)
		/*N�O PODEMOS TER DUAS VARIAVEIS LOCAIS COM O MESMO NOME EX: */
		// int a = 0;
		// int a = 10; <- VAI DAR UM ERRO POR CONTA DA DUPLICIDADE DESTA VARIAVEL
		
		/*ASSIM COMO N�O PODEMOS CRIAR UMA CLASSE E COLOCAR UMA VARIAVEL EST�TICA
		E OUTRA VARIAVEL DE INSTANCIA COM O MESMO NOME*/
		
		/*MAAAAAS, PODEMOS TER VARIAVEIS E METODOS COM O MESMO NOME (EX: LINHA 59)*/
		
		//-----------------------------------------------------------------------
		
		
	}

}


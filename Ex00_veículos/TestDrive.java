package veiculos;

public class TestDrive {

	public static void main(String[] args) {
		Carro carro = new Carro(110);
		
		carro.ligar();
		carro.acelerar(80);
		carro.frear(10);
		carro.desligar();
		carro.buzinar();
		System.out.println(carro.velocidadeAtual);
	}

}

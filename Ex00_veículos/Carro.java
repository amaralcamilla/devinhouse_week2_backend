package veiculos;

public class Carro {
	private String cor;
	private String modelo;
	boolean ligado;
	int velocidadeAtual;
	int velocidadeMaxima;
	
	Carro (int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	void ligar() { 
		if (!this.ligado) { 
			this.ligado = true;
		}
	}
	
	void desligar() {
		if (this.ligado) {
			this.ligado = false;
			this.velocidadeAtual = 0;
		}
	}
	
	void acelerar(int velocidadeAdicional) {
		if (this.ligado) {
			if (this.velocidadeAtual + velocidadeAdicional >= this.velocidadeMaxima) {
			this.velocidadeAtual = this.velocidadeMaxima;	
			} else {
				this.velocidadeAtual += velocidadeAdicional;
			}
		}
	}
	
	void frear(int velocidadeDecremental) {
		if (this.ligado) {
			if (this.velocidadeAtual + velocidadeDecremental >= 0) { this.velocidadeAtual -= velocidadeDecremental;
		} else {
			this.velocidadeAtual = 0;			
		}
		}
	}
	
	void buzinar() {
		System.out.println("beep beep");
	}
}

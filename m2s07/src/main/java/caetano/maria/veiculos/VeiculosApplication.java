package caetano.maria.veiculos;

import caetano.maria.veiculos.model.TipoVeiculo;
import caetano.maria.veiculos.model.Veiculo;
import caetano.maria.veiculos.repository.VeiculoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class VeiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeiculosApplication.class, args);
	}

	@Bean
	CommandLineRunner run(VeiculoRepository veiculoRepository){
		return args -> {
			Veiculo veiculo1 = new Veiculo("ABC-1234", TipoVeiculo.AUTOMOVEL, "Batmovel",
					2022, "Preto");
			Veiculo veiculo2 = new Veiculo("BCA-4321", TipoVeiculo.ONIBUS, "Enterprise",
					1960, "Prata");
			veiculoRepository.save(veiculo1);
			veiculoRepository.save(veiculo2);
		};
	}

}

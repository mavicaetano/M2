package caetano.maria.veiculos;

import caetano.maria.veiculos.model.EnumTipoVeiculo;
import caetano.maria.veiculos.model.Multa;
import caetano.maria.veiculos.model.Veiculo;
import caetano.maria.veiculos.repository.MultaRepository;
import caetano.maria.veiculos.repository.VeiculoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VeiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeiculosApplication.class, args);
	}

	@Bean
	CommandLineRunner run(VeiculoRepository veiculoRepository, MultaRepository multaRepository) {
		return args -> {
			Veiculo veiculo1 = new Veiculo("ABC-1234", EnumTipoVeiculo.AUTOMOVEL, "Batmovel",
					2022, "Preto");
			Veiculo veiculo2 = new Veiculo("BCA-4321", EnumTipoVeiculo.ONIBUS, "Enterprise",
					1960, "Prata");
			Veiculo veiculo3 = new Veiculo("NCC-1701", EnumTipoVeiculo.ONIBUS, "Enterprise-D",
					1960, "Prata");
			veiculoRepository.save(veiculo1);
			veiculoRepository.save(veiculo2);
			veiculoRepository.save(veiculo3);

			Multa multa1 = new Multa("Gotham City", "Farol apagado", 250F, veiculo1);
			Multa multa2 = new Multa("Gotham City", "Insufilm", 100F, veiculo1);
			Multa multa3 = new Multa("Hiper-espaço", "Excesso de velocidade", 400F, veiculo2);
			multaRepository.save(multa1);
			multaRepository.save(multa2);
			multaRepository.save(multa3);

			multa3.setValor(380F);
			multaRepository.save(multa3);

		};
	}

}


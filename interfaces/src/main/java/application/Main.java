package application;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.service.AluguelService;
import model.service.BrasilImpostoService;
import model.service.USAImpostoService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //Solução focada nas demais classes, sem se importar com a interfile usando o Scanner.
        DateTimeFormatter formatarDataDiaMesAnoHoraMinuto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        AluguelCarro carroAlugado = new AluguelCarro();
        AluguelService aluguelService;

        carroAlugado.setVehiculo(new Veiculo("Civic"));
        carroAlugado.setDataInicio(LocalDateTime.parse("25/06/2018 10:30",formatarDataDiaMesAnoHoraMinuto));
        carroAlugado.setDataFinal(LocalDateTime.parse("27/06/2018 11:40",formatarDataDiaMesAnoHoraMinuto));
        System.out.println("Imposto BRASIL");
        aluguelService = new AluguelService(10.00,130.00,new BrasilImpostoService());
        aluguelService.processarFatura(carroAlugado);
        System.out.println(carroAlugado);

        System.out.println();
        System.out.println("Imposto USA");
        aluguelService = new AluguelService(10.00,130.00,new USAImpostoService());
        aluguelService.processarFatura(carroAlugado);
        System.out.println(carroAlugado);

        System.out.println();

        //Outro exemplo de chamadas
        carroAlugado.setDataInicio(LocalDateTime.parse("25/06/2018 10:30",formatarDataDiaMesAnoHoraMinuto));
        carroAlugado.setDataFinal(LocalDateTime.parse("25/06/2018 14:40",formatarDataDiaMesAnoHoraMinuto));

        //O new BrasilImpostoService, entra como um upCasting para a interfile.(conhecido como injeção de dependencia).
        aluguelService = new AluguelService(10.00,130.00,new BrasilImpostoService());
        aluguelService.processarFatura(carroAlugado);
        System.out.println(carroAlugado);

        System.out.println();

        aluguelService = new AluguelService(10.00,130.00,new USAImpostoService());
        aluguelService.processarFatura(carroAlugado);
        System.out.println(carroAlugado);

    }
}
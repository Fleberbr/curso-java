import java.time.*;
import java.time.temporal.ChronoUnit;

public class CalculoEntreDatas {

    public static void main(String[] args) {

        LocalDate DataLocalDiaMesAno = LocalDate.parse("2022-07-20");
        LocalDateTime DataLocalDiaMesAnoHoraMinuto = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant DataGlobal = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate semanaPassadaDataLocal = DataLocalDiaMesAno.minusDays(7);
        LocalDate proximaSemanaDataLocal = DataLocalDiaMesAno.plusDays(7);
        LocalDate proximosMesDataLocal = DataLocalDiaMesAno.plusMonths(2);
        LocalDate proximosAnosDataLocal = DataLocalDiaMesAno.plusYears(2);


        System.out.println("semanaPassadaDataLocal : "+semanaPassadaDataLocal);
        System.out.println("proximaSemanaDataLocal : "+proximaSemanaDataLocal);
        System.out.println("proximosMesDataLocal : "+proximosMesDataLocal);
        System.out.println("proximosAnosDataLocal : "+proximosAnosDataLocal);

        LocalDateTime semanaPassadaDataHoraLocal = DataLocalDiaMesAnoHoraMinuto.minusDays(7);
        LocalDateTime proximaSemanaDataHoraLocal = DataLocalDiaMesAnoHoraMinuto.plusDays(7);
        LocalDateTime proximosMesDataHoraLocal = DataLocalDiaMesAnoHoraMinuto.plusMonths(2);
        LocalDateTime proximosAnosDataHoraLocal = DataLocalDiaMesAnoHoraMinuto.plusYears(2);
        LocalDateTime proximaSemanaDataHoraSegundosLocal = DataLocalDiaMesAnoHoraMinuto.plusSeconds(30);
        LocalDateTime proximosMesDataHoraMinLocal = DataLocalDiaMesAnoHoraMinuto.plusMinutes(10);

        System.out.println();
        System.out.println("Data pura :"+ DataLocalDiaMesAnoHoraMinuto);
        System.out.println("semanaPassadaDataHoraLocal : "+semanaPassadaDataHoraLocal);
        System.out.println("proximaSemanaDataHoraLocal : "+proximaSemanaDataHoraLocal);
        System.out.println("proximosMesDataHoraLocal : "+proximosMesDataHoraLocal);
        System.out.println("proximosAnosDataHoraLocal : "+proximosAnosDataHoraLocal);
        System.out.println("proximaSemanaDataHoraSegundosLocal : "+proximaSemanaDataHoraSegundosLocal);
        System.out.println("proximaSemanaDataHoraSegundosLocal : "+proximosMesDataHoraMinLocal);



        Instant semanaPassadaDataHoraGlobal = DataGlobal.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaDataHoraGlobal = DataGlobal.plus(7,ChronoUnit.DAYS);
        System.out.println();
        System.out.println("Data global pura :"+ DataGlobal);
        System.out.println("semanaPassadaDataHoraGlobal : "+semanaPassadaDataHoraGlobal);
        System.out.println("proximaSemanaDataHoraGlobal : "+proximaSemanaDataHoraGlobal);

        //Duracao entre 2 datas.
        Duration duracaoDatahora = Duration.between(semanaPassadaDataHoraLocal,proximaSemanaDataHoraLocal);
        System.out.println();
        System.out.println("duracao em dias " + duracaoDatahora.toDays());
        System.out.println("duracao em minutos " + duracaoDatahora.toMinutes());

        //se não convertar um DataLocal (sem horas) para um Datetime dá erro.
        //atTime(0,0), converte para horas e minutos
        Duration duracaoDataLocal = Duration.between(semanaPassadaDataLocal.atStartOfDay(),proximaSemanaDataLocal.atStartOfDay());
        System.out.println("duracao data local em dias " + duracaoDataLocal.toDays());
        System.out.println("duracao data local em minutos " + duracaoDataLocal.toMinutes());


        Duration duracaoDataGlobal = Duration.between(semanaPassadaDataHoraGlobal,proximaSemanaDataHoraGlobal);
        Duration duracaoDataGlobalsubtraindo = Duration.between(proximaSemanaDataHoraGlobal,semanaPassadaDataHoraGlobal);
        System.out.println();
        System.out.println("duracao data global em dias " + duracaoDataGlobal.toDays());
        System.out.println("duracao data global subtrando em dias " + duracaoDataGlobalsubtraindo.toDays());

    }
}

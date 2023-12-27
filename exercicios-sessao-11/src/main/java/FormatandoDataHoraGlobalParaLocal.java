import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatandoDataHoraGlobalParaLocal {

    public static void main(String[] args) {

        LocalDate DataLocalDiaMesAno = LocalDate.parse("2022-07-20");
        LocalDateTime DataLocalDiaMesAnoHoraMinuto = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant DataGlobal = Instant.parse("2022-07-20T01:30:26Z");

        //data global para local, precisa informar o timezone

        //ZoneId.systemDefault pega o Id do local da máquina
        LocalDate Datalocal = LocalDate.ofInstant(DataGlobal, ZoneId.systemDefault());
        LocalDate DatalocalPortugal = LocalDate.ofInstant(DataGlobal, ZoneId.of("Portugal"));
        LocalDateTime DataHoralocal = LocalDateTime.ofInstant(DataGlobal, ZoneId.systemDefault());
        LocalDateTime DataHoralocalPortugal = LocalDateTime.ofInstant(DataGlobal, ZoneId.of("Portugal"));

        System.out.println("Data global " + DataGlobal +" para local : " +Datalocal);
        System.out.println("Data global " + DataGlobal +" para portugal : " +DatalocalPortugal);
        System.out.println("Data global " + DataGlobal +" para local : " +DataHoralocal);
        System.out.println("Data global " + DataGlobal +" para portugal : " +DataHoralocalPortugal);

        //Pegao dia de um localDate
        System.out.println("data local - Dia do mes" + DataLocalDiaMesAno.getDayOfMonth());
        System.out.println("data local - Mes texto" + DataLocalDiaMesAno.getMonth());
        System.out.println("data local - Mes Numero " + DataLocalDiaMesAno.getMonthValue());
        System.out.println("data local - Ano " + DataLocalDiaMesAno.getYear());
        System.out.println("data local - dia do ano " + DataLocalDiaMesAno.getDayOfYear());

        System.out.println("Data hora local - Hora "+ DataLocalDiaMesAnoHoraMinuto.getHour());
        System.out.println("Data hora local - minuto "+ DataLocalDiaMesAnoHoraMinuto.getMinute());
        System.out.println("Data hora local - segundos "+ DataLocalDiaMesAnoHoraMinuto.getSecond());

        /* para descobrir os ZoneId.
        for(String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }*/












    }
}

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatandoObjetosdeDatasParaTexto {

    public static void main(String[] args) {



        LocalDate DataDiaMesAno = LocalDate.parse("2022-07-20");
        LocalDateTime DataDiaMesAnoHoraMinuto = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant DataGlobal = Instant.parse("2022-07-20T01:30:26Z");

        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter formatarDataDiaMesAno = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatarDataDiaMesAnoHoraMinuto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatarDataGlobal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter formatarIsoDateTime = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatarIsoDateTimeInstant = DateTimeFormatter.ISO_INSTANT;

        //Formas diferentes de apresentar os valores.
        System.out.println("DataDiaMesAno : " + DataDiaMesAno.format(formatarDataDiaMesAno));
        System.out.println("Funciona ataDiaMesAno : " + DataDiaMesAno.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Também funcionando DataDiaMesAno : " + formatarDataDiaMesAno.format(DataDiaMesAno));

        System.out.println("DataDiaMesAnoHoraMinutoformatoUm   : " + DataDiaMesAnoHoraMinuto.format(formatarDataDiaMesAno));
        System.out.println("DataDiaMesAnoHoraMinutoformatoDois : " + DataDiaMesAnoHoraMinuto.format(formatarDataDiaMesAnoHoraMinuto));
        System.out.println("DataDiaMesAnoHoraMinuto ISO DATE TIME : " + DataDiaMesAnoHoraMinuto.format(formatarIsoDateTime));

        //para customizar o Instant
        System.out.println("DataGlobalParaTexto : " + DataGlobal);
        System.out.println("DataGlobalParaTexto : " + formatarDataGlobal.format(DataGlobal));
        System.out.println("DataGlobal ISO DATE TIME: " + formatarIsoDateTimeInstant.format(DataGlobal));












    }
}

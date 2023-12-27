import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDatas {

    public static void main(String[] args) {

        //Pega a hora da máquina (local)
        LocalDate dataLocal = LocalDate.now();

        //Pega a hora da máquina mais os minutos (local)
        LocalDateTime dataTimeLocal = LocalDateTime.now();

        //Pega a hora global GMT(trás a hora de londres )
        Instant dataInstantLondres = Instant.now();

        //Conversões de data para texto
        LocalDate conversaoDataParaTexto = LocalDate.parse("2022-07-20");
        LocalDateTime conversaoDataTimeParaTexto = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant conversaoDataGlobalParaTexto = Instant.parse("2022-07-20T01:30:26Z");
        Instant conversaoDataGlobalParaDataLocal = Instant.parse("2022-07-20T01:30:26-03:00");

        //pagina com diversos código para formatação.
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        //para formatar a data, precisa criar a formatação em um objeto e mandar junto no localDate.parse
        DateTimeFormatter formatarDataDiaMesAno = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataEmFormatoDiaMesAno = LocalDate.parse("20/07/2022",formatarDataDiaMesAno);

        DateTimeFormatter formatarDataDiaMesAnoHoraMinuto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataEmFormatoDiaMesAnoHora = LocalDateTime.parse("20/07/2022 01:30",formatarDataDiaMesAnoHoraMinuto);

        //Ao invés de colocar uma variável no segundo parâmetro, poderia ser colocado toda a formatação no seguro parâmetro
        LocalDate dataEmFormatoDiaMesAno2 = LocalDate.parse("20/07/2022",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime dataEmFormatoDiaMesAnoHora2 = LocalDateTime.parse("20/07/2022 01:30",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate datasIsoladas = LocalDate.of(2022,7,20);
        LocalDateTime datasTimeIsoladas = LocalDateTime.of(2022,7,20,1,30);



        System.out.println("dataLocal          : " + dataLocal);
        //o comando ToString é equivalente a chamar a variável normal
        System.out.println("dataLocal toString : " + dataLocal.toString());
        System.out.println("dataTimeLocal      : " + dataTimeLocal);
        System.out.println("dataIstanteLondres : " + dataInstantLondres);
        //para exibir para o usuário, precisa converter para o usuário.

        System.out.println("conversaoDataParaTexto : " + conversaoDataParaTexto);
        System.out.println("conversaoDataTimeParaTexto : " + conversaoDataTimeParaTexto);
        System.out.println("conversaoDataGlobalParaTexto : " + conversaoDataGlobalParaTexto);
        System.out.println("conversaoDataGlobalParaDataLocal : "+ conversaoDataGlobalParaDataLocal);

        //imprimiu no formato ISO
        System.out.println("dataEmFormatoDiaMesAno : "+ dataEmFormatoDiaMesAno);
        System.out.println("dataEmFormatoDiaMesAnoHora : "+ dataEmFormatoDiaMesAnoHora);

        //imprimiu no formato ISO
        System.out.println("dataEmFormatoDiaMesAno2 : "+ dataEmFormatoDiaMesAno2);
        System.out.println("dataEmFormatoDiaMesAnoHora2 : "+ dataEmFormatoDiaMesAnoHora2);

        //inserindo datas isoladas
        System.out.println("datasIsoladas: "+datasIsoladas);

        System.out.println("datasHorasIsoladas: "+datasTimeIsoladas);

    }
}

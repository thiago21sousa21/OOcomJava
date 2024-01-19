public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();

        DateHoliday[] holidays = createHolidayList();
        app.printHolidays(holidays);
        app.isThisDateAHoliday("01-01-2024");

    }

    public static DateHoliday[] createHolidayList() {
        DateHoliday[] feriadosLista = new DateHoliday[13];
        feriadosLista[0] = new DateHoliday("01-01-2024", "Confraternização Mundial");
        feriadosLista[1] = new DateHoliday("12-02-2024", "Carnaval");
        feriadosLista[2] = new DateHoliday("13-02-2024", "Carnaval");
        feriadosLista[3] = new DateHoliday("29-03-2024", "Sexta-feira Santa");
        feriadosLista[4] = new DateHoliday("21-04-2024", "Tiradentes");
        feriadosLista[5] = new DateHoliday("01-05-2024", "Dia do Trabalho");
        feriadosLista[6] = new DateHoliday("30-05-2024", "Corpus Christi");
        feriadosLista[7] = new DateHoliday("07-09-2024", "Independência do Brasil");
        feriadosLista[8] = new DateHoliday("12-10-2024", "Nossa Senhora Aparecida");
        feriadosLista[9] = new DateHoliday("02-11-2024", "Finados");
        feriadosLista[10] = new DateHoliday("15-11-2024", "Proclamação da República");
        feriadosLista[11] = new DateHoliday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra");
        feriadosLista[12] = new DateHoliday("25-12-2024", "Natal");

        return feriadosLista;
    }

    public void printHolidays(DateHoliday[] holidays) {
        for (int i = 0; i < holidays.length; i++) {
            if (holidays[i] != null) {
                System.out.println(
                        holidays[i].getDateHoliday() + " => " + holidays[i].getDescriptionHoliday());
            }
        }
    }

    public void isThisDateAHoliday(String dateForVerification) {
        DateHoliday[] holidays = createHolidayList();
        for (int i = 0; i < holidays.length; i++) {
            if (holidays[i].getDateHoliday() == dateForVerification) {
                System.out.println(holidays[i].getDateHoliday() + " é " + holidays[i].getDescriptionHoliday());
                return;
            }
        }
        System.out.println("Dia " + dateForVerification + " não é feriado 🥲");

    }
}

class DateHoliday {
    private String data;
    private String descricao;

    public DateHoliday(String data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public String getDateHoliday() {
        return data;
    }

    public String getDescriptionHoliday() {
        return descricao;
    }
}

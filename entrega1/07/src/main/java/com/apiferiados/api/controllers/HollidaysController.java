package com.apiferiados.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/holidays")
public class HollidaysController {

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

    @GetMapping
    public String printHolidays() {
        DateHoliday[] holidays = createHolidayList();
        String result = "";
        for (int i = 0; i < holidays.length; i++) {
            if (holidays[i] != null) {
                result += holidays[i].getDateHoliday() + " => " + holidays[i].getDescriptionHoliday() + "\n";
            }
        }
        System.out.println(result);
        return result;
    }

    @GetMapping("/{dateForVerification}")
    public String isThisDateAHoliday(@PathVariable String dateForVerification) {
        DateHoliday[] holidays = createHolidayList();
        String result = "";
        for (int i = 0; i < holidays.length; i++) {
            if (holidays[i].getDateHoliday() == dateForVerification) {
                result = holidays[i].getDateHoliday() + " é " + holidays[i].getDescriptionHoliday();
                return result;
            }
        }
        result = "Dia " + dateForVerification + " não é feriado 🥲";
        return result;
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

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //погода на 5 дней Ижевск
        String cityCode = RequestHandler.detectCityId("Izhevsk");
        String forecastFiveDay = RequestHandler.getForecastFiveDay(cityCode);
        System.out.println(cityCode);
        System.out.println(forecastFiveDay);

        //погода на 1 день Воронеж
        String cityCode1 = RequestHandler.detectCityId("Voronezh");
        String forecastOneDay = RequestHandler.getForecastOneDay(cityCode1);
        System.out.println(cityCode1);
        System.out.println(forecastOneDay);
    }
}

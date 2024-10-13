public class CurrencyConverter {
    private ConsumirAPI ConsumirAPI;

    public CurrencyConverter() {
        ConsumirAPI = new ConsumirAPI();
    }

    public String convert(String fromCurrency, String toCurrency, double amount) {
        try {
            // Llamamos a la API para obtener las tasas de cambio
            CurrencyRate rates = ConsumirAPI.getExchangeRates(fromCurrency);

            // Obtenemos la tasa de conversión de la moneda de destino
            Double exchangeRate = rates.getRates().get(toCurrency);

            if (exchangeRate == null) {
                return "No se pudo obtener la tasa de conversión para " + toCurrency;
            }

            // Realizamos la conversión
            double convertedAmount = amount * exchangeRate;

            return String.format("%.2f %s equivalen a %.2f %s", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (Exception e) {
            return "Error al realizar la conversión: " + e.getMessage();
        }
    }
}

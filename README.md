# ConMonedas - Java Project
App que se encarga de la conversión de monedas en java consumiendo una API

## Descripción

Este proyecto es un conversor de monedas desarrollado en Java, diseñado para interactuar con una API externa que proporciona tasas de cambio actualizadas. Utiliza la librería **Gson** para manejar las respuestas JSON de la API. El objetivo principal del proyecto es permitir a los usuarios realizar conversiones entre seis pares de monedas predefinidas.

## Desarrollo

1. **Estructura del proyecto**:
   El código fue organizado en clases para asegurar una separación clara de responsabilidades:
   
   - **principal.java**: Contiene el punto de entrada principal del programa, encargándose de la interacción con el usuario, presentando un menú y capturando las opciones.
   - **ConsumirAPI.java**: Responsable de realizar la solicitud HTTP a la API de tasas de cambio, utilizando `HttpClient` nativo de Java 11. Se implementó `Gson` para deserializar las respuestas en formato JSON.
   - **CurrencyConverter.java**: Encargada de la lógica de conversión entre monedas. Utiliza los datos obtenidos por la clase `ConsumirAPI` para calcular el valor convertido.

2. **API externa**:
   Se seleccionó una API externa que proporciona tasas de cambio en tiempo real. Se implementaron métodos de consulta mediante peticiones GET, y se integró la librería **Gson** para facilitar el manejo del JSON en las respuestas.

3. **Manejo de excepciones**:
   Se incorporó manejo de excepciones para garantizar que el programa pueda gestionar errores como problemas de conectividad con la API o valores de entrada inválidos por parte del usuario.

## Funcionamiento

El usuario selecciona entre seis pares de monedas, ingresa la cantidad a convertir y recibe el resultado de la conversión basado en las tasas de cambio actuales.

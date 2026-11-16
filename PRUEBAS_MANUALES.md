# Pruebas manuales
Autor: Diego Fernando Ardila Mora.
Estado inicial: pendientes de ejecución en dispositivo. Registrar modelo, API, orientación, fecha y versión del APK: __________.

| Caso | Acción | Resultado esperado | Resultado real / estado |
|---|---|---|---|
| Suma | 0.1 y 0,2, Sumar | Resultado: 0,3 | __________ |
| Resta | -2 y 1,5, Restar | -3,5 | __________ |
| Multiplicar | -2,5 y -2 | 5 | __________ |
| División | 5 y 2 | 2,5 | __________ |
| División periódica | 1 y 3 | 0,3333333333333333 | __________ |
| Vacíos | Limpiar y Sumar | Errores en ambos campos, sin cálculo | __________ |
| Falta uno | Solo primer número, Dividir | Error en segundo campo | __________ |
| Formato | Pegar 1,2.3 o --2 | Se rechaza sin cierre inesperado | __________ |
| Cero | Dividir 5 entre 0, 0.0 y -0,00 | Error de división entre cero | __________ |
| Decimal único | 1,000 más 0 | 1, interpretado como decimal | __________ |
| Limpiar | Calcular o provocar error, Limpiar | Entradas y errores vacíos; Resultado: — | __________ |
| Giro | Introducir -12,5 y 2, calcular y girar | Se conservan entradas y resultado | __________ |
| Giro sin calcular | Escribir entradas y girar | Entradas conservadas | __________ |
| Pantalla pequeña | Abrir teclado y desplazarse en horizontal | Todos los controles alcanzables; barras sin solapamiento | __________ |
| Texto grande | Aumentar fuente del sistema | Textos legibles y desplazamiento disponible | __________ |
| Tema oscuro | Activar modo oscuro | Campos, etiquetas y resultado legibles | __________ |

Pruebas unitarias automatizadas ejecutadas: testDebugUnitTest terminó correctamente. Informe: 10 pruebas, 0 fallos, 0 omitidas; 9 pruebas corresponden a CalculadoraTest y una a la prueba de ejemplo original. assembleDebug y lintDebug también terminaron con éxito sobre el código actualizado. Los casos manuales anteriores siguen pendientes: no hay dispositivos en ejecución.

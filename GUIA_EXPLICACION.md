# Explicación del proyecto
Autor: Diego Fernando Ardila Mora.

- app/src/main/java/com/diegoardila/calculadora/MainActivity.java: conecta las vistas con findViewById. Cada botón usa setOnClickListener para llamar a operar con su operación. Limpiar vacía los campos y errores.
- Calculadora.java: contiene la lógica Java independiente de Android. leerNumero valida el formato completo y convierte coma en punto para BigDecimal. calcular ejecuta la operación y devuelve texto con coma decimal.
- app/src/main/res/layout/activity_main.xml: ScrollView permite desplazarse con pantallas pequeñas o teclado visible; un LinearLayout vertical organiza etiquetas, dos EditText, botones y resultado.
- res/values/strings.xml y colors.xml: reúnen textos en español y colores.
- AndroidManifest.xml: declara la Activity de inicio y adjustResize para el teclado.
- Gradle y su catálogo: conservan las versiones y dependencias del proyecto original.
- CalculadoraTest.java: pruebas locales de precisión decimal, signos, operaciones y entradas inválidas.

## Validación y estado
Se comprueban ambos campos. Si falta un valor o su formato es inválido aparece un error junto al campo y se evita calcular. El divisor se compara por su valor, así que -0,00 también es cero.
Los EditText con ID guardan automáticamente su estado en la jerarquía de vistas. El resultado se guarda explícitamente en onSaveInstanceState y se restaura en onCreate.
Los insets combinan barras del sistema, recortes y teclado para que el contenido desplazable disponga del espacio visible.
No se usan bases de datos ni servicios externos. La rotación se resuelve con estado temporal de Android.

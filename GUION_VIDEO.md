# Guion de demostración — aproximadamente 4 minutos
Autor y presentador: Diego Fernando Ardila Mora.
Este documento es un guion; no constituye un video grabado.

## 0:00–0:30 Objetivo
Presentarme, indicar el nombre Calculadora y explicar que es una actividad académica con Java y layouts XML. Mostrar el proyecto abierto en Android Studio.

## 0:30–1:25 Funciones
Ejecutar la aplicación. Escribir 12,5 y -2. Mostrar suma (10,5), resta (14,5), multiplicación (-25) y división (-6,25).
Mostrar también 0.1 más 0,2, con resultado 0,3. Explicar que punto y coma representan decimales, nunca miles.

## 1:25–2:10 Validaciones
Pulsar Limpiar y luego Sumar: mostrar campos obligatorios. Introducir un formato inválido por pegado, por ejemplo 1,2.3. Probar división entre 0 y -0,00. Corregir y volver a calcular.
Girar el dispositivo y comprobar que las entradas y el resultado permanecen. Mostrar desplazamiento con teclado visible.

## 2:10–3:15 Código
Abrir activity_main.xml: explicar ScrollView, LinearLayout, EditText, Button y TextView.
Abrir MainActivity.java: señalar findViewById, listeners, validar y operar.
Mostrar onSaveInstanceState y explicar la restauración automática del texto de los EditText. Señalar el tratamiento de barras y teclado.

## 3:15–4:00 Lógica y verificación
Abrir Calculadora.java: expresión de validación, BigDecimal, switch y comparación con cero. Explicar el redondeo de división.
Ejecutar testDebugUnitTest y mostrar sus resultados reales; mostrar assembleDebug y la ubicación del APK si se generó. Finalizar indicando que el autor es Diego Fernando Ardila Mora.

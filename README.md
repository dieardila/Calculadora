# Calculadora
Autor: Diego Fernando Ardila Mora.

## Objetivo
Aplicación académica en Java y XML para sumar, restar, multiplicar y dividir dos números. Incluye validación, limpieza y conservación de entradas y resultado al girar.

## Requisitos y apertura
Conservar la configuración original: Android Gradle Plugin 9.5.1, Gradle Wrapper 9.6.0, SDK 37, minSdk 24 y compatibilidad de código Java 11. Usar el JDK de Gradle configurado en Android Studio.
Clonar o descargar el repositorio Calculadora y abrir su carpeta raíz mediante File > Open; después sincronizar Gradle. Instalar el SDK requerido si falta. local.properties contiene la ubicación local del SDK y no se distribuye.

## Compilar
Ejecutar desde la carpeta raíz en PowerShell:
- ./gradlew.bat assembleDebug
- ./gradlew.bat testDebugUnitTest
- ./gradlew.bat lintDebug

APK: app/build/outputs/apk/debug/app-debug.apk.
Informe de pruebas: app/build/reports/tests/testDebugUnitTest/index.html.
Informe de análisis: app/build/reports/lint-results-debug.html.
Verificación realizada sobre el código actualizado: ./gradlew.bat assembleDebug testDebugUnitTest lintDebug --console=plain terminó con BUILD SUCCESSFUL (código de salida 0). Se compilaron MainActivity, Calculadora y las pruebas. El autor confirmó que instaló y probó la aplicación en su celular y que funciona correctamente. No se documentan casos concretos, modelo o versión de Android porque no fueron proporcionados.

## Ejecutar
Seleccionar app y un dispositivo o emulador con Android 7.0 o posterior; pulsar Run.
Introducir dos números, elegir una operación o pulsar Limpiar. Coma y punto son separadores decimales, nunca de miles: 1,000 significa uno.
Suma, resta y multiplicación usan BigDecimal exacto; división redondea a 16 cifras significativas.
No utiliza servicios externos ni permisos adicionales.

## Documentación
GUIA_EXPLICACION.md explica archivos, listeners y estado.
GUION_VIDEO.md propone una demostración de cuatro minutos.
PRUEBAS_MANUALES.md contiene casos y espacios para registrar resultados reales.
La confirmación general de funcionamiento en celular no implica que se hayan ejecutado todos los casos de PRUEBAS_MANUALES.md; sus resultados específicos deben registrarse cuando se comprueben.

## Uso de asistencia de IA
Este proyecto se desarrolló con asistencia de IA mediante Codex en Android Studio para generar y ajustar código Java, layouts XML, pruebas unitarias y documentación, y para ejecutar y revisar comprobaciones de compilación.
El autor de la entrega es Diego Fernando Ardila Mora. La IA no se presenta como una persona integrante del equipo. No se atribuyen aportes de compañeros ni acciones personales que no hayan sido comunicadas.
La prueba en celular indicada anteriormente fue reportada por el autor; no fue una prueba visual realizada por el asistente.

## Contenido del repositorio
Se conservan código fuente, pruebas, recursos XML, manifiesto, configuración Gradle, catálogo de versiones y Gradle Wrapper (gradlew, gradlew.bat, gradle/wrapper/gradle-wrapper.jar y gradle-wrapper.properties).
.gitignore excluye local.properties, cachés .gradle, carpetas build, archivos locales del IDE, APK/AAB generados y formatos habituales de claves. Cada equipo debe configurar su SDK local. No se deben publicar credenciales.
El nombre previsto del repositorio es Calculadora. La preparación no crea repositorios, commits ni remotos y no publica contenido en GitHub.

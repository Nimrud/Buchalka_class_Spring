package m01_basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    // DODANIE LOGGERA
    // w MVNRepository wyszukujemy Logback Classic Module i dodajemy dependency w pom.xml
    // wyłączamy przy tym 'scope' i robimy reload w zakładce Maven

    private final static Logger log = LoggerFactory.getLogger(Main.class);
    // klasa Logger (slf4j) od razu nie wyskakuje w podpowiedziach
    // trzeba wyłączyć <scope>test</scope> w dependencies

    // plik konfiguracyjny Logbacka tworzymy w pakiecie 'resources'
    // definiujemy w nim, jaki ma być wzorzec informacji zwrotnej loggera

    public static void main(String[] args) {
        log.info("Info");
        log.debug("Debug");
    }
}

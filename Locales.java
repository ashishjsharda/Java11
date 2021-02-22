import java.util.Locale;
import java.util.stream.Stream;

/**
 *Locales using Streams
 * @author ashish
 */
public class Locales {
    public static void main(String[] args) {

        Stream<Locale> locales=Stream.of(Locale.getAvailableLocales());
        locales.forEach(System.out::println);
    }
}

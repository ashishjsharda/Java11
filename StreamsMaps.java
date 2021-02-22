import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *Put Streams results into Maps
 * @author ashish
 */
public class StreamsMaps {
    public static void main(String[] args) {

        Stream<Locale> locales=Stream.of(Locale.getAvailableLocales());
        Map<String, List<Locale>> countryLocale=locales.collect(Collectors.groupingBy(Locale::getCountry));
        System.out.println(countryLocale.get("CH"));

    }
}

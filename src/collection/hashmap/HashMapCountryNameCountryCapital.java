package collection.hashmap;
import java.util.LinkedHashMap;
import java.util.Set;


public class HashMapCountryNameCountryCapital {

    public void createCountryHashMap() {

        LinkedHashMap<String, String> countryData = new LinkedHashMap<>();
        // countryName,countryCapital
        countryData.put("Afghanistan", "Kabul");
        countryData.put("Albania", "Tirane");
        countryData.put("Algeria", "Algiers");
        countryData.put("Andorra", "Andorra la Vella");
        countryData.put("Angola", "Luanda");
        countryData.put("Antigua and Barbuda", "Saint John's");
        countryData.put("Argentina", "Buenos Aires");
        countryData.put("Armenia", "Yerevan");
        countryData.put("Australia", "Canberra");
        countryData.put("Austria", "Vienna");
        countryData.put("Azerbaijan", "Baku");
        countryData.put("The Bahamas", "Nassau");
        countryData.put("Bahrain", "Manama");
        countryData.put("Bangladesh", "Dhaka");
        countryData.put("Barbados", "Bridgetown");
        countryData.put("Belarus", "Minsk");
        countryData.put("Belgium", "Brussels");
        countryData.put("Belize", "Belmopan");
        countryData.put("Benin", "Porto-Novo");
        countryData.put("Bhutan", "Thimphu");
        countryData.put("Bolivia", "La Paz");
        countryData.put("Bosnia and Herzegovina", "Sarajevo");
        countryData.put("Botswana", "Gaborone");
        countryData.put("Brazil", "Brasilia");
        countryData.put("Brunei", "Bandar Seri Begawan");
        countryData.put("Bulgaria", "Sofia");
        countryData.put("Burkina Faso", "Ouagadougou");
        countryData.put("Burundi", "Gitega");
        countryData.put("Cambodia", "Phnom Penh");
        countryData.put("Cameroon", "Yaounde");
        countryData.put("Canada", "Ottawa");
        countryData.put("Cape Verde", "Praia");
        countryData.put("Central African Republic", "Bangui");
        countryData.put("Chad", "N'Djamena");
        countryData.put("Chile", "Santiago");
        countryData.put("China", "Beijing");
        countryData.put("Colombia", "Bogota");
        countryData.put("Comoros", "Moroni");
        countryData.put("Republic of the Congo", "Brazzaville");
        countryData.put("Costa Rica", "San Jose");
        countryData.put("Cote d'lovire", "Yamoussoukro,Abidjan");
        countryData.put("Croatia", "Zagreb");
        countryData.put("Cuba", "Havana");
        countryData.put("Cyprus", "Nicosia");
        countryData.put("Czech Republic", "Prague");
        countryData.put("Denmark", "Copenhagen");
        countryData.put("Djibouti", "Djibouti");
        countryData.put("Dominica", "Roseau");
        countryData.put("Dominican Republic", "Santo Domingo");
        countryData.put("East Timor(Timor-Leste)", "Dili");
        countryData.put("Ecuador", "Quito");
        countryData.put("Egypt", "Cairo");
        countryData.put("El Salvador", "San Salvador");
        countryData.put("Equatorial Guinea", "Malabo");
        countryData.put("Eritrea", "Asmara");
        countryData.put("Estonia", "Tallinn");
        countryData.put("Ethiopia", "Addis Ababa");
        countryData.put("Fiji", "Suva");
        countryData.put("Finland", "Helsinki");
        countryData.put("France", "Paris");
        countryData.put("Gabon", "Libreville");
        countryData.put("The Gambia", "Banjul");
        countryData.put("Georgia", "Tbilisi");
        countryData.put("Germany", "Berlin");
        countryData.put("Ghana", "Accra");
        countryData.put("Greece", "Athens");
        countryData.put("Grenada", "Saint George's");
        countryData.put("Guatemala", "Guatemala City");
        countryData.put("Guinea", "Conakry");
        countryData.put("Guinea-Bissau", "Bissau");
        countryData.put("Guyana", "Georgetown");
        countryData.put("Haiti", "Port-au-Prince");
        countryData.put("Honduras", "Tegucigalpa");
        countryData.put("Hungary", "Budapest");
        countryData.put("Iceland", "Reykjavik");
        countryData.put("India", "New Delhi");
        countryData.put("Indonesia", "Jakarta");
        countryData.put("Iran", "Tehran");
        countryData.put("Iraq", "Baghdad");
        countryData.put("Ireland", "Dublin");
        countryData.put("Israel", "Jerusalem");
        countryData.put("Italy", "Rome");
        countryData.put("Jamaica", "Kingston");
        countryData.put("Japan", "Tokyo");
        countryData.put("Jordan", "Amman");
        countryData.put("Kazakhstan", "Nur Sultan");
        countryData.put("Kenya", "Nairobi");
        countryData.put("Kiribati", "Tarawa Atoll");
        countryData.put("North Korea", "Pyongyang");
        countryData.put("South Korea", "Seoul");
        countryData.put("Kuwait", "Kuwait City");
        countryData.put("Kyrgyzstan", "Bishkek");
        countryData.put("Laos", "Vientiane");
        countryData.put("Latvia", "Riga");
        countryData.put("Lebanon", "Beirut");
        countryData.put("Lesotho", "Maseru");
        countryData.put("Liberia", "Monrovia");
        countryData.put("Libya", "Tripoli");
        countryData.put("Liechtenstein", "Vaduz");
        countryData.put("Lithuania", "Vilnius");
        countryData.put("Luxembourg", "Luxembourg");
        countryData.put("Macedonia", "Skopje");
        countryData.put("Madagascar", "Antananarivo");
        countryData.put("Malawi", "Lilongwe");
        countryData.put("Malaysia", "Kuala Lumpur");
        countryData.put("Maldives", "Male");
        countryData.put("Mali", "Bamako");
        countryData.put("Malta", "Valletta");
        countryData.put("Marshall Islands", "Majuro");
        countryData.put("Mauritania", "Nouakchott");
        countryData.put("Mauritius", "Port Louis");
        countryData.put("Mexico", "Mexico City");
        countryData.put("Federated States of Micronesia", "Palikir");
        countryData.put("Moldova", "Chisinau");
        countryData.put("Monaco", "Monte Carlo");
        countryData.put("Mongolia", "Ulaanbaatar");
        countryData.put("Montenegro", "Podgorica");
        countryData.put("Morocco", "Rabat");
        countryData.put("Mozambique", "Maputo");
        countryData.put("Myanmar(Burma)", "Nay Pyi Taw");
        countryData.put("Namibia", "Windhoek");
        countryData.put("Nauru", "Yaren");
        countryData.put("Nepal", "Kathmandu");
        countryData.put("Netherlands", "Amsterdam");
        countryData.put("New Zealand", "Wellington");
        countryData.put("Nicaragua", "Managua");
        countryData.put("Niger", "Niamey");
        countryData.put("Nigeria", "Abuja");
        countryData.put("Norway", "Oslo");
        countryData.put("Oman", "Muscat");
        countryData.put("Pakistan", "Islamabad");
        countryData.put("Palau", "Melekeok");
        countryData.put("Palestine", "Ramallah,East Jerusalem");
        countryData.put("Panama", "Panama City");
        countryData.put("Papua New Guinea", "Port Moresby");
        countryData.put("Paraguay", "Asuncion");
        countryData.put("Peru", "Lima");
        countryData.put("Philippines", "Manila");
        countryData.put("Poland", "Warsaw");
        countryData.put("Portugal", "Lisbon");
        countryData.put("Qatar", "Doha");
        countryData.put("Romania", "Bucharest");
        countryData.put("Russia", "Moscow");
        countryData.put("Rwanda", "Kigali");
        countryData.put("Saint Kitts and Nevis", "Basseterre");
        countryData.put("Saint Lucia", "Castries");
        countryData.put("Saint Vincent and the Grenadines", "Kingston");
        countryData.put("Samoa", "Apia");
        countryData.put("San Marino", "San Marino");
        countryData.put("Sao Tome and Principe", "Sao Tome");
        countryData.put("Saudi Arabia", "Riyadh");
        countryData.put("Senegal", "Dakar");
        countryData.put("Serbia", "Belgrade");
        countryData.put("Seychelles", "Victoria");
        countryData.put("Sierra Leone", "Freetown");
        countryData.put("Singapore", "Singapore");
        countryData.put("Slovakia", "Bratislava");
        countryData.put("Slovenia", "Ljubljana");
        countryData.put("Solomon Islands", "Honiara");
        countryData.put("Somalia", "Mogadishu");
        countryData.put("South Africa", "Pretoria,Cape Town,Bloemfontein");
        countryData.put("South Sudan", "Juba");
        countryData.put("Spain", "Madrid");
        countryData.put("Sri Lanka", "Colombo");
        countryData.put("Sudan", "Khartoum");
        countryData.put("Suriname", "Paramaribo");
        countryData.put("Swaziland", "Mbabane");
        countryData.put("Sweden", "Stockholm");
        countryData.put("Switzerland", "Berne");
        countryData.put("Syria", "Damascus");
        countryData.put("Taiwan", "Taipei");
        countryData.put("Tajikistan", "Dushanbe");
        countryData.put("Tanzania", "Dar es Salaam");
        countryData.put("Thailand", "Bangkok");
        countryData.put("Togo", "Lome");
        countryData.put("Tonga", "Nuku'alofa");
        countryData.put("Trinidad and Tobago", "Port of Spain");
        countryData.put("Tunisia", "Tunis");
        countryData.put("Turkey", "Ankara");
        countryData.put("Turkmenistan", "Ashgabat");
        countryData.put("Tuvalu", "Vaiaku villege,Funafuti Province");
        countryData.put("Uganda", "Kampala");
        countryData.put("Ukraine", "Kiev");
        countryData.put("United Arab Emirates", "Abu Dhabi");
        countryData.put("United Kingdom", "London");
        countryData.put("United States of America", "Washington D.C.");
        countryData.put("Uruguay", "Montevideo");
        countryData.put("Uzbekistan", "Tashkent");
        countryData.put("Vanuatu", "Port-Vila");
        countryData.put("Vatican City", "Vatican City");
        countryData.put("Venezuela", "Caracas");
        countryData.put("Vietnam", "Hanoi");
        countryData.put("Yemen", "Sanaa");
        countryData.put("Zambia", "Lusaka");
        countryData.put("Zimbabwe", "Harare");

        System.out.println("WELCOME SCREEN");
        System.out.println(countryData.get("Zimbabwe"));
        System.out.println(" ");
        System.out.println(countryData);
        System.out.println(" ");

        Set<String> keys = countryData.keySet();
        for (String key : keys) {
            System.out.println("Printing CountryCapital using Advanced for loop :" + countryData.get(key));
        }
    }

    public void createCountryNameWithPopulation() {

        LinkedHashMap<Integer, String> populationData = new LinkedHashMap<>();


        populationData.put(1431012843, "INDIA");
        populationData.put(1425607058, "CHINA");
        populationData.put(340327659, "UNITED STATES");
        populationData.put(277948831, "INDONESIA");
        populationData.put(224762384, "PAKISTAN");
        populationData.put(216646550, "NIGERIA");
        populationData.put(173271987, "BRAZIL");
        populationData.put(144354116, "BANGLADESH");
        populationData.put(128625914, "RUSSIA");
        populationData.put(127101500, "MEXICO");
        populationData.put(123175071, "ETHIOPIA");
        populationData.put(117657387, "PHILIPPINES");
        populationData.put(113030664, "EGYPT");
        populationData.put(102861256, "DR CONGO");
        populationData.put(98977292, "VIET NAM");
        populationData.put(89291380, "IRAN");
        populationData.put(85897624, "TURKEY");
        populationData.put(83288033, "GERMANY");
        populationData.put(71818431, "THAILAND");
        System.out.println(" ");
        System.out.println(populationData);
        System.out.println(" ");
        System.out.println(populationData.get(71818431));


        System.out.println(" ");
        System.out.println("****Using Advanced for loop****");
        System.out.println(" ");
        Set<Integer> keys = populationData.keySet();
        for (Integer key : keys) {
            System.out.println("Printing CountryName Using Advanced for loop : " + populationData.get(key));
        }


    }

    public void createDoubleWithCountryName() {
        LinkedHashMap<String, Double> populationDataWithDouble = new LinkedHashMap<>();

        populationDataWithDouble.put("INDIA", 1.1);
        populationDataWithDouble.put("CHINA", 1.2);
        populationDataWithDouble.put("UNITED STATES", 1.3);
        populationDataWithDouble.put("INDONESIA", 1.4);
        populationDataWithDouble.put("PAKISTAN", 1.5);
        populationDataWithDouble.put("NIGERIA", 1.6);
        populationDataWithDouble.put("BRAZIL", 1.7);
        populationDataWithDouble.put("BANGLADESH", 1.8);
        populationDataWithDouble.put("RUSSIA", 1.9);
        populationDataWithDouble.put("MEXICO", 2.0);
        populationDataWithDouble.put("ETHIOPIA", 2.1);
        populationDataWithDouble.put("PHILIPPINES", 2.2);
        populationDataWithDouble.put("EGYPT", 2.3);
        populationDataWithDouble.put("DR CONGO", 2.4);
        populationDataWithDouble.put("VIET NAM", 2.5);
        populationDataWithDouble.put("IRAN", 2.6);
        populationDataWithDouble.put("TURKEY", 2.7);
        populationDataWithDouble.put("GERMANY", 2.8);
        populationDataWithDouble.put("THAILAND", 2.9);
        System.out.println(" ");
        System.out.println(populationDataWithDouble);

        System.out.println(" ");
        System.out.println(populationDataWithDouble.get("THAILAND"));
        Set<String> keys = populationDataWithDouble.keySet();
        System.out.println(" ");
        System.out.println("****Using for Advanced for loop****");
        System.out.println(" ");
        for (String key : keys) {
            System.out.println("Printing CountryName with Population Grade :" + populationDataWithDouble.get(key));
        }
    }

    public static void main(String[] args) {
        HashMapCountryNameCountryCapital obj = new HashMapCountryNameCountryCapital();
        obj.createCountryHashMap();
        obj.createCountryNameWithPopulation();
        obj.createDoubleWithCountryName();

    }
}

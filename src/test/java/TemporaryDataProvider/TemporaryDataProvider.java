package TemporaryDataProvider;

import java.util.List;

import static java.util.Arrays.asList;

public class TemporaryDataProvider {
    public static String baseUrl = "https://www.mbank.pl";
    public static String expectedUrl = "https://www.mbank.pl/indywidualny/";
    public static List<String> expectedUrlFromFirstMenu = asList("/indywidualny/", "/private-banking/", "/firmy/", "/msp-korporacje/");
    public static String demoPageHeaderText = "Witamy w wersji demonstracyjnej serwisu transakcyjnego mBanku.";
    public static List<String> expectedHelpProposalsHeaders = asList("Samouczków,", "Filmów wideo,", "Eksperta online,");
    public static List<String> expectedFirstMenuDescriptions = asList("Oferta indywidualna", "Private banking", "Oferta dla firm", "MSP i korporacje");
}

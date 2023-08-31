package ru.avito.autotest;

public class Utils {
    public final static String ADD_TO_FAVORITES = "//*[contains(@class, 'add-favorite')]";
    public final static String LINK_TO_FAVORITES = "a[href='/favorites/knigi_i_zhurnaly']";
    public final static Long ADS_ID = 2639542363L;

    public final static String EXPECTED_LINK = String.format("a[href$='%d']", ADS_ID);
    public final static String EXPECTED_TEXT_TO_FAVORITES = "в избранное";
    public final static String AVITO = "https://avito.ru/";
}

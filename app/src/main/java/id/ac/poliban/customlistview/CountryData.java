package id.ac.poliban.customlistview;
import java.util.ArrayList;
import java.util.List;

public class CountryData {
    static List<Country> getAllData(){
        List<Country> data = new ArrayList<>();
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_Indonesia.svg/125px-Flag_of_Indonesia.svg.png","Indonesia","Indonesia (/ˌɪndəˈniːʒə/ (About this soundlisten) IN-də-NEE-zhə, /-ˈniːziə/ -\u2060NEE-zee-ə; Indonesian: [ɪndoˈnesia]), officially the Republic of Indonesia (Indonesian: Republik Indonesia [reˈpublik ɪndoˈnesia]),[a] is a country in Southeast Asia, between the Indian and Pacific oceans. It is the world's largest island country, with more than seventeen thousand islands,[11] and at 1,904,569 square kilometres (735,358 square miles), the 14th largest by land area and 7th in the combined sea and land area.[12] With over 261 million people, it is the world's 4th most populous country as well as the most populous Muslim-majority country.[13] Java, the world's most populous island,[14] is home to more than half of the country's population."));

        return data;
    }
}

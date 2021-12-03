package Main;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //Создание нужного конвертора
        Converter converter = new ConverterTXT_to_XML();
        //Создание класса maker
        Maker maker = new Maker(converter);
        //Конвертация
        maker.startCon("article.txt","article.xml");


    }
}

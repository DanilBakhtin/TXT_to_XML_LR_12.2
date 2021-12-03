package Main;

import java.util.ArrayList;

//Абстрактный класс конвертор
abstract class Converter {

    //Заголовок
    protected String head;
    //Авторы
    protected ArrayList<String> authors = new ArrayList<>();
    //Текст статьи
    protected String text;
    //Хэш-код текста статьи
    protected String hash;
    //Считанный текст(по строчно)
    protected ArrayList<String> startText = new ArrayList<>();


    //метод чтения файла
    public abstract void writer(String path);
    //метод записи в файл
    public abstract void reader(String path);
    //метод создания заголовка
    public abstract void makeHeader();
    //метод создания авторов
    public abstract void makeAuthors();
    //метод создания текста
    public abstract void makeText();
    //метод создания хэш-кода
    public abstract void makeHashCode();
    //метод проверки хэш-кода
    public abstract void checkHC();
    //метод конвертации
    public abstract void conversion();
}

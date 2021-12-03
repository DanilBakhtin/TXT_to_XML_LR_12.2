package Main;

public class Maker {

    Converter converter;

    public Maker(Converter converter) {
        this.converter = converter;
    }

    public void startCon(String path1, String path2){
        converter.reader(path1);
        converter.makeHeader();
        converter.makeAuthors();
        converter.makeText();
        converter.makeHashCode();
        converter.checkHC();
        converter.conversion();
        converter.writer(path2);
    }
}

package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Класс для конвертации из txt в xml, наследник класса конвертор
public class ConverterTXT_to_XML extends Converter{

    private Data data = new Data();

    @Override
    public void writer(String path) {
        try {
            FileWriter writer = new FileWriter(new File(path), false);
            writer.write(data.result());

            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void reader(String path) {
        try {
            BufferedReader reader =new BufferedReader(new FileReader(new File(path)));
            String line;
            while((line = reader.readLine()) != null){
                startText.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void makeHeader() {
        head = startText.get(0);
    }

    @Override
    public void makeAuthors() {
        String mass[] = startText.get(1).split(" ");
        for (int i = 0; i < mass.length; i++)
            authors.add(mass[i]);
    }

    @Override
    public void makeText() {

        text = "";
        for (int i = 2; i < startText.size() - 1; i++)
            text += startText.get(i);
    }

    @Override
    public void makeHashCode() {
        hash = startText.get(startText.size() - 1);
    }

    @Override
    public void checkHC() {
        String hash_text = text.hashCode() + "";
        if (hash.equals(hash_text))
            System.out.println("Хэш-код верный");
        else System.out.println("Хэш-код НЕ верный");
    }

    @Override
    public void conversion() {

        data.addNewData("<article>");

        data.addNewData("<head>" + head + "</head>");

        for (int i = 0; i < authors.size(); i++)
            data.addNewData("<author>" + authors.get(i) + "</author>");

        data.addNewData("<text>" + text + "</text>");

        data.addNewData("<hash>" + hash + "</hash>");

        data.addNewData("</article>");

    }

}

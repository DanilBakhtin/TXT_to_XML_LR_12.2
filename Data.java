package Main;

import java.util.ArrayList;

public class Data {

    private ArrayList<String> teg_data = new ArrayList<>();

    //Добавление новых данных
    public void addNewData(String data){
        teg_data.add(data);
    }

    //Создание строки из данных
    public String result() {
        String out = "";
        for (int i = 0; i < teg_data.size(); i++)
            out += teg_data.get(i) + "\n";
        return out;
    }

}

package co.edu.umanizales.mythirdapi.service;

import co.edu.umanizales.mythirdapi.model.Location;
import co.edu.umanizales.mythirdapi.model.Store;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;



@Service
public class StoreService  {
    public List<Store> getStoresFromCSV(String filepath) throws IOException {
        List<Store> stores = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(filepath))){
            String[] nextline;
            while((nextline = csvReader.readNext()) != null) {

                String name = nextline[0];
                String city = nextline[1];
                String code = nextline[2];
                String ID = nextline[3];
                String Adress = nextline[4];
            }

        } catch (IOException e) {
            e.printStackTrace();
        }catch (CsvValidationException e){
            throw new RuntimeException(e);
        }
        return stores;
    }
}
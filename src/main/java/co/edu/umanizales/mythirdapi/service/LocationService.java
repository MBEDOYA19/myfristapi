package co.edu.umanizales.mythirdapi.service;

import co.edu.umanizales.mythirdapi.model.Location;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    // Método para leer el archivo CSV y convertirlo en una lista de Location
    public List<Location> loadLocationsFromCSV(String filePath) throws IOException, CsvValidationException {
        List<Location> locations = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextline;


            while ((nextline = reader.readNext()) != null) {
                String code = nextline[0];

                String description = nextline[1];
                Location location = new Location(code, description);
                locations.add(new Location(code, description));

            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (CsvValidationException e){
            throw new RuntimeException(e);
        }

        return locations;
    }



}


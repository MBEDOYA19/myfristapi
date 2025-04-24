package co.edu.umanizales.mythirdapi.service;

import co.edu.umanizales.mythirdapi.model.Location;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


@Service
@Getter
public class LocationService {

    private List<Location> locations;

    @Value("${locations_filename}")
    private String locationsFilename;

    @PostConstruct
    public void readLocationsFromCSV() throws IOException, URISyntaxException {
        locations = new ArrayList<>();
        locations.add(new Location("05","ANTIOQUIA"));
        locations.add(new Location("17","CALDAS"));
        locations.add(new Location("66","RISARALDA"));
        locations.add(new Location("91","AMAZONAS"));
        locations.add(new Location("08","ATLANTICO"));
        locations.add(new Location("11","BOGOTA"));
        locations.add(new Location("13","BOLIVAR"));
        locations.add(new Location("15","BOYACA"));
        locations.add(new Location("18","CAQUETA"));
        locations.add(new Location("19","CAUCA"));
        locations.add(new Location("85","CASANARE"));
        locations.add(new Location("20","CESAR"));
        locations.add(new Location("27","CHOCO"));
        locations.add(new Location("25","CUNDINAMARCA"));
        locations.add(new Location("23","CORDOBA"));
        locations.add(new Location("94","GUANIA"));
        locations.add(new Location("95","GUAVIARE"));
        locations.add(new Location("41","HUILA"));
        locations.add(new Location("44","LA GUAJIRA"));
        locations.add(new Location("47","MAGDALENA"));
        locations.add(new Location("50","META"));
        locations.add(new Location("52","NARIÑO"));
        locations.add(new Location("54","NORTE DE SANTANDER"));
        locations.add(new Location("86","PUTUMAYO"));
        locations.add(new Location("63","QUINDIO"));
        locations.add(new Location("88","SAN ANDRES y PROVIDENCIA"));
        locations.add(new Location("68","SANTANDER"));
        locations.add(new Location("70","SUCRE"));
        locations.add(new Location("73","TOLIMA"));
        locations.add(new Location("76","VALLE DEL CAUCA"));
        locations.add(new Location("99","VICHADA"));
        locations.add(new Location("97","VAUPES"));
        locations.add(new Location("81","ARAUCA"));


        Path pathFile = Paths.get(ClassLoader.getSystemResource(locationsFilename).toURI());

        try (CSVReader csvReader = new CSVReader(new FileReader(pathFile.toString()))) {
            String[] line;
            csvReader.skip(1);
            // Ciclo para Leer todas las filas del CSV
            while ((line = csvReader.readNext()) != null) {

                // Crear un nuevo objeto Location y agregarlo a la lista
                locations.add(new Location(line[2],line[3]));

            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;  // Lanza la excepción para que pueda manejarse en la capa superior si es necesario
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
    //Ciclo para retornar un codigo
    public Location getLocationByCode(String code) {
        for (Location location : locations) {
            if (location.getCode().equals(code)) {
                return location;
            }
        }
        return null;
    }
    //ciclo para retornar estados
    public List<Location> getStates() {
        List<Location> states = new ArrayList<>();
        for (Location location : locations) {
            if (location.getCode().length() == 2) {
                states.add(location);
            }
        }
        return states;
    }

    public List<Location> getLocationsByName(String name) {
        List<Location> result = new ArrayList<>();
        for (Location location : locations) {
            if (location.getCode().startsWith(name)) {
                result.add(location);
            }
        }
        return result;
    }
    //Ciclo para retornar las iniciales de las letras de ciertos codigos
    public List<Location> getLocationsByInitialLetters(String letters) {
        List<Location> result = new ArrayList<>();
        for (Location location : locations) {
            if (location.getDescription().startsWith(letters)) {
                result.add(location);
            }
        }
        return result;
    }
    //Ciclo para retornar las ubicaciones por codigo del departamento
    public List<Location> getLocationsByStateCode(String stateCode) {
        List<Location> statesCode = new ArrayList<>();
        for (Location location : locations) {
            if (location.getCode().startsWith(stateCode)) {
                statesCode.add(location);
            }

        }
        return statesCode;
    }
    //Ciclo para retornar capitales
    public List<Location> getCapitals() {
        List<Location> result = new ArrayList<>();
        for (Location location : locations) {
            if (location.getCode().endsWith("01") && location.getCode().length() == 5) {
                result.add(location);
            }
        }
        return result;

    }

    //Ciclo para retornar el departamento del codigo dado que tenga solo dos caracteres
    public Location getStateByCode(String code) {
        for (Location location : locations) {
            if (location.getCode().equals(code) && location.getCode().length() == 2) {
                return location;
            }
        }
        return null;
    }

    public List<Location> getLocationsByInitialAndLetter(char letterA, char letterB ) {
        List<Location> initialandendletterArray = new ArrayList<>();
        for (Location location : locations) {
            if(location.getDescription().charAt(0)== letterA && location.getDescription().charAt(location.getDescription().length()-1)== letterB){
                initialandendletterArray.add(location);
            }
        }
        return initialandendletterArray;
    }

}
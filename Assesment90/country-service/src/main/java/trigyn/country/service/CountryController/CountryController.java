package trigyn.country.service.CountryController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trigyn.country.service.Model.Country;
import trigyn.country.service.service.CountryService;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    CountryService countryService;

    @PostMapping("/save")

    public ResponseEntity<Country> saveountry(@RequestBody Country obj)

            throws Exception {

        countryService.save(obj);

        return new ResponseEntity<Country>(obj, HttpStatus.CREATED);

    }


    @PostMapping("/delete")

    public ResponseEntity<Country> deleteCustCountry(@RequestBody Country obj)

            throws Exception {

        countryService.remove(obj);

        return new ResponseEntity<Country>(obj, HttpStatus.CREATED);

    }

    @GetMapping("/all")

    public ResponseEntity<List<Country>> getAllCustCountry() {

        List<Country> list = countryService.getAll();

        return new ResponseEntity<List<Country>>(list, HttpStatus.OK);

    }


    @GetMapping("/{id}")

    public ResponseEntity<Country> getByIdCustCountry(@PathVariable Integer id) {

        Country obj = countryService.getById(id);

        return new ResponseEntity<Country>(obj, HttpStatus.OK);

    }

    @DeleteMapping("/{id}")

    public ResponseEntity<Country>

    deleteCustCountry(@PathVariable Integer id)

            throws Exception {

        countryService.remove(id);

        return new ResponseEntity<Country>(HttpStatus.OK);

    }
}

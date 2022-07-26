package dh.meli.datapraticaintegradoraii.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class TestCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_case;
    private String description;
    private boolean tested;
    private boolean passed;
    private int number_of_tries;
    private LocalDate last_update;

}

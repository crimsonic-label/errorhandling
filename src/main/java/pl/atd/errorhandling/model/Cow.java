package pl.atd.errorhandling.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Cow {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(name="CAN_MOO")
    private Boolean canMoo;
}

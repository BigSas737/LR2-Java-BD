package students;

import Groups.Group;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private int age;

    @ManyToOne (fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "group_id",nullable = false)
    @JsonIgnore
    private Group group;
}





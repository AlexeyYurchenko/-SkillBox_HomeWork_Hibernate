package Key;

import lombok.*;
import tables.Course;
import tables.Student;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@NoArgsConstructor
@Getter
@Setter
public class SubscriptionsKey implements Serializable {
    @OneToOne
    private Student student;

    @OneToOne
    private Course course;

    public SubscriptionsKey(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
}
package tables;

import Key.LinkedPurchaseListKey;
import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "LinkedPurchaseList")
@NoArgsConstructor
@AllArgsConstructor
public class LinkedPurchaseList {

    @EmbeddedId
    private LinkedPurchaseListKey id;

    public LinkedPurchaseList(LinkedPurchaseListKey id) {
        this.id = id;
    }

    @Column(name = "student_id", insertable = false, updatable = false)
    private int studentId;

    @Column(name = "course_id", insertable = false, updatable = false)
    private int courseId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "price")
    private int price;

    @Column(name = "subscription_date")
    private Date subscriptionDate;
}
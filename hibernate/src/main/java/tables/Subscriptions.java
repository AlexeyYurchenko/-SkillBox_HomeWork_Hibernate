package tables;

import Key.SubscriptionsKey;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Subscriptions")
public class Subscriptions {

    @EmbeddedId
    private SubscriptionsKey subscriptionsKey;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "subscription_date")
    private Date subscriptionDate;
}
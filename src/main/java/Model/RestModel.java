package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "contact_details")
public class RestModel {
    //RentalId
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //RentalDate
    private int RentalDate;

    //DueDate
    private int DueDate;

    //TotalCost
    private double TotalCost;

    //fine
    private double fine;

    //ReturnDate
    private int ReturnDate;

}

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private Double interestRate;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    private Customer customer;
    // Getters and Setters
}

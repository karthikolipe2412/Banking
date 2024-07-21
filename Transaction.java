@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Double amount;
    @ManyToOne
    private Account account;
    private LocalDate date;
    // Getters and Setters
}

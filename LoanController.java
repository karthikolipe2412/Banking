@RestController
@RequestMapping("/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @PostMapping
    public ResponseEntity<Loan> createLoan(@RequestBody Loan loan) {
        return new ResponseEntity<>(loanService.createLoan(loan), HttpStatus.CREATED);
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<Loan>> getLoansByCustomerId(@PathVariable Long customerId) {
        return new ResponseEntity<>(loanService.getLoansByCustomerId(customerId), HttpStatus.OK);
    }
}

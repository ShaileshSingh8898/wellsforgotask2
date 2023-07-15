
package javax.persistence;




import javax.persistence.*;


public class FinancialAdvisor {

   
    private Long id;

    private String name;
    private String email;

    public FinancialAdvisor() {
    }

    public FinancialAdvisor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters (excluding setId)

    public Long getId() {
        return id;
    }

    // Other getters and setters
}


   
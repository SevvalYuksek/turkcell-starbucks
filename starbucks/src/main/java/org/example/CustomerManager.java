package org.example;

public class CustomerManager {
    private VerificationService verificationService;

    public CustomerManager(VerificationService verificationService) {
        this.verificationService = verificationService;
    }

    public void add(Customer customer){
        if (verificationService.CheckIfRealPerson(customer)){
            System.out.println("Doğrulandı");
        }
        else System.out.println("Doğrulanamadı");
    }
}

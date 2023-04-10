package org.example;

public class EdevletServiceAdapter implements VerificationService{

    private EdevletService edevletService = new EdevletService();

    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        return edevletService.verify(customer.getName(), customer.getLastName(), customer.getBirthYear(), customer.getNationalId());
    }
}

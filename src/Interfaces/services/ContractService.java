package Interfaces.services;

import Interfaces.entities.Contract;
import Interfaces.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){

        double basicParcela = contract.getTotalValue() / months;

        for(int i = 0; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicParcela,months);
            double fee = onlinePaymentService.paymentFee(basicParcela + interest);
            double quota = basicParcela + interest + fee;

            contract.getInstallments().add(new Installment(dueDate,quota));
        }

    }
}

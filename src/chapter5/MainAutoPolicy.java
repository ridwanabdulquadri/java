package chapter5;

public class MainAutoPolicy {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(11111111,"Toyota Camry","NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222,"ford Chevrolet","ME");
        policyIsNoFaultState(policy1);
        policyIsNoFaultState(policy2);
    }

    private static void policyIsNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy");
        System.out.printf("AccountNumber: %d;%nCar: %s;%nState: %s is a no-fault state\n\n",
                policy.getAccountNumber(),
                policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is": "is not"));
    }
}

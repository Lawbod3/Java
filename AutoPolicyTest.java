public class AutoPolicyTest {
   public static void main(String[] args) {	

 AutoPolicy policy1 = new AutoPolicy(423064819, "Mercedes Benz", "Nj");
 AutoPolicy  policy2 = new AutoPolicy(219123030, "Lamborghini urus", "IL");

 policyInNoFaultState(policy1);
 policyInNoFaultState(policy2);

}



public static void policyInNoFaultState(AutoPolicy policy) {
System.out.println("\nThe Auto Policy");
System.out.printf(
		"Account number: %d%n Car: %s%n State: %s%n State %s a no fault state.\n",
                 policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
		 (policy.isNoFaultState()? "is" : "is not"));      

}
















	
}
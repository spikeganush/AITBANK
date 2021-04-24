package Account;

public class Cheque extends Account implements WithdrawalLimit{

	public Cheque() {
		setAccType("Cheque");		
	}




	@Override
	public void checkCash() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void withdrawal(double amount) {
		checkCash();
		if(getBalance() > amount) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("The balance is not enough");
		
		
	}

	@Override
	public void calculateInterestRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawalLimit() {
		// TODO Auto-generated method stub
		
	}
	
}

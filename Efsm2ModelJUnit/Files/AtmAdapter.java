public class AtmAdapter {	
	private User user = new User();
	private Bank bank = new Bank();

	public void insertCard() {
		user.getCard();
	}
	public void validadeCard() {
	 	return bank.validadeCard(user.getCard());
	}
	public void validadeCard() {
	 	return bank.validadeCard(user.getCard());
	}
	public void enterPassword() {
		user.getPsw();
	}
	public void validadePassword() {
	 	return bank.validadePassword(user.getPsw());
	}
	public void validadePassword() {
	 	return bank.validadePassword(user.getPsw());
	}
	public void enterValue() {
		user.getValue();
	}
	public void validadeBalance() {
	 	return bank.validadeBalance(user.getValue());
	}
	public void validadeBalance() {
	 	return bank.validadeBalance(user.getValue());
	}
}	

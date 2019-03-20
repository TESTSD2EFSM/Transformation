import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;

public class AtmModel implements FsmModel {
	private AtmAdpter adapter = new AtmAdpter();

	private boolean cardOk;
	private boolean passOk;
	private boolean valueOk;
		
	private enum State{S0, S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13}
	private State state = State.S0;

	public Object getState() {
		return state;
	}

	public void reset(boolean arg0) {
		state = State.S0;
	}

	@action
	public void insertCard() {
		if (state == State.S0) {
			adapter.insertCard();
		}
	}
	@action
	public void validadeCard() {
		if (state == State.S1) {
			adapter.validadeCard();
		}
	}
	@action
	public void validadeCard() {
		if (state == State.S1) {
			adapter.validadeCard();
		}
	}
	@action
	public void requestPassword() {
		if (state == State.S2) {
			adapter.requestPassword();
		}
	}
	@action
	public void enterPassword() {
		if (state == State.S3) {
			adapter.enterPassword();
		}
	}
	@action
	public void validadePassword() {
		if (state == State.S4) {
			adapter.validadePassword();
		}
	}
	@action
	public void validadePassword() {
		if (state == State.S4) {
			adapter.validadePassword();
		}
	}
	@action
	public void requestValue() {
		if (state == State.S5) {
			adapter.requestValue();
		}
	}
	@action
	public void enterValue() {
		if (state == State.S6) {
			adapter.enterValue();
		}
	}
	@action
	public void validadeBalance() {
		if (state == State.S7) {
			adapter.validadeBalance();
		}
	}
	@action
	public void value() {
		if (state == State.S8) {
			adapter.value();
		}
	}
	@action
	public void validadeBalance() {
		if (state == State.S7) {
			adapter.validadeBalance();
		}
	}
	@action
	public void unavailableBalance() {
		if (state == State.S10) {
			adapter.unavailableBalance();
		}
	}
	@action
	public void exit() {
		if (state == State.S11) {
			adapter.exit();
		}
	}
	@action
	public void exit() {
		if (state == State.S9) {
			adapter.exit();
		}
	}
	@action
	public void cardOut() {
		if (state == State.S12) {
			adapter.cardOut();
		}
	}

}

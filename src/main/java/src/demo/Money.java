package demo;

public class Money {

		int amount;
		String currency;
		
		public Money(int amount, String currency) {
			super();
			this.amount = amount;
			this.currency = currency;
		}
		
		@Override
		public String toString() {
			return "Money [amount=" + amount + ", currency=" + currency + "]";
		}
}

package day7;

//Problem - when to use builder Method ?

//When an object creation is dynamic, the object properties are decided during runtime, then use builder.
//the builder should build the object in a single line with no inconsistency.

public class BuilderMethodDemo {
	public static void main(String[] args) {
		Pizza mypizza = new Pizza.Cheff("Chicken added", "BBQ Sauce Added").build(); // to call a inner class which is
																						// static
		System.out.println(mypizza);

		Pizza mypizza2 = new Pizza.Cheff("Chicken added", "BBQ Sauce").setExtraCheese("Extra Cheese Added")
				.setOlives("Olives added").build();
		System.out.println(mypizza2);
	}
}

class Pizza {

	// Fixed
	private String chicken;
	private String bbqSauce;

	// Optional
	private String extraCheese;
	private String olives;

	@Override
	public String toString() {
		return "Pizza [chicken=" + chicken + ", bbqSauce=" + bbqSauce + ", extraCheese=" + extraCheese + ", olives="
				+ olives + "]";
	}

	public Pizza(Cheff cheff) {
		this.chicken = cheff.getChicken(); // in order to access the private members, we create setters and getters
		this.bbqSauce = cheff.getBbqSauce(); // as final and public
		this.extraCheese = cheff.getExtraCheese();
		this.olives = cheff.getOlives();
	}

	public static class Cheff { // inner class - not necessary to have a inner class
		// Fixed
		private String chicken;
		private String bbqSauce;

		// Optional
		private String extraCheese;
		private String olives;

		public Cheff(String chicken, String bbqSauce) { // constructor for fixed values // It has to get returned for
														// sure
			this.chicken = chicken;
			this.bbqSauce = bbqSauce;
		}

		public final String getChicken() { // to access the private members, we use getter and setter methods
			return chicken;
		}

		public final void setChicken(String chicken) {
			this.chicken = chicken;
		}

		public final String getBbqSauce() {
			return bbqSauce;
		}

		public final void setBbqSauce(String bbqSauce) {
			this.bbqSauce = bbqSauce;
		}

		public final String getExtraCheese() {
			return extraCheese;
		}

		public final Cheff setExtraCheese(String extraCheese) { // we have access this method in another class, so we
																// return
			this.extraCheese = extraCheese;
			return this;
		}

		public final String getOlives() {
			return olives;
		}

		public final Cheff setOlives(String olives) {
			this.olives = olives;
			return this;
		}

		public Pizza build() {
			return new Pizza(this); // "this" returns Pizza along with Chef
		}
	}
}
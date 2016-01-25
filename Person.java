package person;

public class Person {
	public class Address {

		private String city;
		private String street;
		private int house;

		public Address() {
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public int getHouse() {
			return house;
		}

		public void setHouse(int house) {
			this.house = house;
		}

		@Override
		public int hashCode() {

			final int demo = 10;
			int c = city.hashCode();
			int result = 37;
			result = demo * result + c;

			c = ((Integer) house).hashCode();
			result = demo * result + c;

			c = street.hashCode();
			result = demo * result + c;

			return result;
		}

		@Override
		public boolean equals(Object obj) {

			if (obj != null && obj instanceof Address) {
				Address adr = (Address) obj;
				return city.equals(adr.getCity())
						&& street.equals(adr.getStreet())
						&& house == adr.getHouse();
			}
			return false;
		}

	}
}
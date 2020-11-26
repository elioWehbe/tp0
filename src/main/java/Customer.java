
public class Customer {
	private String _id;
	private String _firstname;
	private String _lastname;
	private String _telephone;
	private String _street1;
	private String _street2;
	private String _city;
	private String _state;
	private String _zipcode;
	private String _country;
	private String _mail;
	public Customer(String id,String firstname,String lastname,String telephone,String street1,String street2,String city,String state,String zipcode,String country,String mail) {
		super();
		_id=id;
		_firstname=firstname;
		_lastname=lastname;
		_telephone=telephone;
		_street1=street1;
		_street2=street2;
		_city=city;
		_state=state;
		_zipcode=zipcode;
		_country=country;
		_mail=mail;
	}
	

	public Customer(String id, String string, String string2) {
		super();
		_id = id;
	}


	public String getId() {
		return _id;
	}
	public void setId(String id) {
		_id = id;
	}
	public String getFirstname() {
		return _firstname;
	}
	public void setFirstname(String firstname) {
		_firstname = firstname;
	}
	public String getLastname() {
		return _lastname;
	}
	public void setLastname(String lastname) {
		_lastname = lastname;
	}
	public String getTelephone() {
		return _telephone;
	}
	public void setTelephone(String telephone) {
		_telephone = telephone;
	}
	public String getStreet1() {
		return _street1;
	}
	public void setStreet1(String street1) {
		_street1 = street1;
	}
	public String getStreet2() {
		return _street2;
	}
	public void setStreet2(String street2) {
		_street2 = street2;
	}
	public String getCity() {
		return _city;
	}
	public void setCity(String city) {
		_city = city;
	}
	public String getState() {
		return _state;
	}
	public void setState(String state) {
		_state = state;
	}
	public String getZipcode() {
		return _zipcode;
	}
	public void setZipcode(String zipcode) {
		_zipcode = zipcode;
	}
	public String getCountry() {
		return _country;
	}
	public void setCountry(String country) {
		_country = country;
	}
	public String getMail() {
		return _mail;
	}
	public void setMail(String mail) {
		_mail = mail;
	}

	public boolean checkId(String id) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean checkData() {
		// TODO Auto-generated method stub
		return _id !=null && !_id.equals("");
	}

	public String getCheckDataError() {
		// TODO Auto-generated method stub
		return null;
	}


	public static Customer find(Object object) {
		// TODO Auto-generated method stub
		return null;
	}


	public static boolean remove(String sid) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean checkMail() {
		// TODO Auto-generated method stub
		return false;
	}


	public static boolean insert(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}


	
}

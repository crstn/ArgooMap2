package com.mapitz.gwt.googleMaps.client;

/**
 * Represents an address from GClientGeocode, stored in GGeocodeResult
 * 
 * @author aglaforge
 */
public class GGeocodeAddress {

    /**
     * The full address as defined by the {@link GClientGeocoder}
     */
    String addressStr;

    /**
     * The street line of the geocoded address
     */
    String streetLine;

    /**
     * The city of the geocoded address
     */
    String city;

    /**
     * The state or province of the geocoded address
     */
    String state;

    /**
     * The zip or postal code of the geocoded address
     */
    String zip;

    /**
     * The county or region of the geocoded address
     */
    String county;

    /**
     * The country of the geocoded address
     */
    String country;

    /**
     * The position (latitude, longitude) of the geocoded address
     */
    GLatLng position;

    /**
     * The accuracy (scope) of the geocoded address
     */
    int accuracy;

    /**
     * Creates a new Geocoded Address
     * 
     * @param addressStr
     *            The full address as defined by the {@link GClientGeocoder}
     * @param streetLine
     *            The street line of the geocoded address
     * @param city
     *            The city of the geocoded address
     * @param state
     *            The state or province of the geocoded address
     * @param zip
     *            The zip of the geocoded address
     * @param county
     *            The county of the geocoded address
     * @param country
     *            The country of the geocoded address
     * @param lat
     *            The latitude of the geocoded address
     * @param lng
     *            The longitude of the geocoded address
     * @param accuracy
     *            The accuracy (scope) of the geocoded address
     */
    public GGeocodeAddress(String addressStr, String streetLine, String city,
            String state, String zip, String county, String country,
            double lat, double lng, int accuracy) {

        this.addressStr = addressStr;
        this.streetLine = streetLine;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.county = county;
        this.country = country;
        this.position = new GLatLng(lat, lng);
        this.accuracy = accuracy;
    }

    /**
     * Creates a new Geocoded Address
     * 
     * @param addressStr
     *            The full address as defined by the {@link GClientGeocoder}
     * @param streetLine
     *            The street line of the geocoded address
     * @param city
     *            The city of the geocoded address
     * @param state
     *            The state or province of the geocoded address
     * @param zip
     *            The zip of the geocoded address
     * @param county
     *            The county of the geocoded address
     * @param country
     *            The country of the geocoded address
     * @param lat
     *            The latitude of the geocoded address
     * @param lng
     *            The longitude of the geocoded address
     * @param accuracy
     *            The accuracy (scope) of the geocoded address
     * @return The address object
     */
    public static GGeocodeAddress create(String addressStr, String streetLine,
            String city, String state, String zip, String county,
            String country, double lat, double lng, int accuracy) {

        return new GGeocodeAddress(addressStr, streetLine, city, state, zip,
                county, country, lat, lng, accuracy);
    }

    /**
     * Example: 123 Some Street, City, TX, 12345
     * 
     * @return The full address
     */
    public String getAddressStr() {

        return addressStr;
    }

    /**
     * Example: Austin
     * 
     * @return The city
     */
    public String getCity() {

        return city;
    }

    /**
     * Example: US
     * 
     * @return The country, using ISO-3991-1 Two Letter abbreviations
     */
    public String getCountry() {

        return country;
    }

    /**
     * Example: Travis
     * 
     * @return The county
     */
    public String getCounty() {

        return county;
    }

    /**
     * Example: TX
     * 
     * @return The state
     */
    public String getState() {

        return state;
    }

    /**
     * Example: 12345
     * 
     * @return The zip or postal code
     */
    public String getZip() {

        return zip;
    }

    /**
     * Latitude and longitude position of the address
     * 
     * @return The map position
     */
    public GLatLng getPosition() {

        return position;
    }

    /**
     * Gets the accuracy or scope as defined by the <a
     * href="http://www.google.com/apis/maps/documentation/reference.html#GGeoAddressAccuracy">Google
     * Maps API</a>
     * 
     * @return Returns the accuracy
     */
    public int getAccuracy() {

        return this.accuracy;
    }

    /**
     * Gets the streetLine
     * 
     * @return Returns the streetLine.
     */
    public String getStreetLine() {

        return this.streetLine;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {

        String s = "GGeocodeAddress:\n";

        s += " Full Address:	" + this.addressStr + "\n";
        s += " Street Line:	" + this.streetLine + "\n";
        s += " City:		" + this.city + "\n";
        s += " State:		" + this.state + "\n";
        s += " Postal Code:	" + this.zip + "\n";
        s += " County:	" + this.county + "\n";
        s += " Country:	" + this.country + "\n";
        s += " Location:	" + this.position + "\n";
        s += " Accuracy:	" + this.accuracy + "\n";

        return s;
    }
}
public class MailingAddress {
    private static String primaryStreet;
    private static String secondaryStreet;
    private static String city;
    private static String state;
    private static String postalCode;

    public MailingAddress(java.lang.String primaryStreet,
                          java.lang.String secondaryStreet,
                          java.lang.String city,
                          java.lang.String state,
                          java.lang.String postalCode){
        this.primaryStreet = primaryStreet;
        this.secondaryStreet = secondaryStreet;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public java.lang.String getFormattedAddress(){
        String address = primaryStreet + "\n";
        if(secondaryStreet != null){
            address += secondaryStreet + "\n";
        }
        address += city + ", ";
        address += state + ", ";
        address += postalCode + ", ";
        return address;
    }

    public java.lang.String validateStreet(java.lang.String street) {
        if (street == null || street.length() <= 0) {
            return null;
        } else {
            return street;
        }
    }

    public java.lang.String validateCity(java.lang.String city){
        if (city == null || city.length() <= 0) {
            return null;
        } else {
            return city;
        }
    }

    public java.lang.String validateState(java.lang.String state){
        if(state == null){
            return null;
        }else{
            switch(state){
                case "AL":
                    return state;
                case "AK":
                    return state;
                case "AZ":
                    return state;
                case "AR":
                    return state;
                case "CA":
                    return state;
                case "CO":
                    return state;
                case "CT":
                    return state;
                case "DE":
                    return state;
                case "FL":
                    return state;
                case "GA":
                    return state;
                case "HI":
                    return state;
                case "ID":
                    return state;
                case "IL":
                    return state;
                case "IN":
                    return state;
                case "IA":
                    return state;
                case "KS":
                    return state;
                case "KY":
                    return state;
                case "LA":
                    return state;
                case "ME":
                    return state;
                case "MD":
                    return state;
                case "MA":
                    return state;
                case "MI":
                    return state;
                case "MN":
                    return state;
                case "MS":
                    return state;
                case "MO":
                    return state;
                case "MT":
                    return state;
                case "NE":
                    return state;
                case "NV":
                    return state;
                case "NH":
                    return state;
                case "NJ":
                    return state;
                case "NM":
                    return state;
                case "NY":
                    return state;
                case "NC":
                    return state;
                case "ND":
                    return state;
                case "OH":
                    return state;
                case "OK":
                    return state;
                case "OR":
                    return state;
                case "PA":
                    return state;
                case "RI":
                    return state;
                case "SC":
                    return state;
                case "SD":
                    return state;
                case "TN":
                    return state;
                case "TX":
                    return state;
                case "UT":
                    return state;
                case "VT":
                    return state;
                case "WA":
                    return state;
                case "WV":
                    return state;
                case "WI":
                    return state;
                case "WY":
                    return state;
                default:
                    return null;
            }
        }
    }
    public java.lang.String validatePostalCode(java.lang.String postalCode){
        if (postalCode == null || postalCode.length() != 5) {
            return null;
        } else {
            return postalCode;
        }
    }

    public java.lang.String getPrimaryStreet(){
        return primaryStreet;
    }

    public void setPrimaryStreet(java.lang.String primaryStreet){
        MailingAddress.primaryStreet = primaryStreet;
    }

    public java.lang.String getSecondaryStreet(){
        return secondaryStreet;
    }

    public void setSecondaryStreet(java.lang.String secondaryStreet){
        MailingAddress.secondaryStreet = secondaryStreet;
    }

    public java.lang.String getCity(){
        return city;
    }

    public void setCity(java.lang.String city){
        MailingAddress.city = city;
    }

    public java.lang.String getState(){
        return state;
    }

    public void setState(java.lang.String state){
        MailingAddress.state = state;
    }

    public java.lang.String getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(java.lang.String postalCode){
        MailingAddress.postalCode = postalCode;
    }

}

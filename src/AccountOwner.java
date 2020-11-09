public class AccountOwner {
    private static String salutation;
    private static String firstName;
    private static String lastName;
    private static String emailAddress;
    private static long phoneNumber;
    private static MailingAddress mailingAddress;

    public AccountOwner(java.lang.String salutation,
                        java.lang.String firstName,
                        java.lang.String lastName,
                        java.lang.String emailAddress,
                        long phoneNumber,
                        MailingAddress mailingAddress){
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public java.lang.String getName(int format){
        switch(format){
            case 2:
                return salutation + ". " + lastName;

            case 3:
                return lastName + ", " + firstName;

            default:
                return firstName + " " + lastName;
        }
    }

    public java.lang.String getFormattedPhoneNumber(){
        String num = String.valueOf(phoneNumber);
        String first3 = "(" + num.substring(0,3)+")";
        String second3 = num.substring(3,6)+ "-" + num.substring(6,10);
        return first3 + second3;

    }

    public java.lang.String validateSalutation(java.lang.String salutation){
        if(salutation == null || salutation.length() <= 0){
            return null;
        }
        else{
            return salutation;
        }
        }
//fix
    public java.lang.String validateEmailAddress(java.lang.String emailAddress){
        if(emailAddress.length() < 7 || emailAddress.length() > 254 ){
            return null;
        }else{
            return emailAddress;
        }

    }

    public long validatePhoneNumber(long phoneNumber){
        String num = Long.toString(phoneNumber);
        if(num.length() != 10){
            return 0L;
        }
        else{
            return phoneNumber;
        }
    }

    public java.lang.String getSalutation(){
        return salutation;
    }

    public void setSalutation(java.lang.String salutation){
        AccountOwner.salutation = salutation;
    }

    public java.lang.String getFirstName(){
        return firstName;
    }

    public void setFirstName(java.lang.String firstName){
        AccountOwner.firstName = firstName;
    }

    public java.lang.String getLastName(){
        return lastName;
    }

    public void setLastName(java.lang.String lastName){
        AccountOwner.lastName = lastName;
    }

    public java.lang.String getEmailAddress(){
        return emailAddress;
    }

    public void setEmailAddress(java.lang.String emailAddress){
        AccountOwner.emailAddress = emailAddress;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber){
        AccountOwner.phoneNumber = phoneNumber;
    }

    public MailingAddress getMailingAddress(){
        return mailingAddress;
    }

    public void setMailingAddress(MailingAddress mailingAddress){
        AccountOwner.emailAddress = emailAddress;
    }



}

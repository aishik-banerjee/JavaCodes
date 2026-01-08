package StringQuestions;

/*
 *  Defanging an IP Address
 *  Given a valid (IPv4) IP address, return a defanged version of that IP address.
    A defanged IP address replaces every period "." with "[.]".
*/

class DefangingIPAddress {
    public String defangIPaddr(String address) {
        String ans="";
        for(int i = 0; i<address.length();i++){
            if(address.charAt(i) == '.'){
                ans=ans + "[.]";
            }else{
                ans=ans+address.charAt(i);
            }
        }
        return ans;
    }
}
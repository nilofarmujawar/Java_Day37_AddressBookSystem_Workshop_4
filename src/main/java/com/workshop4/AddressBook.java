package com.workshop4;

/**
 * import arraylist class
 */
import java.util.ArrayList;

/**
 * create a class name as AddressBook
 */
public class AddressBook {
    /**
     * create an arraylist,create object name as addressList
     */
    private ArrayList<Contact> addressList = new ArrayList<Contact>();

    /**
     * creating parameterized method named as setAddressList
     * @param addressList - person address list
     */
    public void setAddressList(ArrayList<Contact> addressList) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.addressList = addressList;
    }
    /**
     * crete a get method name as getAddressList
     * The get method returns the value of the variable
     * @return addressList - person address list
     */
    public ArrayList<Contact> getAddressList() {
        return addressList;
    }

    /**
     * create a addcontact method.this is parameterized method
     * @param contact - persons contact details.
     */
    public void addContact(Contact contact) {
        /**
         * calling add method from addressList object
         */
        addressList.add(contact);
    }

    /**
     * create a method name as searchByName,this method is parameterized
     * @param name - person name in address book
     * @return - person name in address list
     */
    public Contact searchByName(String name) {
        for (int i = 0; i < addressList.size(); ++i) {
            if (addressList.get(i).getName().contains(name))
            /**
             * calling get method from addressList object
             */
                return addressList.get(i);
        }
        return null;
    }

    /**
     * create method named as deleteContact.
     * this is parameterized method .
     * it is boolean data type method which means this method output must be true or false.
     * @param name - person name in address book
     * @return - delete name in address book
     */
    public boolean deleteContact(String name) {
        for (int i = 0; i < addressList.size(); ++i) {
            if (addressList.get(i).getName().equalsIgnoreCase(name)) {
                /**
                 * calling remove method for delete a person name in address book from addressList object
                 */
                addressList.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * create a toString method
     * @return -  person data
     */
    public String toString() {
        /**
         * StringBuilder :-
         *
         * The principal operations on a StringBuilder are the append and insert methods,
         * which are overloaded so as to accept data of any type. Each effectively converts a given datum to a string
         * and then appends or inserts the characters of that string to the string builder.
         * The append method always adds these characters at the end of the builder;
         * the insert method adds the characters at a specified point.
         *
         * here create object for StringBuilder class ,object name as str.
         */
        StringBuilder str = new StringBuilder();
        /**
         * variable
         */
        int count = 1;
        for (Contact contact : addressList) {
            if (contact != null) {
                str.append(count + ". " + contact.getFirstName() + " " + contact.getLastName() + "\n");
                count++;
            }
        }
        /**
         * length =
         * Returns the length (character count).
         * str length is 0,then return dislpay msg no contact found on console
         */
        if (str.length() == 0)
            return "\nNo contact found";
        return str.toString();
    }
}
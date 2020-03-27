/*
 * Armen Petrosyan
 * group c
 * 27/03/2020
 * G00343137
 * */
package ie.gmit.single;

public class StoreUserCheck {

    private Store store = new Store();

    public void saveUser(User user) {
        store.store(user);
    }
}

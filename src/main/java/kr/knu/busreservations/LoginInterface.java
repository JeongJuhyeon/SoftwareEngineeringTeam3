package kr.knu.busreservations;

public class LoginInterface {

    public boolean login(String id, String pw) {
        String ID = id;
        String password = pw;



        DBManagement DB = new DBManagement("p3");

        User login_user = DB.verifyUserDetails(ID, password);

        if (login_user != null)
            return true;

        return false;
    }



}
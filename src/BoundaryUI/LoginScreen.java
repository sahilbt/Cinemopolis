package BoundaryUI;

import Controllers.*;

public class LoginScreen {
        private String inputEmail;
        private String inputPassword;
        private String userType;

        public LoginScreen(String userType) {
            this.userType = userType;
            Controller x = new LoginController();
      
    }
}

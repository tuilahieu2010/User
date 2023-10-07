package Controller;

import Model.Manager;
import View.Menu;

/**
 *
 * @author hieu
 */
public class ManagerMenu extends Menu<String> {

  private static String[] mc = {"Create a new account.", "Login system.","Exit."};

    public  ManagerMenu() {
        super("\n MAIN MENU", mc);
    }

    public void execute(int n) {
        Manager manager = new Manager();
        switch (n) {
            case 1:
                    manager.createNewAccount();
                    break;
                case 2:
                    manager.loginSystem();
                    break;
                case 3:
                    return;
        }
    }
}
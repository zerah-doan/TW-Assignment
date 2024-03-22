package page;

public class CreateWalletFacade {
    /**
     * Create 1st wallet and skip backup
     * @param passcode
     * @param confirmPasscode
     */
    public static void Create1stWallet(String passcode, String confirmPasscode){
        new GetStartedPage().getStarted().createFirstWallet().skip().inputPasscode(passcode, confirmPasscode);
    }

    /**
     * Create 1st wallet with cloud backup
     * @param backupName
     * @param password
     * @param confirmPassword
     * @param passcode
     * @param confirmPasscode
     */
    public static void Create1stWallet(String backupName, String password, String confirmPassword,String passcode, String confirmPasscode){
        new GetStartedPage().getStarted().createFirstWallet().backupOnCloud(backupName, password, confirmPassword).inputPasscode(passcode, confirmPasscode);
    }

    /**
     * Create 2nd wallet onward and skip backup
     */

    public static void Create2ndWallet(){
        new HomePage().create2ndWallet().skip();
    }

    /**
     * Create 2nd wallet onward with cloud backup
     * @param backupName
     * @param password
     * @param confirmPassword
     */
    public static void Create2ndWallet(String backupName, String password, String confirmPassword){
        new HomePage().create2ndWallet().backupOnCloud(backupName, password, confirmPassword);
    }
}

import java.util.Arrays;

public class User {

    private String userName;
    private String passWord;
    private char size;
    private int rewardPoints;
    private double accountBalance;
    private String[] address;


    public User(){ //default constructor
    }//end of constructor


    public User(String userName,String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(double balance){
    }

    public User(String userName,String passWord,int rewardPoints,String[] address){
        this.userName=userName;
        this.passWord=passWord;
        this.rewardPoints=rewardPoints;
        this.address=address;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public void printAllAddresses(){
        for (int i = 0; i < this.address.length; i++) {
            System.out.println(this.address[i]);
        }
    }
    public void setUserName(String newUserName){
        this.userName = newUserName;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void resetPassword(String newPassWord){
        this.passWord=newPassWord;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public double getAccountBalance() {
        return accountBalance;
    }


    public void useRewardPoints(int pointsToUse){
        //i used pointstoUse from my rewardPoints
        //  rewardPoints-pointsToUse;
        rewardPoints=rewardPoints-pointsToUse;
        System.out.println("You should use "+pointsToUse+" and now you have "+rewardPoints+" points left");

    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance<0){
            System.out.println("Can't give user a negative balance");
        }else {
            this.accountBalance=accountBalance;
        }
    }

    public void printUserProfile(){
        System.out.println(" Username: " +userName+"\n Reward Points: "+rewardPoints+"\n Account Balance: "+accountBalance+ "\n User's Address: "+Arrays.toString(address));
    }


}

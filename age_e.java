import java.util.Scanner;



class AgeCheck {
   public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeInvalidToVoteException e) {
            System.out.println(e.getMessage());
        }
    }
    static void checkAge(int age) throws AgeInvalidToVoteException {
        if (age < 18) {
            throw new AgeInvalidToVoteException("Age must be 18 or above to vote.");
        } else {
            System.out.println("Eligible to vote");
        }
    }

   
}
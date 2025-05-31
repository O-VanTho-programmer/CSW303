package FactoryPattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isContinue = true;

        while (isContinue) {
            isContinue = false;

            System.out.println("Create request:\n(1): Low-Priority\n(2): Medium-Priority\n(3): High-Priority");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    RequestProduct LPR = new LowPriorityConcreteCreator().createRequest();
                    LPR.processRequest();
                    break;
                case 2:
                    RequestProduct MPR = new MediumPriorityConcreteCreator().createRequest();
                    MPR.processRequest();
                    break;
                case 3:
                    RequestProduct HPR = new HighPriorityConcreteCreator().createRequest();
                    HPR.processRequest();
                    break;
                default:
                    System.out.println("Invalid Input");
                    isContinue = true;
                    break;
            }
        }
    }
}

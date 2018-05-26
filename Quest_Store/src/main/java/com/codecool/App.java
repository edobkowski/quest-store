package com.codecool;

import com.codecool.Controller.AdminController;
import com.codecool.Controller.MentorController;
import com.codecool.Controller.OnlineShop;
import com.codecool.Model.Quest;
import com.codecool.View.View;
import com.codecool.input.UserInput;

import javax.swing.text.html.Option;
import java.util.Set;

public class App {


    public static void main( String[] args )
    {
        UserInput userInput = new UserInput();
        int option = -1;

        while (option != 0) {
            System.out.println("0. Quest Store\n" +
                    "1. Admin: create mentor account\n" +
                    "2. Admin: check mentor account\n" +
                    "3. Admin: create class\n" +
                    "4. Admin: set lvl experience !! IN PROGRESS\n" +
                    "---------------------------------------\n" +
                    "5. Mentor: add Student !! IN PROGRESS\n" +
                    "6. Mentor: create Quest\n" +
                    "7. Mentor: create artifact\n" +
                    "8. Mentor: update artifact\n" +
                    "9. Mentor: add artifact to store !! IN PROGRESS\n" +
                    "10. Mentor: set quest category !! IN PROGRESS\n" +
                    "---------------------------------------\n" +
                    "11. Student: see exp lvl !! IN PROGRESS\n" +
                    "12. Student: see account info !! IN PROGRESS\n" +
                    "\n");
            option = userInput.getInt("Enter option: ");

            if (option == 1) {
                AdminController adminController = new AdminController();
                adminController.addMentor();
            } else if (option == 2) {
                AdminController adminController = new AdminController();
                adminController.viewMentorAccount();
            } else if (option == 3) {
                AdminController adminController = new AdminController();
                adminController.addClass();
            } else if (option == 4) {
                AdminController adminController = new AdminController();
//                adminController.addLevel(); TODO
            } else if (option == 5) {
                MentorController mentorController = new MentorController();
                mentorController.addStudent();
            } else if (option == 6) {
                MentorController mentorController = new MentorController();
                mentorController.addQuest();
            } else if (option == 7) {
                MentorController mentorController = new MentorController();
                mentorController.addArtifact();
            } else if (option == 8) {
                MentorController mentorController = new MentorController();
                mentorController.updateArtifact();
            } else if (option == 9) {
                MentorController mentorController = new MentorController();
                mentorController.setQuestCategory();
            } else if (option == 0) {
                testShopMenu();
            }
        }
    }

    public static void testShopMenu() {
        boolean continueShopping = true;
        OnlineShop onlineShop = new OnlineShop();
        UserInput userInput = new UserInput();

        while(continueShopping) {
            System.out.println("------ONLINE SHOP------\n\n 1. See all items \n 2. See quests \n 3. See artifacts \n 4. Exit");
            String userChoice = userInput.getString("Select option: ");

            if (userChoice.equals("1")) {
                System.out.println("Available items: ");
                View.displaySetOfItems(onlineShop.getAvailableArtifacts());
                View.displaySetOfItems(onlineShop.getAvailableQuests());

            } else if (userChoice.equals("2")) {
                System.out.println("Available quests: ");
                View.displaySetOfItems(onlineShop.getAvailableQuests());

            } else if (userChoice.equals("3")) {
                System.out.println("Available artifacts: ");
                View.displaySetOfItems(onlineShop.getAvailableArtifacts());

            } else if (userChoice.equals("4")) {
                continueShopping = false;

            } else {
                System.out.println("Wrong selection...");
            }
        }
    }
}



package kz.lab2;

import kz.lab2.config.SpringConfiguration;
import kz.lab2.dao.UserDAO;
import kz.lab2.models.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        int choice;
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserDAO user = context.getBean("userDAO", UserDAO.class);
        Users users = new Users();
        System.out.println(user);
        System.out.println(users);

        users.setUsername("Event and Handle");
        System.out.println("This is Salon list:");
        ArrayList<String> product = new ArrayList<String>();
        product.add(0, "Product:Fan" + "Cost:3000");
        product.add(1, "Product:Fan" + "Cost:4000");
        product.add(2, "Product:Fan" + "Cost:5000");
        System.out.println(product.get(0));
        System.out.println(product.get(1));
        System.out.println(product.get(2));

        System.out.println(" ");

        ArrayList<String> service = new ArrayList<String>();
        service.add(0, "Service:Hair" + "Cost:1000");
        service.add(1, "Service:Hair" + "Cost:1500");
        service.add(2, "Service:Hair" + "Cost:2000");
        System.out.println(service.get(0));
        System.out.println(service.get(1));
        System.out.println(service.get(2));

        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like one of this? Enter the num:");
        System.out.println("1) Hair cutting:1000 and Fan:3000");
        System.out.println("2) Hair cutting2:1500 and Fan:4000");
        System.out.println("3) Hair cutting3:2000 and Fan:5000");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hair cutting:1000 and Fan:3000 \nYou have one of these card types: \n1)Premium \n2)Gold \n3)Silver  \n4)FirstTime");
                int cards = sc.nextInt();
                if (cards == 1) {
                    Premium premium = new Premium();
                    premium.sale();
                    premium.getName("Premium");
                    int sum = (1000 + 3000 - 4000 * premium.premiumpercent / 100);
                    System.out.println("Cost:1000 and 3000" + premium + "Total cost:" + sum);
                } else if (cards == 2) {
                    Gold gold = new Gold();
                    gold.sale();
                    gold.getName("Gold");
                    int sum = (1000 + 3000 - 4000 * gold.goldpercent / 100);
                    System.out.println("Cost:1000 and 3000" + gold + "Total cost:" + sum);
                } else if (cards == 3) {
                    Silver silver = new Silver();
                    silver.sale();
                    silver.getSilverName("Silver");
                    int sum = (1000 + 3000 - 4000 * silver.silverpercent / 100);
                    System.out.println("Cost:1000 and 3000" + silver + "Total cost:" + sum);
                } else if (cards == 4) {
                    FirstTime firstTime = new FirstTime();
                    firstTime.sale();
                    firstTime.getFirstName("FirstTime");
                    int sum = (1000 + 3000 - 4000 * firstTime.firstpercent / 100);
                    System.out.println("Cost:1000 and 3000" + firstTime + "Total cost:" + sum);
                }
                break;

            case 2:
                System.out.println("Hair cutting:1500  and Fan:4000 \nYou have one of these card  types: \n1)Premium \n2)Gold \n3)Silver \n4)First time");
                int cards1 = sc.nextInt();
                if (cards1 == 1) {
                    Premium premium = new Premium();
                    premium.sale();
                    premium.getName("Premium");
                    int sum = (1500 + 4000 - 5500 * premium.premiumpercent / 100);
                    System.out.println("Cost:1500 and 4000" + premium + "Total cost:" + sum);
                } else if (cards1 == 2) {
                    Gold gold = new Gold();
                    gold.sale();
                    gold.getName("Gold");
                    int sum = (1500 + 4000 - 5500 * gold.goldpercent / 100);
                    System.out.println("Cost:1500 and 4000" + gold + "Total cost:" + sum);
                } else if (cards1 == 3) {
                    Silver silver = new Silver();
                    silver.sale();
                    silver.getSilverName("Silver");
                    int sum = (1500 + 4000 - 5500 * silver.silverpercent / 100);
                    System.out.println("Cost:1500 and 4000" + silver + "Total cost:" + sum);
                } else if (cards1 == 4) {
                    FirstTime firstTime = new FirstTime();
                    firstTime.sale();
                    firstTime.getFirstName("FirstTime");
                    int sum = (1500 + 4000 - 5500 * firstTime.firstpercent / 100);
                    System.out.println("Cost:1500 and 4000" + firstTime + "Total cost:" + sum);
                }

            case 3:
                System.out.println("Hair cutting:2000 and Fan:5000 \nYou have one of these card types: \n1)Premium \n2)Gold \n3)Silver \n4)FirstTime");
                int cards2 = sc.nextInt();
                if (cards2 == 1) {
                    Premium premium = new Premium();
                    premium.sale();
                    premium.getName("Premium");
                    int sum = (2000 + 5000 - 7000 * premium.premiumpercent / 100);
                    System.out.println("Cost:2000 and 5000" + premium + " Total cost:" + sum);
                } else if (cards2 == 2) {
                    Gold gold = new Gold();
                    gold.sale();
                    gold.getName("Gold");
                    int sum = (2000 + 5000 - 7000 * gold.goldpercent / 100);
                    System.out.println("Cost:2000 and 5000" + gold + "Total cost:" + sum);
                } else if (cards2 == 3) {
                    Silver silver = new Silver();
                    silver.sale();
                    silver.getSilverName("Silver");
                    int sum = (2000 + 5000 - 7000 * silver.silverpercent / 100);
                    System.out.println("Cost:2000 and 5000" + silver + "Total cost:" + sum);
                } else if (cards2 == 4) {
                    FirstTime firstTime = new FirstTime();
                    firstTime.sale();
                    firstTime.getFirstName("FirstTime");
                    int sum = (2000 + 5000 - 7000 * firstTime.firstpercent / 100);
                    System.out.println("Cost:2000 and 5000" + firstTime + "Total cost:" + sum);
                }
                break;
        }
    }

}



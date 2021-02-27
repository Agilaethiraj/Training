package io.assignment.guest;

import io.assignment.guest.ConditionExceptions;
import io.assignment.guest.Gues;
import io.assignment.guest.Invalid_Id;
import io.assignment.guest.Name_Not_found;

import java.util.*;
public class Run {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
List<Gues> hh=new ArrayList();


        System.out.println("Welcome to the interactive Guest book platform, Press 0:Exit\n Press 1:Add new guest\n Press 2:Print Guest by ID\n Press 3:Search and Print Guest name\n Press 4: Remove the guest \n Press 5:Print the guest_list. ");

        int i = Integer.parseInt(sc.next());
        while(i!=-1){
            switch (i){
            case 0:{
                System.out.println(".....EXITING.......");
            }break;
            case 1:{
                System.out.println("Enter the guest name && Enter the age && Enter the phone_number");
                String next = sc.next();
                int i1 = sc.nextInt();
                long l = sc.nextLong();
                if(next.length()>=3 && i1>18 && l==10) {
                    hh.add(new Gues(next, l, i1));
                    String s = hh.toString();
                    System.out.println(s);
                }
                else
                    try {
                        if (next.length() < 3 && i1 <= 18 && l!=10)
                            throw new ConditionExceptions("Invalid details");

                    } catch (ConditionExceptions e) {
                        System.out.println("Please follow the Company's guidelines in order to add the details in the list\n The name should be atleast three characters and above.\n The phone number should be exactly ten digit\n The guest's age should be greater than 18.");
                    }
                }
                break;
            case 2: {
                System.out.println("Enter the Guest_id");
                int i1 = sc.nextInt();
                if(hh.contains(i1)){
                    String s = hh.toString();
                    System.out.println(s);
                }
                else
                try{
                    if(hh.isEmpty())
                        throw new Invalid_Id("Invalid Details");

                }
                catch(Invalid_Id e){
                    System.out.println("Kindly input the registered id");
                }

            }break;
            case 3:{
                System.out.println("Enter the Guest_name");
                String next = sc.next();
                for(Gues g:hh) {
                    if (g.getName().equals(next)) {
                        System.out.println(next);
                    }

                    try {
                        if (g.getName() != next)
                            throw new Name_Not_found("Not valid input");
                    }
                        catch(Name_Not_found e){
                            System.out.println("Please enter the registered Guest's name");
                        }
                    }
                }break;
            case 4:{
                System.out.println("Enter the Id");
                int i1 = sc.nextInt();
                for(Gues g:hh){
                    if(g.getGuest_id()==i1){
                        hh.remove(i1);
                        System.out.println(hh.toString());
                    }
                }
            }break;
            case 5:{
                Iterator<Gues> iterator = hh.iterator();
                while(iterator.hasNext()){
                    Gues next = iterator.next();
                    System.out.println(next);
                }
            }break;
        }
        }

    }
}

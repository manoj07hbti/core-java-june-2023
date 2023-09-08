package collection;

import java.util.ArrayList;

public class ArrayMYDramaListGenerics {

    public ArrayList <String> stringArrayList(){

        ArrayList <String>myDramaList=new ArrayList();

        myDramaList.add("Move to Heaven");
        myDramaList.add("Weak Hero Class 1");
        myDramaList.add("Hospital Playlist Season 2");
        myDramaList.add("Flower of Evil");
        myDramaList.add("Hospital Playlist");
        myDramaList.add("Alchemy of Souls");
        myDramaList.add("Reply 1988");
        myDramaList.add("My Mister");
        myDramaList.add("Under the Queen's Umbrella");
        myDramaList.add("The Glory Part 2");
        myDramaList.add("Dr.Romantic Season 3");
        myDramaList.add("Crash Landing on You");
        myDramaList.add("Prison Playbook");
        myDramaList.add("Mr.Queen");
        myDramaList.add("Mother");
        myDramaList.add("Extraordinary Attorney Woo");
        myDramaList.add("It's Okay to Not Be Okay");
        myDramaList.add("Alchemy of Souls Season 2:Light and Shadow");
        myDramaList.add("Navillera");
        myDramaList.add("Vincenzo");
        myDramaList.add("Signal");
        myDramaList.add("The Glory");
        myDramaList.add("The Good Bad Mother");
        myDramaList.add("Kingdom Season 2");
        myDramaList.add("Happiness");
        myDramaList.add("Mr.Sunshine");
        myDramaList.add("Taxi Driver Season 2");
        myDramaList.add("Tomorrow");
        myDramaList.add("Tale of the Nine-Tailed 1938");
        myDramaList.add("Healer");
        myDramaList.add("Mouse");
        myDramaList.add("Goblin");
        myDramaList.add("Stranger");
        myDramaList.add("The Uncanny Counter");
        myDramaList.add("The Red Sleeve");
        myDramaList.add("Twenty-Five Twenty-One");
        myDramaList.add("D.P.");
        myDramaList.add("SKY Castle");
        myDramaList.add("Kingdom");
        myDramaList.add("Missing:The Other Side Season 2");
        myDramaList.add("Weightlifting Fairy Kim Bok Joo");
        myDramaList.add("Taxi Driver");
        myDramaList.add("Youth of May");
        myDramaList.add("Through the Darkness");
        myDramaList.add("The Devil Judge");
        myDramaList.add("Life on Mars");
        myDramaList.add("Beyond Evil");
        myDramaList.add("Dr.Romantic Season 2");
        myDramaList.add("My Dearest");
        myDramaList.add("Racket Boys");
        myDramaList.add("Dear My Friends");
        myDramaList.add("Hometown Cha-Cha-Cha");
        myDramaList.add("Arthdal Chronicles Part 3:The Prelude to All Legend");
        myDramaList.add("D.P.Season 2");
        myDramaList.add("Arthdal Chronicles Part 2:The Sky Turning Inside Out,Rising Land");
        myDramaList.add("Six Flying Dragons");
        myDramaList.add("The Penthouse:War in Life");
        myDramaList.add("The Penthouse Season 2:War in Life");
        myDramaList.add("The Guest");
        myDramaList.add("Moon Lovers:Scarlet Heart Ryeo");
        myDramaList.add("Our Beloved Summer");
        myDramaList.add("While You Were Sleeping");
        myDramaList.add("Sweet Home");
        myDramaList.add("Partners for Justice Season 2");
        myDramaList.add("The King of Pigs");
        myDramaList.add("Defendant");
        myDramaList.add("My Name");
        myDramaList.add("Strong Women Do Bong Soon");
        myDramaList.add("Revenant");
        myDramaList.add("18 Again");
        myDramaList.add("A Business Proposal");
        myDramaList.add("Kill Me,Heal Me");
        myDramaList.add("Hot Stove League");
        myDramaList.add("Dr.Romantic");
        myDramaList.add("Strangers from Hell");
        myDramaList.add("Chicago Typewriter");
        myDramaList.add("Misaeng:Incomplete Life");
        myDramaList.add("Our Blues");
        myDramaList.add("Jewel in the Palace");
        myDramaList.add("Bloodhounds");
        myDramaList.add("Descendants of the Sun");
        myDramaList.add("The First Responders");
        myDramaList.add("Hotel del Luna");
        myDramaList.add("Tunnel");
        myDramaList.add("The Fiery Priest");
        myDramaList.add("Missing:The Other Side");
        myDramaList.add("Live");
        myDramaList.add("My Perfect Stranger");
        myDramaList.add("Law School");
        myDramaList.add("My Liberation Notes");
        myDramaList.add("It's Okay,That's Love");
        myDramaList.add("Children of Nobody");
        myDramaList.add("Once Again");
        myDramaList.add("Ghost Doctor");
        myDramaList.add("Juvenile Justice");
        myDramaList.add("Go Back Couple");
        myDramaList.add("Empress Ki");
        myDramaList.add("Eulachacha Waikiki");
        myDramaList.add("Good Manager");
        myDramaList.add("Love to Hate You");

        return myDramaList;
    }

    public static void main(String[] args) {
        ArrayMYDramaListGenerics obj=new ArrayMYDramaListGenerics();
        ArrayList<String >TVShows=obj.stringArrayList();


        System.out.println("****Using for loop****");
        for (int i=0;i< TVShows.size();i++){
            System.out.println("INDEX " + i+"."+TVShows.get(i));
        }
        System.out.println("");
        System.out.println("****Using while loop****");
        int j=0;
        while (j< TVShows.size()){
            System.out.println("INDEX " + j+"."+TVShows.get(j));
            j++;
        }
        System.out.println("");
        System.out.println("****Using do while loop****");
        int k=0;
        do {
            System.out.println("INDEX " + k+"."+TVShows.get(k));
            k++;
        }while (k< TVShows.size());
    }
}

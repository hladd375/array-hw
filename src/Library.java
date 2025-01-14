import java.sql.SQLOutput;

public class Library {

    public String owner = "Mx. Bradford";
    public Book[] allBooks;
    public static void main(String[] args) {
        Library lib = new Library();
    }

    public Library(){

        System.out.println("Welcome to "+ owner + "'s library!!!!!");
        allBooks = new Book[10];
        //TODO: Give the array allReviews a size of 10
        for(int x = 0; x < allBooks.length; x++){
            allBooks[x] = new Book((int)(Math.random()*11));
        }
        for(int x = 0; x < allBooks.length; x++){
            System.out.println(allBooks[x].rating);
        }
        averageRating();

        //TODO: Fill the array allReviews with reviews with random ratings from 0 to 10 inclusive

        //TODO: print all the ratings in the array allReviews
        
        //TODO: Call the method averageRating

    }

    public void averageRating(){
        int averageSum = 0;
        int average;
        for(int x = 0; x < allBooks.length; x++){
            averageSum = averageSum + allBooks[x].rating;
        }
        average = averageSum/ allBooks.length;
        System.out.println("Average: " + average);

        //TODO: calculate the average rating from the array allReviews and print it

    }
}

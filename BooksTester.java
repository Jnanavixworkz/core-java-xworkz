class BooksTester{

public static void main(String args[]){
Books books = new Books();
books.name = "To Kill a Mockingbird";
books.author = "Harper Lee";
books.price = 500.00;
books.noOfPages = 100;
books.publicationName = "J. B. Lippincott & Co.";
books.toGainKnowledge();
System.out.println("Create 1st copy of the Books");
System.out.println(books.name + " " + books.price + " " + books.author + " " + books.noOfPages + " " + books.publicationName);

Books books1 = new Books();
books1.name = "The Great Gatsby";
books1.author = "F. Scott Fitzgerald";
books1.price = 900.00;
books1.noOfPages = 200;
books1.publicationName = "Charles Scribner's Sons";
books1.toGainKnowledge();
System.out.println("Create 2nd copy of the Books");
System.out.println(books1.name + " " + books1.price + " " + books1.author + " " + books1.noOfPages + " " + books1.publicationName);

Books books2 = new Books();
books2.name = "1984";
books2.author = "George Orwell";
books2.price = 1500.00;
books2.noOfPages = 2500;
books2.publicationName = "Secker & Warburg";
books2.toGainKnowledge();
System.out.println("Create 3rd copy of the Books");
System.out.println(books2.name + " " + books2.price + " " + books2.author + " " + books2.noOfPages + " " + books2.publicationName);

Books books3 = new Books();
books3.name = "Pride and Prejudice";
books3.author = "Jane Austen";
books3.price = 3500.00;
books3.noOfPages = 1000;
books3.publicationName = "T. Egerton, Whitehall";
books3.toGainKnowledge();
System.out.println("Create 4th copy of the Books");
System.out.println(books3.name + " " + books3.price + " " + books3.author + " " + books3.noOfPages + " " + books3.publicationName);

Books books4 = new Books();
books4.name = "Harry Potter and the Sorcerer's Stone";
books4.author = "J.K. Rowling";
books4.price = 5000.00;
books4.noOfPages = 2800;
books4.publicationName = "Bloomsbury Publishing";
books4.toGainKnowledge();
System.out.println("Create 5th copy of the Books");
System.out.println(books4.name + " " + books4.price + " " + books4.author + " " + books4.noOfPages + " " + books4.publicationName);

Books books5 = new Books();
books5.name = "The Catcher in the Rye";
books5.author = "J.D. Salinger";
books5.price = 5500.00;
books5.noOfPages = 1100;
books5.publicationName = "Little, Brown and Company";
books5.toGainKnowledge();
System.out.println("Create 6th copy of the Books");
System.out.println(books5.name + " " + books5.price + " " + books5.author + " " + books5.noOfPages + " " + books5.publicationName);

Books books6 = new Books();
books6.name = "The Lord of the Rings";
books6.author = "J.R.R. Tolkien";
books6.price = 8500.00;
books6.noOfPages = 1110;
books6.publicationName = "George Allen & Unwin";
books6.toGainKnowledge();
System.out.println("Create 7th copy of the Books");
System.out.println(books6.name + " " + books6.price + " " + books6.author + " " + books6.noOfPages + " " + books6.publicationName);

Books books7 = new Books();
books7.name = "To the Lighthouse";
books7.author = "Virginia Woolf";
books7.price = 5500.00;
books7.noOfPages = 10000;
books7.publicationName = "Hogarth Press";
books7.toGainKnowledge();
System.out.println("Create 8TH copy of the Books");
System.out.println(books7.name + " " + books7.price + " " + books7.author + " " + books7.noOfPages + " " + books7.publicationName);

Books books8 = new Books();
books8.name = "The Chronicles of Narnia";
books8.author = "C.S. Lewis";
books8.price = 50.00;
books8.noOfPages = 1000;
books8.publicationName = " Geoffrey Bles";
books8.toGainKnowledge();
System.out.println("Create 9TH copy of the Books");
System.out.println(books8.name + " " + books8.price + " " + books8.author + " " + books8.noOfPages + " " + books8.publicationName);

Books books9 = new Books();
books9.name = "Moby-Dick";
books9.author = "Herman Melville";
books9.price = 1500.00;
books9.noOfPages = 1900;
books9.publicationName = "Harper & Brothers";
books9.toGainKnowledge();
System.out.println("Create 10TH copy of the Books");
System.out.println(books9.name + " " + books9.price + " " + books9.author + " " + books9.noOfPages + " " + books9.publicationName);


}
}
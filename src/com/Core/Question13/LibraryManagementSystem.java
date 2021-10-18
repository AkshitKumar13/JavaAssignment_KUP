package com.Core.Question13;

import java.util.Scanner;
  class LibraryManagementSystem {
    public static void main(String arg[]) {
        char r;
        do {
            System.out.println("Library Management System*");
            System.out.println("Press 1 to add book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a book");
            System.out.println("Press 4 to print complete issue details");
            System.out.println("Press 5 to exit");
            Scanner obj1 = new Scanner(System.in);
            System.out.println("Enter any Number");
            int option = obj1.nextInt();
            switch (option) {
                case 1:
                    Library addbook_obj = new Library();
                    addbook_obj.add();
                    break;
                case 2:
                    Library issuebook_obj = new Library();
                    issuebook_obj.iss();
                    break;
                case 3:
                    Library returnbook_obj = new Library();
                    returnbook_obj.ret();
                    break;
                case 4:
                    Library detail_obj = new Library();
                    detail_obj.details();
                    break;
                case 5:
                    Library add = new Library();
                    add.exit();
                    break;
                default:
                    System.out.println("Invalid number");
            }
            System.out.println("Do you want to select next option(y/n)");
            r = obj1.next().charAt(0);

        }while (r == 'Y' || r == 'y') ;
        if (r == 'N' || r == 'n') {
            Library z = new Library();
            z.exit();
        }
    }
}


class Library {

    static String bookname, issuedate, date;
    static int bookid, total_issuebook;

    void add() {
        System.out.println("Enter the book name, Prize and Book_No");
        Scanner obj2 = new Scanner(System.in);
        String str = obj2.nextLine();
        float price = obj2.nextInt();
        int bookno = obj2.nextInt();
        System.out.println("your details are Name: " + str + " Price: " + price + " Book_No: " + bookno);
    }

    void iss() {
        Scanner obj3 = new Scanner(System.in);
        System.out.println("Book Name");
          bookname = obj3.nextLine();
        System.out.println("Book_id");
         bookid = obj3.nextInt();
          obj3.nextLine();
        System.out.println("issue date");
         issuedate = obj3.nextLine();
        System.out.println("total no of book issued");
         total_issuebook = obj3.nextInt();
        obj3.nextLine();
        System.out.println("Return book date");
        String date = obj3.nextLine();
    }

    int getid() {
        return bookid;
    }

    void ret() {
        System.out.println("Enter the Student_Name and book_id");
        Scanner c = new Scanner(System.in);
        String name = c.nextLine();
        int bookId = c.nextInt();
        if (bookid == bookId) {
            System.out.println("Total Details");
            System.out.println("Book_name:" + Library.bookname);
            System.out.println("Book_id:" + Library.bookid);
            System.out.println("Issue date:" + Library.issuedate);
            System.out.println("Total number of book issued:" + Library.total_issuebook);
            System.out.println("Book return date" + Library.date);
        } else {
            System.out.println("You entered the wrong id , Please dd the correct id kindly.");
        }

    }

    void details() {
        System.out.println("Book_name:" + Library.bookname);
        System.out.println("Book_id:" + Library.bookid);
        System.out.println("Issue date:" + Library.issuedate);
        System.out.println("Total number of book issued:" + Library.total_issuebook);
        System.out.println("Book return date" + Library.date);

    }

    void exit() {

    }

}
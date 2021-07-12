package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book a1[] = new Book[3];
        Book book1 = new Book(1,"English",100,"ROnaldo");
        Book book2 = new Book(2,"Vietnammese",300,"Messi");
        Book book3 = new Book(3,"History",200,"KAKA");
        Book book4 = new Book(4,"Tom and jerry",500,"Henry");
        Book book5 = new Book(5,"ROOM",200,"Roony");
        Book book6 = new Book(6,"Running Man",150,"ozil");

        a1[0]= book1;
        a1[1]= book2;
        a1[2]= book3;
        a1[3]= book4;
        a1[4]= book5;
        a1[5]= book6;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cuốn sách bạn tìm");
        String name = sc.nextLine();
        int index =-1;
        for(int i =0;i<a1.length;i++){
            if(name.equals(a1[i].name)){
                index = i;
            }
        }
        System.out.println(index);
        if(index==-1){
            System.out.println("no found");
        }else{
            String result = a1[index].name + "\t" + a1[index].price + "\t" + a1[index].author;
            System.out.println(result);
        }
        System.out.println("mời bạn nhập giá cuốn sách");
        int name2= sc.nextInt();
        int index1= -1;
        for(int i =0;i< a1.length;i++){
            if(name2 == a1[i].price){
                index1= i;
            }
        }
        if(index1==-1){
            System.out.println("no found");
        }else{
            String result = a1[index1].name + "\t" + a1[index1].price + "\t" + a1[index1].author;
            System.out.println(result);
        }
        int sum =0;
        for(int i =0;i<a1.length;i++){
            sum += a1[i].price;
        }
        System.out.println("tổng tiền các cuốn sách là"+sum);


    }
    public static class Book{
        private  int bookCode;
        private String name,author;
        private double price;
        public Book(int bookCode, String name, double price, String author){
            this.bookCode = bookCode;
            this.name = name;
            this.price = price;
            this.author = author;
        }
        public int getBookCode(){
            return bookCode;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getAuthor() {
            return author;
        }
    }
}

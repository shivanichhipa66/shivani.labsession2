package com.travelmoney.driver;
import java.util.Scanner;
import com.travelmoney.services.*;

public class CurrencyDenomination {

	public static void main(String[] args) {

		MergeSort mergesort = new MergeSort();
		NoteCount notecount = new NoteCount();

		System.out.println("Enter the size of currency denominations");
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
		int notes[]= new int[size];
        System.out.println("Enter the currency denominations value");
        for(int i=0;i<size;i++) {
			notes[i]=sc.nextInt();
        }

			System.out.println("Enter the amount you want to pay");
			int amount = sc.nextInt();
			mergesort.sort(notes, 0, notes.length-1);
			notecount.notesCountImplementation(notes,amount);
		}

		
		
	}

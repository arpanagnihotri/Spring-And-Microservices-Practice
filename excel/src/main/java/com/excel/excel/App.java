package com.excel.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class App 
{
	private static Workbook w;
	private static Sheet sh;
	private static FileInputStream fs;
	private static FileOutputStream fos;
	private static Row r;
	private static Cell c;
	
    public static void main( String[] args ) throws Exception
    {
        fs=new FileInputStream("C:\\Users\\c1julymind158\\Desktop\\demo.xls");
        w=WorkbookFactory.create(fs);
        sh=w.getSheet("Sheet1");
        
        Scanner sc= new Scanner(System.in);
        int rown=sc.nextInt();
        sc.nextLine();
        int coln=sc.nextInt();
        sc.nextLine();
        r=sh.createRow(rown);
        c=r.createCell(coln);
        c.setCellValue(sc.nextLine());
        System.out.println(c.getStringCellValue());
        fos=new FileOutputStream("C:\\\\Users\\\\c1julymind158\\\\Desktop\\\\demo.xls");
        w.write(fos);
        fos.flush();
        fos.close();
        System.out.println("Done");
        
        }
}

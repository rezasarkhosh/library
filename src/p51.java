
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class p51 {
////////////////////////////////////////////////////////////////////////////// قسمت چاپ اطلاعات کاربر باید به جستجو تغییر داده شود!
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		Scanner in = new Scanner (System.in);
		String A[][]=new String[15][5]; // ارایه اعضای کتابخانه
		String B[][]=new String[10][5];// ارایه لیست اطلاعات کتابخانه
        String C[][]=new String[10][3]; // ارایه اطلاعات امانات
		int cA=1; // برای سطر
		int ca=0; // برای ستون
		System.out.println("ایا  دفعه اول است که این برنامه را در این سیتسم اجرا میکنید؟ " + "\n" + "1-بله" + "\n" + "2- خیر ، قبلا در این سستم اجرا شده است");
		int im=input.nextInt();
		
		if (im==1)
		{
		A[0][0]= "شماره_عضویت";
		A[0][1]= "نام_ونام_خانوادگی";
		A[0][2]= "کدملی";
		A[0][3]= "شماره_تماس";
		A[0][4]= "آدرس";
		for (int x=0;x<15;x++)
		{
			for (int y=0;y<5;y++)
				if (A[x][y]==null)
					A[x][y]="null";
      
	     }
		B[0][0]="شماره_کتاب";
		B[0][1]=" عنوان_کتاب";
		B[0][2]="نویسنده";
		B[0][3]="مترجم";
		B[0][4]="تعداد_تیتراژ";
		for (int x=0;x<10;x++)
		{
			for (int y=0;y<5;y++)
				if (B[x][y]==null)
					B[x][y]="null";
        }
		C[0][0]="عنوان_کتاب";
		C[0][1]="تاریخ _مانت";
		C[0][2]="تاریخ_تحویل";
		for (int x=0;x<10;x++)
		{
			for (int y=0;y<3;y++)
				if (C[x][y]==null)
					C[x][y]="خالی";
        }
		}
		String temp="";
		String temp1="";
		String temp2="";
		
		char spliter=' ';
	    String s = ""; // وقتی null نباشد ارور میدهد
	    int iS=0;
		String r="";
		int ir=0;
		String c="";
		int ic=0;
		
	    File f5=new File("D:\\gFiles\\library.txt"); // برای لیست کاربران
		File f52=new File("D:\\gFiles\\LISTOFBOOKS.txt");
		File f53=new File("D:\\gFiles\\amanat.txt");
		
		Scanner INFILE=new Scanner (f53);
        Scanner inFile=new Scanner (f52);
		Scanner infile=new Scanner (f5);
	if (im==2)
	{
	while(infile.hasNext())
		{
	    s=infile.nextLine();
		}
	      for (int z=0;z<15;z++)
				{		
					for (int y=0;y<5;y++)	
			     	{
						while (s.charAt(iS)!=spliter && iS<s.length())
						{
							temp=temp+s.charAt(iS++);
						}
							
						if (s.charAt(iS)==spliter  && iS<s.length())
						{	
							A[z][y]=temp;
						temp="";
						iS++;
						}	
						}}
		while (inFile.hasNext())
		{
			r=inFile.nextLine();
		}
	
		  for (int x=0;x<10;x++)
		  {
			  for (int y=0;y<5;y++)
			  {
				  while (r.charAt(ir)!=spliter && ir<r.length())
					  temp1=temp1+r.charAt(ir++);
				  if (r.charAt(ir)==spliter && ir<r.length())
				  {
					  B[x][y]=temp1;
					  temp1="";
					  ir++;
				  }
				 }}
		  while(INFILE.hasNext())
			{
		    c=INFILE.nextLine();
			}
		  for (int x=0;x<10;x++)
		  {
			  for (int y=0;y<3;y++)
			  {
				  while (r.charAt(ic)!=spliter && ic<c.length())
					  temp1=temp1+r.charAt(ic++);
				  if (r.charAt(ic)==spliter && ic<c.length())
				  {
					  C[x][y]=temp2;
					  temp2="";
					  ic++;
				  }
				 }}
	}
	 PrintWriter outfile1=new PrintWriter(f5);
		PrintWriter outFile=new PrintWriter(f52);
		PrintWriter OUTFILE=new PrintWriter(f53);
		while (1 == 1)
		{
			System.out.println("Please select your option " + "\n" + "1-show list of users" + "\n" + "2-add and edit users" + "\n" + "3-delete a user from system");
			System.out.println("4-show books optins" + "\n" + "5-search and  a user information " + "\n" + "6-Lending list" + "\n" + "7-Exit" );
			int n=input.nextInt();
			//////////////////////////////////////////////////////////////////////////////////////////////////////////// برای نشان دادن لیست اعضا
		 if (n==1)
		 {
			 for (int x=0;x<15;x++)
			 { for (int y=0;y<5;y++)
					 System.out.print(A[x][y] + "   ");
			 System.out.println();
			 }
	     }// end of if(1)
		 ////////////////////////////////////////////////////////////////////////////////////////////////////////////// برای افزودن و ویرایش اطلاعات
		 if (n==2)
		 {
			 System.out.println("برای اضافه کردن عضو جدید عدد 1 و برای ویرایش اطلاعات کاربران قبلی عدد 2 را وارد کنید.");
			 System.out.println(" توجه داشته باشید در صورت اضافه کردن عضو جدید خانه خالی در لیست را برای انجام این کار انتخاب کنید تا اطلاعات کاربران قبلی پاک نشود. ظرفیت لیست:15 نقر میباشد");
			 int m=input.nextInt();
			 if (m==1)
			 {
				 System.out.println("لطفا سطر مورد نظر خود را وارد کنید:");
				 int y=input.nextInt();
				 System.out.print("شماره عضویت: ");
				 A[y][0]=in.nextLine();
				 System.out.println();
				 System.out.print("نام و نام خانوادگی:  ");
				 A[y][1]=in.nextLine();
				 System.out.println();
				 System.out.print("کد ملی:  ");
				 A[y][2]=in.nextLine();
				 System.out.println();
				 System.out.print("شماره تماس:  ");
				 A[y][3]=in.nextLine();
				 System.out.println();
				 System.out.print("ادرس:  ");
				 A[y][4]=in.nextLine();
				 System.out.println();
				 System.out.println("تبریک! ثبت نام کاربر جدید شما با موفقیت انجام شد!");
				 }
			 if (m==2)
			 {
				 System.out.println(" سطر چندم از لیست را می خواهید ویرایش کنید:");
				 int r1=input.nextInt();
				 System.out.println("چه اطلاعاتی از کاربر را میخواهید ویرایش کنید:" + "\n" + "1-شماره عضویت" + "\n" + "2-نام و نام خانوادگی" + "\n" + "3-کد ملی" + "\n" + "4-شماره تماس" + "\n" + "5-ادرس");
			     int t=input.nextInt();
			     if (t==1)
			     {
			    	 System.out.println("لطفا شماره عضویت جدید کاربر مورد نظر خود را وارد کنید");
			    	 A[r1][t]=input.nextLine();
			     }
			     if (t==2)
			     {
			    	 System.out.println("لطفا نام و نام خانوادگی جدید کاربر مورد نظر خود را وارد کنید");
			    	 A[r1][t]=input.nextLine();
			    }
			     if (t==3)
			     {
			    	 System.out.println("لطفا کدملی جدید کاربر مورد نظر خود را وارد کنید");
			    	 A[r1][t]=input.nextLine();
			     }
			     if (t==4)
			     {
			    	 System.out.println("لطفا شماره تماس جدید کاربر مورد نظر خود را وارد کنید");
			    	 A[r1][t]=input.nextLine();
			     }
			     if (t==5)
			     {
			    	 System.out.println("لطفا  ادرس  جدید کاربر مورد نظر خود را وارد کنید");
			    	 A[r1][t]=input.nextLine();
			    
			 }
			 else 
			 {
				 System.out.println(" گزینه انتخابی شما وجود ندارد ! شما به مرحله قبلی فرستاده شدید.");
				 break;
			 }
		     }
			
		 }
		 //////////////////////////////////////////////////////////////////////////////////////////////////////////// حذف یک کاربر از سیستم
		 if (n==3)
		 {
			 System.out.println("لطفا  سطری که کاربر شما در آن وجود دارد را وارد کنید:");
			 int h=input.nextInt();
			 for (int x=0;x<5;x++)
				 A[h][x]="حذف شده";			 
		 }
		 ////////////////////////////////////////////////////////////////////////////////////////////////////////// منوی کتاب های موجود در کتابخانه
		 if (n==4)
		 {
			 while (1==1)
			 {
				 System.out.println(" شما وارد بخش اطلاعات کتاب های موجود در کتابخانه شده اید.");
				 System.out.println("لطفا عملکرد مورد نظر خود را وارد کنید:" + "\n" + "1-show list of books" + "\n" +  "2-add and edit a book informations" + "\n" + "3-delete a book from system");
				 System.out.println("4-search and print a book information" + "\n" + "5-return to previous menu");
				 int d=input.nextInt();
		//////////////////////////////////////////////////////////////////////////////////////////////////////////// برای نشان دادن لیست کتاب های موجود
				 if (d==1)
				 {
					for (int x=0;x<10;x++)
					 { for (int y=0;y<5;y++)
							 System.out.print(B[x][y] + "   ");
					 System.out.println();
					 }
				}
	 //////////////////////////////////////////////////////////////////////////////////////////////////////////////// افزودن و ویرایش اطلاعات کتابخانه
				if  (d==2)
				{
					System.out.println("برای اضافه کردن کتاب جدید عدد 1 و برای ویرایش اطلاعات کتاب های  قبلی عدد 2 را وارد کنید.");
					 System.out.println(" توجه داشته باشید در صورت اضافه کردن کتاب جدید  ، خانه خالی در لیست را برای انجام این کار انتخاب کنید تا اطلاعات کتاب های  قبلی پاک نشود. ظرفیت لیست:10  نفر میباشد");
					 int b=input.nextInt();
					 if (b==1)
					 {
						 System.out.println("لطفا سطر مورد نظر خود را وارد کنید:");
						 int o=input.nextInt();
						 System.out.print(" شماره کتاب:");
						 B[o][0]=in.nextLine();
						 System.out.println();
						 System.out.print(" عنوان کتاب: ");
						 B[o][1]=in.nextLine();
						 System.out.println();
						 System.out.print("نویسنده:  ");
						 B[o][2]=in.nextLine();
						 System.out.println();
						 System.out.print("مترجم:  ");
						 B[o][3]=in.nextLine();
						 System.out.println();
						 System.out.print("تعداد تیتراژ:  ");
						 B[o][4]=in.nextLine();
						 System.out.println();
						 System.out.println("تبریک! ثبت  کتاب جدید شما با موفقیت انجام شد!");
						 }
					 if (b==2)
					 {
						 System.out.println(" سطر چندم از لیست را می خواهید ویرایش کنید:");
						 int l=input.nextInt();
						 System.out.println("چه اطلاعاتی از کاربر را میخواهید ویرایش کنید:" + "\n" + "1-شماره کتاب" + "\n" + "2-عنوان کتاب" + "\n" + "3- نویسنده" + "\n" + "4-مترجم" + "\n" + "5-تعداد تیتراژ");
					     int k=input.nextInt();
					     if (k==1)
					     {
					    	 System.out.println("لطفا شماره کتاب جدید  مورد نظر خود را وارد کنید");
					    	 B[l][k]=in.nextLine();
					     }
					     if (k==2)
					     {
					    	 System.out.println("لطفا عنوان کتاب جدید  مورد نظر خود را وارد کنید");
					    	 B[l][k]=in.nextLine();
					    }
					     if (k==3)
					     {
					    	 System.out.println("لطفا نام نویسنده جدید  مورد نظر خود را وارد کنید");
					    	 B[l][k]=in.nextLine();
					     }
					     if (k==4)
					     {
					    	 System.out.println("لطفا نام مترجم جدید  مورد نظر خود را وارد کنید");
					    	 B[l][k]=in.nextLine();
					     }
					     if (k==5)
					     {
					    	 System.out.println("لطفا  تعداد تیتراژ جدید  مورد نظر خود را وارد کنید");
					    	 B[l][k]=in.nextLine();
					    
					 }
					 else 
					 {
						 System.out.println(" گزینه انتخابی شما وجود ندارد ! شما به مرحله قبلی فرستاده شدید.");
						 break;
					 }
				    
				}
				}
				 
				 //////////////////////////////////////////////////////////////////////////////////////////////////////////////// حذف یک کتاب از لیست کتاب موجود
	            if (d==3)
	            {
	         
	    			 System.out.println("لطفا  سطری که کتاب شما در آن وجود دارد را وارد کنید:");
	    			 int h=input.nextInt();
	    			 for (int x=0;x<5;x++)
	    				 B[h][x]="حذف_شده";			 
	    		System.out.println(" با موفقیت حذف شد");
	            }
				
				//////////////////////////////////////////////////////////////////////////////////////////////////////////////// جست و جو و چاپ اطلاعات یک کتاب
	         if (d==4)
	         {
	        	 System.out.println(" لطفا حالت مورد نظر خود را برای جستجو انتخاب کنید" + "\n" + "1-جستجوعادی بر اساس خط" + "\n" + "2-جستجو پیشرفته ");
	        	 int se=input.nextInt();
	        	 if (se==1)
	        	 {
	        		 System.out.println("لطفا سطر مورد نظر خود را برای جستجوی اطلاعات وارد کنید");
	        		 int se1=input.nextInt();
	        	   	 for (int x=0;x<5;x++)
	    	     	 { 
	    	     	if (A[se1][x]!="null")
	    	     		 System.out.print(A[se1][x] + " ");
	    		     if (A[se1][x]=="null")
	    		     {
	    		    	 System.out.println(" هیچ اطلاعاتی در این خانه وجود ندارد!");
	    	        	    break;
	    		     }}
	        		  }//  end of if 
	        	int um;
				if (se==2)
	        	 {
	        		 System.out.println("لطفا اطلاعات مورد نظر خود را نظیر *شماره کتاب* یا .... را وارد کنید تا کلیه اطلاعات آن کتاب برای شما نشان داده شود");
	        		 String se2=input.next();
	        		 for (int x=0;x<10;x++)
	        				for (int y=0;y<5;y++)
	        					if (B[x][y]==se2)
	        						{
	        						um=x;
	        						for (int z=0;z<5;z++)
	        						System.out.print(B[um][z]);
	        						}
	        	 }
	        	 }
	            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////   برای بازگشت به منوی قبلی
		       if (d==5)
		       {
		    	   System.out.println(" شما به مرحله قبل بازگشتید");
		    	   break;
		       }
				 
				 
				 
			 } // end of while books
			 } //  end of if 4
		 
		 
		 
		 //////////////////////////////////////////////////////////////////////////////////////////////////////////// برای چاپ اطلاعات یک کاربر
		if (n==5)
		{
			System.out.println("لطفا شماره  شماره ( سطری که کارابر در آن وجود دارد)فردی که میخواهید اطلاعات آن چاپ شود را وارد کنید:");
		   int f=input.nextInt();
	     	 for (int x=0;x<5;x++)
	     	 { 
	     	if (A[f][x]!="null")
	     		 System.out.print(A[f][x] + " ");
		     if (A[f][x]=="null")
		     {
		    	 System.out.println(" هیچ اطلاعاتی در این خانه وجود ندارد!");
	        	    break;
		     }
	     	 }
	     	 
		}
		 /////////////////////////////////////////////////////////////////////////////////////////////////////////// لیست امانت
		if (n==6)
		{
			while (1==1) 
			{
				System.out.println("1- لیست امانات" + "\n" + "2-ویرایش لیست امانات" + "\n" + "3-بازگشت به مرحله قبل" );
				int mm=input.nextInt();
				if (mm==1)
				{
					for (int x=0;x<10;x++)
					{
						for (int y=0;y<3;y++)
							System.out.print(C[x][y] + " ");
						System.out.println();
			        }}
				if (mm==2)
				{
					System.out.println(" برای افزودن کتاب جدید به لیست امانات لطفا عدد 1 و برای ویرایش لیست های قبلی لطفا عدد 2 را وارد کنید:");
					int nn=input.nextInt();
					if (nn==1)
					{
						System.out.println("لطفا مشخص کنید که امانت جدید را می خواهید در کدام سطر ثبت نمایید");
						int satr=input.nextInt();
						  System.out.println("لطفا عنوان کتاب را وارد کنید");
						  C[satr][0]=in.nextLine();
						  System.out.println(" لطفا تاریخ امانت را وارد کنید:");
						  C[satr][1]=in.nextLine();
						 
					}
					if (nn==2)
					{
						System.out.print("کدام سطر از  از لیست را می خواهید ویرایش کنید");
						int ff=input.nextInt();
						System.out.println("1-عنوان کتاب" + "\n" + "2-تاریخ امانت" + "\n" + "3-تاریخ تحویل");
						int bb=input.nextInt();
						System.out.println("لطفا اطلاعات  مورد نظر خود را وارد کنید");
						C[ff][bb-1]=in.nextLine();
						
					}}
				if (mm==3)
				{
					System.out.println(" شما به لیست  قبل بازگشتید");
					break;
				}
				} // end of while
			} // end of if for lending
		 
		 
		 
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////// برای خروج از سیستم
				 if (n==7)
		 {
			System.out.println(" با تشکر از انتخاب شما"); 
			break;
		 }
			
		}
		
	
		for (int x=0;x<15;x++)
		{
			for (int y=0;y<5;y++)
				outfile1.print(A[x][y]+ " " );
      
	     }
	
		for (int x=0;x<10;x++)
		{
			for (int y=0;y<5;y++)
				outFile.print(B[x][y]+ " " );
      
	     }
		for (int x=0;x<10;x++)
		{
			for (int y=0;y<3;y++)
				OUTFILE.print(C[x][y]+ " " );
      
	     }
			outfile1.close();
            outFile.close();
           OUTFILE.close();
	}
}

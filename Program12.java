class Program12{

public static void main(String [] args){

   for(int i=1;i<=5;i++){

      for(int j=1;j<=i;j++){ 
           System.out.print(i);
          }
       System.out.println();
    }
System.out.println();

/*
55555
4444
333
22
1
*/
   for(int i=5;i>=1;i--){
       for(int j=i;j>=1;j--){
           System.out.print(i);
           }
      System.out.println();
    }

/*
55555
4444
333
22
1
*/
 System.out.println();

/*
11111
2222
333
44
5
*/
   for(int i=1;i<=5;i++){
     for(int j=5;j>=i;j--){
      System.out.print(i);
     }
     System.out.println();
     }

/* 

5
44
333
2222
11111

*/
 System.out.println();

for(int i=5;i>=1;i--){
   for(int j=i;j<=5;j++){
    System.out.print(i);
     }
 System.out.println();
}

/*
54321
5432
543
54
5

*/

 System.out.println();
for(int i=1;i<=5;i++){
   for(int j=5;j>=i;j--){
    System.out.print(j);     
}
System.out.println();
}

System.out.println();

/*

5
54
543
5432
54321

*/

for(int i=1;i<=5;i++){
  for(int j=5;j>=i;j--){ 
     System.out.print(i);     
} 
System.out.println();
 }

}
}
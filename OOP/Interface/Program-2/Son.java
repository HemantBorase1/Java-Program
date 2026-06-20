class Son implements IndianMother,BritishMother
{

     public void food()
     {
        System.out.println("Son Called the Food Method");
        IndianMother.super.food();
        BritishMother.super.food();
     }
}
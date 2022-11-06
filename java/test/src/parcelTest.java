import java.util.Scanner;

class  parcel  {
    String  comName;
    String  parcelNum;
    String  personName;
    Long  personPhone;
    String  personBName;
    Long  personBPhone;
    String  address;
    double  price;


    parcel(String comName, String parcelNum, String personName, Long personPhone, String personBName, Long personBPhone, String address, double price)
    {
        super();
        this.comName  =  comName;
        this.parcelNum  =  parcelNum;
        this.personName  =  personName;
        this.personPhone  =  personPhone;
        this.personBName  =  personBName;
        this.personBPhone  =  personBPhone;
        this.address  =  address;
        this.price  =  price;
    }

    @Override
    public  String  toString()  {
        return  "["+comName  +"  "+parcelNum+"  "+  personName
                +"  "+personPhone  +"  "+  personBPhone
                +"  "+  address+"  "+  price+"]"  ;
    }

}
public  class  parcelTest{
    public  static  void  main(String[]  asd){
        String  comName;
        String  parcelNum;
        String  personName;
        Long  personPhone;
        String  personBName;
        Long  personBPhone;
        String  address;
        double  price;
        Scanner sc= new Scanner(System.in);
        comName= sc.next();
        parcelNum=sc.next();
        personName=sc.next();
        personPhone= sc.nextLong();
        personBName=sc.next();
        personBPhone=sc.nextLong();
        address=sc.next();
        price=sc.nextDouble();
        parcel  par= new parcel(comName,parcelNum,
                                personName,personPhone,
                                personBName,personBPhone,
                                address,price);
        System.out.println("["+par.comName+ " " +par.parcelNum+ " " +
                par.personName+ " " +par.personPhone+ " "
                +par.personBPhone+ " " +
                par.address+ " " +par.price+"]"
        );
    }
}


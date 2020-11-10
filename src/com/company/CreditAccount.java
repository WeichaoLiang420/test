package com.company;

public class CreditAccount {
   // CardType cardType = new CardType();
    private String cardHolder;
    private String expiredDate;
    private String cardNumber;
//    private CardType MasterCard;
//    private CardType visa;
//    private CardType AmericanExpress;
//    private  CardType Discover;
    private String cardType;


    public CreditAccount(String cardHolder, String expiredDate, String cardNumber) {
        this.cardHolder = cardHolder;
        this.expiredDate = expiredDate;
        this.cardNumber = cardNumber;
        //this.cardType = CardType();
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }


    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        String second_cardNumber_1 = (String) this.cardNumber.subSequence(1, 2);
        int second_cardNumber = Integer.parseInt(second_cardNumber_1);
       String first_four_digit =  this.cardNumber.substring(0,4);
        System.out.println(first_four_digit);
        if ((this.cardNumber.substring(0) == "5")&&( second_cardNumber >= 1 && second_cardNumber <= 5) && (this.cardNumber.length()==15)){
            this.cardType = "MasterCard";
            System.out.println(this.getCardNumber()+ "is master");
            //return this.cardType;
        }
        else if((this.cardNumber.substring(0) == "4")&&(this.cardNumber.length() ==12 || this.cardNumber.length() ==15)){
            this.cardType = "Visa";
            System.out.println(this.getCardNumber()+ "is visa");
            //return this.cardType;
        }
        else if((this.cardNumber.substring(0) == "3")&&(second_cardNumber == 4|| second_cardNumber ==7)&&(this.cardNumber.length()==14)){
            this.cardType ="AmericanExpress";
            System.out.println(this.getCardNumber()+ "is ae");
            //return this.cardType;
        }
        else if (first_four_digit == "6011" && this.cardNumber.length() == 15){
            this.cardType = "Discover";
            System.out.println(this.getCardNumber()+ "discover");
            //return this.cardType;
        }
        else this.cardType = "Invalid";
        //return this.cardType;


    }
    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardType() {
        return this.cardType;
    }



//    public String CardType(){
//        //this.cardNumber = cardNumber;
//        //cardNumber = this.cardNumber;
//        String second_cardNumber_1 =this.cardNumber.substring(1);
//        int second_cardNumber = Integer.parseInt(second_cardNumber_1);
//        String first_four_digit =  this.cardNumber.substring(0,4);
//        if ((this.cardNumber.substring(0) == "5")&&( second_cardNumber >= 1 && second_cardNumber <= 5) && (this.cardNumber.length()==15)){
//            this.cardType = "MasterCard";
//            System.out.println(this.getCardNumber()+ "is master");
//            return this.cardType;
//        }
//        else if((this.cardNumber.substring(0) == "4")&&(this.cardNumber.length() ==12 || this.cardNumber.length() ==15)){
//            this.cardType = "Visa";
//            System.out.println(this.getCardNumber()+ "is visa");
//            return this.cardType;
//        }
//        else if((this.cardNumber.substring(0) == "3")&&(second_cardNumber == 4|| second_cardNumber ==7)&&(this.cardNumber.length()==14)){
//            this.cardType ="AmericanExpress";
//            System.out.println(this.getCardNumber()+ "is ae");
//            return this.cardType;
//        }
//        else if (first_four_digit == "6011" && this.cardNumber.length() == 15){
//            this.cardType = "Discover";
//            System.out.println(this.getCardNumber()+ "discover");
//            return this.cardType;
//        }
//        else this.cardType = "Invalid";
//        return this.cardType;
//
//
//    }
}

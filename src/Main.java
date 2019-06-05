import types_of_trains.Freight_train;
import types_of_trains.Mail_train;
import types_of_trains.Passenger_train;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Passenger_train passenger_train = new Passenger_train();
        Freight_train freight_train = new Freight_train();
        Mail_train mail_train = new Mail_train();

        System.out.println("Выберете вид вагона");
        System.out.println("1.Пассажирский поезд");
        System.out.println("2.Грузовой поезд");
        System.out.println("3.Почтовый поезд");

        int trainPower = 1200;
        int q = sc.nextInt();
        int typeOfTrain = 0;

        if(q == 1){
            typeOfTrain = passenger_train.getpassengerTrainPower();
        }
        else if(q == 2){
            typeOfTrain = freight_train.getfreightTrainPower();
        }
        else if(q==3){
            typeOfTrain = mail_train.getMailTrainPower();
        }

        for (int i = 0; i <= trainPower; i = i + typeOfTrain) {

            System.out.println("Поезд отправился! Занято " + i + " мощности. Осталось мощности - "+(trainPower - i));

        }
    }
}
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int temperatureFahren = 88;

        System.out.println("The temperature in degrees celcius is " + fahrenToCelcius(tempF));

        int temperatureCelsius=34;

        System.out.println("The temperature in degrees fahrenheit is " + celcToFahren(tempC));

    }

    public void menu(){

    }


    static double fahrenToCelcius(int temp){
        double celcius=(temp - 32)/1.8;
        return celcius;
    }

    static double celcToFahren(int temp){
        double fahren= (temp*1.8) +32;
        return fahren;
    }
}

// THIS COMMENT WAS MADE IN GITHUB

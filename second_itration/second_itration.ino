#include <SoftwareSerial.h>
#include<SPI.h>
#include<SD.h>

//We are defining the flags being used to check all the parameters
bool DoneCustomMessage = false;
bool DoneBirthdayMessages = false;
bool DoneAnniversaryMessages = false;
String day; //variable to hold current day
String month;//variable to hold current month
//String files[15] = {"cusMsg.txt", "a.txt", "b.txt", "c.txt", "d.txt", "e.txt", "f.txt", "g.txt", "h.txt", "i.txt", "j.txt", "k.txt", "l.txt", "birMsg.txt", "aniMsg.txt"};

SoftwareSerial mySerial(9, 10);
String incommingdata;

File myFile;

void setup()
{
  mySerial.begin(9600);
  Serial.begin(9600);
  delay(100);
  mySerial.println("AT+CCLK?");
  delay(300);
  String Data = mySerial.readString();
  month = Data.substring(22, 24);
  day = Data.substring(25, 27);

  if (!SD.begin(4)) {
    Serial.println("initialization failed!");
    while (1);
  }




}


void loop() {


  if (month == "05") {

    myFile = SD.open("may.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }
    
  }
    if (month == "06") {

    myFile = SD.open("june.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }

}
  if (month == "07") {

    myFile = SD.open("july.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }
}
  if (month == "08") {

    myFile = SD.open("aug.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }
}
  if (month == "09") {

    myFile = SD.open("sep.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }





}

  if (month == "10") {

    myFile = SD.open("oct.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }

}
  if (month == "11") {

    myFile = SD.open("nov.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }
  }


    if (month == "12") {

    myFile = SD.open("dec.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }}
    
      if (month == "01") {

    myFile = SD.open("jan.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }
    
    
    
    
    
    }
  if (month == "02") {

    myFile = SD.open("feb.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }
}
  if (month == "03") {

    myFile = SD.open("mar.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }
}
  if (month == "04") {

    myFile = SD.open("apr.txt");
    if (myFile) {
      while (myFile.available())

      {

        String data = myFile.readStringUntil('\n');
        delay(1000);
        int len = data.length();
        int leN = (len - 11);

        String ph = "+91" + data.substring(leN, len);
        String na = data.substring(5, leN - 1);
        String t = data.substring(0, 2);
        String d = data.substring(3, 4);
        if (t == day) {
          if (d == "A")
          {
            mySerial.println("AT+CMGS=\"" + ph + "\"");
            delay(500);
            mySerial.print("Hello Mr and Mrs."+na+"\n Wish you a very happy anniversary\nFrom innovators");
            delay(500);
            mySerial.write(26);
            delay(3000);
            }
            }
            }
      myFile.close();
    }}
    
    }

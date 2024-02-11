/*##############################################################################
 Author:
 * Mirko Prosseda (08-2018)
 * email: mirko.prosseda@gmail.com
 
 Description:
 * LCD Shield for Arduino 16x2 test sketch v2.0
 * Print a default text on the lcd display, and update it if any button is pressed.
 
 Connections:
 * LCD    -> ARDUINO
 * RS     -> 7
 * Enable -> 6
 * D4     -> 5
 * D5     -> 4
 * D6     -> 3
 * D7     -> 2
 * R/W    -> GND
 * light  -> 9
 * Buttons array is connected to the analog input A0
##############################################################################*/


// include the library code:
#include <LiquidCrystal.h>

// initialize the library with the numbers of the interface pins
LiquidCrystal lcd(7, 6, 5, 4, 3, 2);


// Define constants and variables


//////////*******************CAMBIADO - ALDATUTA - inicio 1

//SIMULADORERAKO
const int inputPin = A0;    // buttons array analog input 
const int ledPin =  9;      // backlight control
const int sensorPin = A1;   // buttons array analog input 
uint16_t inputValue = 0;    // value read from buttons array
int kasua;                  //zein kasuan gauden adierazten digu
float temp;                 //tenperatura gordetzen du;
int ordu;                   //ordua gordetzen du
int minu;                   //minutuak gordetzen ditu
int segu;                   //segunduak gordetzen ditu
unsigned long denbora;
unsigned long denbora2 = 0;      


//uint8_t pwmValue = 0;      // value for lcd brightness


// Initialization
void setup() 
{
  pinMode(ledPin, OUTPUT);
  digitalWrite(ledPin, HIGH);
  lcd.begin(16, 2);               // set up the LCD's number of columns and rows
  lcd.print("------menua-----");  // Print a message on the LCD
  lcd.setCursor(0, 1);            // set the cursor to column 0, line 1
  lcd.print("1.ER 2.TEN 3.DOI");
  kasua = 1;
  ordu = 00;
  minu = 00;
  segu = 00;
  Serial.begin(9600);
  denbora = millis();
}

// main loop
void loop() 
{
  //////////*******************CAMBIADO - ALDATUTA - inicio 2

  // check buttons status
  inputValue = analogRead(inputPin);
  if(inputValue < 100 && inputValue >= 0) inputValue = 1;
  else if(inputValue < 250 && inputValue > 150) inputValue = 2;
  else if(inputValue < 470 && inputValue > 370) inputValue = 3;
  else if(inputValue < 670 && inputValue > 570) inputValue = 4;
  else if(inputValue < 870 && inputValue > 770) inputValue = 5;
  else if(inputValue <= 1023 && inputValue > 950) inputValue = 0;

  delay(200);  // Para empezar / Hasteko.
  /*Después mejorar sin delay para evitar leer más de una vez una pulsación.
  Gero hobetu delay gabe, pultsaketa bat behin baino ez irakurtzeko.*/

  //////////*******************CAMBIADO - ALDATUTA - fin 2

  // update display text
  if(denbora - denbora2 >=1000)
  {
    denbora2 = denbora;
    segu = denbora;
  }
  if(segu >= 60)
  {
    segu = 00;
    minu += 1;
  }
  if(minu >= 60)
  {
    minu = 00;
    ordu += 1;
  }
  switch (kasua)
  {
    case 1:
       if(inputValue == 1)
      {
        kasua = 2;
      }
      else if(inputValue == 2)
      {
        kasua = ;
      }
      else(inputValue == 3)
      {
        doiketa = True;
      }
      break;
    case 2:
      if(inputValue == 1)
      {
        menu = True;
      }
      else if(inputValue == 2)
      {
        tenperatura = True;
      }
      else(inputValue == 3)
      {
        doiketa = True;
      }
      break;
    case 3:
      if(inputValue == 1)
      {
        erlojua = True;
      }
      else if(inputValue == 2)
      {
        menu = True;
      }
      else(inputValue == 3)
      {
        doiketa = True;
      }
      break;
    case 4:
      if(inputValue == 1)
      {
        erlojua = True;
      }
      else if(inputValue == 2)
      {
        tenperatura = True;
      }
      else(inputValue == 3)
      {
        menu = True;
      }
      break;
  }
}

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
/*const int inputPin1 = A0;  // buttons array analog input 
const int inputPin2 = A1;  // buttons array analog input 
const int inputPin3 = A2;  // buttons array analog input 
const int inputPin4 = A3;  // buttons array analog input 
const int inputPin5 = A4;  // buttons array analog input 
uint16_t inputValue1 = 0;   // value read from buttons array
uint16_t inputValue2 = 0;   // value read from buttons array
uint16_t inputValue3 = 0;   // value read from buttons array
uint16_t inputValue4 = 0;   // value read from buttons array
uint16_t inputValue5 = 0;   // value read from buttons array
*/
const int inputPin = A0;    // buttons array analog input 
const int ledPin =  9;      // backlight control
const int sensorPin = A1;   // buttons array analog input 
uint16_t inputValue = 0;    // value read from buttons array
int kasua, botoia;                  //zein kasuan gauden adierazten digu
float temp;                 //tenperatura gordetzen du;
int ordu, minu, segu = 0;       //ordua, minutuak eta segunduak gordetzeko

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

   /*//SIMULADOR - Para placa comentar - inicio 
  inputValue1 = analogRead(inputPin1);
  inputValue2 = analogRead(inputPin2);
  inputValue3 = analogRead(inputPin3);
  inputValue4 = analogRead(inputPin4);
  inputValue5 = analogRead(inputPin5);
  if(inputValue1 <= 1023 && inputValue1 > 950) inputValue = 1;
  else if(inputValue2 <= 1023 && inputValue2 > 950) inputValue = 2;
  else if(inputValue3 <= 1023 && inputValue3 > 950) inputValue = 3;
  else if(inputValue4 <= 1023 && inputValue4 > 950) inputValue = 4;
  else if(inputValue5 <= 1023 && inputValue5 > 950) inputValue = 5;
  else inputValue = 0;
  //SIMULADOR - Para placa comentar - fin*/

  delay(200);  // Para empezar / Hasteko.
  /*Después mejorar sin delay para evitar leer más de una vez una pulsación.
  Gero hobetu delay gabe, pultsaketa bat behin baino ez irakurtzeko.*/

  //////////*******************CAMBIADO - ALDATUTA - fin 2

  denbora = millis();
  switch (inputValue)
  {
    case 0:
      denboraEguneratu();
      break;
    case 1:
      lcd.clear();
      lcd.print("menua");
      break;
    case 2:
      lcd.clear();
      lcd.print("erlojua");
      lcd.setCursor(1,0);
      denboraEguneratu();
      break;
    case 3:
      lcd.clear();
      lcd.print("tenperatura");
      break;
    case 4:
      lcd.clear();
      lcd.print("ordua aldatu");
      break;
    case 5:
      lcd.clear();
      lcd.print("formatua");
      break;
  }
  // update display text
  
}
void inprimatuDenbora()
{
  lcd.setCursor(4,1);
  if (ordu < 10)
  {
    lcd.print("0");
    lcd.print(ordu);
  }
  else
  {
    lcd.print(ordu);
  }
  lcd.print(":");
  if (minu < 10)
  {
    lcd.print("0");
    lcd.print(minu);
  }
  else
  {
    lcd.print(minu);
  }
  if (segu < 10)
  {
    lcd.print("0");
    lcd.print(segu);
  }
  else
  {
    lcd.print(segu);
  }
}

void denboraEguneratu()
{
  if (denbora - denbora2 >= 1000)
  {
    denbora2 = denbora;
    if (segu < 60)
    {
      segu ++;
    }
    else
    {
      segu = 0;
      if (minu < 60)
      {
        minu ++;
      }
      else
      {
        minu = 0;
        if (ordu < formatua)
        {
          ordu ++;
        }
        else
        {
          if (formatua == 12)
          {
            ordu = 1;
          }
          else
          {
            ordu = 0;
          }
        }
      }
    }
  }
}

void tenperatura()
{
  
}

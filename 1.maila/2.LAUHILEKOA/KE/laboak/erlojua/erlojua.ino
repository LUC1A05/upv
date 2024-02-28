#include <LiquidCrystal.h>
LiquidCrystal lcd(7, 6, 5, 4, 3, 2);

const int inputPin = A0;    // buttons array analog input 
const int ledPin =  9;      // backlight control
const int sensorPin = A1;   // buttons array analog input 
uint16_t inputValue = 0;    // value read from buttons array
int kasua, botoia, ormin;                  //zein kasuan gauden adierazten digu
float ptenperatura;                 //tenperatura gordetzen du;
int ordu, minu, segu = 0;       //ordua, minutuak eta segunduak gordetzeko

unsigned long denbora, denbora2, lagDen, lagDen1 = 0;
boolean segPasa = false;
int sensorValue = 0;
const int term = A4;

//extra
byte smiley[8] = {
  B00000,
  B10001,
  B00000,
  B00000,
  B10001,
  B01110,
  B00000,
};
byte heart[8] = {
  B00000,
  B01010,
  B11111,
  B11111,
  B11111,
  B01110,
  B00100,
};
byte larrow[8] = {
  B00000,
  B00100,
  B00010,
  B11111,
  B00010,
  B00100,
  B00000,
};
byte rarrow[8] = {
  B00000,
  B00100,
  B01000,
  B11111,
  B01000,
  B00100,
  B00000,
};

byte termo[8] = {
  B01110,
  B01010,
  B01110,
  B10101,
  B10101,
  B10001,
  B01110,
};

/*const int inputPin1 = A0;  // buttons array analog input 
const int inputPin2 = A1;  // buttons array analog input 
const int inputPin3 = A2;  // buttons array analog input 
const int inputPin4 = A3;  // buttons array analog input 
const int inputPin5 = A4;  // buttons array analog input 
uint16_t inputValue1 = 0;   // value read from buttons array
uint16_t inputValue2 = 0;   // value read from buttons array
uint16_t inputValue3 = 0;   // value read from buttons array
uint16_t inputValue4 = 0;   // value read from buttons array
uint16_t inputValue5 = 0;   // value read from buttons array*/

void setup() 
{
  pinMode(ledPin, OUTPUT);
  digitalWrite(ledPin, HIGH);
  lcd.begin(16, 2);               // set up the LCD's number of columns and rows
  lcd.print("Ongi etorri!");  // Print a message on the LCD
  
  //Charactere bereziak
  lcd.createChar(0, smiley);
  lcd.createChar(1,heart);
  lcd.createChar(2,larrow);
  lcd.createChar(3,rarrow);
  lcd.createChar(4,termo);
  int n = 0;
  lcd.setCursor(11,1);
  lcd.write(n);
  n = 1;
  lcd.setCursor(12,1);
  lcd.write(n);
  n = 4;
  lcd.setCursor(13,1);
  lcd.write(n);

  lcd.setCursor(0, 1);            // set the cursor to column 0, line 1
  lcd.print("sakatu b1");
  Serial.begin(9600);
  kasua = 0;
}


void loop() {
  denboraEguneratu();
  tenperatura();

  /*inputValue1 = analogRead(inputPin1);
  inputValue2 = analogRead(inputPin2);
  inputValue3 = analogRead(inputPin3);
  inputValue4 = analogRead(inputPin4);
  inputValue5 = analogRead(inputPin5);
  if(inputValue1 <= 1023 && inputValue1 > 950) inputValue = 1;
  else if(inputValue2 <= 1023 && inputValue2 > 950) inputValue = 2;
  else if(inputValue3 <= 1023 && inputValue3 > 950) inputValue = 3;
  else if(inputValue4 <= 1023 && inputValue4 > 950) inputValue = 4;
  else if(inputValue5 <= 1023 && inputValue5 > 950) inputValue = 5;
  else inputValue = 0;*/
  //Comprobar botones
  inputValue = analogRead(inputPin);
  if(inputValue < 100 && inputValue >= 0) inputValue = 1;
  else if(inputValue < 250 && inputValue > 150) inputValue = 2;
  else if(inputValue < 470 && inputValue > 370) inputValue = 3;
  else if(inputValue < 670 && inputValue > 570) inputValue = 4;
  else if(inputValue < 870 && inputValue > 770) inputValue = 5;
  else if(inputValue <= 1023 && inputValue > 950) inputValue = 0;

  
 //delay(200);  // Para empezar / Hasteko.
  lagDen = millis();
  while (lagDen - lagDen1 < 200)
  {
    lagDen1 = lagDen;
    lagDen = millis();
  }
  lagDen, lagDen1 = 0;
 
  /*Después mejorar sin delay para evitar leer más de una vez una pulsación.
  Gero hobetu delay gabe, pultsaketa bat behin baino ez irakurtzeko.*/

  //////////*******************CAMBIADO - ALDATUTA - fin 2
  switch (kasua)
  {
    case 0:
      if (inputValue == 1)
      {
        kasu1();
      }
    case 1:
      if (inputValue == 1)
      {
        kasu4();
      }
      else if (inputValue == 2)
      {
        kasu2();
      }
      else if (inputValue == 3)
      {
        kasu3();
      }
      else if (inputValue == 4)
      {
        kasu4();
      }
      else if (inputValue == 5)
      {
        kasu2();
      }
      break;
    case 2:
      if (inputValue == 0)
      {
        if (segPasa)
        {
          inprimatuDenbora();
          segPasa = false;
        }
      }
      if (inputValue == 1)
      {
        kasu1();
      }
      else if (inputValue == 2)
      {
        kasu1(); //hemen jar dezakegu 24/12 egiteko
      }
      else if (inputValue == 3)
      {
        //TODO
      }
      else if (inputValue == 4)
      {
        //TODO
      }
      else if (inputValue == 5)
      {
        kasu3();
      }
      break;
    case 3:
      if (inputValue == 0)
      {
        inprimatuTenp();
      }
      else if (inputValue == 1)
      {
        kasu2();
      }
      else if (inputValue == 2)
      {
        //TODO
      }
      else if (inputValue == 3)
      {
        kasu1();
      }
      else if (inputValue == 4)
      {
        //TODO
      }
      else if (inputValue == 5)
      {
        kasu4();
      }
      break;
    case 4:
      if (inputValue == 0)
      {
        if (segPasa)
        {
          inprimatuDenbora();
          segPasa = false;
        }
      }
      else if (inputValue == 1)
      {
        kasu3();
      }
      else if (inputValue == 2)
      {
        if (ormin == 1)
        {
          if (ordu == 23)
          {
            ordu = 0;
          }
          else
            ordu ++;
        }
        else 
        {
          if (minu == 59)
            minu = 0;
          else
            minu ++;
        }
      }
      else if (inputValue == 3)
      {
        if (ormin == 1)
        {
          if (ordu >0)
            ordu --;
          else
            ordu = 23;
        }
        else 
        {
          if (minu >0)
            minu --;
          else
            minu = 59;
        }
      }
      else if (inputValue == 4)
      {
        if (ormin == 1)
        {
          ormin = 2;
        }
        else
        {
          ormin = 1;
        }
      }
      if (inputValue == 5)
      {
        kasu1();
      }
  }
}
  
  // update display text
void kasu1()
{
  kasua = 1;
  lcd.clear();
  int n = 3;
  lcd.write(n);
  lcd.print("     menu     ");
  n = 2;
  lcd.write(n);
  lcd.setCursor(0,1);
  lcd.print("2.ER 3.TEN 4.DOI");
}

void kasu2()
{
  kasua = 2;
  lcd.clear();
  int n = 3;
  lcd.write(n);
  lcd.print("   erlojua    ");
  n = 2;
  lcd.write(n);
  lcd.setCursor(1,0);
}

void kasu3()
{
  kasua = 3;
  lcd.clear();
  int n = 3;
  lcd.write(n);
  lcd.print("  tenperatura ");
  n = 2;
  lcd.write(n);
}

void kasu4()
{
  kasua = 4;
  ormin = 1;
  lcd.clear();
  int n = 3;
  lcd.write(n);
  lcd.print(" ordua aldatu ");
  n = 2;
  lcd.write(n);
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
  lcd.print(":");
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
  denbora = millis();
  if (denbora - denbora2 >= 1000)
  {
    segPasa = true;
    denbora2 += 1000;
    if (segu < 59)
    {
      segu ++;
    }
    else
    {
      segu = 0;
      if (minu < 59)
      {
        minu ++;
      }
      else
      {
        minu = 0;
        if (ordu < 23)
        {
          ordu ++;
        }
        else
        {
          ordu = 0;
        }
      }
    }
  }
}

void tenperatura()
{
  sensorValue = analogRead(term);
  ptenperatura = sensorValue * (500.0/1023.0);
}

void inprimatuTenp()
{
  lcd.setCursor(0,1);
  lcd.print("tenp: ");
  lcd.print(ptenperatura);
  lcd.print("C");
}

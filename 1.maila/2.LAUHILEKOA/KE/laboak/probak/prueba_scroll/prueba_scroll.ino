#include
cont int RS = 8;
const int EN = 9;
const int d4 = 4;
const int d5 = 5;
const int d6 = 6;
const int d7 = 7;
const int pin_BL = 10;
LiquidCrystal lcd(RS, EN, d4, d5, d6, d7);
void setup()
{
  lcd.begin(16,2);
  lcd.print("Esto es una prue");
  delay(1000);
}
void loop()
{
  for (int positionCounter = 0; positionCounter < 16; positionCounter++)
  {
    lcd.scrollDisplayLeft();
    delay(400);
  }
  for (int positionCounter = 0; positionCounter < 32; positionCounter++)
  {
    lcd.scrollDisplayRight();
    delay(400);
  }
  for (int positionCounter = 0; positionCounter < 16; positionCounter++)
  {
    lcd.scrollDisplayLeft();
    delay(50);
  }
  delay(1000);
}

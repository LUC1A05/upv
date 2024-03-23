#include <LiquidCrystal.h>

LiquidCrystal lcd(2, 3, 4, 5, 6, 7);

byte smiley[8] = {
 B00000,
 B10001,
 B00000,
 B00000,
 B10001,
 B01110,
 B00000,
};


void setup()
{
  lcd.createChar(0, smiley);
  lcd.begin(16,2);
  lcd.print("Hello World!!");
  int n = 0;
  lcd.setCursor(0,1);
  lcd.write(n);
  delay(1000);
}

void loop()
{
  digitalWrite(LED_BUILTIN, HIGH);
  delay(1000); // Wait for 1000 millisecond(s)
  digitalWrite(LED_BUILTIN, LOW);
  delay(1000); // Wait for 1000 millisecond(s)
}

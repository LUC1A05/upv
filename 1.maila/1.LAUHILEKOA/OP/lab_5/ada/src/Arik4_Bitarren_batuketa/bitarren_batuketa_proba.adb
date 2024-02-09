with Ada.Integer_Text_IO,Ada.Text_IO;
use Ada.Integer_Text_IO,Ada.Text_IO;
with bitarren_batuketa;

procedure bitarren_batuketa_proba is 
batura:Integer;
begin
  begin
   batura:=bitarren_batuketa(0,0);
   Put("Lehen proba: bitarrez 0 + 0 = 0 da eta zure programak dio: ");
   put(batura);
   New_Line(3);
   Put_Line("Sakatu return jarraitzeko");
   Skip_Line;

   batura:=bitarren_batuketa(0,1);
   Put("Bigarren proba: bitarrez 0 + 1 = 1 da eta zure programak dio: ");
   put(batura);
   New_Line(3);
   Put_Line("Sakatu return jarraitzeko");
   Skip_Line;

   batura:=bitarren_batuketa(1,0);
   Put("Hirugarren proba: bitarrez 1 + 0 = 1 da eta zure programak dio: ");
   put(batura);
   New_Line(3);
   Put_Line("Sakatu return jarraitzeko");
   Skip_Line;

   batura:=bitarren_batuketa(1,1);
   Put("Laugarren proba: bitarrez 1 + 1 = 10 da eta zure programak dio: ");
   put(batura);
   New_Line(3);
   Put_Line("Sakatu return jarraitzeko");
   Skip_Line;

   batura:=bitarren_batuketa(11,11);
   Put("Bostgarren proba: bitarrez 11 + 11 = 110 da eta zure programak dio: ");
   put(batura);
      New_Line(3);
   end;
end bitarren_batuketa_proba;




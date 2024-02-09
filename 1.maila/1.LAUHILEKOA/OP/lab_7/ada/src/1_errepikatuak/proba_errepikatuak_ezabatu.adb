with Ada.Text_Io;
use Ada.Text_Io;
with Def_Datuak;
use Def_Datuak;
with errepikatuak_ezabatu, zerrenda_idatzi;

procedure proba_errepikatuak_ezabatu is 


   V1,  
   V2 : osokoen_zerrenda;  

begin

   Put_Line("Aurreneko proba. errepikatuak_ezabatu(1,2,3,4,5,6,7,8,9,10)");
   V1.zenbakiak := (1,2,3,4,5,6,7,8,9,10, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   New_Line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   New_Line(3);
   Put_Line("Sakatu return jarraitzeko");
   Skip_Line;


   put_line("Bigarren proba: errepikatuak_ezabatu(1,1,1,1,1,1,1,1,1,1)");
   V1.zenbakiak := (1,1,1,1,1,1,1,1,1,1, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);
   Put_Line("Sakatu return jarraitzeko");
   skip_line;

   put_line("Tercera prueba: errepikatuak_ezabatu(1,3,1,3,1,3,1,3,1,1)");
   V1.zenbakiak := (1,3,1,3,1,3,1,3,1,1, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);
   Put_Line("Sakatu return jarraitzeko");
   skip_line;
   
   put_line("Cuarta prueba: errepikatuak_ezabatu(1,1,1,2,3,3,3,2,3,2)");
   V1.zenbakiak := (1,1,1,2,3,3,3,2,3,2, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);
   Put_Line("Sakatu return jarraitzeko");
   skip_line;
   
   Put_Line("GURE PROBAK");
   Skip_Line;
   
   put_line("1. prueba: ez dago errepikaturik errepikatuak_ezabatu(1,2,3,4,5,6,7,8,9)");
   V1.zenbakiak := (1,2,3,4,5,6,7,8,9, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);
   Put_Line("Sakatu return jarraitzeko");
   skip_line;
   
   put_line("2. prueba: elementu bakarra errepikatuak_ezabatu(1)");
   V1.zenbakiak := (1, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);
   Put_Line("Sakatu return jarraitzeko");
   skip_line;
   
   put_line("3. prueba: denak errepikatuta errepikatuak_ezabatu(1,1,1,1,1,1,1,1,1,1)");
   V1.zenbakiak := (1,1,1,1,1,1,1,1,1,1, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);
   Put_Line("Sakatu return jarraitzeko");
   skip_line;
   
   put_line("4. prueba: batzuk errepikatuta eta beste batzuk ez errepikatuak_ezabatu(1,1,2,3,3,4,5,5,6,6)");
   V1.zenbakiak := (1,1,2,3,3,4,5,5,6,6, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);
   Put_Line("Sakatu return jarraitzeko");
   skip_line;
   
   put_line("5. prueba: zenbaki ezberdinak eta errepikatuta errepikatuak_ezabatu(1,1,1,2,2,2,3,3,3,2)");
   V1.zenbakiak := (1,1,1,2,2,2,3,3,3,2, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);
   Put_Line("Sakatu return jarraitzeko");
   skip_line;
   
   put_line("6. prueba: desordenatuta eta errepikatuta errepikatuak_ezabatu(1,2,3,1,2,3,1,2,3,3)");
   V1.zenbakiak := (1,2,3,1,2,3,1,2,3,3, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);


end proba_errepikatuak_ezabatu;

with Ada.Text_Io; use Ada.Text_Io;
with bektoreak; use bektoreak;
with Ezabatu_Hirugarren_elementua, Zerrenda_idatzi;

procedure Proba_Ezabatu_Hirugarren_elementua is 
   -- progama honek ezabatu_hirugarren_elementua funtzioari dei egiten dio, eta 
   -- horren funtzionamendua zuzena dela ziurtatzeko balio du

Zerrenda1: Osokoen_Zerrenda;

begin
   
   Zerrenda1.Zenbakiak(1) := 1; 
   Zerrenda1.Zenbakiak(2) := 2; 
   Zerrenda1.Zenbakiak(3) := 3;
   Zerrenda1.Zenbakiak(4) := 4; 
   Zerrenda1.Kont := 4;
   Put_line("1. kasua: 4 elementuko zerrenda: (1 2 3 4)");
   Put_line(" hasierako zerrenda: ");
   zerrenda_idatzi(Zerrenda1);
   put_line(" emaitza 1 2 4 izan beharko zen (EDOZEIN ORDENATAN) eta amaierako zerrenda honakoa da: ");
   ezabatu_hirugarren_elementua(Zerrenda1);
   zerrenda_idatzi(Zerrenda1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   Zerrenda1.Zenbakiak(1) := 1; 
   Zerrenda1.Zenbakiak(2) := 2; 
   Zerrenda1.Zenbakiak(3) := 3;
   Zerrenda1.Kont := 3;
   Put_line("2. kasua: 3 elementuko zerrenda: (1 2 3 )");
   Put_line(" hasierako zerrenda: ");
   zerrenda_idatzi(Zerrenda1);
   put_line(" emaitza 1 2 izan beharko zen (EDOZEIN ORDENATAN) eta amaierako zerrenda honakoa da: ");
   ezabatu_hirugarren_elementua(Zerrenda1);
   zerrenda_idatzi(Zerrenda1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   Zerrenda1.Zenbakiak(1) := 1; 
   Zerrenda1.Zenbakiak(2) := 2; 
   Zerrenda1.Kont := 2;
   Put_line("3. kasua: 2 elementuko zerrenda: (1 2)");
   Put_line(" hasierako zerrenda: ");
   zerrenda_idatzi(Zerrenda1);
   put_line(" emaitza 1 2 izan beharko zen (EDOZEIN ORDENATAN) eta amaierako zerrenda honakoa da: ");
   ezabatu_hirugarren_elementua(Zerrenda1);
   zerrenda_idatzi(Zerrenda1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   Zerrenda1.Zenbakiak(1) := 1; 
   Zerrenda1.Zenbakiak(2) := 2; 
   Zerrenda1.Zenbakiak(3) := 3;
   Zerrenda1.Zenbakiak(4) := 4;
   Zerrenda1.Zenbakiak(5) := 5;
   Zerrenda1.Zenbakiak(6) := 6;
   Zerrenda1.Zenbakiak(7) := 7;
   Zerrenda1.Zenbakiak(8) := 8;
   Zerrenda1.Zenbakiak(9) := 9;
   Zerrenda1.Zenbakiak(10) := 10;
   Zerrenda1.Kont := 10;
   Put_line("4. kasua: 10 elementuko zerrenda: (1 2 3 4 5 6 7 8 9 10)");
   Put_line(" hasierako zerrenda: ");
   zerrenda_idatzi(Zerrenda1);
   put_line(" emaitza 1 2 4 5 6 7 8 9 10 izan beharko zen (EDOZEIN ORDENATAN) eta amaierako zerrenda honakoa da: ");
   ezabatu_hirugarren_elementua(Zerrenda1);
   zerrenda_idatzi(Zerrenda1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   Zerrenda1.Kont := 0;
   Put_line("5. kasua: hutsik dagoen zerrenda");
   Put_line(" hasierako zerrenda: ");
   zerrenda_idatzi(Zerrenda1);
   put_line(" emaitza izan beharko zen (EDOZEIN ORDENATAN) eta amaierako zerrenda honakoa da: ");
   ezabatu_hirugarren_elementua(Zerrenda1);
   zerrenda_idatzi(Zerrenda1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   

   --proba kasu batzuk falta dira

end proba_ezabatu_hirugarren_elementua;

